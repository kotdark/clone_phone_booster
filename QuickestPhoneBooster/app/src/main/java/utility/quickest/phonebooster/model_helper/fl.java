package utility.quickest.phonebooster.model_helper;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Notification;
import android.app.NotificationManager;
import android.text.TextUtils;
import android.util.Pair;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.p112b.SharedPrefHelper;
import utility.quickest.phonebooster.p114d.C2449g;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.util.C2554z;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/* compiled from: CleanNotificationModel */
public final class fl {
    private static volatile fl f14203a = null;
    private fs f14204b = null;
    private final Runnable f14205c = new fm(this);

    public static fl m18526a() {
        if (f14203a == null) {
            synchronized (fl.class) {
                if (f14203a == null) {
                    f14203a = new fl();
                }
            }
        }
        return f14203a;
    }

    public void m18539a(fs fsVar) {
        ThreadUtil.m19102b();
        this.f14204b = fsVar;
    }

    public void m18540b() {
        ThreadUtil.m19102b();
         SharedPrefHelper.m17454a().m17536n(System.currentTimeMillis());
    }

    private fl() {
        ThreadUtil.m19098a(this.f14205c, 3600000);
        ThreadUtil.m19099a(false, new fn(this));
    }

    private void m18532a(boolean z, boolean z2, boolean z3, boolean z4) {
        ThreadUtil.m19102b();
        long currentTimeMillis = System.currentTimeMillis();
         SharedPrefHelper a =  SharedPrefHelper.m17454a();
        int c = C2554z.m19116c(currentTimeMillis);
        if (c >= 13 && c < 22 && !a.m17538o() && a.m17526j() && !MyApplicationLike.m17418b().m17433d() && Math.abs(currentTimeMillis - a.m17557y()) >= 5400000) {
            Object obj;
            Object obj2;
            Object obj3;
            Object obj4 = null;
            long b = C2554z.m19115b(currentTimeMillis);
            if (z) {
                obj = null;
            } else {
                obj = b != C2554z.m19115b(a.m17549u()) ? 1 : null;
            }
            if (z2) {
                obj2 = null;
            } else {
                obj2 = b != C2554z.m19115b(a.m17551v()) ? 1 : null;
            }
            if (z3) {
                obj3 = null;
            } else {
                obj3 = b != C2554z.m19115b(a.m17553w()) ? 1 : null;
            }
            if (!z4) {
                obj4 = b != C2554z.m19115b(a.m17555x()) ? 1 : null;
            }
            List arrayList = new ArrayList();
            if (obj != null) {
                arrayList.add(Integer.valueOf(1));
            }
            if (obj2 != null) {
                arrayList.add(Integer.valueOf(2));
            }
            if (obj3 != null) {
                arrayList.add(Integer.valueOf(3));
            }
            if (obj4 != null) {
                arrayList.add(Integer.valueOf(4));
            }
            if (!arrayList.isEmpty()) {
                switch (((Integer) arrayList.get(new Random().nextInt(arrayList.size()))).intValue()) {
                    case 1:
                        boolean z5;
                        boolean z6;
                        boolean z7;
                        if (obj2 == null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (obj3 == null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (obj4 == null) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        m18531a(z5, z6, z7);
                        return;
                    case 2:
                        m18534b(obj == null, obj3 == null, obj4 == null);
                        return;
                    case 3:
                        m18537c(obj == null, obj2 == null, obj4 == null);
                        return;
                    case 4:
                        m18538d(obj == null, obj2 == null, obj3 == null);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    private void m18531a(boolean z, boolean z2, boolean z3) {
        ThreadUtil.m19102b();
        fw fwVar = new fw(gy.InstalledApp);
        fwVar.m18595a(new fp(this, fwVar, z, z2, z3));
        fwVar.m18596a(0, 0);
    }

    private void m18534b(boolean z, boolean z2, boolean z3) {
        long j;
        ft ftVar;
        ThreadUtil.m19102b();
        Pair p = C2535e.m19051p();
        long longValue = ((((Long) p.second).longValue() - ((Long) p.first).longValue()) * 100) / ((Long) p.second).longValue();
        if (longValue > 100) {
            j = 100;
        } else if (longValue < 0) {
            j = 0;
        } else {
            j = longValue;
        }
        if (j >= 85) {
            ftVar = ft.ProcessWithSize;
        } else if (j >= 10) {
            ftVar = ft.ProcessWithoutSize;
        } else {
            ftVar = null;
        }
        if (ftVar == null) {
            m18532a(z, true, z2, z3);
        } else if (this.f14204b != null) {
            Notification notification = null;
            try {
                Set linkedHashSet = new LinkedHashSet();
                Set keySet = C2535e.m19030a(false).keySet();
                for (RunningAppProcessInfo runningAppProcessInfo : C2535e.m19050o()) {
                    if (runningAppProcessInfo.pkgList != null) {
                        for (Object obj : runningAppProcessInfo.pkgList) {
                            Object obj2;
                            if (obj2 != null) {
                                obj2 = obj2.trim();
                            }
                            if (!(TextUtils.isEmpty(obj2) || obj2.equals("utility.quickest.phonebooster") || !keySet.contains(obj2))) {
                                linkedHashSet.add(obj2);
                            }
                        }
                    }
                }
                notification = this.f14204b.mo3075a(ftVar, j, linkedHashSet);
            } catch (Throwable th) {
            }
            if (notification != null) {
                try {
                    C2542m.m19081a(notification);
                    NotificationManager notificationManager = (NotificationManager) MyApplicationLike.getApplication().getSystemService("notification");
                    if (notificationManager != null) {
                        notificationManager.notify(5001, notification);
                        longValue = System.currentTimeMillis();
                         SharedPrefHelper a =  SharedPrefHelper.m17454a();
                        a.m17512g(longValue);
                        a.m17523j(longValue);
                        ftVar.m18551b();
                    }
                } catch (Throwable th2) {
                }
            }
        }
    }

    private void m18537c(boolean z, boolean z2, boolean z3) {
        long j;
        ft ftVar;
        ThreadUtil.m19102b();
        Pair p = C2535e.m19051p();
        long longValue = ((((Long) p.second).longValue() - ((Long) p.first).longValue()) * 100) / ((Long) p.second).longValue();
        if (longValue > 100) {
            j = 100;
        } else if (longValue < 0) {
            j = 0;
        } else {
            j = longValue;
        }
        if (j >= 30) {
            ftVar = ft.FakeLowPower;
        } else {
            ftVar = null;
        }
        if (ftVar == null) {
            m18532a(z, z2, true, z3);
        } else if (this.f14204b != null) {
            Notification notification = null;
            try {
                Set linkedHashSet = new LinkedHashSet();
                Set keySet = C2535e.m19030a(false).keySet();
                for (RunningAppProcessInfo runningAppProcessInfo : C2535e.m19050o()) {
                    if (runningAppProcessInfo.pkgList != null) {
                        for (Object obj : runningAppProcessInfo.pkgList) {
                            Object obj2;
                            if (obj2 != null) {
                                obj2 = obj2.trim();
                            }
                            if (!(TextUtils.isEmpty(obj2) || obj2.equals("utility.quickest.phonebooster") || !keySet.contains(obj2))) {
                                linkedHashSet.add(obj2);
                            }
                        }
                    }
                }
                notification = this.f14204b.mo3075a(ftVar, j, linkedHashSet);
            } catch (Throwable th) {
            }
            if (notification != null) {
                try {
                    C2542m.m19081a(notification);
                    NotificationManager notificationManager = (NotificationManager) MyApplicationLike.getApplication().getSystemService("notification");
                    if (notificationManager != null) {
                        notificationManager.notify(6001, notification);
                        longValue = System.currentTimeMillis();
                         SharedPrefHelper a =  SharedPrefHelper.m17454a();
                        a.m17516h(longValue);
                        a.m17523j(longValue);
                        ftVar.m18551b();
                    }
                } catch (Throwable th2) {
                }
            }
        }
    }

    private void m18538d(boolean z, boolean z2, boolean z3) {
        ThreadUtil.m19102b();
        jd.m18744a(new fr(this, z, z2, z3));
    }

    private void m18536c() {
        ThreadUtil.m19102b();
        long currentTimeMillis = System.currentTimeMillis();
         SharedPrefHelper a =  SharedPrefHelper.m17454a();
        int c = C2554z.m19116c(currentTimeMillis);
        if (c >= 11 && c < 22 && !a.m17538o() && a.m17526j() && !MyApplicationLike.m17418b().m17433d()) {
            if (a.m17464J() <= 0) {
                a.m17536n(currentTimeMillis);
                return;
            }
            int a2 = C2554z.m19112a(C2554z.m19115b(a.m17464J()), C2554z.m19115b(currentTimeMillis));
            if (a2 >= 10 && this.f14204b != null) {
                Notification a3;
                Notification notification = null;
                try {
                    a3 = this.f14204b.mo3075a(ft.Antivirus, (long) (a2 / 2), new LinkedHashSet());
                } catch (Throwable th) {
                    a3 = notification;
                }
                if (a3 != null) {
                    try {
                        C2542m.m19081a(a3);
                        NotificationManager notificationManager = (NotificationManager) MyApplicationLike.getApplication().getSystemService("notification");
                        if (notificationManager != null) {
                            notificationManager.notify(8001, a3);
                            a.m17536n(currentTimeMillis);
                            ft.Antivirus.m18551b();
                        }
                    } catch (Throwable th2) {
                    }
                }
            }
        }
    }

    private void m18527a(C2449g c2449g) {
        ft ftVar = null;
        ThreadUtil.m19102b();
        if (c2449g != null) {
             SharedPrefHelper a =  SharedPrefHelper.m17454a();
            if (c2449g.m17664b()) {
                a.m17518h(false);
            } else if (!a.m17538o() && a.m17526j()) {
                ft ftVar2;
                int a2 = c2449g.m17663a();
                if (a2 > 35 || a.m17459E()) {
                    ftVar2 = ftVar;
                } else {
                    ftVar2 = ft.LowPower;
                }
                if (ftVar2 != null && this.f14204b != null) {
                    Notification a3;
                    try {
                        a3 = this.f14204b.mo3075a(ftVar2, (long) a2, new LinkedHashSet());
                    } catch (Throwable th) {
                        Object obj = ftVar;
                    }
                    if (a3 != null) {
                        try {
                            C2542m.m19081a(a3);
                            NotificationManager notificationManager = (NotificationManager) MyApplicationLike.getApplication().getSystemService("notification");
                            if (notificationManager != null) {
                                notificationManager.notify(7001, a3);
                                a.m17518h(true);
                                ftVar2.m18551b();
                            }
                        } catch (Throwable th2) {
                        }
                    }
                }
            }
        }
    }
}
