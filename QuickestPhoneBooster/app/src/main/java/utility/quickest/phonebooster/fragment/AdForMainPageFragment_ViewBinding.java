package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.view.CustomRiseNumberTextView;
import utility.quickest.phonebooster.view.RoundProgressBar;
import utility.quickest.phonebooster.R;

public class AdForMainPageFragment_ViewBinding<T extends AdForMainPageFragment> implements Unbinder {
    protected T f13148b;
    private View f13149c;
    private View f13150d;

    public AdForMainPageFragment_ViewBinding(T t, View view) {
        this.f13148b = t;
        t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_container, "field 'mAdContainer'", ViewGroup.class);
        View a =  Utils.findRequiredView(view, R.id.cpu_percent_progress_bar, "field 'mCpuPercentProgressBar' and method 'doCleanMemory'");
        t.mCpuPercentProgressBar = (RoundProgressBar)  Utils.castView(a, R.id.cpu_percent_progress_bar, "field 'mCpuPercentProgressBar'", RoundProgressBar.class);
        this.f13149c = a;
        a.setOnClickListener(new C2469g(this, t));
        t.mCpuPercentProgressBg = (ImageView)  Utils.findRequiredViewAsType(view, R.id.cpu_percent_progress_bg, "field 'mCpuPercentProgressBg'", ImageView.class);
        t.mCpuPercentText = (CustomRiseNumberTextView)  Utils.findRequiredViewAsType(view, R.id.cpu_percent_text, "field 'mCpuPercentText'", CustomRiseNumberTextView.class);
        t.mCpuPercentUnit = (TextView)  Utils.findRequiredViewAsType(view, R.id.cpu_percent_unit, "field 'mCpuPercentUnit'", TextView.class);
        t.mCpuPercentTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.cpu_percent_tag, "field 'mCpuPercentTag'", TextView.class);
        t.mCpuPercentDetailText = (TextView)  Utils.findRequiredViewAsType(view, R.id.cpu_percent_detail_text, "field 'mCpuPercentDetailText'", TextView.class);
        a =  Utils.findRequiredView(view, R.id.cpu_detail_button, "field 'mCpuDetaiButton' and method 'doCleanMemory'");
        t.mCpuDetaiButton = (TextView)  Utils.castView(a, R.id.cpu_detail_button, "field 'mCpuDetaiButton'", TextView.class);
        this.f13150d = a;
        a.setOnClickListener(new C2471h(this, t));
    }
}
