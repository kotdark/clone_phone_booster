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
import utility.quickest.phonebooster.model_helper.hh;
import utility.quickest.phonebooster.model_helper.ig;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.R;

public class OpenLockScreenDialogFromMainPage extends Dialog {
    @BindView
    protected ViewGroup mContainer;
    @BindView
    protected ImageView mImage;
    @BindView
    protected TextView mTip;

    @OnClick
    public void confirm() {
        C2542m.m19082a("open_ls_dialog_from_main", "create", null);
        try {
            dismiss();
        } catch (Throwable th) {
        }
        ig.m18707a().m18715c(true);
    }

    @OnClick
    public void doClose() {
        C2542m.m19082a("open_ls_dialog_from_main", "close", null);
        try {
            dismiss();
        } catch (Throwable th) {
        }
    }

    public OpenLockScreenDialogFromMainPage(Activity activity) {
        super(activity);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCancelable(false);
        setContentView(R.layout.dialog_open_lock_screen_from_main_page);
        ButterKnife.m2792a((Dialog) this);
        try {
            this.mImage.setImageResource(R.drawable.im_illustration_6);
        } catch (Throwable th) {
        }
        LayoutParams layoutParams = new RelativeLayout.LayoutParams((C2535e.f14679c * 13) / 18, -2);
        layoutParams.addRule(13);
        this.mContainer.setLayoutParams(layoutParams);
        if (hh.m18641f()) {
            this.mTip.setText(R.string.enable_lock_screen_tip1);
        } else {
            this.mTip.setText(R.string.enable_lock_screen_tip);
        }
    }

    public void m19228a() {
        try {
            show();
            C2542m.m19082a("open_ls_dialog_from_main", "show", null);
        } catch (Throwable th) {
        }
        try {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            window.setAttributes(attributes);
            window.setBackgroundDrawable(new ColorDrawable(0));
        } catch (Throwable th2) {
        }
    }

    public void dismiss() {
        ig.m18707a().m18715c(false);
        super.dismiss();
    }
}
