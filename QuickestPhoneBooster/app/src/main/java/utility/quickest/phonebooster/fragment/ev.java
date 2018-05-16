package utility.quickest.phonebooster.fragment;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.model_helper.hz;
import utility.quickest.phonebooster.view.C2462h;
import java.util.Map.Entry;

/* compiled from: MemoryJunkCleanFragment */
class ev implements C2462h {
    final /* synthetic */ String f13717a;
    final /* synthetic */ eu f13718b;

    ev(eu euVar, String str) {
        this.f13718b = euVar;
        this.f13717a = str;
    }

    public void mo3092a() {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("packageName", this.f13717a);
            for (Entry entry : hz.m18683a().m18694b().entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            FirebaseAnalytics.getInstance(MyApplicationLike.getApplication()).logEvent("add_to_white_list_in_phone_boost", bundle);
        } catch (Throwable th) {
        }
        this.f13718b.f13716a.f13397e.m18808b(this.f13717a);
    }
}
