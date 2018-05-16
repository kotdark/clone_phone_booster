package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.p112b.SharedPrefHelper;
import utility.quickest.phonebooster.p114d.C2447e;
import java.io.File;

/* compiled from: AppUpdateModel */
class fb implements Runnable {
    final /* synthetic */ File f14190a;
    final /* synthetic */ fa f14191b;

    fb(fa faVar, File file) {
        this.f14191b = faVar;
        this.f14190a = file;
    }

    public void run() {
        this.f14191b.f14189b.f14172e.remove(Integer.valueOf(this.f14191b.f14188a.m17641c()));
        if (this.f14190a != null && this.f14191b.f14189b.f14169b != null && this.f14191b.f14189b.f14169b.m17641c() == this.f14191b.f14188a.m17641c()) {
            this.f14191b.f14189b.f14169b = this.f14191b.f14189b.f14169b.m17638a(this.f14190a);
             SharedPrefHelper.m17454a().m17489b(C2447e.m17634b(this.f14191b.f14189b.f14169b));
            if (this.f14191b.f14189b.f14170c) {
                this.f14191b.f14189b.f14170c = false;
                this.f14191b.f14189b.m18517e();
            } else if (!MyApplicationLike.m17418b().m17433d()) {
                this.f14191b.f14189b.m18510i();
            }
        }
    }
}
