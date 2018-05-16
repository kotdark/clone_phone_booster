package utility.quickest.phonebooster.fragment;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import utility.quickest.phonebooster.activity.DocActivity;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.R;

/* compiled from: LauncherFragmentNew */
class cl extends ClickableSpan {
    final /* synthetic */ LauncherFragmentNew f13609a;

    cl(LauncherFragmentNew launcherFragmentNew) {
        this.f13609a = launcherFragmentNew;
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(-1);
        textPaint.setUnderlineText(true);
    }

    public void onClick(View view) {
        C2542m.m19082a("launcher_fragment", "privacy_policy_doc", null);
        DocActivity.m17268a(this.f13609a, this.f13609a.m17696a((int) R.string.about_privacy_policy), "http://goclean.tech/protocol.html");
    }
}
