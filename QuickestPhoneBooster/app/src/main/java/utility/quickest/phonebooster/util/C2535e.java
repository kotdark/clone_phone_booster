package utility.quickest.phonebooster.util;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningServiceInfo;
import android.app.AlarmManager;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings.Secure;
import android.support.v4.app.NotificationCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.os.EnvironmentCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.CustomEvent;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.p112b.SharedPrefHelper;
import io.fabric.sdk.android.services.p058b.C0880a;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: DeviceUtil */
public final class C2535e {
    public static final int f14677a;
    public static final float f14678b;
    public static final int f14679c;
    public static final int f14680d;
    private static final PackageManager f14681e = MyApplicationLike.getApplication().getPackageManager();
    private static final ActivityManager f14682f = ((ActivityManager) MyApplicationLike.getApplication().getSystemService("activity"));
    private static int f14683g = 0;
    private static String f14684h = null;
    private static String f14685i = null;
    private static String f14686j = null;
    private static String f14687k = null;
    private static String f14688l = null;
    private static String f14689m = null;
    private static String f14690n = null;
    private static String f14691o = null;
    private static String f14692p = null;
    private static final Map<String, WeakReference<Drawable>> f14693q = new HashMap();
    private static final Map<String, String> f14694r = new HashMap();
    private static volatile String f14695s = null;
    private static final Lock f14696t = new ReentrantLock();
    private static final Condition f14697u = f14696t.newCondition();
    private static String f14698v = null;

    static {
        DisplayMetrics displayMetrics = MyApplicationLike.getApplication().getResources().getDisplayMetrics();
        f14677a = displayMetrics.densityDpi;
        f14678b = displayMetrics.density;
        if (displayMetrics.widthPixels <= displayMetrics.heightPixels) {
            f14679c = displayMetrics.widthPixels;
            f14680d = displayMetrics.heightPixels;
        } else {
            f14679c = displayMetrics.heightPixels;
            f14680d = displayMetrics.widthPixels;
        }
        C2535e.m19059x();
    }

    public static synchronized int m19027a() {
        int i = 41943040;
        synchronized (C2535e.class) {
            if (f14683g > 0) {
                i = f14683g;
            } else {
                try {
                    f14683g = (int) ((C2535e.m19031a(f14682f) ? 0.33f : 0.4f) * ((float) ((f14682f.getMemoryClass() * 1024) * 1024)));
                    if (f14683g > 0) {
                        i = f14683g;
                    }
                } catch (Throwable th) {
                }
            }
        }
        return i;
    }

    private static boolean m19031a(ActivityManager activityManager) {
        if (activityManager == null) {
            return true;
        }
        if (VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        if (VERSION.SDK_INT >= 11) {
            return false;
        }
        return true;
    }

    public static synchronized String m19032b() {
        String str;
        synchronized (C2535e.class) {
            if (f14684h == null) {
                try {
                    f14684h = (Build.MANUFACTURER + "  " + Build.MODEL).trim();
                } catch (Throwable th) {
                }
            }
            str = f14684h == null ? "" : f14684h;
        }
        return str;
    }

    public static String m19035c() {
        return C0880a.ANDROID_CLIENT_TYPE;
    }

    public static synchronized String m19036d() {
        String str;
        synchronized (C2535e.class) {
            if (f14685i == null) {
                try {
                    f14685i = String.valueOf(VERSION.SDK_INT).trim();
                } catch (Throwable th) {
                }
            }
            str = f14685i == null ? "" : f14685i;
        }
        return str;
    }

    public static synchronized String m19038e() {
        String str;
        synchronized (C2535e.class) {
            if (f14686j == null) {
                try {
                    f14686j = VERSION.RELEASE.trim();
                } catch (Throwable th) {
                }
            }
            str = f14686j == null ? "" : f14686j;
        }
        return str;
    }

    public static synchronized String m19040f() {
        String str;
        synchronized (C2535e.class) {
            if (f14687k == null) {
                try {
                    f14687k = String.valueOf(f14677a).trim();
                } catch (Throwable th) {
                }
            }
            str = f14687k == null ? "" : f14687k;
        }
        return str;
    }

    public static synchronized String m19042g() {
        String str;
        synchronized (C2535e.class) {
            if (f14688l == null) {
                try {
                    f14688l = (f14679c + "*" + f14680d).trim();
                } catch (Throwable th) {
                }
            }
            str = f14688l == null ? "" : f14688l;
        }
        return str;
    }

    public static String m19043h() {
        return "";
    }

    public static String m19044i() {
        return "";
    }

    public static synchronized String m19045j() {
        String str;
        synchronized (C2535e.class) {
            if (f14689m == null) {
                try {
                    f14689m = Secure.getString(MyApplicationLike.getApplication().getContentResolver(), "android_id").trim();
                } catch (Throwable th) {
                }
            }
            str = f14689m == null ? "" : f14689m;
        }
        return str;
    }

    public static synchronized String m19046k() {
        String str;
        synchronized (C2535e.class) {
            if (f14690n == null) {
                f14690n =  SharedPrefHelper.m17454a().m17511g();
            }
            str = f14690n == null ? "" : f14690n;
        }
        return str;
    }

    public static synchronized String m19047l() {
        String str;
        synchronized (C2535e.class) {
            if (f14691o == null) {
                f14691o =  SharedPrefHelper.m17454a().m17515h();
            }
            str = f14691o == null ? "" : f14691o;
        }
        return str;
    }

    private static void m19059x() {
        ThreadUtil.m19097a("RefreshGoogleAdvertisingInfo", new C2536f());
    }

    public static String m19048m() {
        return "0.0,0.0";
    }

    public static synchronized String m19049n() {
        String str;
        synchronized (C2535e.class) {
            if (f14692p == null) {
                try {
                    f14692p = Locale.getDefault().toString().trim();
                } catch (Throwable th) {
                }
            }
            str = f14692p == null ? "" : f14692p;
        }
        return str;
    }

    public static Map<String, Integer> m19030a(boolean z) {
        Map<String, Integer> hashMap = new HashMap();
        try {
            for (PackageInfo packageInfo : f14681e.getInstalledPackages(128)) {
                if (!(packageInfo == null || packageInfo.applicationInfo == null || packageInfo.packageName == null || TextUtils.isEmpty(packageInfo.packageName.trim()))) {
                    if (((packageInfo.applicationInfo.flags & 1) != 0 ? 1 : null) == null || z) {
                        hashMap.put(packageInfo.packageName.trim(), Integer.valueOf(packageInfo.versionCode));
                    }
                }
            }
        } catch (Throwable th) {
        }
        return hashMap;
    }

    public static List<RunningAppProcessInfo> m19050o() {
        int parseInt;
        Object trim;
        String readLine;
        String trim2;
        int indexOf;
        CharSequence substring;
        Object obj = 1;
        List<RunningAppProcessInfo> arrayList = new ArrayList();
        try {
            for (RunningAppProcessInfo runningAppProcessInfo : f14682f.getRunningAppProcesses()) {
                if (runningAppProcessInfo != null) {
                    arrayList.add(runningAppProcessInfo);
                }
            }
        } catch (Throwable th) {
        }
        Object obj2 = 1;
        for (RunningAppProcessInfo runningAppProcessInfo2 : arrayList) {
            if (runningAppProcessInfo2.pkgList != null) {
                for (Object trim3 : runningAppProcessInfo2.pkgList) {
                    if (trim3 != null) {
                        trim3 = trim3.trim();
                    }
                    if (!TextUtils.isEmpty(trim3) && !trim3.equals("utility.quickest.phonebooster")) {
                        trim3 = null;
                        break;
                    }
                }
                trim3 = obj2;
                if (trim3 == null) {
                    break;
                }
            } else {
                trim3 = obj2;
            }
            obj2 = trim3;
        }
        trim3 = obj2;
        if (trim3 != null) {
            arrayList.clear();
            BufferedReader bufferedReader;
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("ps").getInputStream()));
                while (true) {
                    readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        try {
                            break;
                        } catch (IOException e) {
                        }
                    } else {
                        String[] split = readLine.split("\\s+");
                        if (split != null && split.length == 9) {
                            try {
                                parseInt = Integer.parseInt(split[1].trim());
                            } catch (Throwable th2) {
                                parseInt = 0;
                            }
                            if (parseInt > 0) {
                                readLine = split[8];
                                if (readLine != null) {
                                    trim2 = readLine.trim();
                                } else {
                                    trim2 = readLine;
                                }
                                if (!(TextUtils.isEmpty(trim2) || trim2.equals("ps"))) {
                                    List arrayList2 = new ArrayList();
                                    indexOf = trim2.indexOf(":");
                                    if (indexOf < 0) {
                                        arrayList2.add(trim2);
                                    } else {
                                        try {
                                            substring = trim2.substring(0, indexOf);
                                            if (substring != null) {
                                                substring = substring.trim();
                                            }
                                            if (!TextUtils.isEmpty(substring)) {
                                                arrayList2.add(substring);
                                            }
                                        } catch (Throwable th3) {
                                        }
                                    }
                                    if (!arrayList2.isEmpty()) {
                                        RunningAppProcessInfo runningAppProcessInfo3 = new RunningAppProcessInfo();
                                        runningAppProcessInfo3.pid = parseInt;
                                        runningAppProcessInfo3.processName = trim2;
                                        runningAppProcessInfo3.pkgList = (String[]) arrayList2.toArray(new String[0]);
                                        arrayList.add(runningAppProcessInfo3);
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                bufferedReader.close();
            } catch (IOException e2) {
            } catch (Throwable th4) {
            }
        }
        for (RunningAppProcessInfo runningAppProcessInfo22 : arrayList) {
            if (runningAppProcessInfo22.pkgList != null) {
                for (Object trim32 : runningAppProcessInfo22.pkgList) {
                    if (trim32 != null) {
                        trim32 = trim32.trim();
                    }
                    if (!TextUtils.isEmpty(trim32) && !trim32.equals("utility.quickest.phonebooster")) {
                        obj = null;
                        break;
                    }
                }
                if (obj == null) {
                    break;
                }
            }
        }
        if (obj != null) {
            arrayList.clear();
            try {
                for (RunningServiceInfo runningServiceInfo : f14682f.getRunningServices(10000)) {
                    if (runningServiceInfo != null) {
                        int i = runningServiceInfo.pid;
                        readLine = runningServiceInfo.process;
                        if (i > 0) {
                            if (readLine != null) {
                                trim2 = readLine.trim();
                            } else {
                                trim2 = readLine;
                            }
                            if (!TextUtils.isEmpty(trim2)) {
                                List arrayList3 = new ArrayList();
                                indexOf = trim2.indexOf(":");
                                if (indexOf < 0) {
                                    arrayList3.add(trim2);
                                } else {
                                    try {
                                        substring = trim2.substring(0, indexOf);
                                        if (substring != null) {
                                            substring = substring.trim();
                                        }
                                        if (!TextUtils.isEmpty(substring)) {
                                            arrayList3.add(substring);
                                        }
                                    } catch (Throwable th5) {
                                    }
                                }
                                if (!arrayList3.isEmpty()) {
                                    RunningAppProcessInfo runningAppProcessInfo4 = new RunningAppProcessInfo();
                                    runningAppProcessInfo4.pid = i;
                                    runningAppProcessInfo4.processName = trim2;
                                    runningAppProcessInfo4.pkgList = (String[]) arrayList3.toArray(new String[0]);
                                    arrayList.add(runningAppProcessInfo4);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th6) {
            }
        }
        return arrayList;
    }

    public static Pair<Long, Long> m19051p() {
        long j;
        long j2;
        long j3;
        try {
            MemoryInfo memoryInfo = new MemoryInfo();
            f14682f.getMemoryInfo(memoryInfo);
            j3 = memoryInfo.availMem;
            try {
                j = memoryInfo.totalMem;
                j2 = j3;
            } catch (Throwable th) {
                j = 0;
                j2 = j3;
                if (j2 > 0) {
                }
                return new Pair(Long.valueOf(1073741824), Long.valueOf(2147483648L));
            }
        } catch (Throwable th2) {
            j3 = 0;
            j = 0;
            j2 = j3;
            if (j2 > 0) {
            }
            return new Pair(Long.valueOf(1073741824), Long.valueOf(2147483648L));
        }
        if (j2 > 0 || j <= 0 || j2 > j) {
            return new Pair(Long.valueOf(1073741824), Long.valueOf(2147483648L));
        }
        return new Pair(Long.valueOf(j2), Long.valueOf(j));
    }

    public static Pair<Long, Long> m19052q() {
        StatFs statFs;
        long blockSize;
        long totalBytes;
        long availableBytes;
        long j;
        try {
            StatFs statFs2 = new StatFs(Environment.getRootDirectory().getAbsolutePath());
            if (VERSION.SDK_INT >= 18) {
                totalBytes = statFs2.getTotalBytes() + 0;
                try {
                    availableBytes = statFs2.getAvailableBytes() + 0;
                } catch (Throwable th) {
                    availableBytes = 0;
                    statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
                    if (VERSION.SDK_INT < 18) {
                        totalBytes += statFs.getTotalBytes();
                        availableBytes += statFs.getAvailableBytes();
                    } else {
                        blockSize = (long) statFs.getBlockSize();
                        totalBytes += ((long) statFs.getBlockCount()) * blockSize;
                        availableBytes += ((long) statFs.getAvailableBlocks()) * blockSize;
                    }
                    j = availableBytes;
                    availableBytes = totalBytes;
                    if (j > 0) {
                    }
                    return new Pair(Long.valueOf(7516192768L), Long.valueOf(17179869184L));
                }
                try {
                    statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
                    if (VERSION.SDK_INT < 18) {
                        totalBytes += statFs.getTotalBytes();
                        availableBytes += statFs.getAvailableBytes();
                    } else {
                        blockSize = (long) statFs.getBlockSize();
                        totalBytes += ((long) statFs.getBlockCount()) * blockSize;
                        availableBytes += ((long) statFs.getAvailableBlocks()) * blockSize;
                    }
                    j = availableBytes;
                    availableBytes = totalBytes;
                } catch (Throwable th2) {
                    j = availableBytes;
                    availableBytes = totalBytes;
                }
                if (j > 0 || availableBytes <= 0 || j > availableBytes) {
                    return new Pair(Long.valueOf(7516192768L), Long.valueOf(17179869184L));
                }
                return new Pair(Long.valueOf(j), Long.valueOf(availableBytes));
            }
            j = (long) statFs2.getBlockSize();
            totalBytes = (((long) statFs2.getBlockCount()) * j) + 0;
            availableBytes = (((long) statFs2.getAvailableBlocks()) * j) + 0;
            statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            if (VERSION.SDK_INT < 18) {
                blockSize = (long) statFs.getBlockSize();
                totalBytes += ((long) statFs.getBlockCount()) * blockSize;
                availableBytes += ((long) statFs.getAvailableBlocks()) * blockSize;
            } else {
                totalBytes += statFs.getTotalBytes();
                availableBytes += statFs.getAvailableBytes();
            }
            j = availableBytes;
            availableBytes = totalBytes;
            if (j > 0) {
            }
            return new Pair(Long.valueOf(7516192768L), Long.valueOf(17179869184L));
        } catch (Throwable th3) {
            totalBytes = 0;
            availableBytes = 0;
            statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            if (VERSION.SDK_INT < 18) {
                blockSize = (long) statFs.getBlockSize();
                totalBytes += ((long) statFs.getBlockCount()) * blockSize;
                availableBytes += ((long) statFs.getAvailableBlocks()) * blockSize;
            } else {
                totalBytes += statFs.getTotalBytes();
                availableBytes += statFs.getAvailableBytes();
            }
            j = availableBytes;
            availableBytes = totalBytes;
            if (j > 0) {
            }
            return new Pair(Long.valueOf(7516192768L), Long.valueOf(17179869184L));
        }
    }

    public static Drawable m19029a(String str) {
        if (str != null) {
            str = str.trim();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (f14693q) {
            Drawable drawable;
            WeakReference weakReference = (WeakReference) f14693q.get(str);
            if (weakReference != null) {
                drawable = (Drawable) weakReference.get();
                if (drawable != null) {
                    return drawable;
                }
            }
            try {
                drawable = f14681e.getApplicationIcon(str);
                if (drawable != null) {
                    f14693q.put(str, new WeakReference(drawable));
                }
                return drawable;
            } catch (Throwable th) {
                return null;
            }
        }
    }

    public static String m19033b(String str) {
        if (str != null) {
            str = str.trim();
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        synchronized (f14694r) {
            String str2 = (String) f14694r.get(str);
            if (str2 != null) {
                return str2;
            }
            try {
                str2 = f14681e.getApplicationLabel(f14681e.getApplicationInfo(str, 128)).toString().trim();
                f14694r.put(str, str2);
                return str2;
            } catch (Throwable th) {
                return "";
            }
        }
    }

    public static File m19034c(String str) {
        if (str != null) {
            str = str.trim();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file;
        try {
            file = new File(f14681e.getApplicationInfo(str, 128).sourceDir);
            if (!file.exists()) {
                file = null;
            }
        } catch (Throwable th) {
            file = null;
        }
        return file;
    }

    public static long m19028a(int i) {
        long totalPrivateDirty;
        try {
            totalPrivateDirty = ((long) f14682f.getProcessMemoryInfo(new int[]{i})[0].getTotalPrivateDirty()) * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        } catch (Throwable th) {
            totalPrivateDirty = 0;
        }
        if (totalPrivateDirty < 0) {
            return 0;
        }
        return totalPrivateDirty;
    }

    public static void m19037d(String str) {
        try {
            f14682f.killBackgroundProcesses(str);
        } catch (Throwable th) {
        }
    }

    public static boolean m19053r() {
        try {
            return ((TelephonyManager) MyApplicationLike.getApplication().getSystemService("phone")).getCallState() == 0;
        } catch (Throwable th) {
            return true;
        }
    }

    public static boolean m19054s() {
        long j = 0;
        try {
             SharedPrefHelper a =  SharedPrefHelper.m17454a();
            long currentTimeMillis = System.currentTimeMillis() - 60000;
            long j2 = 120000 + currentTimeMillis;
            long F = a.m17460F();
            if (VERSION.SDK_INT >= 21) {
                try {
                    j = ((AlarmManager) MyApplicationLike.getApplication().getSystemService(NotificationCompat.CATEGORY_ALARM)).getNextAlarmClock().getTriggerTime();
                } catch (Throwable th) {
                }
            }
            if (F >= currentTimeMillis && F <= j2) {
                return false;
            }
            if (j < currentTimeMillis || j > j2) {
                a.m17530l(j);
                return true;
            }
            a.m17530l(j);
            return false;
        } catch (Throwable th2) {
            return true;
        }
    }

    public static String m19055t() {
        String str;
        if (ThreadUtil.m19100a()) {
            f14696t.lock();
            if (f14695s == null) {
                Object trim;
                str = EnvironmentCompat.MEDIA_UNKNOWN;
                try {
                    if (VERSION.SDK_INT >= 17) {
                        trim = WebSettings.getDefaultUserAgent(MyApplicationLike.getApplication()).trim();
                        if (!TextUtils.isEmpty(trim)) {
                            f14695s = trim;
                            str = "getDefaultUserAgent()";
                        }
                    }
                } catch (Throwable th) {
                }
                try {
                    if (f14695s == null) {
                        try {
                            trim = new WebView(MyApplicationLike.getApplication()).getSettings().getUserAgentString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                f14695s = trim;
                                str = "getUserAgentString()";
                            }
                        } catch (Throwable th2) {
                        }
                    }
                    if (f14695s == null) {
                        String str2;
                        String str3;
                        str = VERSION.RELEASE;
                        CharSequence trim2 = str == null ? "" : str.trim();
                        if (TextUtils.isEmpty(trim2)) {
                            str2 = "4.4.2";
                        } else {
                            CharSequence charSequence = trim2;
                        }
                        str = Build.MODEL;
                        trim2 = str == null ? "" : str.trim();
                        if (TextUtils.isEmpty(trim2)) {
                            str3 = "LG-D802";
                        } else {
                            CharSequence charSequence2 = trim2;
                        }
                        str = Build.ID;
                        str = str == null ? "" : str.trim();
                        if (TextUtils.isEmpty(str)) {
                            str = "KOT49I.D80220c";
                        }
                        f14695s = "Mozilla/5.0 (Linux; Android " + str2 + "; " + str3 + " Build/" + str + (VERSION.SDK_INT >= 21 ? "; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/43.0.2357.65 Mobile Safari/537.36" : ") AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/30.0.0.0 Mobile Safari/537.36");
                        str = "own";
                    }
                    try {
                        Answers.getInstance().logCustom((CustomEvent) new CustomEvent("UASource").putCustomAttribute("source", str));
                    } catch (Throwable th3) {
                    }
                } finally {
                    f14696t.unlock();
                }
            }
            f14697u.signalAll();
            str = f14695s;
        } else {
            f14696t.lock();
            while (f14695s == null) {
                try {
                    ThreadUtil.m19099a(false, new C2537g());
                    f14697u.awaitUninterruptibly();
                } finally {
                    f14696t.unlock();
                }
            }
            str = f14695s;
        }
        return str;
    }

    public static synchronized String m19056u() {
        String networkOperator;
        synchronized (C2535e.class) {
            if (f14698v == null) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) MyApplicationLike.getApplication().getSystemService("phone");
                    String networkOperatorName = telephonyManager.getNetworkOperatorName();
                    Object trim = networkOperatorName == null ? "" : networkOperatorName.trim();
                    networkOperator = telephonyManager.getNetworkOperator();
                    Object trim2 = networkOperator == null ? "" : networkOperator.trim();
                    if (TextUtils.isEmpty(trim) && TextUtils.isEmpty(trim2)) {
                        f14698v = "";
                    } else {
                        f14698v = trim + " (" + trim2 + ")";
                    }
                } catch (Throwable th) {
                    f14698v = "";
                }
            }
            networkOperator = f14698v;
        }
        return networkOperator;
    }
}
