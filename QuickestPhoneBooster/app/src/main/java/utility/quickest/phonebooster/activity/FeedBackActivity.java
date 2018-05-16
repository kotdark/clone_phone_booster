package utility.quickest.phonebooster.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.firebase.perf.metrics.AppStartTrace;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.fragment.FeedBackFragment;
import utility.quickest.phonebooster.fragment. BaseFragment;

public class FeedBackActivity extends BaseActivity {
    protected void onCreate(Bundle bundle) {
        AppStartTrace.setLauncherActivityOnCreateTime("utility.quickest.phonebooster.activity.FeedBackActivity");
        super.onCreate(bundle);
    }

    protected void onResume() {
        AppStartTrace.setLauncherActivityOnResumeTime("utility.quickest.phonebooster.activity.FeedBackActivity");
        super.onResume();
    }

    protected void onStart() {
        AppStartTrace.setLauncherActivityOnStartTime("utility.quickest.phonebooster.activity.FeedBackActivity");
        super.onStart();
    }

    public static void m17276a(Fragment fragment) {
        fragment.startActivity(new Intent(MyApplicationLike.getApplication(), FeedBackActivity.class));
    }

    protected BaseFragment mo3067a(Intent intent) {
        return FeedBackFragment.m17784a();
    }
}
