package utility.quickest.phonebooster.model_helper;

/* compiled from: AntivirusHelper */
class dm implements Runnable {
    final /* synthetic */ int f14102a;
    final /* synthetic */ String f14103b;
    final /* synthetic */ dl f14104c;

    dm(dl dlVar, int i, String str) {
        this.f14104c = dlVar;
        this.f14102a = i;
        this.f14103b = str;
    }

    public void run() {
        if (this.f14104c.f14101d.f14094e != null) {
            int i = 0;
            try {
                i = (int) ((((float) this.f14102a) / ((float) this.f14104c.f14098a.size())) * 100.0f);
            } catch (Throwable th) {
            }
            this.f14104c.f14101d.f14094e.mo3089a(this.f14103b, i);
        }
    }
}
