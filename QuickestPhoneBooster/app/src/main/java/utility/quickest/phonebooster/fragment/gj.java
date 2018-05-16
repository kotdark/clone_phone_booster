package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.model_helper.il;
import utility.quickest.phonebooster.view.cq;
import utility.quickest.phonebooster.R;

/* compiled from: SettingFragment */
class gj implements cq {
    final /* synthetic */ SettingFragment f13777a;

    gj(SettingFragment settingFragment) {
        this.f13777a = settingFragment;
    }

    public void mo3107a(il ilVar) {
        if (il.Celsius.equals(ilVar)) {
            this.f13777a.mSettingTemperatureUnitValue.setText(this.f13777a.m17696a((int) R.string.cpu_cooling_temperature_unit));
            this.f13777a.f13464a.m18710a(il.Celsius);
        } else if (il.Fahrenheit.equals(ilVar)) {
            this.f13777a.mSettingTemperatureUnitValue.setText(this.f13777a.m17696a((int) R.string.cpu_cooling_temperature_unit1));
            this.f13777a.f13464a.m18710a(il.Fahrenheit);
        }
    }
}
