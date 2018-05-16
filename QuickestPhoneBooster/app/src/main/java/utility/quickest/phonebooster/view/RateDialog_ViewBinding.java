package utility.quickest.phonebooster.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class RateDialog_ViewBinding<T extends RateDialog> implements Unbinder {
    protected T f14972b;
    private View f14973c;
    private View f14974d;
    private View f14975e;

    public RateDialog_ViewBinding(T t, View view) {
        this.f14972b = t;
        t.mImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.image, "field 'mImage'", ImageView.class);
        t.mContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.container, "field 'mContainer'", ViewGroup.class);
        t.mGap =  Utils.findRequiredView(view, R.id.gap, "field 'mGap'");
        View a =  Utils.findRequiredView(view, R.id.yes_confirm, "method 'confirm'");
        this.f14973c = a;
        a.setOnClickListener(new bz(this, t));
        a =  Utils.findRequiredView(view, R.id.no_confirm, "method 'doClose'");
        this.f14974d = a;
        a.setOnClickListener(new ca(this, t));
        a =  Utils.findRequiredView(view, R.id.close, "method 'doClose'");
        this.f14975e = a;
        a.setOnClickListener(new cb(this, t));
    }
}
