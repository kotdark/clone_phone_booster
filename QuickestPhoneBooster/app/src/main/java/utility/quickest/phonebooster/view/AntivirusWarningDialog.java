package utility.quickest.phonebooster.view;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import butterknife.ButterKnife;
import butterknife.OnClick;
import utility.quickest.phonebooster.app.MyApplicationLike;

public class AntivirusWarningDialog extends Dialog {
    private LayoutInflater f14746a = LayoutInflater.from(MyApplicationLike.getApplication());
    private C2459k f14747b;
    private Activity f14748c;

    @OnClick
    public void closeWindow() {
        dismiss();
    }

    @OnClick
    public void onYes() {
        if (this.f14747b != null) {
            this.f14747b.mo3086a();
        }
        dismiss();
    }

    @OnClick
    public void onNo() {
        if (this.f14747b != null) {
            this.f14747b.mo3087b();
        }
        dismiss();
    }

    public AntivirusWarningDialog(Activity activity, C2459k c2459k, int i) {
        super(activity);
        this.f14748c = activity;
        this.f14747b = c2459k;
        View inflate = this.f14746a.inflate(i, null);
        ButterKnife.m2793a(this, inflate);
        requestWindowFeature(1);
        setContentView(inflate);
    }

    public void m19122a() {
        try {
            Window window = getWindow();
            LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            window.setAttributes(attributes);
            window.setBackgroundDrawable(new ColorDrawable(0));
            show();
        } catch (Exception e) {
        }
    }
}
