package utility.quickest.phonebooster.view;

import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import butterknife.ButterKnife;
import butterknife.OnClick;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.R;

public class LockScreenSettingPopupWindowForSPAD extends PopupWindow {
    private LayoutInflater f14918a = LayoutInflater.from(MyApplicationLike.getApplication());
    private at f14919b;

    @OnClick
    public void closeWindow() {
        C2542m.m19082a("ls_setting_pop_spad", "close", null);
        dismiss();
    }

    @OnClick
    public void closeLockScreen() {
        C2542m.m19082a("ls_setting_pop_spad", "close_ls", null);
        if (this.f14919b != null) {
            this.f14919b.mo3103a();
            dismiss();
        }
    }

    public LockScreenSettingPopupWindowForSPAD(at atVar) {
        this.f14919b = atVar;
        View inflate = this.f14918a.inflate(R.layout.popup_lock_screen_setting_for_spad, null);
        ButterKnife.m2793a(this, inflate);
        setContentView(inflate);
        setWidth(-1);
        setHeight(-1);
        setOutsideTouchable(true);
        setBackgroundDrawable(new ColorDrawable(0));
    }

    public void m19205a(View view) {
        try {
            if (isShowing()) {
                dismiss();
            } else {
                showAtLocation(view, 17, 0, 0);
            }
        } catch (Exception e) {
        }
    }
}
