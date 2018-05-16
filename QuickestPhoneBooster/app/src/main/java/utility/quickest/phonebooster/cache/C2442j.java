package utility.quickest.phonebooster.cache;

import android.content.Context;
import com.bumptech.glide.load.p049c.C0738s;
import com.bumptech.glide.load.p049c.C0742t;
import com.bumptech.glide.load.p049c.C0770c;
import com.bumptech.glide.load.p049c.C0772e;
import utility.quickest.phonebooster.network.C2522c;
import java.io.InputStream;
import okhttp3.C3068i;

/* compiled from: ImageCache */
final class C2442j implements C0742t<C0772e, InputStream> {
    private static volatile C3068i f13069a;
    private final C3068i f13070b;

    private C2442j() {
        this(C2442j.m17604b());
    }

    private C2442j(C3068i c3068i) {
        this.f13070b = c3068i;
    }

    private static C3068i m17604b() {
        if (f13069a == null) {
            synchronized (C2442j.class) {
                if (f13069a == null) {
                    f13069a = C2522c.m18853c();
                }
            }
        }
        return f13069a;
    }

    public C0738s<C0772e, InputStream> mo1279a(Context context, C0770c c0770c) {
        return new C2441i(this.f13070b);
    }

    public void mo1280a() {
    }
}
