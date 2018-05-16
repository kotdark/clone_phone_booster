package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class AntivirusFragment_ViewBinding<T extends AntivirusFragment> implements Unbinder {
    protected T f13193b;
    private View f13194c;
    private View f13195d;
    private View f13196e;

    public AntivirusFragment_ViewBinding(T t, View view) {
        this.f13193b = t;
        t.mActionBar = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.action_bar, "field 'mActionBar'", ViewGroup.class);
        View a =  Utils.findRequiredView(view, R.id.action_bar_back_icon, "field 'mActionBarBackIcon' and method 'doBack'");
        t.mActionBarBackIcon = (ViewGroup)  Utils.castView(a, R.id.action_bar_back_icon, "field 'mActionBarBackIcon'", ViewGroup.class);
        this.f13194c = a;
        a.setOnClickListener(new af(this, t));
        t.mActionBarTitle = (TextView)  Utils.findRequiredViewAsType(view, R.id.action_bar_title, "field 'mActionBarTitle'", TextView.class);
        t.mActionBarBackImg = (ImageView)  Utils.findRequiredViewAsType(view, R.id.action_bar_back_img, "field 'mActionBarBackImg'", ImageView.class);
        t.mAntivirusAppListView = (ListView)  Utils.findRequiredViewAsType(view, R.id.antivirus_app_list_view, "field 'mAntivirusAppListView'", ListView.class);
        t.mAntivirusNumber = (TextView)  Utils.findRequiredViewAsType(view, R.id.antivirus_number_text, "field 'mAntivirusNumber'", TextView.class);
        t.mAntivirusNumberUnit = (TextView)  Utils.findRequiredViewAsType(view, R.id.antivirus_number_unit, "field 'mAntivirusNumberUnit'", TextView.class);
        t.mAntivirusWaitContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.antivirus_wait_container, "field 'mAntivirusWaitContainer'", ViewGroup.class);
        t.mAntivirusWaitDotContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.antivirus_wait_dot_container, "field 'mAntivirusWaitDotContainer'", ViewGroup.class);
        t.mAntivirusWaitContainerBack = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.antivirus_wait_container_back, "field 'mAntivirusWaitContainerBack'", ViewGroup.class);
        t.mAntivirusBg = (ImageView)  Utils.findRequiredViewAsType(view, R.id.antivirus_bg, "field 'mAntivirusBg'", ImageView.class);
        t.mScanningAppName = (TextView)  Utils.findRequiredViewAsType(view, R.id.scanning_app_name, "field 'mScanningAppName'", TextView.class);
        a =  Utils.findRequiredView(view, R.id.antivirus_ignore, "field 'mAntivirusIgnore' and method 'doIgnore'");
        t.mAntivirusIgnore = (ViewGroup)  Utils.castView(a, R.id.antivirus_ignore, "field 'mAntivirusIgnore'", ViewGroup.class);
        this.f13195d = a;
        a.setOnClickListener(new ag(this, t));
        t.mScanProgress = (ProgressBar)  Utils.findRequiredViewAsType(view, R.id.scan_progress, "field 'mScanProgress'", ProgressBar.class);
        t.mAntivirusMalwareBg = (ImageView)  Utils.findRequiredViewAsType(view, R.id.antivirus_malware_bg, "field 'mAntivirusMalwareBg'", ImageView.class);
        t.mAntivirusThreatsBg = (ImageView)  Utils.findRequiredViewAsType(view, R.id.antivirus_threats_bg, "field 'mAntivirusThreatsBg'", ImageView.class);
        t.mTagContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.tag_container, "field 'mTagContainer'", ViewGroup.class);
        t.mDot =  Utils.findRequiredView(view, R.id.dot, "field 'mDot'");
        View a2 =  Utils.findRequiredView(view, R.id.antivirus_fix, "method 'doFix'");
        this.f13196e = a2;
        a2.setOnClickListener(new ah(this, t));
    }
}
