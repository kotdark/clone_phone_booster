package utility.quickest.phonebooster.cache;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bumptech.glide.C0563b;
import com.bumptech.glide.C0597f;
import com.bumptech.glide.C0631g;
import com.bumptech.glide.load.C0662a;
import com.bumptech.glide.load.p044b.C0715e;
import com.bumptech.glide.load.p044b.p046b.C0693l;
import com.bumptech.glide.load.p044b.p046b.C0696n;
import com.bumptech.glide.load.p049c.C0772e;
import com.bumptech.glide.p035e.C0588a;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.util.ViewUtil;
import java.io.InputStream;

public final class ImageCache {

    public final class MyGlideModule implements C0588a {
        public void applyOptions(Context context, C0631g c0631g) {
            if (c0631g != null) {
                c0631g.m3241a(new C0696n(C2535e.m19027a() / 6));
                c0631g.m3240a(new C0693l(MyApplicationLike.getApplication(), "image_cache", 536870912));
                c0631g.m3242a(ThreadUtil.m19106d());
                c0631g.m3243b(ThreadUtil.m19104c());
                c0631g.m3239a(C0662a.PREFER_ARGB_8888);
            }
        }

        public void registerComponents(Context context, C0597f c0597f) {
            try {
                c0597f.m3098a(C0772e.class, InputStream.class, new C2442j());
            } catch (Throwable th) {
            }
        }
    }

    public static void m17565a(Fragment fragment, ImageView imageView, String str) {
        m17566a(fragment, imageView, str, 0);
    }

    public static void m17566a(Fragment fragment, ImageView imageView, String str, int i) {
        m17567a(fragment, imageView, str, i, i);
    }

    public static void m17567a(Fragment fragment, ImageView imageView, String str, int i, int i2) {
        m17561a(null, fragment, imageView, str, i, i2);
    }

    public static void m17563a(Context context, ImageView imageView, String str, int i, int i2) {
        m17569a(imageView, str, i, i2);
    }

    public static void m17562a(Activity activity, ImageView imageView, int i) {
        m17560a(activity, null, imageView, i);
    }

    public static void m17564a(Fragment fragment, ImageView imageView, int i) {
        m17560a(null, fragment, imageView, i);
    }

    public static void m17570a(String str) {
        ThreadUtil.m19102b();
        if (str != null) {
            str = str.trim();
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                C0597f.m3091b(MyApplicationLike.getApplication()).m3295a(str).mo1184a(new C2433a());
            } catch (Throwable th) {
            }
        }
    }

    private static void m17561a(Activity activity, Fragment fragment, ImageView imageView, String str, int i, int i2) {
        ThreadUtil.m19102b();
        C0563b a;
        if (activity != null) {
            try {
                if (ViewUtil.m18936a(activity)) {
                    if (str != null) {
                        str = str.trim();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        a = C0597f.m3091b(MyApplicationLike.getApplication()).m3295a(str);
                        if (i > 0) {
                            a.m2896a(i);
                        }
                        if (i2 > 0) {
                            a.m2909b(i2);
                        }
                        a.m2922d().m2898a(new C2434b(activity)).m2900a(C0715e.SOURCE).mo1166a(imageView);
                    } else if (i > 0) {
                        m17562a(activity, imageView, i);
                    } else if (i2 > 0) {
                        m17562a(activity, imageView, i2);
                    }
                }
            } catch (Exception e) {
            }
        } else if (ViewUtil.m18937a(fragment)) {
            if (str != null) {
                str = str.trim();
            }
            if (!TextUtils.isEmpty(str)) {
                a = C0597f.m3091b(MyApplicationLike.getApplication()).m3295a(str);
                if (i > 0) {
                    a.m2896a(i);
                }
                if (i2 > 0) {
                    a.m2909b(i2);
                }
                a.m2922d().m2898a(new C2435c(fragment)).m2900a(C0715e.SOURCE).mo1166a(imageView);
            } else if (i > 0) {
                m17564a(fragment, imageView, i);
            } else if (i2 > 0) {
                m17564a(fragment, imageView, i2);
            }
        }
    }

    private static void m17560a(Activity activity, Fragment fragment, ImageView imageView, int i) {
        ThreadUtil.m19102b();
        if (activity != null) {
            try {
                if (ViewUtil.m18936a(activity)) {
                    C0597f.m3091b(MyApplicationLike.getApplication()).m3294a(Integer.valueOf(i)).m2922d().m2898a(new C2436d(activity)).m2900a(C0715e.SOURCE).mo1166a(imageView);
                }
            } catch (Exception e) {
            }
        } else if (ViewUtil.m18937a(fragment)) {
            C0597f.m3091b(MyApplicationLike.getApplication()).m3294a(Integer.valueOf(i)).m2922d().m2898a(new C2437e(fragment)).m2900a(C0715e.SOURCE).mo1166a(imageView);
        }
    }

    private static void m17569a(ImageView imageView, String str, int i, int i2) {
        ThreadUtil.m19102b();
        if (str != null) {
            try {
                str = str.trim();
            } catch (Exception e) {
                return;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            C0563b a = C0597f.m3091b(MyApplicationLike.getApplication()).m3295a(str);
            if (i > 0) {
                a.m2896a(i);
            }
            if (i2 > 0) {
                a.m2909b(i2);
            }
            a.m2922d().m2898a(new C2438f()).m2900a(C0715e.SOURCE).mo1166a(imageView);
        } else if (i > 0) {
            m17568a(imageView, i);
        } else if (i2 > 0) {
            m17568a(imageView, i2);
        }
    }

    private static void m17568a(ImageView imageView, int i) {
        ThreadUtil.m19102b();
        try {
            C0597f.m3091b(MyApplicationLike.getApplication()).m3294a(Integer.valueOf(i)).m2922d().m2898a(new C2439g()).m2900a(C0715e.SOURCE).mo1166a(imageView);
        } catch (Exception e) {
        }
    }
}
