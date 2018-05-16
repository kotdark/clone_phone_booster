package utility.quickest.phonebooster.fragment;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.model_helper.hz;
import utility.quickest.phonebooster.model_helper.jt;
import utility.quickest.phonebooster.view.C2462h;
import java.util.Map.Entry;

/* compiled from: CPUCoolingFragment */
class bb implements C2462h {
    final /* synthetic */ String f13549a;
    final /* synthetic */ ba f13550b;

    bb(ba baVar, String str) {
        this.f13550b = baVar;
        this.f13549a = str;
    }

    public void mo3092a() {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("packageName", this.f13549a);
            for (Entry entry : hz.m18683a().m18694b().entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            FirebaseAnalytics.getInstance(MyApplicationLike.getApplication()).logEvent("add_to_white_list_in_cpu_cooling", bundle);
        } catch (Throwable th) {
        }
        jt.m18785a().m18808b(this.f13549a);
    }
}
