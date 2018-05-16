package utility.quickest.phonebooster.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
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

public class AddWhiteListFragment extends BaseFragment {
    private WhiteListAdapter f13151a;
    private jt f13152b = jt.m18785a();
    private final jz f13153c = new C2472i(this);
    @BindView
    protected ViewGroup mActionBarBackIcon;
    @BindView
    protected TextView mActionBarTitle;
    @BindView
    protected ListView mAddWhiteListListView;

    @OnClick
    public void doBack() {
        C2542m.m19082a("add_white_list_fragment", "back", null);
        getActivity().finish();
    }

    public static AddWhiteListFragment m17711a() {
        return new AddWhiteListFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_add_white_list, null);
        ButterKnife.m2793a(this, inflate);
        this.mActionBarBackIcon.setVisibility(0);
        this.mActionBarTitle.setText(m17696a((int) R.string.add_ignore_list));
        this.f13151a = new WhiteListAdapter();
        this.mAddWhiteListListView.setAdapter(this.f13151a);
        return inflate;
    }

    public void onStart() {
        super.onStart();
        this.f13152b.m18805a(this.f13153c);
        m17713d();
    }

    public void onStop() {
        super.onStop();
        this.f13152b.m18807b(this.f13153c);
    }

    private void m17713d() {
        Set<String> keySet = C2535e.m19030a(hz.m18683a().m18693a(id.IncludeSysApp)).keySet();
        List c = this.f13152b.m18810c();
        List arrayList = new ArrayList();
        for (String str : keySet) {
            if (!c.contains(str)) {
                arrayList.add(str);
            }
        }
        this.f13151a.m17382a(arrayList, 2);
    }
}
