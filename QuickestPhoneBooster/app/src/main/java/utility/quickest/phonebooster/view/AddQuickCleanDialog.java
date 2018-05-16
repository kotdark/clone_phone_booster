package utility.quickest.phonebooster.view;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import utility.quickest.phonebooster.model_helper.ig;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ThreadUtil;
import com.mopub.volley.DefaultRetryPolicy;
import utility.quickest.phonebooster.R;

public class AddQuickCleanDialog extends Dialog {
    @BindView
    protected TextView mAddQcDialogCreate;
    @BindView
    protected TextView mAddQcDialogCreated;
    @BindView
    protected View mGap;
    @BindView
    protected ImageView mImage;

    @OnClick
    public void confirm() {
        C2542m.m19082a("add_qc_dialog", "create", null);
        ig.m18707a().m18718e();
        this.mAddQcDialogCreate.setVisibility(8);
        this.mAddQcDialogCreated.setVisibility(0);
        this.mAddQcDialogCreated.setAlpha(0.0f);
        m19117b();
    }

    @OnClick
    public void doClose() {
        C2542m.m19082a("add_qc_dialog", "close", null);
        dismiss();
    }

    public AddQuickCleanDialog(Activity activity) {
        super(activity);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        setContentView(R.layout.dialog_add_quick_clean);
        ButterKnife.m2792a((Dialog) this);
        this.mAddQcDialogCreate.setVisibility(0);
        this.mAddQcDialogCreated.setVisibility(8);
        try {
            this.mImage.setImageResource(R.drawable.im_illustration_3);
        } catch (Throwable th) {
        }
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C2535e.f14680d / 16);
        layoutParams.setMargins(0, (C2535e.f14680d * 5) / 64, 0, 0);
        this.mGap.setLayoutParams(layoutParams);
        layoutParams = new RelativeLayout.LayoutParams(C2535e.f14679c / 3, C2535e.f14679c / 3);
        layoutParams.addRule(14);
        this.mImage.setLayoutParams(layoutParams);
    }

    private void m19117b() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT});
        ofFloat.setRepeatCount(0);
        ofFloat.setDuration(700);
        ofFloat.addUpdateListener(new C2578a(this));
        ofFloat.addListener(new C2579b(this));
        ofFloat.start();
    }

    public void m19118a() {
        try {
            ThreadUtil.m19098a(new C2580c(this), 500);
        } catch (Throwable th) {
        }
    }
}
