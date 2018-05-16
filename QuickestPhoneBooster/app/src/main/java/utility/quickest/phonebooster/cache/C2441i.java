package utility.quickest.phonebooster.cache;

import com.bumptech.glide.load.p043a.C0650c;
import com.bumptech.glide.load.p049c.C0738s;
import com.bumptech.glide.load.p049c.C0772e;
import java.io.InputStream;
import okhttp3.C3068i;

/* compiled from: ImageCache */
final class C2441i implements C0738s<C0772e, InputStream> {
    private final C3068i f13068a;

    private C2441i(C3068i c3068i) {
        this.f13068a = c3068i;
    }

    public C0650c<InputStream> m17602a(C0772e c0772e, int i, int i2) {
        return new C2440h(this.f13068a, c0772e);
    }
}
