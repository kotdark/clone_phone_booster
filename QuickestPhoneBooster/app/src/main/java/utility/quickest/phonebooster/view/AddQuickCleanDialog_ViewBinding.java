package utility.quickest.phonebooster.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class AddQuickCleanDialog_ViewBinding<T extends AddQuickCleanDialog> implements Unbinder {
    protected T f14737b;
    private View f14738c;
    private View f14739d;

    public AddQuickCleanDialog_ViewBinding(T t, View view) {
        this.f14737b = t;
        View a =  Utils.findRequiredView(view, R.id.add_qc_dialog_create, "field 'mAddQcDialogCreate' and method 'confirm'");
        t.mAddQcDialogCreate = (TextView)  Utils.castView(a, R.id.add_qc_dialog_create, "field 'mAddQcDialogCreate'", TextView.class);
        this.f14738c = a;
        a.setOnClickListener(new C2583f(this, t));
        t.mAddQcDialogCreated = (TextView)  Utils.findRequiredViewAsType(view, R.id.add_qc_dialog_created, "field 'mAddQcDialogCreated'", TextView.class);
        t.mImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.image, "field 'mImage'", ImageView.class);
        t.mGap =  Utils.findRequiredView(view, R.id.gap, "field 'mGap'");
        View a2 =  Utils.findRequiredView(view, R.id.add_qc_dialog_close, "method 'doClose'");
        this.f14739d = a2;
        a2.setOnClickListener(new C2584g(this, t));
    }
}
