package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class PopupAppDeletedFragment_ViewBinding<T extends PopupAppDeletedFragment> implements Unbinder {
    protected T f13416b;
    private View f13417c;
    private View f13418d;

    public PopupAppDeletedFragment_ViewBinding(T t, View view) {
        this.f13416b = t;
        t.mAppNameTxt = (TextView)  Utils.findRequiredViewAsType(view, R.id.app_name, "field 'mAppNameTxt'", TextView.class);
        View a =  Utils.findRequiredView(view, R.id.no_confirm, "method 'onNoConfirmClicked'");
        this.f13417c = a;
        a.setOnClickListener(new fe(this, t));
        a =  Utils.findRequiredView(view, R.id.yes_confirm, "method 'onYesConfirmClicked'");
        this.f13418d = a;
        a.setOnClickListener(new ff(this, t));
    }
}
