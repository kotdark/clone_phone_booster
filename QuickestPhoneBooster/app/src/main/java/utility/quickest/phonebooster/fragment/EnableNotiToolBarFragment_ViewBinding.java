package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class EnableNotiToolBarFragment_ViewBinding<T extends EnableNotiToolBarFragment> implements Unbinder {
    protected T f13237b;
    private View f13238c;
    private View f13239d;

    public EnableNotiToolBarFragment_ViewBinding(T t, View view) {
        this.f13237b = t;
        t.mIllustration = (ImageView)  Utils.findRequiredViewAsType(view, R.id.illustration, "field 'mIllustration'", ImageView.class);
        View a =  Utils.findRequiredView(view, R.id.close, "method 'doClose'");
        this.f13238c = a;
        a.setOnClickListener(new bm(this, t));
        a =  Utils.findRequiredView(view, R.id.ok, "method 'doOk'");
        this.f13239d = a;
        a.setOnClickListener(new bn(this, t));
    }
}
