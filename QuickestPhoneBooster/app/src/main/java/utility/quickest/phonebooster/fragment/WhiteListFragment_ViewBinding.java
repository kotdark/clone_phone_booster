package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class WhiteListFragment_ViewBinding<T extends WhiteListFragment> implements Unbinder {
    protected T f13503b;
    private View f13504c;
    private View f13505d;
    private View f13506e;

    public WhiteListFragment_ViewBinding(T t, View view) {
        this.f13503b = t;
        View a =  Utils.findRequiredView(view, R.id.action_bar_back_icon, "field 'mActionBarBackIcon' and method 'doBack'");
        t.mActionBarBackIcon = (ViewGroup)  Utils.castView(a, R.id.action_bar_back_icon, "field 'mActionBarBackIcon'", ViewGroup.class);
        this.f13504c = a;
        a.setOnClickListener(new hp(this, t));
        t.mActionBarTitle = (TextView)  Utils.findRequiredViewAsType(view, R.id.action_bar_title, "field 'mActionBarTitle'", TextView.class);
        a =  Utils.findRequiredView(view, R.id.action_bar_add_icon, "field 'mActionBarAddIcon' and method 'openAddWhiteListPage'");
        t.mActionBarAddIcon = (ViewGroup)  Utils.castView(a, R.id.action_bar_add_icon, "field 'mActionBarAddIcon'", ViewGroup.class);
        this.f13505d = a;
        a.setOnClickListener(new hq(this, t));
        t.mWhiteListListView = (ListView)  Utils.findRequiredViewAsType(view, R.id.white_list_list_view, "field 'mWhiteListListView'", ListView.class);
        t.mNoInfoContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.no_info_container, "field 'mNoInfoContainer'", ViewGroup.class);
        t.mNoInfoImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.no_info_image, "field 'mNoInfoImage'", ImageView.class);
        View a2 =  Utils.findRequiredView(view, R.id.white_list_add_button, "method 'openAddWhiteListPage'");
        this.f13506e = a2;
        a2.setOnClickListener(new hr(this, t));
    }
}
