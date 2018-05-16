package utility.quickest.phonebooster.fragment;

import android.text.TextUtils;
import utility.quickest.phonebooster.util.C2461k;
import utility.quickest.phonebooster.util.ViewUtil;
import utility.quickest.phonebooster.view.AddToWhiteListPopupWindow;

/* compiled from: MemoryJunkCleanFragment */
class eu implements C2461k {
    final /* synthetic */ MemoryJunkCleanFragment f13716a;

    eu(MemoryJunkCleanFragment memoryJunkCleanFragment) {
        this.f13716a = memoryJunkCleanFragment;
    }

    public void mo3091a(Object obj) {
        if (ViewUtil.m18937a(this.f13716a)) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                this.f13716a.f13396d = new AddToWhiteListPopupWindow(this.f13716a.getActivity(), str, new ev(this, str));
                this.f13716a.f13396d.m19121a(this.f13716a.mMemoryJunkCleanButton.getRootView());
            }
        }
    }
}
