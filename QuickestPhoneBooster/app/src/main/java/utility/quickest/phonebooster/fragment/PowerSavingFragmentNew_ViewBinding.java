package utility.quickest.phonebooster.fragment;

import android.support.v7.widget.CardView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.view.BatteryViewVertical1;
import utility.quickest.phonebooster.R;

public class PowerSavingFragmentNew_ViewBinding<T extends PowerSavingFragmentNew> implements Unbinder {
    protected T f13456b;
    private View f13457c;
    private View f13458d;
    private View f13459e;

    public PowerSavingFragmentNew_ViewBinding(T t, View view) {
        this.f13456b = t;
        t.mActionBar = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.action_bar, "field 'mActionBar'", ViewGroup.class);
        t.mActionBar1 = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.action_bar1, "field 'mActionBar1'", ViewGroup.class);
        t.mActionBarTitle = (TextView)  Utils.findRequiredViewAsType(view, R.id.action_bar_title, "field 'mActionBarTitle'", TextView.class);
        t.mActionBarTitle1 = (TextView)  Utils.findRequiredViewAsType(view, R.id.action_bar_title1, "field 'mActionBarTitle1'", TextView.class);
        t.mPowerSavingDetail = (TextView)  Utils.findRequiredViewAsType(view, R.id.power_saving_detail, "field 'mPowerSavingDetail'", TextView.class);
        t.mPowerSavingDetail1 = (TextView)  Utils.findRequiredViewAsType(view, R.id.power_saving_detail1, "field 'mPowerSavingDetail1'", TextView.class);
        t.mMemoryJunkGridView = (GridView)  Utils.findRequiredViewAsType(view, R.id.memory_junk_grid_view, "field 'mMemoryJunkGridView'", GridView.class);
        View a =  Utils.findRequiredView(view, R.id.power_saving_button, "field 'mPowerSavingButton' and method 'doClean'");
        t.mPowerSavingButton = (TextView)  Utils.castView(a, R.id.power_saving_button, "field 'mPowerSavingButton'", TextView.class);
        this.f13457c = a;
        a.setOnClickListener(new gc(this, t));
        t.mPowerSavingButtonBg = (CardView)  Utils.findRequiredViewAsType(view, R.id.power_saving_button_bg, "field 'mPowerSavingButtonBg'", CardView.class);
        t.mPowerSavingWaitContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.power_saving_wait_container, "field 'mPowerSavingWaitContainer'", ViewGroup.class);
        t.mPowerSavingWaitContainerinner = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.power_saving_wait_container_inner, "field 'mPowerSavingWaitContainerinner'", ViewGroup.class);
        t.mPowerSavingDetailContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.power_saving_detail_contaienr, "field 'mPowerSavingDetailContainer'", ViewGroup.class);
        t.mPowerSavingWaitView1 = (ImageView)  Utils.findRequiredViewAsType(view, R.id.power_saving_wait_view1, "field 'mPowerSavingWaitView1'", ImageView.class);
        t.mPowerSavingWaitView2 = (ImageView)  Utils.findRequiredViewAsType(view, R.id.power_saving_wait_view2, "field 'mPowerSavingWaitView2'", ImageView.class);
        t.mPowerSavingWaitBg = (ImageView)  Utils.findRequiredViewAsType(view, R.id.power_saving_wait_bg, "field 'mPowerSavingWaitBg'", ImageView.class);
        t.mPowerSavingWaitBg1 = (ImageView)  Utils.findRequiredViewAsType(view, R.id.power_saving_wait_bg1, "field 'mPowerSavingWaitBg1'", ImageView.class);
        t.mPowerSavingWaitTip = (TextView)  Utils.findRequiredViewAsType(view, R.id.power_saving_wait_tip, "field 'mPowerSavingWaitTip'", TextView.class);
        t.mDeletingIcon = (ImageView)  Utils.findRequiredViewAsType(view, R.id.deleting_icon, "field 'mDeletingIcon'", ImageView.class);
        t.mDeletingIcon2 = (ImageView)  Utils.findRequiredViewAsType(view, R.id.deleting_icon2, "field 'mDeletingIcon2'", ImageView.class);
        t.mDeletingIcon3 = (ImageView)  Utils.findRequiredViewAsType(view, R.id.deleting_icon3, "field 'mDeletingIcon3'", ImageView.class);
        t.mDeletingContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.deleting_container, "field 'mDeletingContainer'", ViewGroup.class);
        t.mBattery = (BatteryViewVertical1)  Utils.findRequiredViewAsType(view, R.id.battery, "field 'mBattery'", BatteryViewVertical1.class);
        View a2 =  Utils.findRequiredView(view, R.id.action_bar_back_icon, "method 'doBack'");
        this.f13458d = a2;
        a2.setOnClickListener(new gd(this, t));
        a2 =  Utils.findRequiredView(view, R.id.action_bar_back_icon1, "method 'doBack'");
        this.f13459e = a2;
        a2.setOnClickListener(new ge(this, t));
    }
}
