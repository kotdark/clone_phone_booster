package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.model_helper.jj;
import utility.quickest.phonebooster.util.ViewUtil;
import utility.quickest.phonebooster.R;

/* compiled from: CPUCoolingFragment */
class az implements jj {
    final /* synthetic */ CPUCoolingFragment f13545a;

    az(CPUCoolingFragment cPUCoolingFragment) {
        this.f13545a = cPUCoolingFragment;
    }

    public void mo3090a(int i) {
        if (ViewUtil.m18937a(this.f13545a) && this.f13545a.mTemperatureWaitContainer.getVisibility() != 0) {
            this.f13545a.m17775k();
            if (this.f13545a.f13220d.m18754b() <= 60) {
                this.f13545a.mTemperatureTag.setText(this.f13545a.m17696a((int) R.string.cpu_cooling_tag1));
                this.f13545a.mTemperatureTip.setText(this.f13545a.m17696a((int) R.string.cpu_cooling_tip1));
                this.f13545a.mTemperatureNumber.setTextColor(this.f13545a.m17699c().getColor(R.color.main_color));
                this.f13545a.mTemperatureTag.setTextColor(this.f13545a.m17699c().getColor(R.color.main_color));
                this.f13545a.mTemperatureUnit.setTextColor(this.f13545a.m17699c().getColor(R.color.main_color));
            } else if (this.f13545a.f13220d.m18754b() > 60) {
                this.f13545a.mTemperatureTag.setText(this.f13545a.m17696a((int) R.string.cpu_cooling_tag2));
                this.f13545a.mTemperatureTip.setText(this.f13545a.m17696a((int) R.string.cpu_cooling_tip2));
                this.f13545a.mTemperatureNumber.setTextColor(this.f13545a.m17699c().getColor(R.color.red));
                this.f13545a.mTemperatureTag.setTextColor(this.f13545a.m17699c().getColor(R.color.red));
                this.f13545a.mTemperatureUnit.setTextColor(this.f13545a.m17699c().getColor(R.color.red));
            }
        }
    }
}
