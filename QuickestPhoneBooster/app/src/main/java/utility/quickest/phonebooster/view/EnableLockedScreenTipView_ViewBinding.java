package utility.quickest.phonebooster.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class EnableLockedScreenTipView_ViewBinding<T extends EnableLockedScreenTipView> implements Unbinder {
    protected T f14908b;
    private View f14909c;
    private View f14910d;

    public EnableLockedScreenTipView_ViewBinding(T t, View view) {
        this.f14908b = t;
        View a =  Utils.findRequiredView(view, R.id.container, "field 'mContainer' and method 'doContainerClick'");
        t.mContainer = (ViewGroup)  Utils.castView(a, R.id.container, "field 'mContainer'", ViewGroup.class);
        this.f14909c = a;
        a.setOnClickListener(new an(this, t));
        t.mTipContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.tip_container, "field 'mTipContainer'", ViewGroup.class);
        a =  Utils.findRequiredView(view, R.id.tip, "field 'mTip' and method 'doTip'");
        t.mTip = (TextView)  Utils.castView(a, R.id.tip, "field 'mTip'", TextView.class);
        this.f14910d = a;
        a.setOnClickListener(new ao(this, t));
        t.mAnimImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.anim_image, "field 'mAnimImage'", ImageView.class);
    }
}
