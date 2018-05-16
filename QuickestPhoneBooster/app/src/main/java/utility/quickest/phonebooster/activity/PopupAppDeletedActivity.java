package utility.quickest.phonebooster.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.google.firebase.perf.metrics.AppStartTrace;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.fragment.PopupAppDeletedFragment;
import utility.quickest.phonebooster.fragment. BaseFragment;
import utility.quickest.phonebooster.util.ThreadUtil;

public class PopupAppDeletedActivity extends BaseActivity {
    protected void onResume() {
        AppStartTrace.setLauncherActivityOnResumeTime("utility.quickest.phonebooster.activity.PopupAppDeletedActivity");
        super.onResume();
    }

    protected void onStart() {
        AppStartTrace.setLauncherActivityOnStartTime("utility.quickest.phonebooster.activity.PopupAppDeletedActivity");
        super.onStart();
    }

    public static void m17306a(String str) {
        ThreadUtil.m19102b();
        Context a = MyApplicationLike.getApplication();
        Intent intent = new Intent(a, PopupAppDeletedActivity.class);
        intent.setFlags(335544320);
        intent.putExtra("key_app_name", str);
        a.startActivity(intent);
    }

    public void onCreate(Bundle bundle) {
        AppStartTrace.setLauncherActivityOnCreateTime("utility.quickest.phonebooster.activity.PopupAppDeletedActivity");
        getWindow().setFormat(1);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().getDecorView().setBackgroundColor(0);
        super.onCreate(bundle);
    }

    protected BaseFragment mo3067a(Intent intent) {
        return PopupAppDeletedFragment.m17849a(intent);
    }
}
