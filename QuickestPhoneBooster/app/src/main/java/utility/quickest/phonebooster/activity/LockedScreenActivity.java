package utility.quickest.phonebooster.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.CustomEvent;
import com.google.firebase.perf.metrics.AppStartTrace;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.fragment.LockedScreenFragment;
import utility.quickest.phonebooster.fragment.LockedScreenFragmentWithAd;
import utility.quickest.phonebooster.fragment. BaseFragment;
import utility.quickest.phonebooster.model_helper.hh;
import utility.quickest.phonebooster.model_helper.ig;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.view.SwipeBackLayout;
import utility.quickest.phonebooster.R;

public class LockedScreenActivity extends BaseActivity {
    private boolean f12824a = false;
    private SwipeBackLayout f12825b;
    private long f12826c = 0;

    protected void onResume() {
        AppStartTrace.setLauncherActivityOnResumeTime("utility.quickest.phonebooster.activity.LockedScreenActivity");
        super.onResume();
    }

    public static void m17282d() {
        Context a = MyApplicationLike.getApplication();
        Intent intent = new Intent(a, LockedScreenActivity.class);
        intent.setFlags(335544320);
        a.startActivity(intent);
    }

    public void onCreate(Bundle bundle) {
        AppStartTrace.setLauncherActivityOnCreateTime("utility.quickest.phonebooster.activity.LockedScreenActivity");
        getWindow().setFormat(1);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(4194304);
        getWindow().addFlags(524288);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().getDecorView().setBackgroundColor(0);
        this.f12825b = (SwipeBackLayout) LayoutInflater.from(this).inflate(R.layout.base, null);
        this.f12825b.m19259a(this);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (!ig.m18707a().m18717d() || !C2535e.m19054s() || !C2535e.m19053r()) {
            finish();
        }
    }

    protected void onStart() {
        AppStartTrace.setLauncherActivityOnStartTime("utility.quickest.phonebooster.activity.LockedScreenActivity");
        super.onStart();
        if (!ig.m18707a().m18717d() || !C2535e.m19054s() || !C2535e.m19053r()) {
            finish();
        }
    }

    protected void onStop() {
        super.onStop();
        if (this.f12824a) {
            finish();
        }
    }

    protected BaseFragment mo3067a(Intent intent) {
        if (hh.m18641f()) {
            return LockedScreenFragmentWithAd.m17809a();
        }
        return LockedScreenFragment.m17799a();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.f12824a = true;
            this.f12826c = SystemClock.elapsedRealtime();
            try {
                Answers.getInstance().logCustom(new CustomEvent("LockedScreenToShow"));
                return;
            } catch (Throwable th) {
                return;
            }
        }
        if (this.f12826c > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f12826c;
            if (elapsedRealtime > 0) {
                try {
                    Answers.getInstance().logCustom((CustomEvent) new CustomEvent("LockedScreenAliveTime").putCustomAttribute("time", Long.valueOf(elapsedRealtime)));
                } catch (Throwable th2) {
                }
            }
        }
        this.f12826c = 0;
    }

    public void onBackPressed() {
    }
}
