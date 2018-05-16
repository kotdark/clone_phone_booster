package utility.quickest.phonebooster.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.firebase.perf.metrics.AppStartTrace;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.fragment.AntivirusFinishFragment;
import utility.quickest.phonebooster.fragment. BaseFragment;
import utility.quickest.phonebooster.view.co;
import utility.quickest.phonebooster.R;

public class AntivirusFinishActivity extends BaseActivity {
    protected void onResume() {
        AppStartTrace.setLauncherActivityOnResumeTime("utility.quickest.phonebooster.activity.AntivirusFinishActivity");
        super.onResume();
    }

    protected void onStart() {
        AppStartTrace.setLauncherActivityOnStartTime("utility.quickest.phonebooster.activity.AntivirusFinishActivity");
        super.onStart();
    }

    public static void m17260a(Fragment fragment, String str) {
        Intent intent = new Intent(MyApplicationLike.getApplication(), AntivirusFinishActivity.class);
        intent.putExtra("key_antivirus_tip_type", str);
        fragment.startActivity(intent);
    }

    protected BaseFragment mo3067a(Intent intent) {
        return AntivirusFinishFragment.m17714a(intent);
    }

    protected void onCreate(Bundle bundle) {
        AppStartTrace.setLauncherActivityOnCreateTime("utility.quickest.phonebooster.activity.AntivirusFinishActivity");
        super.onCreate(bundle);
        co.m19372a(this, getResources().getColor(R.color.antivirus_color));
    }
}
