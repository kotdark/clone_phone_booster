package utility.quickest.phonebooster.fragment;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: DocFragment */
class bk extends WebViewClient {
    final /* synthetic */ DocFragment f13562a;

    bk(DocFragment docFragment) {
        this.f13562a = docFragment;
    }

    public void onPageFinished(WebView webView, String str) {
        this.f13562a.mDocProgress.setVisibility(8);
        this.f13562a.mDocContent.setVisibility(0);
        super.onPageFinished(webView, str);
    }
}
