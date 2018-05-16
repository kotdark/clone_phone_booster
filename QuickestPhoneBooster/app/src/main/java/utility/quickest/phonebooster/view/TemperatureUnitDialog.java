package utility.quickest.phonebooster.view;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.model_helper.ig;
import utility.quickest.phonebooster.model_helper.il;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.R;

public class TemperatureUnitDialog extends Dialog {
    private cq f15029a;
    private Activity f15030b;
    @BindView
    protected ImageView mCelsius;
    @BindView
    protected ImageView mFahrenheit;

    @OnClick
    public void closeWindow() {
        C2542m.m19082a("temperature_unit_dialog", "close", null);
        dismiss();
    }

    @OnClick
    public void onSelectFahrenheit() {
        C2542m.m19082a("temperature_unit_dialog", "fahrenheit", null);
        if (this.f15029a != null) {
            this.f15029a.mo3107a(il.Fahrenheit);
        }
        dismiss();
    }

    @OnClick
    public void onSelectCelsius() {
        C2542m.m19082a("temperature_unit_dialog", "celsius", null);
        if (this.f15029a != null) {
            this.f15029a.mo3107a(il.Celsius);
        }
        dismiss();
    }

    public TemperatureUnitDialog(Activity activity, cq cqVar) {
        super(activity);
        this.f15030b = activity;
        this.f15029a = cqVar;
        View inflate = LayoutInflater.from(MyApplicationLike.getApplication()).inflate(R.layout.popup_temperature_unit, null);
        ButterKnife.m2793a(this, inflate);
        requestWindowFeature(1);
        setContentView(inflate);
        this.mCelsius.setImageResource(R.drawable.ic_radio_unselect);
        this.mFahrenheit.setImageResource(R.drawable.ic_radio_unselect);
        ig a = ig.m18707a();
        if (il.Celsius.equals(a.m18720g())) {
            this.mCelsius.setImageResource(R.drawable.ic_radio_select);
        } else if (il.Fahrenheit.equals(a.m18720g())) {
            this.mFahrenheit.setImageResource(R.drawable.ic_radio_select);
        }
    }

    public void m19260a() {
        try {
            this.mCelsius.setImageResource(R.drawable.ic_radio_unselect);
            this.mFahrenheit.setImageResource(R.drawable.ic_radio_unselect);
            ig a = ig.m18707a();
            if (il.Celsius.equals(a.m18720g())) {
                this.mCelsius.setImageResource(R.drawable.ic_radio_select);
            } else if (il.Fahrenheit.equals(a.m18720g())) {
                this.mFahrenheit.setImageResource(R.drawable.ic_radio_select);
            }
        } catch (Throwable th) {
        }
        try {
            Window window = getWindow();
            LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            window.setAttributes(attributes);
            window.setBackgroundDrawable(new ColorDrawable(0));
            show();
        } catch (Exception e) {
        }
    }
}
