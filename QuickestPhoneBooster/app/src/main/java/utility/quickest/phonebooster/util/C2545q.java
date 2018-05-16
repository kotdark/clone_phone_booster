package utility.quickest.phonebooster.util;

import java.util.concurrent.ThreadFactory;

/* compiled from: ThreadUtil */
final class C2545q implements ThreadFactory {
    C2545q() {
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "SharedPrefTask");
    }
}
