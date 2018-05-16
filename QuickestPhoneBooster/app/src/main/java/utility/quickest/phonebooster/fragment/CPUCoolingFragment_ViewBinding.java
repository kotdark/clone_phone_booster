package utility.quickest.phonebooster.fragment;

import android.support.v7.widget.CardView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ToggleButton;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class CPUCoolingFragment_ViewBinding<T extends CPUCoolingFragment> implements Unbinder {
    protected T f13229b;
    private View f13230c;
    private View f13231d;
    private View f13232e;

    public CPUCoolingFragment_ViewBinding(T t, View view) {
        this.f13229b = t;
        t.mActionBar = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.action_bar, "field 'mActionBar'", ViewGroup.class);
        View a =  Utils.findRequiredView(view, R.id.action_bar_back_icon, "field 'mActionBarBackIcon' and method 'doBack'");
        t.mActionBarBackIcon = (ViewGroup)  Utils.castView(a, R.id.action_bar_back_icon, "field 'mActionBarBackIcon'", ViewGroup.class);
        this.f13230c = a;
        a.setOnClickListener(new bh(this, t));
        t.mActionBarBackImg = (ImageView)  Utils.findRequiredViewAsType(view, R.id.action_bar_back_img, "field 'mActionBarBackImg'", ImageView.class);
        t.mActionBarTitle = (TextView)  Utils.findRequiredViewAsType(view, R.id.action_bar_title, "field 'mActionBarTitle'", TextView.class);
        t.mTemperatureContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.temperature_container, "field 'mTemperatureContainer'", ViewGroup.class);
        t.mMemoryJunkListView = (ListView)  Utils.findRequiredViewAsType(view, R.id.memory_junk_list_view, "field 'mMemoryJunkListView'", ListView.class);
        a =  Utils.findRequiredView(view, R.id.temperature_clean_button, "field 'mTemperatureCleanButton' and method 'doClean'");
        t.mTemperatureCleanButton = (TextView)  Utils.castView(a, R.id.temperature_clean_button, "field 'mTemperatureCleanButton'", TextView.class);
        this.f13231d = a;
        a.setOnClickListener(new bi(this, t));
        t.mTemperatureCleanButtonBg = (CardView)  Utils.findRequiredViewAsType(view, R.id.temperature_clean_button_bg, "field 'mTemperatureCleanButtonBg'", CardView.class);
        t.mTemperatureNumber = (TextView)  Utils.findRequiredViewAsType(view, R.id.temperature_number, "field 'mTemperatureNumber'", TextView.class);
        t.mTemperatureTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.temperature_tag, "field 'mTemperatureTag'", TextView.class);
        t.mTemperatureTip = (TextView)  Utils.findRequiredViewAsType(view, R.id.temperature_tip, "field 'mTemperatureTip'", TextView.class);
        t.mTemperatureWaitBg = (ImageView)  Utils.findRequiredViewAsType(view, R.id.temperature_wait_bg, "field 'mTemperatureWaitBg'", ImageView.class);
        t.mTemperatureWaitBg1 = (ImageView)  Utils.findRequiredViewAsType(view, R.id.temperature_wait_bg1, "field 'mTemperatureWaitBg1'", ImageView.class);
        t.mTemperatureWait = (ImageView)  Utils.findRequiredViewAsType(view, R.id.temperature_wait, "field 'mTemperatureWait'", ImageView.class);
        t.mTemperatureWait1 = (ImageView)  Utils.findRequiredViewAsType(view, R.id.temperature_wait1, "field 'mTemperatureWait1'", ImageView.class);
        t.mTemperatureWaitContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.temperature_wait_container, "field 'mTemperatureWaitContainer'", ViewGroup.class);
        t.mTemperatureWaitContainerBack = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.temperature_wait_container_back, "field 'mTemperatureWaitContainerBack'", ViewGroup.class);
        t.mTemperatureUnit = (TextView)  Utils.findRequiredViewAsType(view, R.id.temperature_unit, "field 'mTemperatureUnit'", TextView.class);
        t.mTemperatureUnitToogleeTextF = (TextView)  Utils.findRequiredViewAsType(view, R.id.temperature_unit_toggle_text_f, "field 'mTemperatureUnitToogleeTextF'", TextView.class);
        t.mTemperatureUnitToogleeTextC = (TextView)  Utils.findRequiredViewAsType(view, R.id.temperature_unit_toggle_text_c, "field 'mTemperatureUnitToogleeTextC'", TextView.class);
        a =  Utils.findRequiredView(view, R.id.temperature_unit_toggle_button, "field 'mTemperatureUnitToogleeButton' and method 'onTemUnitToggle'");
        t.mTemperatureUnitToogleeButton = (ToggleButton)  Utils.castView(a, R.id.temperature_unit_toggle_button, "field 'mTemperatureUnitToogleeButton'", ToggleButton.class);
        this.f13232e = a;
        a.setOnClickListener(new bj(this, t));
        t.mTemperatureUnitToogleeButtonContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.temperature_unit_toggle_button_container, "field 'mTemperatureUnitToogleeButtonContainer'", ViewGroup.class);
    }
}
