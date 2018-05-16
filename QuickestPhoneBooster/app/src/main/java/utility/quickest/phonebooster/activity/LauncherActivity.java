package utility.quickest.phonebooster.activity;

import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.perf.metrics.AppStartTrace;
import utility.quickest.phonebooster.fragment.LauncherFragmentNew;
import utility.quickest.phonebooster.fragment. BaseFragment;

public class LauncherActivity extends BaseActivity {
    protected void onResume() {
        AppStartTrace.setLauncherActivityOnResumeTime("utility.quickest.phonebooster.activity.LauncherActivity");
        super.onResume();
    }

    protected void onStart() {
        AppStartTrace.setLauncherActivityOnStartTime("utility.quickest.phonebooster.activity.LauncherActivity");
        super.onStart();
    }

    protected BaseFragment mo3067a(Intent intent) {
        return LauncherFragmentNew.m17795a();
    }

    public void onCreate(Bundle bundle) {
        AppStartTrace.setLauncherActivityOnCreateTime("utility.quickest.phonebooster.activity.LauncherActivity");
        getWindow().setFormat(1);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        super.onCreate(bundle);
    }

    public void onBackPressed() {
    }
}
