package utility.quickest.phonebooster.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.firebase.perf.metrics.AppStartTrace;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.fragment.CPUCoolingFragment;
import utility.quickest.phonebooster.fragment. BaseFragment;
import utility.quickest.phonebooster.model_helper.hh;
import utility.quickest.phonebooster.model_helper.hm;
import utility.quickest.phonebooster.R;

public class CPUCoolingActivity extends BaseActivity {
    protected void onCreate(Bundle bundle) {
        AppStartTrace.setLauncherActivityOnCreateTime("utility.quickest.phonebooster.activity.CPUCoolingActivity");
        super.onCreate(bundle);
    }

    protected void onResume() {
        AppStartTrace.setLauncherActivityOnResumeTime("utility.quickest.phonebooster.activity.CPUCoolingActivity");
        super.onResume();
    }

    protected void onStart() {
        AppStartTrace.setLauncherActivityOnStartTime("utility.quickest.phonebooster.activity.CPUCoolingActivity");
        super.onStart();
    }

    public static void m17263a(Fragment fragment) {
        if (hh.m18637b(hm.CPU)) {
            fragment.startActivity(new Intent(MyApplicationLike.getApplication(), CPUCoolingActivity.class));
        } else {
            CPUCoolingFinishActivity.m17266a(fragment, MyApplicationLike.getApplication().getString(R.string.cpu_cooling_tag1));
        }
    }

    public static void m17262a(Activity activity) {
        if (hh.m18637b(hm.CPU)) {
            activity.startActivity(new Intent(MyApplicationLike.getApplication(), CPUCoolingActivity.class));
        } else {
            CPUCoolingFinishActivity.m17265a(activity, MyApplicationLike.getApplication().getString(R.string.cpu_cooling_tag1));
        }
    }

    protected BaseFragment mo3067a(Intent intent) {
        return CPUCoolingFragment.m17755a();
    }
}
