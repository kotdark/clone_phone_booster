package utility.quickest.phonebooster.fragment;

import android.support.v7.widget.CardView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class PowerSavingFragment_ViewBinding<T extends PowerSavingFragment> implements Unbinder {
    protected T f13460b;
    private View f13461c;
    private View f13462d;
    private View f13463e;

    public PowerSavingFragment_ViewBinding(T t, View view) {
        this.f13460b = t;
        t.mActionBar = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.action_bar, "field 'mActionBar'", ViewGroup.class);
        t.mActionBar1 = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.action_bar1, "field 'mActionBar1'", ViewGroup.class);
        t.mActionBarTitle = (TextView)  Utils.findRequiredViewAsType(view, R.id.action_bar_title, "field 'mActionBarTitle'", TextView.class);
        t.mActionBarTitle1 = (TextView)  Utils.findRequiredViewAsType(view, R.id.action_bar_title1, "field 'mActionBarTitle1'", TextView.class);
        t.mPowerSavingDetail = (TextView)  Utils.findRequiredViewAsType(view, R.id.power_saving_detail, "field 'mPowerSavingDetail'", TextView.class);
        t.mPowerSavingDetail1 = (TextView)  Utils.findRequiredViewAsType(view, R.id.power_saving_detail1, "field 'mPowerSavingDetail1'", TextView.class);
        t.mMemoryJunkGridView = (GridView)  Utils.findRequiredViewAsType(view, R.id.memory_junk_grid_view, "field 'mMemoryJunkGridView'", GridView.class);
        View a =  Utils.findRequiredView(view, R.id.power_saving_button, "field 'mPowerSavingButton' and method 'doClean'");
        t.mPowerSavingButton = (TextView)  Utils.castView(a, R.id.power_saving_button, "field 'mPowerSavingButton'", TextView.class);
        this.f13461c = a;
        a.setOnClickListener(new gf(this, t));
        t.mPowerSavingButtonBg = (CardView)  Utils.findRequiredViewAsType(view, R.id.power_saving_button_bg, "field 'mPowerSavingButtonBg'", CardView.class);
        t.mPowerSavingWaitContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.power_saving_wait_container, "field 'mPowerSavingWaitContainer'", ViewGroup.class);
        t.mPowerSavingDetailContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.power_saving_detail_contaienr, "field 'mPowerSavingDetailContainer'", ViewGroup.class);
        t.mPowerSavingWaitView1 = (ImageView)  Utils.findRequiredViewAsType(view, R.id.power_saving_wait_view1, "field 'mPowerSavingWaitView1'", ImageView.class);
        t.mPowerSavingWaitView2 = (ImageView)  Utils.findRequiredViewAsType(view, R.id.power_saving_wait_view2, "field 'mPowerSavingWaitView2'", ImageView.class);
        View a2 =  Utils.findRequiredView(view, R.id.action_bar_back_icon, "method 'doBack'");
        this.f13462d = a2;
        a2.setOnClickListener(new gg(this, t));
        a2 =  Utils.findRequiredView(view, R.id.action_bar_back_icon1, "method 'doBack'");
        this.f13463e = a2;
        a2.setOnClickListener(new gh(this, t));
    }
}
