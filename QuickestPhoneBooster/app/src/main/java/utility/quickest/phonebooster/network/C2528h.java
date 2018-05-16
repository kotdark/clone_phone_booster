package utility.quickest.phonebooster.network;

import android.text.TextUtils;
import com.appsflyer.share.Constants;
import utility.quickest.phonebooster.util.C2535e;
import io.fabric.sdk.android.services.p058b.C0880a;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.ao;
import okhttp3.ap;
import okhttp3.ax;
import okhttp3.bb;
import okhttp3.bd;
import okhttp3.bh;
import okhttp3.bj;
import okhttp3.bk;

/* compiled from: ServiceAccessor */
final class C2528h implements ao {
    private final String f14522a;

    private C2528h(String str) {
        this.f14522a = str == null ? "" : str.trim();
    }

    private bb m18864a(bb bbVar) {
        bd e = bbVar.m22085e();
        if (TextUtils.isEmpty(this.f14522a)) {
            String t = C2535e.m19055t();
            if (!TextUtils.isEmpty(t)) {
                e.m22095a(C0880a.HEADER_USER_AGENT, t);
            }
        } else {
            e.m22095a(C0880a.HEADER_USER_AGENT, this.f14522a);
        }
        e.m22095a(C0880a.HEADER_ACCEPT, "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
        e.m22095a("Accept-Encoding", "gzip,deflate");
        e.m22095a("X-Requested-With", "utility.quickest.phonebooster");
        return e.m22093a();
    }

    public bh mo3147a(ap apVar) throws IOException {
        bb a = m18864a(apVar.mo3428a());
        bh a2;
        String a3;
        try {
            a2 = apVar.mo3429a(a);
            if (a2 == null) {
                return a2;
            }
            int b = a2.m22122b();
            if (b < 300 || b >= 400) {
                return a2;
            }
            a3 = C2522c.m18852b(a2.m22119a(Constants.HTTP_REDIRECT_URL_HEADER_FIELD));
            if (TextUtils.isEmpty(a3)) {
                return a2;
            }
            return a2.m22127g().m22149a(Constants.HTTP_REDIRECT_URL_HEADER_FIELD, a3).m22145a();
        } catch (ProtocolException e) {
            a3 = e.getMessage();
            if (a3 != null && a3.contains("HTTP 204 had non-zero Content-Length")) {
                return new bj().m22153a(a).m22152a(ax.HTTP_1_1).m22146a(204).m22148a("No Content").m22155a(bk.m2771a(null, "")).m22145a();
            }
            throw e;
        } catch (Throwable th) {
            return a2;
        }
    }
}
