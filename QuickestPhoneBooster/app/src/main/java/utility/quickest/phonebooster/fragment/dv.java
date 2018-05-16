package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.model_helper.il;
import utility.quickest.phonebooster.view.cq;
import utility.quickest.phonebooster.R;

/* compiled from: MainFragment */
class dv implements cq {
    final /* synthetic */ MainFragment f13667a;

    dv(MainFragment mainFragment) {
        this.f13667a = mainFragment;
    }

    public void mo3107a(il ilVar) {
        if (il.Celsius.equals(ilVar)) {
            this.f13667a.mSettingTemperatureUnitValue.setText(this.f13667a.m17696a((int) R.string.cpu_cooling_temperature_unit));
            this.f13667a.f13355b.m18710a(il.Celsius);
        } else if (il.Fahrenheit.equals(ilVar)) {
            this.f13667a.mSettingTemperatureUnitValue.setText(this.f13667a.m17696a((int) R.string.cpu_cooling_temperature_unit1));
            this.f13667a.f13355b.m18710a(il.Fahrenheit);
        }
    }
}
