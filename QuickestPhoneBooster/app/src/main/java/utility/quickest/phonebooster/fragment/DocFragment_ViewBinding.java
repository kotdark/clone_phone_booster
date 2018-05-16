package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class DocFragment_ViewBinding<T extends DocFragment> implements Unbinder {
    protected T f13235b;
    private View f13236c;

    public DocFragment_ViewBinding(T t, View view) {
        this.f13235b = t;
        View a =  Utils.findRequiredView(view, R.id.action_bar_back_icon, "field 'mActionBarBackIcon' and method 'doBack'");
        t.mActionBarBackIcon = (ViewGroup)  Utils.castView(a, R.id.action_bar_back_icon, "field 'mActionBarBackIcon'", ViewGroup.class);
        this.f13236c = a;
        a.setOnClickListener(new bl(this, t));
        t.mActionBarTitle = (TextView)  Utils.findRequiredViewAsType(view, R.id.action_bar_title, "field 'mActionBarTitle'", TextView.class);
        t.mDocContent = (WebView)  Utils.findRequiredViewAsType(view, R.id.doc_content, "field 'mDocContent'", WebView.class);
        t.mDocProgress = (ImageView)  Utils.findRequiredViewAsType(view, R.id.doc_progress, "field 'mDocProgress'", ImageView.class);
    }
}
