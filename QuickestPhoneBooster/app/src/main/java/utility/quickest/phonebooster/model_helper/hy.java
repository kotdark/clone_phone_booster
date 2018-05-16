package utility.quickest.phonebooster.model_helper;

import com.google.gson.C2365j;
import utility.quickest.phonebooster.network.C2522c;
import utility.quickest.phonebooster.network.response_data.ConfigurationServiceExpression;
import utility.quickest.phonebooster.p112b.SharedPrefHelper;
import utility.quickest.phonebooster.p114d.C2443a;
import utility.quickest.phonebooster.util.C2542m;
import java.io.IOException;

/* compiled from: RemoteConfigurationModel */
class hy implements Runnable {
    final /* synthetic */ C2443a f14365a;
    final /* synthetic */ String f14366b;
    final /* synthetic */ hx f14367c;

    hy(hx hxVar, C2443a c2443a, String str) {
        this.f14367c = hxVar;
        this.f14365a = c2443a;
        this.f14366b = str;
    }

    public void run() {
        try {
            Object obj = (ConfigurationServiceExpression) C2522c.m18847a().m18846b(C2542m.m19076a(this.f14365a.m17612b()), C2542m.m19076a(this.f14366b)).mo1131a().m2659b();
            if (obj != null) {
                 SharedPrefHelper.m17454a().m17509f(new C2365j().m17182a(obj));
            }
        } catch (IOException e) {
        }
    }
}
