package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class LockScreenCloseChoiceDialogForSPAD_ViewBinding<T extends LockScreenCloseChoiceDialogForSPAD> implements Unbinder {
    protected T f14914b;
    private View f14915c;
    private View f14916d;
    private View f14917e;

    public LockScreenCloseChoiceDialogForSPAD_ViewBinding(T t, View view) {
        this.f14914b = t;
        View a =  Utils.findRequiredView(view, R.id.container, "method 'closeWindow'");
        this.f14915c = a;
        a.setOnClickListener(new aq(this, t));
        a =  Utils.findRequiredView(view, R.id.yes_confirm, "method 'onYes'");
        this.f14916d = a;
        a.setOnClickListener(new ar(this, t));
        a =  Utils.findRequiredView(view, R.id.no_confirm, "method 'onNo'");
        this.f14917e = a;
        a.setOnClickListener(new as(this, t));
    }
}
