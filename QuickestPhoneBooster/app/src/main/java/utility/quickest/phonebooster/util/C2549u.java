package utility.quickest.phonebooster.util;

import java.util.concurrent.ThreadFactory;

/* compiled from: ThreadUtil */
final class C2549u implements ThreadFactory {
    C2549u() {
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "RemoteImageTask");
    }
}
