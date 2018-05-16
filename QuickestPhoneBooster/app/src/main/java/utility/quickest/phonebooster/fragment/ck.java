package utility.quickest.phonebooster.fragment;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import utility.quickest.phonebooster.activity.DocActivity;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.R;

/* compiled from: LauncherFragmentNew */
class ck extends ClickableSpan {
    final /* synthetic */ LauncherFragmentNew f13608a;

    ck(LauncherFragmentNew launcherFragmentNew) {
        this.f13608a = launcherFragmentNew;
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(-1);
        textPaint.setUnderlineText(true);
    }

    public void onClick(View view) {
        C2542m.m19082a("launcher_fragment", "term_doc", null);
        DocActivity.m17268a(this.f13608a, this.f13608a.m17696a((int) R.string.about_terms), "http://goclean.tech/term.html");
    }
}
