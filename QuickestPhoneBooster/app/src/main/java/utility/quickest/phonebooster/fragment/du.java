package utility.quickest.phonebooster.fragment;

import android.content.Context;
import android.widget.Toast;
import utility.quickest.phonebooster.model_helper.ff;
import utility.quickest.phonebooster.p114d.C2447e;
import utility.quickest.phonebooster.util.AppUtil;
import utility.quickest.phonebooster.R;

/* compiled from: MainFragment */
class du implements ff {
    final /* synthetic */ MainFragment f13666a;

    du(MainFragment mainFragment) {
        this.f13666a = mainFragment;
    }

    public void mo3106a(C2447e c2447e) {
        this.f13666a.m17830h();
        Context activity;
        if (c2447e == null) {
            activity = this.f13666a.getActivity();
            if (activity != null) {
                Toast.makeText(activity, this.f13666a.m17696a((int) R.string.no_update_message), 1).show();
            }
        } else if (!AppUtil.m19016a(true, c2447e.m17645g())) {
            activity = this.f13666a.getActivity();
            this.f13666a.mSettingUpdateVersion.setText(this.f13666a.m17696a((int) R.string.is_downloading));
            if (activity != null) {
                Toast.makeText(activity, this.f13666a.m17696a((int) R.string.start_loading_apk), 1).show();
            }
        }
    }
}
