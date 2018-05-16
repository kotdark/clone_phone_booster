package utility.quickest.phonebooster.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import utility.quickest.phonebooster.fragment.AdForMainPageFragment;
import utility.quickest.phonebooster.model_helper.cv;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MainAdPagerAdapter */
public class C2398i extends FragmentPagerAdapter {
    private List<String> f12931a = new ArrayList();
    private List<cv> f12932b = new ArrayList();

    public C2398i(FragmentManager fragmentManager, List<cv> list) {
        super(fragmentManager);
        this.f12931a.clear();
        this.f12931a.add("ui_type_none");
        this.f12931a.add("ui_type_ad");
        this.f12932b = list;
    }

    public Fragment getItem(int i) {
        return AdForMainPageFragment.m17708a((String) this.f12931a.get(i), this.f12932b);
    }

    public int getCount() {
        return this.f12931a.size();
    }
}
