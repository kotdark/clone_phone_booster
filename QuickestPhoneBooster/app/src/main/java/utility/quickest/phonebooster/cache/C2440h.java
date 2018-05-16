package utility.quickest.phonebooster.cache;

import com.bumptech.glide.C0636h;
import com.bumptech.glide.load.p043a.C0650c;
import com.bumptech.glide.load.p049c.C0772e;
import com.bumptech.glide.p042i.C0638b;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map.Entry;
import okhttp3.C3068i;
import okhttp3.C3070h;
import okhttp3.bd;
import okhttp3.bh;
import okhttp3.bk;

/* compiled from: ImageCache */
final class C2440h implements C0650c<InputStream> {
    private final C3068i f13063a;
    private final C0772e f13064b;
    private InputStream f13065c;
    private bk f13066d;
    private volatile C3070h f13067e;

    public /* synthetic */ Object mo1229a(C0636h c0636h) throws Exception {
        return m17599b(c0636h);
    }

    private C2440h(C3068i c3068i, C0772e c0772e) {
        this.f13063a = c3068i;
        this.f13064b = c0772e;
    }

    public InputStream m17599b(C0636h c0636h) throws Exception {
        bd a = new bd().m22094a(this.f13064b.m3619b());
        for (Entry entry : this.f13064b.m3620c().entrySet()) {
            a.m22100b((String) entry.getKey(), (String) entry.getValue());
        }
        this.f13067e = this.f13063a.mo3408a(a.m22093a());
        bh execute = FirebasePerfOkHttpClient.execute(this.f13067e);
        this.f13066d = execute.m22126f();
        if (execute.m22123c()) {
            this.f13065c = C0638b.m3254a(this.f13066d.m2775c(), this.f13066d.mo1134b());
            return this.f13065c;
        }
        throw new IOException("Request failed with code: " + execute.m22122b());
    }

    public void mo1230a() {
        try {
            if (this.f13065c != null) {
                this.f13065c.close();
            }
        } catch (IOException e) {
        }
        if (this.f13066d != null) {
            this.f13066d.close();
        }
    }

    public String mo1231b() {
        return this.f13064b.m3621d();
    }

    public void mo1232c() {
        C3070h c3070h = this.f13067e;
        if (c3070h != null) {
            c3070h.mo3419c();
        }
    }
}
