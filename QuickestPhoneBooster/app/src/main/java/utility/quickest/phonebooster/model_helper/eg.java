package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.activity.PopupAppDeletedActivity;

/* compiled from: AppModificationHelper */
class eg implements Runnable {
    final /* synthetic */ String f14140a;
    final /* synthetic */ ef f14141b;

    eg(ef efVar, String str) {
        this.f14141b = efVar;
        this.f14140a = str;
    }

    public void run() {
        PopupAppDeletedActivity.m17306a(this.f14140a);
    }
}
