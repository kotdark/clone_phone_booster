package utility.quickest.phonebooster.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.firebase.perf.metrics.AppStartTrace;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.fragment.JunkCleanFinishFragment;
import utility.quickest.phonebooster.fragment. BaseFragment;

public class JunkCleanFinishActivity extends BaseActivity {
    protected void onCreate(Bundle bundle) {
        AppStartTrace.setLauncherActivityOnCreateTime("utility.quickest.phonebooster.activity.JunkCleanFinishActivity");
        super.onCreate(bundle);
    }

    protected void onResume() {
        AppStartTrace.setLauncherActivityOnResumeTime("utility.quickest.phonebooster.activity.JunkCleanFinishActivity");
        super.onResume();
    }

    protected void onStart() {
        AppStartTrace.setLauncherActivityOnStartTime("utility.quickest.phonebooster.activity.JunkCleanFinishActivity");
        super.onStart();
    }

    public static void m17279a(Fragment fragment, int i, long j, boolean z) {
        Intent intent = new Intent(MyApplicationLike.getApplication(), JunkCleanFinishActivity.class);
        intent.putExtra("key_entrance", i);
        intent.putExtra("key_junk_size", j);
        intent.putExtra("key_has_cleaned", z);
        fragment.startActivity(intent);
    }

    public static void m17278a(Activity activity, int i, long j, boolean z) {
        Intent intent = new Intent(MyApplicationLike.getApplication(), JunkCleanFinishActivity.class);
        intent.putExtra("key_entrance", i);
        intent.putExtra("key_junk_size", j);
        intent.putExtra("key_has_cleaned", z);
        activity.startActivity(intent);
    }

    protected BaseFragment mo3067a(Intent intent) {
        return JunkCleanFinishFragment.m17788a(intent);
    }
}
