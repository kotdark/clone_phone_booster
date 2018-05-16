package utility.quickest.phonebooster.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.firebase.perf.metrics.AppStartTrace;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.fragment.WhiteListFragment;
import utility.quickest.phonebooster.fragment. BaseFragment;

public class WhiteListActivity extends BaseActivity {
    protected void onCreate(Bundle bundle) {
        AppStartTrace.setLauncherActivityOnCreateTime("utility.quickest.phonebooster.activity.WhiteListActivity");
        super.onCreate(bundle);
    }

    protected void onResume() {
        AppStartTrace.setLauncherActivityOnResumeTime("utility.quickest.phonebooster.activity.WhiteListActivity");
        super.onResume();
    }

    protected void onStart() {
        AppStartTrace.setLauncherActivityOnStartTime("utility.quickest.phonebooster.activity.WhiteListActivity");
        super.onStart();
    }

    public static void m17320a(Fragment fragment) {
        fragment.startActivity(new Intent(MyApplicationLike.getApplication(), WhiteListActivity.class));
    }

    protected BaseFragment mo3067a(Intent intent) {
        return WhiteListFragment.m17936a();
    }
}
