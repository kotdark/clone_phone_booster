package utility.quickest.phonebooster.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.firebase.perf.metrics.AppStartTrace;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.fragment.MemoryJunkCleanFragment;
import utility.quickest.phonebooster.fragment. BaseFragment;
import utility.quickest.phonebooster.model_helper.hh;
import utility.quickest.phonebooster.model_helper.hm;

public class MemoryJunkCleanActivity extends BaseActivity {
    protected void onCreate(Bundle bundle) {
        AppStartTrace.setLauncherActivityOnCreateTime("utility.quickest.phonebooster.activity.MemoryJunkCleanActivity");
        super.onCreate(bundle);
    }

    protected void onResume() {
        AppStartTrace.setLauncherActivityOnResumeTime("utility.quickest.phonebooster.activity.MemoryJunkCleanActivity");
        super.onResume();
    }

    protected void onStart() {
        AppStartTrace.setLauncherActivityOnStartTime("utility.quickest.phonebooster.activity.MemoryJunkCleanActivity");
        super.onStart();
    }

    public static void m17300a(Fragment fragment) {
        if (hh.m18637b(hm.MEMORY)) {
            fragment.startActivity(new Intent(MyApplicationLike.getApplication(), MemoryJunkCleanActivity.class));
        } else {
            JunkCleanFinishActivity.m17279a(fragment, 1, 0, false);
        }
    }

    public static void m17299a(Activity activity) {
        if (hh.m18637b(hm.MEMORY)) {
            activity.startActivity(new Intent(MyApplicationLike.getApplication(), MemoryJunkCleanActivity.class));
        } else {
            JunkCleanFinishActivity.m17278a(activity, 1, 0, false);
        }
    }

    protected BaseFragment mo3067a(Intent intent) {
        return MemoryJunkCleanFragment.m17832a();
    }
}
