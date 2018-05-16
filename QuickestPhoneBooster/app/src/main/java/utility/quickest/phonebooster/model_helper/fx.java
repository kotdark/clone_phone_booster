package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p112b.SharedPrefHelper;

/* compiled from: DeepJunkHelper */
final class fx implements Runnable {
    fx() {
    }

    public void run() {
        if (Math.abs(System.currentTimeMillis() -  SharedPrefHelper.m17454a().m17477W()) >= 3600000) {
            fw.m18594i();
        }
        fw.f14235b.postDelayed(fw.f14236c, 14400000);
    }
}
