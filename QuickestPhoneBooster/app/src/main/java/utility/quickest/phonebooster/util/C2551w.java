package utility.quickest.phonebooster.util;

import java.util.concurrent.ThreadFactory;

/* compiled from: ThreadUtil */
final class C2551w implements ThreadFactory {
    C2551w() {
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AppRunningTask");
    }
}
