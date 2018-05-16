package utility.quickest.phonebooster.view;

import android.view.View;
import android.widget.GridView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class ShareDialogTarget_ViewBinding<T extends ShareDialogTarget> implements Unbinder {
    protected T f14995b;
    private View f14996c;
    private View f14997d;

    public ShareDialogTarget_ViewBinding(T t, View view) {
        this.f14995b = t;
        t.mShareGrid = (GridView)  Utils.findRequiredViewAsType(view, R.id.share_grid, "field 'mShareGrid'", GridView.class);
        View a =  Utils.findRequiredView(view, R.id.share_cancel, "method 'cancel'");
        this.f14996c = a;
        a.setOnClickListener(new ck(this, t));
        a =  Utils.findRequiredView(view, R.id.container, "method 'cancel'");
        this.f14997d = a;
        a.setOnClickListener(new cl(this, t));
    }
}
