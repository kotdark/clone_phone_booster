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
import utility.quickest.phonebooster.R;
import java.util.ArrayList;
import java.util.List;

public class PopupAdActivity extends BaseActivity {
    private List<cv> f12836a = new ArrayList();

    protected void onResume() {
        AppStartTrace.setLauncherActivityOnResumeTime("utility.quickest.phonebooster.activity.PopupAdActivity");
        super.onResume();
    }

    protected void onStart() {
        AppStartTrace.setLauncherActivityOnStartTime("utility.quickest.phonebooster.activity.PopupAdActivity");
        super.onStart();
    }

    public static void m17302d() {
        Context a = MyApplicationLike.getApplication();
        Intent intent = new Intent(a, PopupAdActivity.class);
        intent.setFlags(335544320);
        a.startActivity(intent);
    }

    protected BaseFragment mo3067a(Intent intent) {
        return PopupAdFragment.m17847a(this.f12836a);
    }

    public void onCreate(Bundle bundle) {
        AppStartTrace.setLauncherActivityOnCreateTime("utility.quickest.phonebooster.activity.PopupAdActivity");
        getWindow().setFormat(1);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().getDecorView().setBackgroundColor(0);
        this.f12836a = C2492b.m18285a().m18329c(db.SPLASH2);
        super.onCreate(bundle);
        overridePendingTransition(R.anim.activity_fade_in, 0);
        if (this.f12836a.isEmpty()) {
            finish();
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.activity_fade_out);
    }
}
