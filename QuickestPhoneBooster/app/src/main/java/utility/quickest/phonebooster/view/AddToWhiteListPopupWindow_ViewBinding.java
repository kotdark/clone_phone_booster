package utility.quickest.phonebooster.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class AddToWhiteListPopupWindow_ViewBinding<T extends AddToWhiteListPopupWindow> implements Unbinder {
    protected T f14743b;
    private View f14744c;
    private View f14745d;

    public AddToWhiteListPopupWindow_ViewBinding(T t, View view) {
        this.f14743b = t;
        t.mAppIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.app_icon, "field 'mAppIcon'", ImageView.class);
        t.mAppName = (TextView)  Utils.findRequiredViewAsType(view, R.id.app_name, "field 'mAppName'", TextView.class);
        View a =  Utils.findRequiredView(view, R.id.container, "method 'closeWindow'");
        this.f14744c = a;
        a.setOnClickListener(new C2585i(this, t));
        a =  Utils.findRequiredView(view, R.id.add_to_white_list, "method 'addToWhiteList'");
        this.f14745d = a;
        a.setOnClickListener(new C2586j(this, t));
    }
}
