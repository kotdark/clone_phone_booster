package utility.quickest.phonebooster.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.firebase.perf.metrics.AppStartTrace;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.fragment.AntivirusFragment;
import utility.quickest.phonebooster.fragment. BaseFragment;
import utility.quickest.phonebooster.view.co;
import utility.quickest.phonebooster.R;

public class AntivirusActivity extends BaseActivity {
    protected void onResume() {
        AppStartTrace.setLauncherActivityOnResumeTime("utility.quickest.phonebooster.activity.AntivirusActivity");
        super.onResume();
    }

    protected void onStart() {
        AppStartTrace.setLauncherActivityOnStartTime("utility.quickest.phonebooster.activity.AntivirusActivity");
        super.onStart();
    }

    public static void m17258a(Fragment fragment) {
        fragment.startActivity(new Intent(MyApplicationLike.getApplication(), AntivirusActivity.class));
    }

    public static void m17257a(Activity activity) {
        activity.startActivity(new Intent(MyApplicationLike.getApplication(), AntivirusActivity.class));
    }

    protected BaseFragment mo3067a(Intent intent) {
        return AntivirusFragment.m17723a();
    }

    protected void onCreate(Bundle bundle) {
        AppStartTrace.setLauncherActivityOnCreateTime("utility.quickest.phonebooster.activity.AntivirusActivity");
        super.onCreate(bundle);
        co.m19372a(this, getResources().getColor(R.color.antivirus_color));
    }
}
