package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class PopupMemoryJunkCleanFragment_ViewBinding<T extends PopupMemoryJunkCleanFragment> implements Unbinder {
    protected T f13423b;
    private View f13424c;
    private View f13425d;

    public PopupMemoryJunkCleanFragment_ViewBinding(T t, View view) {
        this.f13423b = t;
        t.mWait1 = (ImageView)  Utils.findRequiredViewAsType(view, R.id.wait1, "field 'mWait1'", ImageView.class);
        t.mWait2 = (ImageView)  Utils.findRequiredViewAsType(view, R.id.wait2, "field 'mWait2'", ImageView.class);
        t.mWait3 = (ImageView)  Utils.findRequiredViewAsType(view, R.id.wait3, "field 'mWait3'", ImageView.class);
        t.mWait4 = (ImageView)  Utils.findRequiredViewAsType(view, R.id.wait4, "field 'mWait4'", ImageView.class);
        t.mWait5 = (ImageView)  Utils.findRequiredViewAsType(view, R.id.wait5, "field 'mWait5'", ImageView.class);
        t.mFinishTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.finish_tag, "field 'mFinishTag'", TextView.class);
        t.mWaitContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.wait_container, "field 'mWaitContainer'", ViewGroup.class);
        t.mBottomContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.bottom_container, "field 'mBottomContainer'", ViewGroup.class);
        t.mPlaceHolder =  Utils.findRequiredView(view, R.id.place_holder, "field 'mPlaceHolder'");
        View a =  Utils.findRequiredView(view, R.id.no_confirm, "method 'onNoConfirmClicked'");
        this.f13424c = a;
        a.setOnClickListener(new fn(this, t));
        a =  Utils.findRequiredView(view, R.id.yes_confirm, "method 'onYesConfirmClicked'");
        this.f13425d = a;
        a.setOnClickListener(new fo(this, t));
    }
}
