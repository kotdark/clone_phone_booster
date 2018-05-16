package utility.quickest.phonebooster.fragment;

import android.os.SystemClock;
import android.view.View;
import android.view.View.OnClickListener;
import utility.quickest.phonebooster.util.C2542m;

/* compiled from: AboutFragment */
class C2458a implements OnClickListener {
    final /* synthetic */ AboutFragment f13507a;

    C2458a(AboutFragment aboutFragment) {
        this.f13507a = aboutFragment;
    }

    public void onClick(View view) {
        if (SystemClock.elapsedRealtime() - this.f13507a.f13133c > 800) {
            this.f13507a.f13132b = 0;
        } else {
            this.f13507a.f13132b = this.f13507a.f13132b + 1;
        }
        this.f13507a.f13133c = SystemClock.elapsedRealtime();
        if (this.f13507a.f13132b >= 10) {
            this.f13507a.f13132b = 0;
            if (C2542m.m19087a()) {
                this.f13507a.mTestModeTextView.setText(this.f13507a.m17706d());
            } else {
                this.f13507a.mTestModeTextView.setText("");
            }
        }
    }
}
