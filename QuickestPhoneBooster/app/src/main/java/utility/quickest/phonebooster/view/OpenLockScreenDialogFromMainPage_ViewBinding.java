package utility.quickest.phonebooster.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class OpenLockScreenDialogFromMainPage_ViewBinding<T extends OpenLockScreenDialogFromMainPage> implements Unbinder {
    protected T f14968b;
    private View f14969c;
    private View f14970d;

    public OpenLockScreenDialogFromMainPage_ViewBinding(T t, View view) {
        this.f14968b = t;
        t.mTip = (TextView)  Utils.findRequiredViewAsType(view, R.id.tip, "field 'mTip'", TextView.class);
        t.mContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mContainer'", ViewGroup.class);
        t.mImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.image, "field 'mImage'", ImageView.class);
        View a =  Utils.findRequiredView(view, R.id.open_ls_dialog_from_main_create, "method 'confirm'");
        this.f14969c = a;
        a.setOnClickListener(new bx(this, t));
        a =  Utils.findRequiredView(view, R.id.open_ls_dialog_from_main_close, "method 'doClose'");
        this.f14970d = a;
        a.setOnClickListener(new by(this, t));
    }
}
