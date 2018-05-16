package utility.quickest.phonebooster.view;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import utility.quickest.phonebooster.model_helper.ig;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.R;

public class RateDialog extends Dialog {
    private Activity f14971a;
    @BindView
    protected ViewGroup mContainer;
    @BindView
    protected View mGap;
    @BindView
    protected ImageView mImage;

    @OnClick
    public void confirm() {
        C2542m.m19082a("rate_dialog", "confirm", null);
        try {
            dismiss();
        } catch (Throwable th) {
        }
        ig.m18707a().m18719f();
    }

    @OnClick
    public void doClose() {
        C2542m.m19082a("rate_dialog", "close", null);
        try {
            dismiss();
        } catch (Throwable th) {
        }
    }

    public RateDialog(Activity activity) {
        super(activity);
        this.f14971a = activity;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        setCancelable(false);
        setContentView(R.layout.dialog_feed_back);
        ButterKnife.m2792a((Dialog) this);
        try {
            this.mImage.setImageResource(R.drawable.im_illustration_2);
        } catch (Throwable th) {
        }
        LayoutParams layoutParams = new RelativeLayout.LayoutParams((C2535e.f14679c * 21) / 36, -2);
        layoutParams.addRule(13);
        this.mContainer.setLayoutParams(layoutParams);
        layoutParams = new RelativeLayout.LayoutParams(-1, (C2535e.f14680d * 5) / 64);
        layoutParams.setMargins(0, (C2535e.f14680d * 5) / 64, 0, 0);
        this.mGap.setLayoutParams(layoutParams);
        layoutParams = new RelativeLayout.LayoutParams((C2535e.f14680d * 5) / 32, (C2535e.f14680d * 5) / 32);
        layoutParams.addRule(14);
        this.mImage.setLayoutParams(layoutParams);
    }

    public void m19229a() {
        try {
            show();
        } catch (Throwable th) {
        }
    }
}
