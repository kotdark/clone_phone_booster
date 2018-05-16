package utility.quickest.phonebooster.model_helper;

import android.os.Handler;
import utility.quickest.phonebooster.util.C2541l;
import utility.quickest.phonebooster.util.ThreadUtil;
import com.mopub.mobileads.VastExtensionXmlManager;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: TemperatureModel */
public final class jd {
    private static volatile jd f14442a = null;
    private int f14443b = 32;
    private boolean f14444c = true;
    private final Handler f14445d = ThreadUtil.m19107e();
    private final Runnable f14446e = new je(this);
    private final Set<jj> f14447f = new LinkedHashSet();

    public static void m18744a(jj jjVar) {
        ThreadUtil.m19102b();
        if (jjVar != null) {
            ThreadUtil.m19097a("FetchTemperatureOnce", new jg(jjVar));
        }
    }

    public static jd m18741a() {
        if (f14442a == null) {
            synchronized (jd.class) {
                if (f14442a == null) {
                    f14442a = new jd();
                }
            }
        }
        return f14442a;
    }

    public int m18754b() {
        ThreadUtil.m19102b();
        return this.f14443b;
    }

    public void m18755b(jj jjVar) {
        ThreadUtil.m19102b();
        if (jjVar != null) {
            this.f14447f.add(jjVar);
            this.f14445d.removeCallbacks(this.f14446e);
            this.f14445d.post(this.f14446e);
        }
    }

    public void m18756c(jj jjVar) {
        ThreadUtil.m19102b();
        if (jjVar != null) {
            this.f14447f.remove(jjVar);
            if (this.f14447f.isEmpty()) {
                this.f14445d.removeCallbacks(this.f14446e);
            }
        }
    }

    private jd() {
    }

    private static Integer m18751d() {
        int i = 0;
        File[] listFiles = new File("/sys/class/thermal").listFiles(new ji());
        double d = 0.0d;
        if (listFiles != null) {
            for (File a : listFiles) {
                Integer a2 = m18742a(a);
                if (a2 != null) {
                    d += (double) a2.intValue();
                    i++;
                }
            }
        }
        if (i > 0) {
            return Integer.valueOf((int) Math.round(d / ((double) i)));
        }
        return null;
    }

    private static Integer m18742a(File file) {
        Integer num = null;
        try {
            if (C2541l.m19071c(new File(file, VastExtensionXmlManager.TYPE)).trim().startsWith("tsens_tz_sensor")) {
                int parseInt = Integer.parseInt(C2541l.m19071c(new File(file, "temp")).trim());
                if (parseInt >= 0 && parseInt <= 100) {
                    num = Integer.valueOf(parseInt);
                }
            }
        } catch (Throwable th) {
        }
        return num;
    }

    private void m18743a(int i) {
        ThreadUtil.m19102b();
        if (!this.f14447f.isEmpty()) {
            for (jj a : new ArrayList(this.f14447f)) {
                a.mo3090a(i);
            }
        }
    }
}
