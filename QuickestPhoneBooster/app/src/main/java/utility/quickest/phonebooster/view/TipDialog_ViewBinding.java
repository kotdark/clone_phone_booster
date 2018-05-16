package utility.quickest.phonebooster.view;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class TipDialog_ViewBinding<T extends TipDialog> implements Unbinder {
    protected T f15036b;

    public TipDialog_ViewBinding(T t, View view) {
        this.f15036b = t;
        t.mMessage = (TextView)  Utils.findRequiredViewAsType(view, R.id.message, "field 'mMessage'", TextView.class);
    }
}
