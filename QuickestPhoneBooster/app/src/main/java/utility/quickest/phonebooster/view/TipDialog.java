package utility.quickest.phonebooster.view;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import utility.quickest.phonebooster.R;

public class TipDialog extends Dialog {
    private String f15035a;
    @BindView
    protected TextView mMessage;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        setCancelable(true);
        setContentView(R.layout.dialog_tip);
        ButterKnife.m2792a((Dialog) this);
        this.mMessage.setText(this.f15035a);
    }
}
