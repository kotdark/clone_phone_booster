package utility.quickest.phonebooster.view;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import utility.quickest.phonebooster.model_helper.et;
import utility.quickest.phonebooster.p114d.C2447e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.R;

public class UpdateDialog extends Dialog {
    private Activity f15037a;
    private et f15038b = et.m18483a();
    @BindView
    protected TextView mDescriptionTextView;
    @BindView
    protected ImageView mImage;

    @OnClick
    public void confirm() {
        C2542m.m19082a("update_dialog", "yes", null);
        this.f15038b.m18517e();
        dismiss();
    }

    @OnClick
    public void close() {
        C2542m.m19082a("update_dialog", "close", null);
        this.f15038b.m18516d();
        dismiss();
    }

    public UpdateDialog(Activity activity) {
        super(activity);
        this.f15037a = activity;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCancelable(false);
        setContentView(R.layout.dialog_update);
        ButterKnife.m2792a((Dialog) this);
        try {
            this.mImage.setImageResource(R.drawable.im_illustration_5);
        } catch (Throwable th) {
        }
        C2447e c = this.f15038b.m18515c();
        if (c != null && !TextUtils.isEmpty(c.m17644f())) {
            this.mDescriptionTextView.setText(c.m17644f());
        }
    }

    public void m19261a() {
        try {
            show();
            Window window = getWindow();
            LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            window.setAttributes(attributes);
            window.setBackgroundDrawable(new ColorDrawable(0));
        } catch (Exception e) {
        }
    }
}
