package utility.quickest.phonebooster.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.firebase.perf.metrics.AppStartTrace;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.fragment.PowerSavingFinishFragment;
import utility.quickest.phonebooster.fragment. BaseFragment;

public class PowerSavingFinishActivity extends BaseActivity {
    protected void onCreate(Bundle bundle) {
        AppStartTrace.setLauncherActivityOnCreateTime("utility.quickest.phonebooster.activity.PowerSavingFinishActivity");
        super.onCreate(bundle);
    }

    protected void onResume() {
        AppStartTrace.setLauncherActivityOnResumeTime("utility.quickest.phonebooster.activity.PowerSavingFinishActivity");
        super.onResume();
    }

    protected void onStart() {
        AppStartTrace.setLauncherActivityOnStartTime("utility.quickest.phonebooster.activity.PowerSavingFinishActivity");
        super.onStart();
    }

    public static void m17314a(Fragment fragment, String str) {
        Intent intent = new Intent(MyApplicationLike.getApplication(), PowerSavingFinishActivity.class);
        intent.putExtra("key_tag_string", str);
        fragment.startActivity(intent);
    }

    public static void m17313a(Activity activity, String str) {
        Intent intent = new Intent(MyApplicationLike.getApplication(), PowerSavingFinishActivity.class);
        intent.putExtra("key_tag_string", str);
        activity.startActivity(intent);
    }

    protected BaseFragment mo3067a(Intent intent) {
        return PowerSavingFinishFragment.m17865a(intent);
    }
}
