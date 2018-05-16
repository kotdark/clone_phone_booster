package utility.quickest.phonebooster.fragment;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import utility.quickest.phonebooster.app.MyApplicationLike;

/* compiled from: BaseFragment */
public abstract class BaseFragment extends Fragment {
    public boolean mo3085b() {
        return false;
    }

    public void mo3084a(boolean z) {
    }

    public Resources m17699c() {
        try {
            return getResources();
        } catch (Exception e) {
            return MyApplicationLike.getApplication().getResources();
        }
    }

    public String m17696a(int i) {
        try {
            return getString(i);
        } catch (Exception e) {
            return MyApplicationLike.getApplication().getString(i);
        }
    }
}
