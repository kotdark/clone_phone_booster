package utility.quickest.phonebooster.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class UpdateDialog_ViewBinding<T extends UpdateDialog> implements Unbinder {
    protected T f15039b;
    private View f15040c;
    private View f15041d;

    public UpdateDialog_ViewBinding(T t, View view) {
        this.f15039b = t;
        t.mDescriptionTextView = (TextView)  Utils.findRequiredViewAsType(view, R.id.update_dialog_description, "field 'mDescriptionTextView'", TextView.class);
        t.mImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.image, "field 'mImage'", ImageView.class);
        View a =  Utils.findRequiredView(view, R.id.update_dialog_confirm, "method 'confirm'");
        this.f15040c = a;
        a.setOnClickListener(new cu(this, t));
        a =  Utils.findRequiredView(view, R.id.update_dialog_close, "method 'close'");
        this.f15041d = a;
        a.setOnClickListener(new cv(this, t));
    }
}
