package utility.quickest.phonebooster.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.firebase.perf.metrics.AppStartTrace;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.fragment.StorageJunkCleanFragment;
import utility.quickest.phonebooster.fragment. BaseFragment;
import utility.quickest.phonebooster.model_helper.hh;
import utility.quickest.phonebooster.model_helper.hm;

public class StorageJunkCleanActivity extends BaseActivity {
    protected void onCreate(Bundle bundle) {
        AppStartTrace.setLauncherActivityOnCreateTime("utility.quickest.phonebooster.activity.StorageJunkCleanActivity");
        super.onCreate(bundle);
    }

    protected void onResume() {
        AppStartTrace.setLauncherActivityOnResumeTime("utility.quickest.phonebooster.activity.StorageJunkCleanActivity");
        super.onResume();
    }

    protected void onStart() {
        AppStartTrace.setLauncherActivityOnStartTime("utility.quickest.phonebooster.activity.StorageJunkCleanActivity");
        super.onStart();
    }

    public static void m17318a(Fragment fragment) {
        if (hh.m18637b(hm.JUNK)) {
            fragment.startActivity(new Intent(MyApplicationLike.getApplication(), StorageJunkCleanActivity.class));
        } else {
            JunkCleanFinishActivity.m17279a(fragment, 0, 0, false);
        }
    }

    public static void m17317a(Activity activity) {
        if (hh.m18637b(hm.JUNK)) {
            activity.startActivity(new Intent(MyApplicationLike.getApplication(), StorageJunkCleanActivity.class));
        } else {
            JunkCleanFinishActivity.m17278a(activity, 0, 0, false);
        }
    }

    protected BaseFragment mo3067a(Intent intent) {
        return StorageJunkCleanFragment.m17911a();
    }
}
