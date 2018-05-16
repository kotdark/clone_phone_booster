package utility.quickest.phonebooster.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.firebase.perf.metrics.AppStartTrace;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.fragment.FakePopupLsFragment;
import utility.quickest.phonebooster.fragment. BaseFragment;
import utility.quickest.phonebooster.model_helper.C2492b;
import utility.quickest.phonebooster.model_helper.cv;
import utility.quickest.phonebooster.model_helper.db;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.view.SwipeBackLayout;
import utility.quickest.phonebooster.R;
import java.util.ArrayList;
import java.util.List;

public class FakePopupLsActivity extends BaseActivity {
    private List<cv> f12821a = new ArrayList();
    private boolean f12822b = false;
    private SwipeBackLayout f12823c;

    protected void onResume() {
        AppStartTrace.setLauncherActivityOnResumeTime("utility.quickest.phonebooster.activity.FakePopupLsActivity");
        super.onResume();
    }

    public static void m17274d() {
        Context a = MyApplicationLike.getApplication();
        Intent intent = new Intent(a, FakePopupLsActivity.class);
        intent.setFlags(335544320);
        a.startActivity(intent);
    }

    public void onCreate(Bundle bundle) {
        AppStartTrace.setLauncherActivityOnCreateTime("utility.quickest.phonebooster.activity.FakePopupLsActivity");
        getWindow().setFormat(1);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(4194304);
        getWindow().addFlags(524288);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().getDecorView().setBackgroundColor(0);
        this.f12821a = C2492b.m18285a().m18329c(db.CPU_COOL2);
        C2492b.m18285a().m18328b(db.CPU_COOL2);
        this.f12823c = (SwipeBackLayout) LayoutInflater.from(this).inflate(R.layout.base, null);
        this.f12823c.m19259a(this);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        if (this.f12821a.isEmpty()) {
            finish();
        }
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (!C2535e.m19054s() || !C2535e.m19053r() || this.f12821a.isEmpty()) {
            finish();
        }
    }

    protected void onStart() {
        AppStartTrace.setLauncherActivityOnStartTime("utility.quickest.phonebooster.activity.FakePopupLsActivity");
        super.onStart();
        if (!C2535e.m19054s() || !C2535e.m19053r() || this.f12821a.isEmpty()) {
            finish();
        }
    }

    protected void onStop() {
        super.onStop();
        if (this.f12822b) {
            finish();
        }
    }

    protected BaseFragment mo3067a(Intent intent) {
        return FakePopupLsFragment.m17782a(this.f12821a);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.f12822b = true;
        }
    }

    public void onBackPressed() {
    }
}
