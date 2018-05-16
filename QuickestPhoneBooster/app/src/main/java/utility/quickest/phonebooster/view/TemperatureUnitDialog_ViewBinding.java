package utility.quickest.phonebooster.view;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class TemperatureUnitDialog_ViewBinding<T extends TemperatureUnitDialog> implements Unbinder {
    protected T f15031b;
    private View f15032c;
    private View f15033d;
    private View f15034e;

    public TemperatureUnitDialog_ViewBinding(T t, View view) {
        this.f15031b = t;
        t.mCelsius = (ImageView)  Utils.findRequiredViewAsType(view, R.id.celsius, "field 'mCelsius'", ImageView.class);
        t.mFahrenheit = (ImageView)  Utils.findRequiredViewAsType(view, R.id.fahrenheit, "field 'mFahrenheit'", ImageView.class);
        View a =  Utils.findRequiredView(view, R.id.container, "method 'closeWindow'");
        this.f15032c = a;
        a.setOnClickListener(new cr(this, t));
        a =  Utils.findRequiredView(view, R.id.fahrenheit_container, "method 'onSelectFahrenheit'");
        this.f15033d = a;
        a.setOnClickListener(new cs(this, t));
        a =  Utils.findRequiredView(view, R.id.celsius_container, "method 'onSelectCelsius'");
        this.f15034e = a;
        a.setOnClickListener(new ct(this, t));
    }
}
