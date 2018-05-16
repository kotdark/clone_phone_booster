package utility.quickest.phonebooster.view;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import utility.quickest.phonebooster.model_helper.ig;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.R;

public class AddQuickCleanDialogFromMainPage extends Dialog {
    @BindView
    protected ImageView mImage;

    @OnClick
    public void confirm() {
        C2542m.m19082a("add_qc_dialog_for_main", "create", null);
        ig.m18707a().m18718e();
        try {
            dismiss();
        } catch (Throwable th) {
        }
    }

    @OnClick
    public void doClose() {
        C2542m.m19082a("add_qc_dialog_for_main", "close", null);
        try {
            dismiss();
        } catch (Throwable th) {
        }
    }

    public AddQuickCleanDialogFromMainPage(Activity activity) {
        super(activity);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        setContentView(R.layout.dialog_add_quick_clean_from_main_page);
        ButterKnife.m2792a((Dialog) this);
        try {
            this.mImage.setImageResource(R.drawable.im_illustration_4);
        } catch (Throwable th) {
        }
        this.mImage.setLayoutParams(new LayoutParams(-2, -2));
    }

    public void m19119a() {
        try {
            show();
        } catch (Throwable th) {
        }
    }
}
