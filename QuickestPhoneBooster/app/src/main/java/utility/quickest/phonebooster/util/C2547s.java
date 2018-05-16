package utility.quickest.phonebooster.util;

import java.util.concurrent.ThreadFactory;

/* compiled from: ThreadUtil */
final class C2547s implements ThreadFactory {
    C2547s() {
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "NetworkTask");
    }
}
