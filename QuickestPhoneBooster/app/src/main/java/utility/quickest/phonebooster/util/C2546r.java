package utility.quickest.phonebooster.util;

import java.util.concurrent.ThreadFactory;

/* compiled from: ThreadUtil */
final class C2546r implements ThreadFactory {
    C2546r() {
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "DatabaseTask");
    }
}
