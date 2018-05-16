package utility.quickest.phonebooster.model_helper;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.p112b.SharedPrefHelper;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.view.EnableLockedScreenTipView;

/* compiled from: LockedScreenWindowHelper */
public final class gz {
    private static hg f14308a = null;
    private static boolean f14309b = false;

    public static void m18603a(hg hgVar) {
        ThreadUtil.m19102b();
        f14308a = hgVar;
    }

    public static boolean m18604a() {
        ThreadUtil.m19102b();
        return  SharedPrefHelper.m17454a().m17501e() >= hw.m18677a().m18679a("key_window_mode_ls_version", 10200);
    }

    public static boolean m18606b() {
        ThreadUtil.m19102b();
        if (VERSION.SDK_INT >= 23) {
            return Settings.canDrawOverlays(MyApplicationLike.getApplication());
        }
        return true;
    }

    public static void m18607c() {
        ThreadUtil.m19102b();
        if (!m18606b()) {
            try {
                if (VERSION.SDK_INT >= 23) {
                    Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:utility.quickest.phonebooster"));
                    intent.setFlags(1409286144);
                    MyApplicationLike.getApplication().startActivity(intent);
                    m18609e();
                }
            } catch (Throwable th) {
            }
        }
    }

    public static void m18608d() {
        ThreadUtil.m19102b();
        if (m18606b() && !f14309b) {
            View view;
            View view2 = null;
            try {
                if (f14308a != null) {
                    view2 = f14308a.mo3079a();
                }
                view = view2;
            } catch (Throwable th) {
                view = null;
            }
            if (view != null) {
                view.setDismissHandler(new ha(view));
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
                LayoutParams layoutParams = new WindowManager.LayoutParams();
                if (VERSION.SDK_INT >= 26) {
                    layoutParams.type = 2038;
                } else {
                    layoutParams.type = 2010;
                }
                layoutParams.format = -2;
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.gravity = 48;
                layoutParams.x = 0;
                layoutParams.y = 0;
                layoutParams.systemUiVisibility = 514;
                if (VERSION.SDK_INT >= 19) {
                    layoutParams.systemUiVisibility |= 4096;
                }
                layoutParams.flags = 4719616;
                try {
                    ((WindowManager) MyApplicationLike.getApplication().getSystemService("window")).addView(view, layoutParams);
                    view.mo3149c();
                    f14309b = true;
                } catch (Throwable th2) {
                }
            }
        }
    }

    private static void m18609e() {
        View enableLockedScreenTipView;
        ThreadUtil.m19102b();
        Context a = MyApplicationLike.getApplication();
        WindowManager windowManager = (WindowManager) a.getSystemService("window");
        try {
            enableLockedScreenTipView = new EnableLockedScreenTipView(a);
        } catch (Throwable th) {
            enableLockedScreenTipView = null;
        }
        if (enableLockedScreenTipView != null) {
            enableLockedScreenTipView.setOnDismissListener(new hb(windowManager, enableLockedScreenTipView));
            enableLockedScreenTipView.setOnUpdateListener(new hc(windowManager, enableLockedScreenTipView));
            LayoutParams layoutParams = new WindowManager.LayoutParams(2005);
            layoutParams.width = -1;
            layoutParams.height = -1;
            layoutParams.gravity = 80;
            layoutParams.format = -2;
            try {
                windowManager.addView(enableLockedScreenTipView, layoutParams);
            } catch (Throwable th2) {
            }
        }
    }
}
