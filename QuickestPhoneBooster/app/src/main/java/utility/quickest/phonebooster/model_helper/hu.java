package utility.quickest.phonebooster.model_helper;

/* compiled from: PushModel */
class hu implements Runnable {
    final /* synthetic */ hs f14359a;

    hu(hs hsVar) {
        this.f14359a = hsVar;
    }

    public void run() {
        if (this.f14359a.f14355c != null) {
            try {
                this.f14359a.f14355c.release();
            } catch (Throwable th) {
            }
        }
    }
}
