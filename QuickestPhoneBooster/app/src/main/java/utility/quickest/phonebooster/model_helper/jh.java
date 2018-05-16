package utility.quickest.phonebooster.model_helper;

/* compiled from: TemperatureModel */
class jh implements Runnable {
    final /* synthetic */ Integer f14452a;
    final /* synthetic */ jg f14453b;

    jh(jg jgVar, Integer num) {
        this.f14453b = jgVar;
        this.f14452a = num;
    }

    public void run() {
        this.f14453b.f14451a.mo3090a(this.f14452a == null ? 32 : this.f14452a.intValue());
    }
}
