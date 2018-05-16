package utility.quickest.phonebooster.model_helper;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: LockedScreenWindowHelper */
public abstract class hd extends FrameLayout {
    private static final Handler f14316a = new Handler(Looper.getMainLooper());
    private final Runnable f14317b = new he(this);
    private hf f14318c = null;

    public hd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void m18621a() {
        ThreadUtil.m19102b();
        if (this.f14318c != null) {
            this.f14318c.mo3142a();
        }
        f14316a.removeCallbacks(this.f14317b);
    }

    public void setDismissHandler(hf hfVar) {
        ThreadUtil.m19102b();
        this.f14318c = hfVar;
    }

    private void mo3149c() {
        f14316a.removeCallbacks(this.f14317b);
        this.f14317b.run();
    }
}
