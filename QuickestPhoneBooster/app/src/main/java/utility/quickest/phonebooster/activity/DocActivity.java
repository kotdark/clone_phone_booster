package utility.quickest.phonebooster.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.firebase.perf.metrics.AppStartTrace;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.fragment.DocFragment;
import utility.quickest.phonebooster.fragment. BaseFragment;

public class DocActivity extends BaseActivity {
    protected void onCreate(Bundle bundle) {
        AppStartTrace.setLauncherActivityOnCreateTime("utility.quickest.phonebooster.activity.DocActivity");
        super.onCreate(bundle);
    }

    protected void onResume() {
        AppStartTrace.setLauncherActivityOnResumeTime("utility.quickest.phonebooster.activity.DocActivity");
        super.onResume();
    }

    protected void onStart() {
        AppStartTrace.setLauncherActivityOnStartTime("utility.quickest.phonebooster.activity.DocActivity");
        super.onStart();
    }

    public static void m17268a(Fragment fragment, String str, String str2) {
        Intent intent = new Intent(MyApplicationLike.getApplication(), DocActivity.class);
        intent.putExtra("key_title", str);
        intent.putExtra("key_content", str2);
        fragment.startActivity(intent);
    }

    protected BaseFragment mo3067a(Intent intent) {
        return DocFragment.m17778a(intent);
    }
}
