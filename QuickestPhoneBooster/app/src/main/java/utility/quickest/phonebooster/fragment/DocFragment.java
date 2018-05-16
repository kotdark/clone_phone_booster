package utility.quickest.phonebooster.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.R;

public class DocFragment extends BaseFragment {
    private String f13233a = "";
    private String f13234b = "";
    @BindView
    protected ViewGroup mActionBarBackIcon;
    @BindView
    protected TextView mActionBarTitle;
    @BindView
    protected WebView mDocContent;
    @BindView
    protected ImageView mDocProgress;

    @OnClick
    public void doBack() {
        C2542m.m19082a("doc_fragment", "back", null);
        getActivity().finish();
    }

    public static DocFragment m17778a(Intent intent) {
        DocFragment docFragment = new DocFragment();
        Bundle bundle = new Bundle();
        bundle.putString("key_content", intent.getStringExtra("key_content"));
        bundle.putString("key_title", intent.getStringExtra("key_title"));
        docFragment.setArguments(bundle);
        return docFragment;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f13233a = arguments.getString("key_content");
            this.f13234b = arguments.getString("key_title");
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_doc, null);
        ButterKnife.m2793a(this, inflate);
        this.mActionBarBackIcon.setVisibility(0);
        this.mActionBarTitle.setText(this.f13234b);
        WebSettings settings = this.mDocContent.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAppCacheEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setSaveFormData(true);
        settings.setSupportZoom(true);
        settings.setLayoutAlgorithm(LayoutAlgorithm.SINGLE_COLUMN);
        settings.setBuiltInZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        this.mDocContent.setWebViewClient(new bk(this));
        this.mDocProgress.setVisibility(0);
        this.mDocContent.setVisibility(8);
        this.mDocContent.loadUrl(this.f13233a);
        return inflate;
    }

    public void onDestroyView() {
        if (this.mDocContent != null) {
            ViewGroup viewGroup = (ViewGroup) this.mDocContent.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.mDocContent);
            }
            this.mDocContent.destroy();
            this.mDocContent = null;
        }
        super.onDestroyView();
    }
}
