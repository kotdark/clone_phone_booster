package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: TemperatureUnitDialog_ViewBinding */
class cr extends DebouncingOnClickListener {
    final /* synthetic */ TemperatureUnitDialog f15215b;
    final /* synthetic */ TemperatureUnitDialog_ViewBinding f15216c;

    cr(TemperatureUnitDialog_ViewBinding temperatureUnitDialog_ViewBinding, TemperatureUnitDialog temperatureUnitDialog) {
        this.f15216c = temperatureUnitDialog_ViewBinding;
        this.f15215b = temperatureUnitDialog;
    }

    public void doClick(View view) {
        this.f15215b.closeWindow();
    }
}
