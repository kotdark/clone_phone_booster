package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.view.CustomCircularProgress1;
import utility.quickest.phonebooster.R;

public class PowerSavingFinishFragment_ViewBinding<T extends PowerSavingFinishFragment> implements Unbinder {
    protected T f13433b;
    private View f13434c;
    private View f13435d;

    public PowerSavingFinishFragment_ViewBinding(T t, View view) {
        this.f13433b = t;
        t.mActionBarTitle = (TextView)  Utils.findRequiredViewAsType(view, R.id.action_bar_title, "field 'mActionBarTitle'", TextView.class);
        t.mActionBarTitle1 = (TextView)  Utils.findRequiredViewAsType(view, R.id.action_bar_title1, "field 'mActionBarTitle1'", TextView.class);
        t.mTagContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.tag_container, "field 'mTagContainer'", ViewGroup.class);
        t.mAdContainerContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_container_container, "field 'mAdContainerContainer'", ViewGroup.class);
        t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_container, "field 'mAdContainer'", ViewGroup.class);
        t.mFinishTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.finish_tag, "field 'mFinishTag'", TextView.class);
        t.mProgress = (CustomCircularProgress1)  Utils.findRequiredViewAsType(view, R.id.progress, "field 'mProgress'", CustomCircularProgress1.class);
        View a =  Utils.findRequiredView(view, R.id.action_bar_back_icon, "method 'doBack'");
        this.f13434c = a;
        a.setOnClickListener(new fr(this, t));
        a =  Utils.findRequiredView(view, R.id.action_bar_back_icon1, "method 'doBack'");
        this.f13435d = a;
        a.setOnClickListener(new fs(this, t));
    }
}
