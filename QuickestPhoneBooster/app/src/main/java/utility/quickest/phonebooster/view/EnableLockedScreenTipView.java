package utility.quickest.phonebooster.view;

import android.animation.ObjectAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.util.C2461k;
import utility.quickest.phonebooster.util.C2539i;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.R;

public class EnableLockedScreenTipView extends FrameLayout {
    private static final Handler f14896k = new Handler(Looper.getMainLooper());
    private Context f14897a;
    private Resources f14898b;
    private AnimationDrawable f14899c;
    private boolean f14900d;
    private al f14901e;
    private am f14902f;
    private int f14903g;
    private int f14904h;
    private final C2461k f14905i;
    private final BroadcastReceiver f14906j;
    private final Runnable f14907l;
    @BindView
    protected ImageView mAnimImage;
    @BindView
    protected ViewGroup mContainer;
    @BindView
    protected TextView mTip;
    @BindView
    protected ViewGroup mTipContainer;

    @OnClick
    public void doTip() {
        m19200d();
    }

    @OnClick
    public void doContainerClick() {
        m19202e();
    }

    public EnableLockedScreenTipView(Context context) {
        this(context, null, 0);
    }

    public EnableLockedScreenTipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14897a = MyApplicationLike.getApplication();
        this.f14898b = MyApplicationLike.getApplication().getResources();
        this.f14900d = false;
        this.f14905i = new ae(this);
        this.f14906j = new af(this);
        this.f14907l = new ag(this);
        m19198c();
    }

    private void m19198c() {
        View inflate = LayoutInflater.from(this.f14897a).inflate(R.layout.fragment_enable_lock_screen_tip, null);
        ButterKnife.m2793a(this, inflate);
        this.f14899c = (AnimationDrawable) this.mAnimImage.getBackground();
        getViewTreeObserver().addOnGlobalLayoutListener(new ah(this));
        if (this.f14899c != null) {
            this.f14899c.start();
        }
        addView(inflate);
        f14896k.removeCallbacks(this.f14907l);
        f14896k.postDelayed(this.f14907l, 500);
        C2539i.EVENT_CLOSE_ENABLE_LOCKED_SCREEN_TIP_VIEW.m19063a(this.f14905i);
        MyApplicationLike.getApplication().registerReceiver(this.f14906j, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            m19202e();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public void m19203a() {
        f14896k.removeCallbacks(this.f14907l);
        C2539i.EVENT_CLOSE_ENABLE_LOCKED_SCREEN_TIP_VIEW.m19066b(this.f14905i);
        if (this.f14906j != null) {
            MyApplicationLike.getApplication().unregisterReceiver(this.f14906j);
        }
        if (this.f14901e != null) {
            this.f14901e.mo3143a();
        }
    }

    private void m19200d() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mTipContainer, "translationY", new float[]{(float) this.f14903g, 0.0f});
        ofFloat.setDuration(500);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.mTip, "translationX", new float[]{0.0f, (float) this.f14904h});
        ofFloat2.setDuration(500);
        ofFloat2.addListener(new ai(this, ofFloat));
        ofFloat2.start();
    }

    private void m19202e() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mTip, "translationX", new float[]{(float) this.f14904h, 0.0f});
        ofFloat.setDuration(500);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.mTipContainer, "translationY", new float[]{0.0f, (float) this.f14903g});
        ofFloat2.setDuration(500);
        ofFloat2.addListener(new aj(this, ofFloat));
        ofFloat2.start();
        ThreadUtil.m19098a(new ak(this), 500);
    }

    public void setOnDismissListener(al alVar) {
        this.f14901e = alVar;
    }

    public void setOnUpdateListener(am amVar) {
        this.f14902f = amVar;
    }
}
