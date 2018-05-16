package utility.quickest.phonebooster.view;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class AddQuickCleanDialogFromMainPage_ViewBinding<T extends AddQuickCleanDialogFromMainPage> implements Unbinder {
    protected T f14734b;
    private View f14735c;
    private View f14736d;

    public AddQuickCleanDialogFromMainPage_ViewBinding(T t, View view) {
        this.f14734b = t;
        t.mImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.image, "field 'mImage'", ImageView.class);
        View a =  Utils.findRequiredView(view, R.id.add_qc_dialog_from_main_create, "method 'confirm'");
        this.f14735c = a;
        a.setOnClickListener(new C2581d(this, t));
        a =  Utils.findRequiredView(view, R.id.add_qc_dialog_from_main_close, "method 'doClose'");
        this.f14736d = a;
        a.setOnClickListener(new C2582e(this, t));
    }
}
