package utility.quickest.phonebooster.view;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.model_helper.hh;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.R;
import java.util.Random;

public class ShareDialog extends Dialog {
    private long f14986a;
    private Activity f14987b;
    @BindView
    protected ViewGroup mContent;
    @BindView
    protected ImageView mImage;
    @BindView
    protected TextView mTitle;

    @OnClick
    public void confirm() {
        C2542m.m19082a("share_dialog", "yes", null);
        new ShareDialogTarget(this.f14987b, ci.SHARE_DIALOG, this.f14986a).m19249a();
        hh.m18653r();
        try {
            dismiss();
        } catch (Throwable th) {
        }
    }

    @OnClick
    public void doClose() {
        C2542m.m19082a("share_dialog", "no", null);
        hh.m18654s();
        try {
            dismiss();
        } catch (Throwable th) {
        }
    }

    public ShareDialog(Activity activity, long j) {
        super(activity);
        this.f14987b = activity;
        this.f14986a = j;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCancelable(false);
        setContentView(R.layout.dialog_share);
        ButterKnife.m2792a((Dialog) this);
        try {
            this.mImage.setImageResource(R.drawable.im_illustration_7);
        } catch (Throwable th) {
        }
        LayoutParams layoutParams = new RelativeLayout.LayoutParams((C2535e.f14679c * 100) / 360, (C2535e.f14679c * 100) / 360);
        layoutParams.addRule(14);
        this.mImage.setLayoutParams(layoutParams);
        this.mContent.setTranslationY((float) (((-C2535e.f14679c) * 50) / 360));
        this.mTitle.setPadding(0, (C2535e.f14679c * 40) / 360, 0, 0);
        if (new Random().nextInt(2) == 0) {
            this.mTitle.setText(C2542m.m19078a(MyApplicationLike.getApplication().getString(R.string.share_dialog_title), C2542m.m19088b(this.f14986a)));
            return;
        }
        String str = ((int) (((double) this.f14986a) / 3250585.6d)) + "";
        this.mTitle.setText(C2542m.m19078a(MyApplicationLike.getApplication().getString(R.string.share_dialog_title1), str));
    }

    public void m19234a() {
        C2542m.m19082a("share_dialog", "show", null);
        try {
            show();
            Window window = getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            window.setAttributes(attributes);
            window.setBackgroundDrawable(new ColorDrawable(0));
        } catch (Exception e) {
        }
    }
}
