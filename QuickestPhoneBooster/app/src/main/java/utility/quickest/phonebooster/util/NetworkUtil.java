package utility.quickest.phonebooster.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import utility.quickest.phonebooster.app.MyApplicationLike;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public final class NetworkUtil {
    private static final Set<C2498o> f14529a = new LinkedHashSet();

    public final class NetworkChangedReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            NetworkUtil.m18870c();
        }
    }

    public static void m18868a(C2498o c2498o) {
        ThreadUtil.m19102b();
        if (c2498o != null) {
            f14529a.add(c2498o);
        }
    }

    public static C2543n m18867a() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) MyApplicationLike.getApplication().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return C2543n.OFFLINE;
            }
            if (activeNetworkInfo.getType() == 1) {
                return C2543n.WIFI;
            }
            if (activeNetworkInfo.getType() == 0) {
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return C2543n.MOBILE_2G;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return C2543n.MOBILE_3G;
                    case 13:
                        return C2543n.MOBILE_4G;
                    default:
                        String subtypeName = activeNetworkInfo.getSubtypeName();
                        if (subtypeName != null && subtypeName.toLowerCase().contains("lte")) {
                            return C2543n.MOBILE_4G;
                        }
                }
            }
            return C2543n.UNKNOWN;
        } catch (Throwable th) {
        }
    }

    private static void m18870c() {
        ThreadUtil.m19102b();
        if (!f14529a.isEmpty()) {
            for (C2498o a : new ArrayList(f14529a)) {
                a.mo3141a();
            }
        }
    }
}
