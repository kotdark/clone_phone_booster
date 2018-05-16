package utility.quickest.phonebooster.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import utility.quickest.phonebooster.activity.AddWhiteListActivity;
import utility.quickest.phonebooster.adapter.WhiteListAdapter;
import utility.quickest.phonebooster.model_helper.hz;
import utility.quickest.phonebooster.model_helper.id;
import utility.quickest.phonebooster.model_helper.jt;
import utility.quickest.phonebooster.model_helper.jz;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WhiteListFragment extends BaseFragment {
    private WhiteListAdapter f13500a;
    private jt f13501b = jt.m18785a();
    private final jz f13502c = new ho(this);
    @BindView
    protected ViewGroup mActionBarAddIcon;
    @BindView
    protected ViewGroup mActionBarBackIcon;
    @BindView
    protected TextView mActionBarTitle;
    @BindView
    protected ViewGroup mNoInfoContainer;
    @BindView
    protected ImageView mNoInfoImage;
    @BindView
    protected ListView mWhiteListListView;

    @OnClick
    public void doBack() {
        C2542m.m19082a("white_list_fragment", "back", null);
        getActivity().finish();
    }

    @OnClick
    public void openAddWhiteListPage(View view) {
        if (R.id.action_bar_add_icon == view.getId()) {
            C2542m.m19082a("white_list_fragment", "add_icon", null);
        } else if (R.id.white_list_add_button == view.getId()) {
            C2542m.m19082a("white_list_fragment", "add_button", null);
        }
        AddWhiteListActivity.m17255a((Fragment) this);
    }

    public static WhiteListFragment m17936a() {
        return new WhiteListFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_white_list, null);
        ButterKnife.m2793a(this, inflate);
        this.mActionBarBackIcon.setVisibility(0);
        this.mActionBarTitle.setText(m17696a((int) R.string.ignore_list));
        this.mActionBarAddIcon.setVisibility(8);
        try {
            this.mNoInfoImage.setImageResource(R.drawable.im_no_white_list);
        } catch (Throwable th) {
        }
        this.f13500a = new WhiteListAdapter();
        this.mWhiteListListView.setAdapter(this.f13500a);
        return inflate;
    }

    public void onStart() {
        super.onStart();
        this.f13501b.m18805a(this.f13502c);
        m17938d();
    }

    public void onStop() {
        super.onStop();
        this.f13501b.m18807b(this.f13502c);
    }

    private void m17938d() {
        Set keySet = C2535e.m19030a(hz.m18683a().m18693a(id.IncludeSysApp)).keySet();
        List<String> c = this.f13501b.m18810c();
        List arrayList = new ArrayList();
        for (String str : c) {
            if (keySet.contains(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            this.mWhiteListListView.setVisibility(8);
            this.mNoInfoContainer.setVisibility(0);
        } else {
            this.mWhiteListListView.setVisibility(0);
            this.mNoInfoContainer.setVisibility(8);
        }
        this.f13500a.m17382a(arrayList, 1);
    }
}
