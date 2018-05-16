package utility.quickest.phonebooster.view;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import utility.quickest.phonebooster.R;

/* compiled from: CustomProgressDialog */
public class C2598x extends Dialog {
    public C2598x(Context context) {
        super(context);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        setContentView(R.layout.dialog_progress);
    }
}
