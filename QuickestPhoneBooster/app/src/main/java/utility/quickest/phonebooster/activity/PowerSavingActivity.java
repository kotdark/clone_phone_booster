package utility.quickest.phonebooster.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.firebase.perf.metrics.AppStartTrace;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.fragment.PowerSavingFragmentNew;
import utility.quickest.phonebooster.fragment. BaseFragment;
import utility.quickest.phonebooster.model_helper.hh;
import utility.quickest.phonebooster.model_helper.hm;
import utility.quickest.phonebooster.R;

public class PowerSavingActivity extends BaseActivity {
    protected void onCreate(Bundle bundle) {
        AppStartTrace.setLauncherActivityOnCreateTime("utility.quickest.phonebooster.activity.PowerSavingActivity");
        super.onCreate(bundle);
    }

    protected void onResume() {
        AppStartTrace.setLauncherActivityOnResumeTime("utility.quickest.phonebooster.activity.PowerSavingActivity");
        super.onResume();
    }

    protected void onStart() {
        AppStartTrace.setLauncherActivityOnStartTime("utility.quickest.phonebooster.activity.PowerSavingActivity");
        super.onStart();
    }

    public static void m17311a(Fragment fragment) {
        if (hh.m18637b(hm.SAVE_POWER)) {
            fragment.startActivity(new Intent(MyApplicationLike.getApplication(), PowerSavingActivity.class));
        } else {
            PowerSavingFinishActivity.m17314a(fragment, MyApplicationLike.getApplication().getString(R.string.power_saving_finish_tip3));
        }
    }

    public static void m17310a(Activity activity) {
        if (hh.m18637b(hm.SAVE_POWER)) {
            activity.startActivity(new Intent(MyApplicationLike.getApplication(), PowerSavingActivity.class));
        } else {
            PowerSavingFinishActivity.m17313a(activity, MyApplicationLike.getApplication().getString(R.string.power_saving_finish_tip3));
        }
    }

    protected BaseFragment mo3067a(Intent intent) {
        return PowerSavingFragmentNew.m17887a();
    }
}
