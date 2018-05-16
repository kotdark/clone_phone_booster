package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p112b.SharedPrefHelper;

/* compiled from: AntivirusHelper */
final class di implements Runnable {
    di() {
    }

    public void run() {
        if (Math.abs(System.currentTimeMillis() -  SharedPrefHelper.m17454a().m17478X()) >= 3600000) {
            dh.m18443f();
        }
        dh.f14091b.postDelayed(dh.f14092c, 14400000);
    }
}
