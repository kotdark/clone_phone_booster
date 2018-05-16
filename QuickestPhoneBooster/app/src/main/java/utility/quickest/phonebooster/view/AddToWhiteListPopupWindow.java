package utility.quickest.phonebooster.view;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import com.mopub.volley.DefaultRetryPolicy;
import utility.quickest.phonebooster.R;

public class AddToWhiteListPopupWindow extends PopupWindow {
    private LayoutInflater f14740a = LayoutInflater.from(MyApplicationLike.getApplication());
    private C2462h f14741b;
    private Activity f14742c;
    @BindView
    protected ImageView mAppIcon;
    @BindView
    protected TextView mAppName;

    @OnClick
    public void closeWindow() {
        C2542m.m19082a("add_to_white_list_popup", "close", null);
        dismiss();
    }

    @OnClick
    public void addToWhiteList() {
        C2542m.m19082a("add_to_white_list_popup", "add", null);
        if (this.f14741b != null) {
            this.f14741b.mo3092a();
            dismiss();
        }
    }

    public AddToWhiteListPopupWindow(Activity activity, String str, C2462h c2462h) {
        this.f14742c = activity;
        this.f14741b = c2462h;
        View inflate = this.f14740a.inflate(R.layout.popup_add_to_white_list, null);
        ButterKnife.m2793a(this, inflate);
        setContentView(inflate);
        setWidth(-1);
        setHeight(-1);
        setOutsideTouchable(true);
        setBackgroundDrawable(new ColorDrawable(0));
        this.mAppIcon.setImageDrawable(C2535e.m19029a(str));
        this.mAppName.setText(C2535e.m19033b(str));
    }

    public void dismiss() {
        super.dismiss();
        m19120a((float) DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
    }

    public void m19121a(View view) {
        try {
            if (isShowing()) {
                dismiss();
                return;
            }
            showAtLocation(view, 17, 0, 0);
            m19120a(0.5f);
        } catch (Exception e) {
        }
    }

    private void m19120a(float f) {
        LayoutParams attributes = this.f14742c.getWindow().getAttributes();
        attributes.alpha = f;
        if (f == DefaultRetryPolicy.DEFAULT_BACKOFF_MULT) {
            this.f14742c.getWindow().clearFlags(2);
        } else {
            this.f14742c.getWindow().addFlags(2);
        }
        this.f14742c.getWindow().setAttributes(attributes);
    }
}
