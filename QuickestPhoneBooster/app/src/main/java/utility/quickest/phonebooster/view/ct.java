package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: TemperatureUnitDialog_ViewBinding */
class ct extends DebouncingOnClickListener {
    final /* synthetic */ TemperatureUnitDialog f15219b;
    final /* synthetic */ TemperatureUnitDialog_ViewBinding f15220c;

    ct(TemperatureUnitDialog_ViewBinding temperatureUnitDialog_ViewBinding, TemperatureUnitDialog temperatureUnitDialog) {
        this.f15220c = temperatureUnitDialog_ViewBinding;
        this.f15219b = temperatureUnitDialog;
    }

    public void doClick(View view) {
        this.f15219b.onSelectCelsius();
    }
}
