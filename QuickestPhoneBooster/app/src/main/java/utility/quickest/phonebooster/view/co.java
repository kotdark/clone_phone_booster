package utility.quickest.phonebooster.view;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.support.v4.widget.ExploreByTouchHelper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout.LayoutParams;
import utility.quickest.phonebooster.util.ViewUtil;
import io.fabric.sdk.android.services.p058b.C0880a;

/* compiled from: StatusBarCompat */
public class co {
    private static final int f15214a = Color.parseColor("#20000000");

    public static void m19372a(Activity activity, int i) {
        if (ViewUtil.m18936a(activity)) {
            Window window = activity.getWindow();
            if (window == null) {
                return;
            }
            if (VERSION.SDK_INT >= 21) {
                if (i != -1) {
                    window.addFlags(ExploreByTouchHelper.INVALID_ID);
                    window.setStatusBarColor(i);
                }
            } else if (VERSION.SDK_INT >= 19 && VERSION.SDK_INT < 21) {
                int i2 = f15214a;
                if (i == -1) {
                    i = i2;
                }
                window.addFlags(67108864);
                ViewGroup viewGroup = (ViewGroup) window.getDecorView();
                View findViewWithTag = viewGroup.findViewWithTag("status_viewutility.quickest.phonebooster");
                if (findViewWithTag != null) {
                    viewGroup.removeView(findViewWithTag);
                }
                viewGroup.addView(m19373b(activity, i));
                viewGroup = (ViewGroup) ((ViewGroup) activity.findViewById(16908290)).getChildAt(0);
                viewGroup.setFitsSystemWindows(true);
                viewGroup.setClipToPadding(true);
            }
        }
    }

    private static View m19373b(Activity activity, int i) {
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(activity.getResources().getIdentifier("status_bar_height", "dimen", C0880a.ANDROID_CLIENT_TYPE));
        if ((activity.getWindow().getAttributes().flags & 1024) == 1024) {
            dimensionPixelSize = 0;
        }
        View view = new View(activity);
        view.setLayoutParams(new LayoutParams(-1, dimensionPixelSize));
        view.setBackgroundColor(i);
        view.setTag("status_viewutility.quickest.phonebooster");
        return view;
    }
}
