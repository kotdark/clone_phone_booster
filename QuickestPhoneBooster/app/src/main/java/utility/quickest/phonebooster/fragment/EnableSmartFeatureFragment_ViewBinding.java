package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class EnableSmartFeatureFragment_ViewBinding<T extends EnableSmartFeatureFragment> implements Unbinder {
    protected T f13240b;
    private View f13241c;
    private View f13242d;

    public EnableSmartFeatureFragment_ViewBinding(T t, View view) {
        this.f13240b = t;
        t.mIllustration = (ImageView)  Utils.findRequiredViewAsType(view, R.id.illustration, "field 'mIllustration'", ImageView.class);
        t.mIncludAdTip = (TextView)  Utils.findRequiredViewAsType(view, R.id.includ_ad_tip, "field 'mIncludAdTip'", TextView.class);
        View a =  Utils.findRequiredView(view, R.id.close, "method 'doClose'");
        this.f13241c = a;
        a.setOnClickListener(new bo(this, t));
        a =  Utils.findRequiredView(view, R.id.ok, "method 'doOk'");
        this.f13242d = a;
        a.setOnClickListener(new bp(this, t));
    }
}
