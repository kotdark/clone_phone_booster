package utility.quickest.phonebooster.model_helper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.support.v4.app.NotificationCompat;
import android.support.v4.widget.ExploreByTouchHelper;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.p114d.C2449g;
import utility.quickest.phonebooster.util.C2541l;
import utility.quickest.phonebooster.util.ThreadUtil;
import com.mopub.nativeads.MoPubNativeAdPositioning.MoPubClientPositioning;
import com.mopub.volley.DefaultRetryPolicy;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public final class BatteryModel {
    private static volatile BatteryModel f13874a = null;
    private static final File[] f13875f = new File[]{new File("/sys/class/power_supply/battery/charge_full_design"), new File("/sys/class/power_supply/battery/charge_full")};
    private C2449g f13876b = new C2449g(0, 100, false, false);
    private final Handler f13877c = ThreadUtil.m19109f();
    private final Runnable f13878d = new fg(this);
    private final Map<fj, fk> f13879e = new LinkedHashMap();

    public final class PowerConnectionReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            BatteryModel a = BatteryModel.m18196a();
            a.f13877c.removeCallbacks(a.f13878d);
            a.f13877c.post(a.f13878d);
        }
    }

    public static BatteryModel m18196a() {
        if (f13874a == null) {
            synchronized (BatteryModel.class) {
                if (f13874a == null) {
                    f13874a = new BatteryModel();
                }
            }
        }
        return f13874a;
    }

    public C2449g m18215b() {
        ThreadUtil.m19102b();
        return this.f13876b;
    }

    public void m18214a(fj fjVar, fk fkVar) {
        ThreadUtil.m19102b();
        if (fjVar != null) {
            if (fkVar == null) {
                fkVar = fk.SLOW;
            }
            this.f13879e.put(fjVar, fkVar);
            this.f13877c.removeCallbacks(this.f13878d);
            this.f13877c.post(this.f13878d);
        }
    }

    public void m18213a(fj fjVar) {
        ThreadUtil.m19102b();
        if (fjVar != null) {
            this.f13879e.remove(fjVar);
            if (m18206h() < 0) {
                this.f13877c.removeCallbacks(this.f13878d);
            }
        }
    }

    public long m18212a(int i) {
        ThreadUtil.m19102b();
        if (i < 0) {
            i = 0;
        }
        int d = this.f13876b.m17666d();
        if (d <= 400) {
            long round = Math.round(1.1d * ((double) i));
            if (i < 2) {
                round += 5;
            }
            if (round > 10) {
                return 10;
            }
            return round;
        } else if (d <= 1500) {
            long round2 = Math.round(2.3d * ((double) i));
            if (i < 5) {
                r0 = 10 + round2;
            } else {
                r0 = round2;
            }
            if (r0 > 30) {
                return 30;
            }
            return r0;
        } else if (d <= DefaultRetryPolicy.DEFAULT_TIMEOUT_MS) {
            r0 = Math.round(2.8d * ((double) i));
            if (i < 12) {
                return r0 + 20;
            }
            return r0;
        } else {
            r0 = Math.round(3.3d * ((double) i));
            if (i < 20) {
                return r0 + 30;
            }
            return r0;
        }
    }

    private BatteryModel() {
        ThreadUtil.m19099a(false, new fi(this));
    }

    private void m18197a(C2449g c2449g) {
        ThreadUtil.m19102b();
        if (c2449g != null && !c2449g.equals(this.f13876b)) {
            this.f13876b = c2449g;
            m18205g();
        }
    }

    private void m18205g() {
        ThreadUtil.m19102b();
        if (!this.f13879e.isEmpty()) {
            for (fj a : new ArrayList(this.f13879e.keySet())) {
                a.mo3097a(this.f13876b);
            }
        }
    }

    private long m18206h() {
        ThreadUtil.m19102b();
        long j = Long.MIN_VALUE;
        Object obj = 1;
        for (fk fkVar : this.f13879e.values()) {
            Object obj2;
            if (obj != null) {
                j = fkVar.m18524a();
                obj2 = null;
            } else if (fkVar.m18524a() < j) {
                j = fkVar.m18524a();
                obj2 = obj;
            } else {
                obj2 = obj;
            }
            obj = obj2;
        }
        return j;
    }

    private static int m18207i() {
        try {
            Class cls = Class.forName("com.android.internal.os.PowerProfile");
            Object newInstance = cls.getConstructor(new Class[]{Context.class}).newInstance(new Object[]{MyApplicationLike.getApplication()});
            Method method = cls.getMethod("getAveragePower", new Class[]{String.class});
            method.setAccessible(true);
            int doubleValue = (int) ((Double) method.invoke(newInstance, new Object[]{"battery.capacity"})).doubleValue();
            if (C2449g.m17662a(doubleValue)) {
                return doubleValue;
            }
        } catch (Throwable th) {
        }
        return m18211m();
    }

    private static int m18208j() {
        try {
            Intent registerReceiver = MyApplicationLike.getApplication().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra < 0 || intExtra2 <= 0) {
                return MoPubClientPositioning.NO_REPEAT;
            }
            return (int) ((((long) intExtra) * 100) / ((long) intExtra2));
        } catch (Throwable th) {
            return MoPubClientPositioning.NO_REPEAT;
        }
    }

    private static boolean m18209k() {
        try {
            if (MyApplicationLike.getApplication().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra(NotificationCompat.CATEGORY_STATUS, 0) == 2) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    private static boolean m18210l() {
        try {
            if (MyApplicationLike.getApplication().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", 0) != 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    private static int m18211m() {
        File[] fileArr = f13875f;
        int length = fileArr.length;
        int i = 0;
        while (i < length) {
            try {
                int parseInt = Integer.parseInt(C2541l.m19071c(fileArr[i]).trim());
                if (C2449g.m17662a(parseInt)) {
                    return parseInt;
                }
                if (parseInt > 0) {
                    while (true) {
                        parseInt /= 10;
                        if (parseInt == 0) {
                            continue;
                            break;
                        } else if (C2449g.m17662a(parseInt)) {
                            return parseInt;
                        }
                    }
                }
                continue;
                i++;
            } catch (Throwable th) {
            }
        }
        return ExploreByTouchHelper.INVALID_ID;
    }
}
