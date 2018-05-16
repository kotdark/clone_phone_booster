package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class LockScreenSettingPopupWindowForSPAD_ViewBinding<T extends LockScreenSettingPopupWindowForSPAD> implements Unbinder {
    protected T f14920b;
    private View f14921c;
    private View f14922d;

    public LockScreenSettingPopupWindowForSPAD_ViewBinding(T t, View view) {
        this.f14920b = t;
        View a =  Utils.findRequiredView(view, R.id.container, "method 'closeWindow'");
        this.f14921c = a;
        a.setOnClickListener(new au(this, t));
        a =  Utils.findRequiredView(view, R.id.lock_screen_setting_close_lock_screen, "method 'closeLockScreen'");
        this.f14922d = a;
        a.setOnClickListener(new av(this, t));
    }
}
