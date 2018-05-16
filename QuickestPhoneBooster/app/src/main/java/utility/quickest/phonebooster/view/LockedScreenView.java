package utility.quickest.phonebooster.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.CustomEvent;
import utility.quickest.phonebooster.activity.MainActivity;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.fragment.LockedScreenFragment;
import utility.quickest.phonebooster.model_helper.BatteryModel;
import utility.quickest.phonebooster.model_helper.fj;
import utility.quickest.phonebooster.model_helper.fk;
import utility.quickest.phonebooster.model_helper.hd;
import utility.quickest.phonebooster.model_helper.ig;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ThreadUtil;
import com.mopub.mobileads.VastExtensionXmlManager;
import com.mopub.volley.DefaultRetryPolicy;
import utility.quickest.phonebooster.R;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LockedScreenView extends hd {
    private static final Handler f14923h = new Handler(Looper.getMainLooper());
    private Context f14924a;
    private Resources f14925b;
    private boolean f14926c;
    private BatteryModel f14927d;
    private SimpleDateFormat f14928e;
    private SimpleDateFormat f14929f;
    private final fj f14930g;
    private final Runnable f14931i;
    @BindView
    protected ViewGroup mCloseChoiceContainer;
    @BindView
    protected TextView mJunkCleanButton;
    @BindView
    protected BatteryViewVertical mLockScreenBattery;
    @BindView
    protected ImageView mLockScreenBatteryIcon;
    @BindView
    protected TextView mLockScreenDate;
    @BindView
    protected ProgressBar mLockScreenJunkProgress;
    @BindView
    protected TextView mLockScreenJunkSize;
    @BindView
    protected TextView mLockScreenJunkTag;
    @BindView
    protected ProgressBar mLockScreenMemoryProgress;
    @BindView
    protected TextView mLockScreenMemorySize;
    @BindView
    protected TextView mLockScreenMemoryTag;
    @BindView
    protected TextView mLockScreenTime;
    @BindView
    protected TextView mLockScreenUnlock;
    @BindView
    protected TextView mPhoneBoostButton;
    @BindView
    protected ViewGroup mSettingPopupContainer;

    @OnClick
    public void closeWindow() {
        LockedScreenFragment.m17803d();
        C2542m.m19082a("locked_screen_view", "sp_close", null);
        m19212f();
    }

    @OnClick
    public void closeLockScreen() {
        LockedScreenFragment.m17803d();
        C2542m.m19082a("locked_screen_view", "sp_close_ls", null);
        this.mCloseChoiceContainer.setVisibility(0);
        m19212f();
    }

    @OnClick
    public void closeChoiceDialog() {
        LockedScreenFragment.m17803d();
        C2542m.m19082a("locked_screen_view", "win_close", null);
        m19213g();
    }

    @OnClick
    public void onYes() {
        LockedScreenFragment.m17803d();
        C2542m.m19082a("locked_screen_view", "win_yes", null);
        ig.m18707a().m18715c(false);
        ThreadUtil.m19098a(new ay(this), 400);
        m19213g();
    }

    @OnClick
    public void onNo() {
        LockedScreenFragment.m17803d();
        C2542m.m19082a("locked_screen_view", "win_no", null);
        ig.m18707a().m18715c(true);
        m19213g();
    }

    @OnClick
    public void doSetting() {
        LockedScreenFragment.m17803d();
        C2542m.m19082a("locked_screen_view", "setting", null);
        this.mSettingPopupContainer.setVisibility(0);
    }

    @OnClick
    public void openMemoryClean() {
        LockedScreenFragment.m17803d();
        C2542m.m19082a("locked_screen_view", "phone_boost", null);
        C2542m.m19085a("locked_screen_view", "func", null, null, null, "phone_boost");
        try {
            Answers.getInstance().logCustom(new CustomEvent("LockedScreenToClick"));
            Answers.getInstance().logCustom((CustomEvent) new CustomEvent("lock_screen_click").putCustomAttribute(VastExtensionXmlManager.TYPE, "phone_boost"));
        } catch (Throwable th) {
        }
        MainActivity.m17287a("locked_screen_phone_boost");
        m18621a();
    }

    @OnClick
    public void openJunkClean() {
        LockedScreenFragment.m17803d();
        C2542m.m19082a("locked_screen_view", "junk_clean", null);
        C2542m.m19085a("locked_screen_view", "func", null, null, null, "junk_clean");
        try {
            Answers.getInstance().logCustom(new CustomEvent("LockedScreenToClick"));
            Answers.getInstance().logCustom((CustomEvent) new CustomEvent("lock_screen_click").putCustomAttribute(VastExtensionXmlManager.TYPE, "junk_clean"));
        } catch (Throwable th) {
        }
        MainActivity.m17287a("locked_screen_junk_clean");
        m18621a();
    }

    public LockedScreenView(Context context) {
        this(context, null, 0);
    }

    public LockedScreenView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14924a = MyApplicationLike.getApplication();
        this.f14925b = MyApplicationLike.getApplication().getResources();
        this.f14926c = false;
        this.f14927d = BatteryModel.m18196a();
        this.f14928e = new SimpleDateFormat("E dd/MM");
        this.f14929f = new SimpleDateFormat("HH:mm");
        this.f14930g = new aw(this);
        this.f14931i = new ax(this);
        m19211e();
    }

    private void m19211e() {
        Runnable azVar;
        LayoutInflater from = LayoutInflater.from(this.f14924a);
        View inflate = from.inflate(R.layout.fragment_locked_screen, null);
        ButterKnife.m2793a(this, inflate);
        this.mSettingPopupContainer.setVisibility(8);
        this.mCloseChoiceContainer.setVisibility(8);
        if (!(this.mLockScreenMemoryTag == null || this.mLockScreenJunkTag == null)) {
            azVar = new az(this);
            ThreadUtil.m19098a(azVar, 500);
            ThreadUtil.m19099a(true, azVar);
        }
        azVar = new ba(this);
        ThreadUtil.m19098a(azVar, 500);
        ThreadUtil.m19099a(true, azVar);
        this.f14927d.m18214a(this.f14930g, fk.VERY_FAST);
        m19214h();
        Pair p = C2535e.m19051p();
        int longValue = (int) ((DefaultRetryPolicy.DEFAULT_BACKOFF_MULT - (((float) ((Long) p.first).longValue()) / ((float) ((Long) p.second).longValue()))) * 100.0f);
        this.mLockScreenMemorySize.setText(C2542m.m19078a(this.f14925b.getString(R.string.percent_unit), String.valueOf(longValue)));
        this.mLockScreenMemoryProgress.setProgress(longValue);
        p = C2535e.m19052q();
        longValue = (int) ((DefaultRetryPolicy.DEFAULT_BACKOFF_MULT - (((float) ((Long) p.first).longValue()) / ((float) ((Long) p.second).longValue()))) * 100.0f);
        this.mLockScreenJunkSize.setText(C2542m.m19078a(this.f14925b.getString(R.string.percent_unit), String.valueOf(longValue)));
        this.mLockScreenJunkProgress.setProgress(longValue);
        this.mLockScreenDate.setText(this.f14928e.format(new Date()));
        this.mLockScreenTime.setText(this.f14929f.format(new Date()));
        this.mLockScreenBattery.setmCurrentEnegryPercent(this.f14927d.m18215b().m17663a());
        this.mLockScreenBattery.setmIsCharging(this.f14927d.m18215b().m17664b());
        SwipeBackLayout1 swipeBackLayout1 = (SwipeBackLayout1) from.inflate(R.layout.base1, null);
        swipeBackLayout1.m19254a(inflate, new bb(this));
        addView(swipeBackLayout1);
        f14923h.removeCallbacks(this.f14931i);
        f14923h.postDelayed(this.f14931i, 1000);
    }

    public void mo3149c() {
        this.f14927d.m18213a(this.f14930g);
        f14923h.removeCallbacks(this.f14931i);
    }

    private void m19212f() {
        this.mSettingPopupContainer.setVisibility(8);
    }

    private void m19213g() {
        this.mCloseChoiceContainer.setVisibility(8);
    }

    private void m19214h() {
        if (this.f14927d.m18215b() != null) {
            if (this.f14927d.m18215b().m17665c()) {
                this.mLockScreenBattery.setVisibility(0);
                this.mLockScreenBatteryIcon.setVisibility(0);
                return;
            }
            this.mLockScreenBattery.setVisibility(8);
            this.mLockScreenBatteryIcon.setVisibility(8);
        }
    }
}
