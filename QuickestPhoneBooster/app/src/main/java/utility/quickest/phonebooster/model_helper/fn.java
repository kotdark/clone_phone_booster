package utility.quickest.phonebooster.model_helper;

/* compiled from: CleanNotificationModel */
class fn implements Runnable {
    final /* synthetic */ fl f14207a;

    fn(fl flVar) {
        this.f14207a = flVar;
    }

    public void run() {
        BatteryModel.m18196a().m18214a(new fo(this), fk.SLOW);
    }
}
