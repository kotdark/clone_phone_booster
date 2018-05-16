package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class AddWhiteListFragment_ViewBinding<T extends AddWhiteListFragment> implements Unbinder {
    protected T f13154b;
    private View f13155c;

    public AddWhiteListFragment_ViewBinding(T t, View view) {
        this.f13154b = t;
        View a =  Utils.findRequiredView(view, R.id.action_bar_back_icon, "field 'mActionBarBackIcon' and method 'doBack'");
        t.mActionBarBackIcon = (ViewGroup)  Utils.castView(a, R.id.action_bar_back_icon, "field 'mActionBarBackIcon'", ViewGroup.class);
        this.f13155c = a;
        a.setOnClickListener(new C2473j(this, t));
        t.mActionBarTitle = (TextView)  Utils.findRequiredViewAsType(view, R.id.action_bar_title, "field 'mActionBarTitle'", TextView.class);
        t.mAddWhiteListListView = (ListView)  Utils.findRequiredViewAsType(view, R.id.add_white_list_list_view, "field 'mAddWhiteListListView'", ListView.class);
    }
}
