package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class PopupAdFragment_ViewBinding<T extends PopupAdFragment> implements Unbinder {
    protected T f13412b;
    private View f13413c;

    public PopupAdFragment_ViewBinding(T t, View view) {
        this.f13412b = t;
        t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_container, "field 'mAdContainer'", ViewGroup.class);
        View a =  Utils.findRequiredView(view, R.id.close, "method 'doClose'");
        this.f13413c = a;
        a.setOnClickListener(new fd(this, t));
    }
}
