package utility.quickest.phonebooster.network;

import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.ap;
import okhttp3.ax;
import okhttp3.bb;
import okhttp3.bh;
import okhttp3.bj;
import okhttp3.bk;

/* compiled from: ServiceAccessor */
class C2527g extends C2526i {
    private C2527g() {
        super();
    }

    public bh mo3147a(ap apVar) throws IOException {
        boolean z = false;
        bb a = apVar.mo3428a();
        try {
            z = a.m22081a().m21948a().getHost().toLowerCase().endsWith("goclean.tech".toLowerCase());
        } catch (Throwable th) {
        }
        if (z) {
            return super.mo3147a(apVar);
        }
        try {
            return apVar.mo3429a(a);
        } catch (ProtocolException e) {
            String message = e.getMessage();
            if (message != null && message.contains("HTTP 204 had non-zero Content-Length")) {
                return new bj().m22153a(a).m22152a(ax.HTTP_1_1).m22146a(204).m22148a("No Content").m22155a(bk.m2771a(null, "")).m22145a();
            }
            throw e;
        }
    }
}
