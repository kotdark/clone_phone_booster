package utility.quickest.phonebooster.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.google.firebase.perf.metrics.AppStartTrace;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.fragment.PopupAdFragment;
import utility.quickest.phonebooster.fragment. BaseFragment;
import utility.quickest.phonebooster.model_helper.C2492b;
import utility.quickest.phonebooster.model_helper.cv;
import utility.quickest.phonebooster.model_helper.db;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.R;
import java.util.ArrayList;
import java.util.List;

public class PopupAfterActivity extends BaseActivity {
    private boolean f12837a = false;
    private List<cv> f12838b = new ArrayList();

    protected void onResume() {
        AppStartTrace.setLauncherActivityOnResumeTime("utility.quickest.phonebooster.activity.PopupAfterActivity");
        super.onResume();
    }

    protected void onStart() {
        AppStartTrace.setLauncherActivityOnStartTime("utility.quickest.phonebooster.activity.PopupAfterActivity");
        super.onStart();
    }

    public static void m17304d() {
        Context a = MyApplicationLike.getApplication();
        Intent intent = new Intent(a, PopupAfterActivity.class);
        intent.setFlags(335544320);
        a.startActivity(intent);
    }

    protected BaseFragment mo3067a(Intent intent) {
        return PopupAdFragment.m17847a(this.f12838b);
    }

    public void onCreate(Bundle bundle) {
        AppStartTrace.setLauncherActivityOnCreateTime("utility.quickest.phonebooster.activity.PopupAfterActivity");
        getWindow().setFormat(1);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().getDecorView().setBackgroundColor(0);
        this.f12838b = C2492b.m18285a().m18329c(db.SAVE_POWER2);
        super.onCreate(bundle);
        overridePendingTransition(R.anim.activity_fade_in, 0);
        if (this.f12838b.isEmpty()) {
            finish();
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.activity_fade_out);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && !this.f12837a) {
            long k;
            this.f12837a = true;
            try {
                k = ((cv) this.f12838b.get(0)).m18413k();
            } catch (Throwable th) {
                k = -1;
            }
            if (k > 0) {
                ThreadUtil.m19098a(new C2389h(this), k);
            }
        }
    }
}
