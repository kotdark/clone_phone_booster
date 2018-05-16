package utility.quickest.phonebooster.util;

import java.util.concurrent.ThreadFactory;

/* compiled from: ThreadUtil */
final class C2548t implements ThreadFactory {
    C2548t() {
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "LocalImageTask");
    }
}
