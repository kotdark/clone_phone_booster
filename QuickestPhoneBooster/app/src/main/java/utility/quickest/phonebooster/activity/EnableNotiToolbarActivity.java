package utility.quickest.phonebooster.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.google.firebase.perf.metrics.AppStartTrace;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.fragment.EnableNotiToolBarFragment;
import utility.quickest.phonebooster.fragment. BaseFragment;
import utility.quickest.phonebooster.R;

public class EnableNotiToolbarActivity extends BaseActivity {
    protected void onResume() {
        AppStartTrace.setLauncherActivityOnResumeTime("utility.quickest.phonebooster.activity.EnableNotiToolbarActivity");
        super.onResume();
    }

    protected void onStart() {
        AppStartTrace.setLauncherActivityOnStartTime("utility.quickest.phonebooster.activity.EnableNotiToolbarActivity");
        super.onStart();
    }

    public static void m17270a(Activity activity) {
        activity.startActivity(new Intent(MyApplicationLike.getApplication(), EnableNotiToolbarActivity.class));
    }

    protected void onCreate(Bundle bundle) {
        AppStartTrace.setLauncherActivityOnCreateTime("utility.quickest.phonebooster.activity.EnableNotiToolbarActivity");
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().getDecorView().setBackgroundColor(0);
        super.onCreate(bundle);
        overridePendingTransition(R.anim.activity_slide_in_from_bottom, R.anim.activity_slide_keep);
    }

    protected BaseFragment mo3067a(Intent intent) {
        return EnableNotiToolBarFragment.m17779a();
    }

    public void onBackPressed() {
    }
}
