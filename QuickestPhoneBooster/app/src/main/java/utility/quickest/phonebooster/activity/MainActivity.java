package utility.quickest.phonebooster.activity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.CustomEvent;
import com.google.firebase.perf.metrics.AppStartTrace;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.app.C2428p;
import utility.quickest.phonebooster.fragment.MainFragment;
import utility.quickest.phonebooster.fragment. BaseFragment;
import utility.quickest.phonebooster.model_helper.AlwaysNotiHelper;
import utility.quickest.phonebooster.model_helper.C2492b;
import utility.quickest.phonebooster.model_helper.db;
import utility.quickest.phonebooster.model_helper.et;
import utility.quickest.phonebooster.model_helper.ft;
import utility.quickest.phonebooster.model_helper.hh;
import utility.quickest.phonebooster.model_helper.ig;
import utility.quickest.phonebooster.util.AppUtil;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.view.AddQuickCleanDialogFromMainPage;
import utility.quickest.phonebooster.view.OpenLockScreenDialogFromMainPage;
import utility.quickest.phonebooster.view.RateDialog;
import utility.quickest.phonebooster.view.ShareDialog;
import utility.quickest.phonebooster.view.UpdateDialog;

public class MainActivity extends BaseActivity {
    private RateDialog f12827a;
    private UpdateDialog f12828b;
    private ShareDialog f12829c;
    private OpenLockScreenDialogFromMainPage f12830d;
    private AddQuickCleanDialogFromMainPage f12831e;
    private long f12832f = Long.MAX_VALUE;
    private C2428p f12833g;
    private boolean f12834h = true;
    private boolean f12835i = true;

    protected void onResume() {
        AppStartTrace.setLauncherActivityOnResumeTime("utility.quickest.phonebooster.activity.MainActivity");
        super.onResume();
    }

    public static PendingIntent m17285a(long j, int i) {
        Intent intent = new Intent(MyApplicationLike.getApplication(), MainActivity.class);
        intent.setFlags(67108864);
        intent.setData(Uri.parse(String.valueOf(j)));
        intent.putExtra("notification_junk_with_size", i);
        return PendingIntent.getActivity(MyApplicationLike.getApplication(), 0, intent, 134217728);
    }

    public static PendingIntent m17289b(long j, int i) {
        Intent intent = new Intent(MyApplicationLike.getApplication(), MainActivity.class);
        intent.setFlags(67108864);
        intent.setData(Uri.parse(String.valueOf(j)));
        intent.putExtra("notification_junk_without_size", i);
        return PendingIntent.getActivity(MyApplicationLike.getApplication(), 0, intent, 134217728);
    }

    public static PendingIntent m17290c(long j, int i) {
        Intent intent = new Intent(MyApplicationLike.getApplication(), MainActivity.class);
        intent.setFlags(67108864);
        intent.setData(Uri.parse(String.valueOf(j)));
        intent.putExtra("notification_ram_without_size", i);
        return PendingIntent.getActivity(MyApplicationLike.getApplication(), 0, intent, 134217728);
    }

    public static PendingIntent m17292d(long j, int i) {
        Intent intent = new Intent(MyApplicationLike.getApplication(), MainActivity.class);
        intent.setFlags(67108864);
        intent.setData(Uri.parse(String.valueOf(j)));
        intent.putExtra("notification_ram_with_size", i);
        return PendingIntent.getActivity(MyApplicationLike.getApplication(), 0, intent, 134217728);
    }

    public static PendingIntent m17293e(long j, int i) {
        Intent intent = new Intent(MyApplicationLike.getApplication(), MainActivity.class);
        intent.setFlags(67108864);
        intent.setData(Uri.parse(String.valueOf(j)));
        intent.putExtra("notification_fake_low_power", i);
        return PendingIntent.getActivity(MyApplicationLike.getApplication(), 0, intent, 134217728);
    }

    public static PendingIntent m17294f(long j, int i) {
        Intent intent = new Intent(MyApplicationLike.getApplication(), MainActivity.class);
        intent.setFlags(67108864);
        intent.setData(Uri.parse(String.valueOf(j)));
        intent.putExtra("notification_fake_low_power", i);
        return PendingIntent.getActivity(MyApplicationLike.getApplication(), 0, intent, 134217728);
    }

    public static PendingIntent m17295g(long j, int i) {
        Intent intent = new Intent(MyApplicationLike.getApplication(), MainActivity.class);
        intent.setFlags(67108864);
        intent.setData(Uri.parse(String.valueOf(j)));
        intent.putExtra("notification_fake_low_power", i);
        return PendingIntent.getActivity(MyApplicationLike.getApplication(), 0, intent, 134217728);
    }

    public static PendingIntent m17296h(long j, int i) {
        Intent intent = new Intent(MyApplicationLike.getApplication(), MainActivity.class);
        intent.setFlags(67108864);
        intent.setData(Uri.parse(String.valueOf(j)));
        intent.putExtra("notification_antivirus", i);
        return PendingIntent.getActivity(MyApplicationLike.getApplication(), 0, intent, 134217728);
    }

    public static PendingIntent m17297i(long j, int i) {
        Intent intent = new Intent(MyApplicationLike.getApplication(), MainActivity.class);
        intent.setFlags(67108864);
        intent.setData(Uri.parse(String.valueOf(j)));
        intent.putExtra("notification_temperature", i);
        return PendingIntent.getActivity(MyApplicationLike.getApplication(), 0, intent, 134217728);
    }

    public static PendingIntent m17284a(long j) {
        Intent intent = new Intent(MyApplicationLike.getApplication(), MainActivity.class);
        intent.setFlags(67108864);
        intent.setData(Uri.parse(String.valueOf(j)));
        intent.putExtra("notification_temperature_always", "notification_temperature_always");
        return PendingIntent.getActivity(MyApplicationLike.getApplication(), 0, intent, 134217728);
    }

    public static PendingIntent m17288b(long j) {
        Intent intent = new Intent(MyApplicationLike.getApplication(), MainActivity.class);
        intent.setFlags(67108864);
        intent.setData(Uri.parse(String.valueOf(j)));
        intent.putExtra("notification_junk_always", "notification_junk_always");
        return PendingIntent.getActivity(MyApplicationLike.getApplication(), 0, intent, 134217728);
    }

    public static PendingIntent m17291d() {
        Intent intent = new Intent(MyApplicationLike.getApplication(), MainActivity.class);
        intent.setFlags(67108864);
        return PendingIntent.getActivity(MyApplicationLike.getApplication(), 0, intent, 134217728);
    }

    public static void m17286a(Fragment fragment) {
        fragment.startActivity(new Intent(MyApplicationLike.getApplication(), MainActivity.class));
    }

    public static void m17287a(String str) {
        Context a = MyApplicationLike.getApplication();
        Intent intent = new Intent(MyApplicationLike.getApplication(), MainActivity.class);
        intent.setFlags(335544320);
        intent.putExtra(str, str);
        a.startActivity(intent);
    }

    protected BaseFragment mo3067a(Intent intent) {
        return MainFragment.m17820a();
    }

    protected void onCreate(Bundle bundle) {
        AppStartTrace.setLauncherActivityOnCreateTime("utility.quickest.phonebooster.activity.MainActivity");
        super.onCreate(bundle);
        this.f12833g = MyApplicationLike.m17418b().m17435f();
        if (this.f12833g == null) {
            hh.m18627a((Activity) this);
            onNewIntent(getIntent());
        }
    }

    protected void onStart() {
        AppStartTrace.setLauncherActivityOnStartTime("utility.quickest.phonebooster.activity.MainActivity");
        super.onStart();
        if (this.f12833g != null) {
            switch (C2387f.f12843a[this.f12833g.ordinal()]) {
                case 1:
                    MemoryJunkCleanActivity.m17299a((Activity) this);
                    break;
                case 2:
                case 3:
                    StorageJunkCleanActivity.m17317a((Activity) this);
                    break;
                case 4:
                    AntivirusActivity.m17257a((Activity) this);
                    break;
                case 5:
                    PowerSavingActivity.m17310a((Activity) this);
                    break;
                case 6:
                    CPUCoolingActivity.m17262a((Activity) this);
                    break;
            }
            this.f12833g = null;
            return;
        }
        if (this.f12834h) {
            hh.m18627a((Activity) this);
            this.f12834h = false;
        }
        if (this.f12835i) {
            this.f12835i = false;
            if (hh.m18635b()) {
                ThreadUtil.m19098a(new C2385d(this), 1000);
            } else if (AlwaysNotiHelper.m18172a()) {
                ThreadUtil.m19098a(new C2386e(this), 1000);
            } else if (hh.m18639d()) {
                if (this.f12830d == null) {
                    this.f12830d = new OpenLockScreenDialogFromMainPage(this);
                }
                if (!this.f12830d.isShowing()) {
                    this.f12830d.m19228a();
                }
            } else if (hh.m18638c()) {
                if (AppUtil.m19016a(true, false)) {
                    if (this.f12831e == null) {
                        this.f12831e = new AddQuickCleanDialogFromMainPage(this);
                    }
                    if (!this.f12831e.isShowing()) {
                        this.f12831e.m19119a();
                    }
                } else {
                    ig.m18707a().m18718e();
                }
            } else if (hh.m18642g()) {
                if (this.f12827a == null) {
                    this.f12827a = new RateDialog(this);
                }
                if (!this.f12827a.isShowing()) {
                    this.f12827a.m19229a();
                }
            } else if (et.m18483a().m18515c() != null) {
                if (this.f12828b == null) {
                    this.f12828b = new UpdateDialog(this);
                }
                if (!this.f12828b.isShowing()) {
                    this.f12828b.m19261a();
                }
            }
        }
        Long q = hh.m18652q();
        if (q != null) {
            if (this.f12829c == null) {
                this.f12829c = new ShareDialog(this, q.longValue());
            }
            if (!this.f12829c.isShowing()) {
                this.f12829c.m19234a();
            }
        }
    }

    protected void onNewIntent(Intent intent) {
        if (intent.hasExtra("notification_junk_with_size") || intent.hasExtra("notification_junk_without_size") || intent.hasExtra("notification_ram_without_size") || intent.hasExtra("notification_ram_with_size") || intent.hasExtra("notification_fake_low_power") || intent.hasExtra("notification_fake_low_power") || intent.hasExtra("notification_fake_low_power") || intent.hasExtra("notification_antivirus") || intent.hasExtra("notification_temperature")) {
            MyApplicationLike.m17418b().m17429a("FromPush");
        }
        if (intent.hasExtra("uninstall_dialog_junk_clean")) {
            StorageJunkCleanActivity.m17317a((Activity) this);
        } else if (intent.hasExtra("locked_screen_junk_clean")) {
            StorageJunkCleanActivity.m17317a((Activity) this);
        } else if (intent.hasExtra("locked_screen_phone_boost")) {
            MemoryJunkCleanActivity.m17299a((Activity) this);
        } else if (intent.hasExtra("locked_screen_cpu_cooling")) {
            CPUCoolingActivity.m17262a((Activity) this);
        } else if (intent.hasExtra("locked_screen_power_saving")) {
            PowerSavingActivity.m17310a((Activity) this);
        } else if (intent.hasExtra("locked_screen_antivirus")) {
            AntivirusActivity.m17257a((Activity) this);
        } else if (intent.hasExtra("notification_junk_with_size")) {
            r0 = ft.m18549a(intent.getIntExtra("notification_junk_with_size", 0));
            if (r0 != null) {
                r0.m18552c();
            }
            StorageJunkCleanActivity.m17317a((Activity) this);
        } else if (intent.hasExtra("notification_junk_without_size")) {
            r0 = ft.m18549a(intent.getIntExtra("notification_junk_without_size", 0));
            if (r0 != null) {
                r0.m18552c();
            }
            StorageJunkCleanActivity.m17317a((Activity) this);
        } else if (intent.hasExtra("notification_ram_without_size")) {
            r0 = ft.m18549a(intent.getIntExtra("notification_ram_without_size", 0));
            if (r0 != null) {
                r0.m18552c();
            }
            MemoryJunkCleanActivity.m17299a((Activity) this);
        } else if (intent.hasExtra("notification_ram_with_size")) {
            r0 = ft.m18549a(intent.getIntExtra("notification_ram_with_size", 0));
            if (r0 != null) {
                r0.m18552c();
            }
            MemoryJunkCleanActivity.m17299a((Activity) this);
            C2492b.m18285a().m18328b(db.ONE_KEY_BOOST);
        } else if (intent.hasExtra("notification_fake_low_power")) {
            r0 = ft.m18549a(intent.getIntExtra("notification_fake_low_power", 0));
            if (r0 != null) {
                r0.m18552c();
            }
            PowerSavingActivity.m17310a((Activity) this);
        } else if (intent.hasExtra("notification_fake_low_power")) {
            r0 = ft.m18549a(intent.getIntExtra("notification_fake_low_power", 0));
            if (r0 != null) {
                r0.m18552c();
            }
            PowerSavingActivity.m17310a((Activity) this);
        } else if (intent.hasExtra("notification_fake_low_power")) {
            r0 = ft.m18549a(intent.getIntExtra("notification_fake_low_power", 0));
            if (r0 != null) {
                r0.m18552c();
            }
            PowerSavingActivity.m17310a((Activity) this);
        } else if (intent.hasExtra("notification_antivirus")) {
            r0 = ft.m18549a(intent.getIntExtra("notification_antivirus", 0));
            if (r0 != null) {
                r0.m18552c();
            }
            AntivirusActivity.m17257a((Activity) this);
        } else if (intent.hasExtra("notification_temperature")) {
            r0 = ft.m18549a(intent.getIntExtra("notification_temperature", 0));
            if (r0 != null) {
                r0.m18552c();
            }
            CPUCoolingActivity.m17262a((Activity) this);
        } else if (intent.hasExtra("notification_temperature_always")) {
            C2542m.m19082a("noti_toolbar", "cpu", null);
            CPUCoolingActivity.m17262a((Activity) this);
        } else if (intent.hasExtra("notification_junk_always")) {
            C2542m.m19082a("noti_toolbar", "junk", null);
            StorageJunkCleanActivity.m17317a((Activity) this);
        } else if (intent.hasExtra("notification_junk_always1")) {
            StorageJunkCleanActivity.m17317a((Activity) this);
        } else if (intent.hasExtra("desktop_quick_clean") && "desktop_quick_clean".equals(intent.getStringExtra("desktop_quick_clean"))) {
            try {
                Answers.getInstance().logCustom(new CustomEvent("desktop_quick_clean"));
            } catch (Throwable th) {
            }
            MemoryJunkCleanActivity.m17299a((Activity) this);
            C2492b.m18285a().m18328b(db.ONE_KEY_CLEAN);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.f12832f = SystemClock.elapsedRealtime();
            return;
        }
        if (!hh.m18646k() && SystemClock.elapsedRealtime() - this.f12832f >= 2000) {
            hh.m18647l();
        }
        this.f12832f = Long.MAX_VALUE;
    }
}
