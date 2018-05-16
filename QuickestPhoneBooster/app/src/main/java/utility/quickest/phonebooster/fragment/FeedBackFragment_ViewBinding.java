package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class FeedBackFragment_ViewBinding<T extends FeedBackFragment> implements Unbinder {
    protected T f13256b;
    private View f13257c;
    private View f13258d;
    private View f13259e;

    public FeedBackFragment_ViewBinding(T t, View view) {
        this.f13256b = t;
        View a =  Utils.findRequiredView(view, R.id.action_bar_back_icon, "field 'mActionBarBackIcon' and method 'doBack'");
        t.mActionBarBackIcon = (ViewGroup)  Utils.castView(a, R.id.action_bar_back_icon, "field 'mActionBarBackIcon'", ViewGroup.class);
        this.f13257c = a;
        a.setOnClickListener(new bs(this, t));
        t.mActionBarTitle = (TextView)  Utils.findRequiredViewAsType(view, R.id.action_bar_title, "field 'mActionBarTitle'", TextView.class);
        a =  Utils.findRequiredView(view, R.id.action_bar_send_icon, "field 'mActionSendIcon' and method 'submit'");
        t.mActionSendIcon = (ViewGroup)  Utils.castView(a, R.id.action_bar_send_icon, "field 'mActionSendIcon'", ViewGroup.class);
        this.f13258d = a;
        a.setOnClickListener(new bt(this, t));
        t.mFeedBackContent = (EditText)  Utils.findRequiredViewAsType(view, R.id.feed_back_content, "field 'mFeedBackContent'", EditText.class);
        t.mFeedBackEmail = (EditText)  Utils.findRequiredViewAsType(view, R.id.feed_back_email, "field 'mFeedBackEmail'", EditText.class);
        View a2 =  Utils.findRequiredView(view, R.id.feed_back_submit, "method 'submit'");
        this.f13259e = a2;
        a2.setOnClickListener(new bu(this, t));
    }
}
