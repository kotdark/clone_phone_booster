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
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.R;

public class LockScreenCloseChoiceDialogForSPAD extends Dialog {
    private LayoutInflater f14911a = LayoutInflater.from(MyApplicationLike.getApplication());
    private ap f14912b;
    private Activity f14913c;

    @OnClick
    public void closeWindow() {
        C2542m.m19082a("ls_close_choice_dialog_spad", "close", null);
        dismiss();
    }

    @OnClick
    public void onYes() {
        C2542m.m19082a("ls_close_choice_dialog_spad", "yes", null);
        if (this.f14912b != null) {
            this.f14912b.mo3104a();
            dismiss();
        }
    }

    @OnClick
    public void onNo() {
        C2542m.m19082a("ls_close_choice_dialog_spad", "no", null);
        if (this.f14912b != null) {
            this.f14912b.mo3105b();
            dismiss();
        }
    }

    public LockScreenCloseChoiceDialogForSPAD(Activity activity, ap apVar) {
        super(activity);
        this.f14913c = activity;
        this.f14912b = apVar;
        View inflate = this.f14911a.inflate(R.layout.dialog_lock_screen_close_choice_for_spad, null);
        ButterKnife.m2793a(this, inflate);
        setContentView(inflate);
    }

    public void m19204a() {
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
