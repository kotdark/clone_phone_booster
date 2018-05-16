package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: TemperatureUnitDialog_ViewBinding */
class cs extends DebouncingOnClickListener {
    final /* synthetic */ TemperatureUnitDialog f15217b;
    final /* synthetic */ TemperatureUnitDialog_ViewBinding f15218c;

    cs(TemperatureUnitDialog_ViewBinding temperatureUnitDialog_ViewBinding, TemperatureUnitDialog temperatureUnitDialog) {
        this.f15218c = temperatureUnitDialog_ViewBinding;
        this.f15217b = temperatureUnitDialog;
    }

    public void doClick(View view) {
        this.f15217b.onSelectFahrenheit();
    }
}
