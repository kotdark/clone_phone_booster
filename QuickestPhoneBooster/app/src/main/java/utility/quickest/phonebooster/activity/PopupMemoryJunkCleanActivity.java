package utility.quickest.phonebooster.activity;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.google.firebase.perf.metrics.AppStartTrace;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.fragment.PopupMemoryJunkCleanFragment;
import utility.quickest.phonebooster.fragment. BaseFragment;
import utility.quickest.phonebooster.util.C2542m;

public class PopupMemoryJunkCleanActivity extends BaseActivity {
    protected void onResume() {
        AppStartTrace.setLauncherActivityOnResumeTime("utility.quickest.phonebooster.activity.PopupMemoryJunkCleanActivity");
        super.onResume();
    }

    protected void onStart() {
        AppStartTrace.setLauncherActivityOnStartTime("utility.quickest.phonebooster.activity.PopupMemoryJunkCleanActivity");
        super.onStart();
    }

    public static PendingIntent m17308d() {
        Intent intent = new Intent(MyApplicationLike.getApplication(), PopupMemoryJunkCleanActivity.class);
        intent.setFlags(67108864);
        return PendingIntent.getActivity(MyApplicationLike.getApplication(), 0, intent, 134217728);
    }

    protected BaseFragment mo3067a(Intent intent) {
        return PopupMemoryJunkCleanFragment.m17854a();
    }

    public void onCreate(Bundle bundle) {
        AppStartTrace.setLauncherActivityOnCreateTime("utility.quickest.phonebooster.activity.PopupMemoryJunkCleanActivity");
        getWindow().setFormat(1);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().getDecorView().setBackgroundColor(0);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        C2542m.m19082a("noti_toolbar", "boost", null);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }
}
