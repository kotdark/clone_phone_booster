package utility.quickest.phonebooster.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class ShareDialog_ViewBinding<T extends ShareDialog> implements Unbinder {
    protected T f14998b;
    private View f14999c;
    private View f15000d;

    public ShareDialog_ViewBinding(T t, View view) {
        this.f14998b = t;
        t.mImage = (ImageView)  Utils.findRequiredViewAsType(view, R.id.image, "field 'mImage'", ImageView.class);
        t.mTitle = (TextView)  Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitle'", TextView.class);
        t.mContent = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.content, "field 'mContent'", ViewGroup.class);
        View a =  Utils.findRequiredView(view, R.id.yes_confirm, "method 'confirm'");
        this.f14999c = a;
        a.setOnClickListener(new cm(this, t));
        a =  Utils.findRequiredView(view, R.id.no_confirm, "method 'doClose'");
        this.f15000d = a;
        a.setOnClickListener(new cn(this, t));
    }
}
