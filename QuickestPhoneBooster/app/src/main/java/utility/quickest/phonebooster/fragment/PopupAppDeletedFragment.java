package utility.quickest.phonebooster.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import utility.quickest.phonebooster.activity.MainActivity;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ViewUtil;
import utility.quickest.phonebooster.R;

public class PopupAppDeletedFragment extends BaseFragment {
    private String f13415a = "";
    @BindView
    protected TextView mAppNameTxt;

    @OnClick
    public void onNoConfirmClicked() {
        if (ViewUtil.m18937a((Fragment) this)) {
            C2542m.m19082a("app_delete_fragment", "no", null);
            getActivity().finish();
        }
    }

    @OnClick
    public void onYesConfirmClicked() {
        if (ViewUtil.m18937a((Fragment) this)) {
            C2542m.m19082a("app_delete_fragment", "yes", null);
            MainActivity.m17287a("uninstall_dialog_junk_clean");
            getActivity().finish();
        }
    }

    public static PopupAppDeletedFragment m17849a(Intent intent) {
        PopupAppDeletedFragment popupAppDeletedFragment = new PopupAppDeletedFragment();
        Bundle bundle = new Bundle();
        bundle.putString("key_app_name", intent.getStringExtra("key_app_name"));
        popupAppDeletedFragment.setArguments(bundle);
        return popupAppDeletedFragment;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f13415a = arguments.getString("key_app_name", "");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_uninstall, null);
        ButterKnife.m2793a(this, inflate);
        CharSequence spannableString = new SpannableString(this.f13415a + " " + m17696a((int) R.string.uninstall_clean_apk_dialog_title));
        spannableString.setSpan(new ForegroundColorSpan(this, m17699c().getColor(R.color.blue_real)) {
            final /* synthetic */ PopupAppDeletedFragment f13414a;

            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(this.f13414a.m17699c().getColor(R.color.blue_real));
                textPaint.setFakeBoldText(false);
                textPaint.setUnderlineText(false);
            }
        }, 0, this.f13415a.length(), 33);
        this.mAppNameTxt.setText(spannableString);
        C2542m.m19082a("app_delete_fragment", "show", null);
        return inflate;
    }

    public boolean mo3085b() {
        C2542m.m19082a("app_delete_fragment", "no", null);
        return super.mo3085b();
    }
}
