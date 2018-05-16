package utility.quickest.phonebooster.model_helper;

import com.google.gson.C2365j;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.network.response_data.AdConfigServiceExpression;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.R;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* compiled from: AdvertisementModel */
class C2501h implements Runnable {
    final /* synthetic */ C2492b f14310a;

    C2501h(C2492b c2492b) {
        this.f14310a = c2492b;
    }

    public void run() {
        C2509p a;
        Throwable th = null;
        try {
            a = C2492b.m18306c(C2492b.m18318g());
            if (a == null) {
                AdConfigServiceExpression adConfigServiceExpression;
                try {
                    adConfigServiceExpression = (AdConfigServiceExpression) new C2365j().m17177a(new BufferedReader(new InputStreamReader(MyApplicationLike.getApplication().getResources().openRawResource(R.raw.default_ad_config))), AdConfigServiceExpression.class);
                } catch (Throwable th2) {
                    adConfigServiceExpression = null;
                }
                a = C2492b.m18306c(adConfigServiceExpression);
            }
        } catch (Throwable th3) {
            th = th3;
            Object obj = null;
        }
        ThreadUtil.m19099a(false, new C2502i(this, a));
        if (th != null) {
            throw new RuntimeException(th);
        }
    }
}
