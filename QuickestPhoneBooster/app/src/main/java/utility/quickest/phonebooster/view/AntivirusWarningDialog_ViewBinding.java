package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class AntivirusWarningDialog_ViewBinding<T extends AntivirusWarningDialog> implements Unbinder {
    protected T f14749b;
    private View f14750c;
    private View f14751d;
    private View f14752e;

    public AntivirusWarningDialog_ViewBinding(T t, View view) {
        this.f14749b = t;
        View a =  Utils.findRequiredView(view, R.id.container, "method 'closeWindow'");
        this.f14750c = a;
        a.setOnClickListener(new C2587l(this, t));
        a =  Utils.findRequiredView(view, R.id.yes_confirm, "method 'onYes'");
        this.f14751d = a;
        a.setOnClickListener(new C2588m(this, t));
        a =  Utils.findRequiredView(view, R.id.no_confirm, "method 'onNo'");
        this.f14752e = a;
        a.setOnClickListener(new C2589n(this, t));
    }
}
