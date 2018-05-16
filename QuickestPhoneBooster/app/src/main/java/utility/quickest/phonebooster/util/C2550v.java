package utility.quickest.phonebooster.util;

import java.util.concurrent.ThreadFactory;

/* compiled from: ThreadUtil */
final class C2550v implements ThreadFactory {
    C2550v() {
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "VirusTask");
    }
}
