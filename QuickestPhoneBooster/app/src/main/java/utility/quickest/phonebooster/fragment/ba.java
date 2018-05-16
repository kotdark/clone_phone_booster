package utility.quickest.phonebooster.fragment;

import android.text.TextUtils;
import utility.quickest.phonebooster.util.C2461k;
import utility.quickest.phonebooster.util.ViewUtil;
import utility.quickest.phonebooster.view.AddToWhiteListPopupWindow;

/* compiled from: CPUCoolingFragment */
class ba implements C2461k {
    final /* synthetic */ CPUCoolingFragment f13548a;

    ba(CPUCoolingFragment cPUCoolingFragment) {
        this.f13548a = cPUCoolingFragment;
    }

    public void mo3091a(Object obj) {
        if (ViewUtil.m18937a(this.f13548a)) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                this.f13548a.f13223g = new AddToWhiteListPopupWindow(this.f13548a.getActivity(), str, new bb(this, str));
                this.f13548a.f13223g.m19121a(this.f13548a.mTemperatureCleanButton.getRootView());
            }
        }
    }
}
