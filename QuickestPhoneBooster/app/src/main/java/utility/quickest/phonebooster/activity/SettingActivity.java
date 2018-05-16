package utility.quickest.phonebooster.activity;

import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.perf.metrics.AppStartTrace;
import utility.quickest.phonebooster.fragment.SettingFragment;
import utility.quickest.phonebooster.fragment. BaseFragment;

public class SettingActivity extends BaseActivity {
    protected void onCreate(Bundle bundle) {
        AppStartTrace.setLauncherActivityOnCreateTime("utility.quickest.phonebooster.activity.SettingActivity");
        super.onCreate(bundle);
    }

    protected void onResume() {
        AppStartTrace.setLauncherActivityOnResumeTime("utility.quickest.phonebooster.activity.SettingActivity");
        super.onResume();
    }

    protected void onStart() {
        AppStartTrace.setLauncherActivityOnStartTime("utility.quickest.phonebooster.activity.SettingActivity");
        super.onStart();
    }

    protected BaseFragment mo3067a(Intent intent) {
        return SettingFragment.m17904a();
    }
}
