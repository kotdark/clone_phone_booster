package utility.quickest.phonebooster.network;

import android.text.TextUtils;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Map.Entry;
import okhttp3.ah;
import okhttp3.ao;
import okhttp3.ap;
import okhttp3.ax;
import okhttp3.bb;
import okhttp3.bd;
import okhttp3.bh;
import okhttp3.bj;
import okhttp3.bk;

/* compiled from: ServiceAccessor */
class C2526i implements ao {
    private C2526i() {
    }

    private void m18861a(bd bdVar, ah ahVar) {
        if (bdVar != null && ahVar != null) {
            int a = ahVar.m21916a();
            for (int i = 0; i < a; i++) {
                String a2 = ahVar.m21917a(i);
                CharSequence b = ahVar.m21919b(i);
                if (a2 != null) {
                    if (b != null) {
                        b = b.trim();
                    }
                    if (TextUtils.isEmpty(b)) {
                        bdVar.m22099b(a2);
                    }
                }
            }
        }
    }

    private void m18860a(bd bdVar, String str, String str2, ah ahVar) {
        if (bdVar != null) {
            if (str != null) {
                str = str.trim();
            }
            if (!TextUtils.isEmpty(str)) {
                if (str2 != null) {
                    str2 = str2.trim();
                }
                if (!TextUtils.isEmpty(str2)) {
                    if (ahVar != null) {
                        String a = ahVar.m21918a(str);
                        if (!(a == null || TextUtils.isEmpty(a.trim()))) {
                            return;
                        }
                    }
                    bdVar.m22095a(str, str2);
                }
            }
        }
    }

    private bb m18859a(bb bbVar) {
        bd e = bbVar.m22085e();
        ah c = bbVar.m22083c();
        m18861a(e, c);
        for (Entry entry : C2522c.m18849a(null).entrySet()) {
            m18860a(e, (String) entry.getKey(), (String) entry.getValue(), c);
        }
        return e.m22093a();
    }

    public bh mo3147a(ap apVar) throws IOException {
        bb a = m18859a(apVar.mo3428a());
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
