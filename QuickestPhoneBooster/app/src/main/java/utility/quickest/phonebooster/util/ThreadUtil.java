package utility.quickest.phonebooster.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;

import com.bumptech.glide.load.engine.executor.FifoPriorityThreadPoolExecutor;
import com.bumptech.glide.load.engine.executor.FifoPriorityThreadPoolExecutor.UncaughtThrowableStrategy;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: ThreadUtil */
public final class ThreadUtil {
    private static final Handler f14715a = new Handler(Looper.getMainLooper());
    private static final ThreadPoolExecutor f14716b = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C2545q());
    private static final ThreadPoolExecutor f14717c = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C2546r());
    private static final ThreadPoolExecutor f14718d = new ThreadPoolExecutor(5, 5, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C2547s());
    private static final ThreadPoolExecutor f14719e = new FifoPriorityThreadPoolExecutor(3, 3, 30, TimeUnit.SECONDS, new C2548t(), UncaughtThrowableStrategy.IGNORE);
    private static final ThreadPoolExecutor f14720f = new FifoPriorityThreadPoolExecutor(5, 5, 30, TimeUnit.SECONDS, new C2549u(), UncaughtThrowableStrategy.IGNORE);
    private static final HandlerThread f14721g = new HandlerThread("CalculateTemperature");
    private static volatile Handler f14722h = null;
    private static final HandlerThread f14723i = new HandlerThread("CalculateBattery");
    private static volatile Handler f14724j = null;
    private static final ThreadPoolExecutor f14725k = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C2550v());
    private static final ThreadPoolExecutor f14726l = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C2551w());
    private static final HandlerThread f14727m = new HandlerThread("FetchSwitch");
    private static volatile Handler f14728n = null;

    static {
        f14716b.allowCoreThreadTimeOut(true);
        f14717c.allowCoreThreadTimeOut(true);
        f14718d.allowCoreThreadTimeOut(true);
        f14719e.allowCoreThreadTimeOut(true);
        f14720f.allowCoreThreadTimeOut(true);
        f14721g.start();
        f14723i.start();
        f14725k.allowCoreThreadTimeOut(true);
        f14726l.allowCoreThreadTimeOut(true);
        f14727m.start();
    }

    public static boolean m19100a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void m19102b() {
    }

    public static void m19099a(boolean z, Runnable runnable) {
        if (runnable != null) {
            if (z || !ThreadUtil.m19100a()) {
                f14715a.post(runnable);
            } else {
                runnable.run();
            }
        }
    }

    public static void m19098a(Runnable runnable, long j) {
        if (runnable != null) {
            if (j < 0) {
                j = 0;
            }
            f14715a.postDelayed(runnable, j);
        }
    }

    public static Future<?> m19097a(String str, Runnable runnable) {
        if (runnable == null) {
            throw new IllegalArgumentException("runnable is null!");
        }
        if (str != null) {
            str = str.trim();
        }
        FutureTask futureTask = new FutureTask(new C2552x(runnable, 0, null));
        if (TextUtils.isEmpty(str)) {
            str = "UnknownThread";
        }
        new Thread(futureTask, str).start();
        return futureTask;
    }

    public static Future<?> m19096a(Runnable runnable) {
        if (runnable != null) {
            return f14716b.submit(new C2552x(runnable, 0, null));
        }
        throw new IllegalArgumentException("runnable is null!");
    }

    public static Future<?> m19101b(Runnable runnable) {
        if (runnable != null) {
            return f14717c.submit(new C2552x(runnable, 0, null));
        }
        throw new IllegalArgumentException("runnable is null!");
    }

    public static Future<?> m19103c(Runnable runnable) {
        if (runnable != null) {
            return f14718d.submit(new C2552x(runnable, 0, null));
        }
        throw new IllegalArgumentException("runnable is null!");
    }

    public static ThreadPoolExecutor m19104c() {
        return f14719e;
    }

    public static ThreadPoolExecutor m19106d() {
        return f14720f;
    }

    public static Handler m19107e() {
        if (f14722h == null) {
            synchronized (f14721g) {
                if (f14722h == null) {
                    f14722h = new Handler(f14721g.getLooper());
                }
            }
        }
        return f14722h;
    }

    public static Handler m19109f() {
        if (f14724j == null) {
            synchronized (f14723i) {
                if (f14724j == null) {
                    f14724j = new Handler(f14723i.getLooper());
                }
            }
        }
        return f14724j;
    }

    public static Future<?> m19105d(Runnable runnable) {
        if (runnable != null) {
            return f14725k.submit(new C2552x(runnable, 0, null));
        }
        throw new IllegalArgumentException("runnable is null!");
    }

    public static Future<?> m19108e(Runnable runnable) {
        if (runnable != null) {
            return f14726l.submit(new C2552x(runnable, 0, null));
        }
        throw new IllegalArgumentException("runnable is null!");
    }

    public static Handler m19110g() {
        if (f14728n == null) {
            synchronized (f14727m) {
                if (f14728n == null) {
                    f14728n = new Handler(f14727m.getLooper());
                }
            }
        }
        return f14728n;
    }
}
