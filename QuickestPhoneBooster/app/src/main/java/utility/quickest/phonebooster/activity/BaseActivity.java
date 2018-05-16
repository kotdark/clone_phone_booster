package utility.quickest.phonebooster.activity;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.crashlytics.android.Crashlytics;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.fragment.AboutFragment;
import utility.quickest.phonebooster.fragment.AddWhiteListFragment;
import utility.quickest.phonebooster.fragment.AntivirusFinishFragment;
import utility.quickest.phonebooster.fragment.AntivirusFragment;
import utility.quickest.phonebooster.fragment.BaseFragment;
import utility.quickest.phonebooster.fragment.CPUCoolingFinishFragment;
import utility.quickest.phonebooster.fragment.CPUCoolingFragment;
import utility.quickest.phonebooster.fragment.DocFragment;
import utility.quickest.phonebooster.fragment.FeedBackFragment;
import utility.quickest.phonebooster.fragment.JunkCleanFinishFragment;
import utility.quickest.phonebooster.fragment.LauncherFragmentNew;
import utility.quickest.phonebooster.fragment.MainFragment;
import utility.quickest.phonebooster.fragment.MemoryJunkCleanFragment;
import utility.quickest.phonebooster.fragment.PowerSavingFinishFragment;
import utility.quickest.phonebooster.fragment.PowerSavingFragment;
import utility.quickest.phonebooster.fragment.SettingFragment;
import utility.quickest.phonebooster.fragment.StorageJunkCleanFragment;
import utility.quickest.phonebooster.fragment.WhiteListFragment;
import utility.quickest.phonebooster.fragment. BaseFragment;
import utility.quickest.phonebooster.model_helper.et;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.view.UpdateDialog;
import utility.quickest.phonebooster.view.co;
import utility.quickest.phonebooster.R;

/* compiled from: BaseActivity */
public abstract class BaseActivity extends FragmentActivity {
    private boolean f12819a = false;
    private UpdateDialog f12820b;

    protected BaseFragment mo3067a(Intent intent) {
        return null;
    }

    protected void m17250a() {
    }

    protected void m17251b() {
    }

    public boolean m17252c() {
        if (VERSION.SDK_INT >= 17) {
            return isDestroyed();
        }
        return this.f12819a;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_base);
        co.m19372a(this, getResources().getColor(R.color.blue1));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentById(R.id.fragment_container_for_activity) == null) {
            Intent intent = getIntent();
            Fragment a = mo3067a((Intent) intent.clone());
            if (a != null) {
                Bundle bundle2;
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    bundle2 = new Bundle(extras);
                } else {
                    bundle2 = new Bundle();
                }
                extras = a.getArguments();
                if (extras != null) {
                    bundle2.putAll(extras);
                }
                a.setArguments(bundle2);
                supportFragmentManager.beginTransaction().add((int) R.id.fragment_container_for_activity, a).commitAllowingStateLoss();
            }
        }
    }

    protected void onDestroy() {
        this.f12819a = true;
        try {
            super.onDestroy();
        } catch (Throwable th) {
            Crashlytics.logException(th);
        }
    }

    public void onBackPressed() {
        boolean z = false;
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.fragment_container_for_activity);
        if (findFragmentById != null && (findFragmentById instanceof BaseFragment)) {
            z = ((BaseFragment) findFragmentById).mo3085b();
        }
        if (!z) {
            try {
                if (findFragmentById instanceof LauncherFragmentNew) {
                    C2542m.m19082a("launcher_fragment", "key_back", null);
                } else if (findFragmentById instanceof MainFragment) {
                    C2542m.m19082a("main_fragment", "key_back", null);
                } else if (findFragmentById instanceof StorageJunkCleanFragment) {
                    C2542m.m19082a("junk_clean_fragment", "key_back", null);
                } else if (findFragmentById instanceof MemoryJunkCleanFragment) {
                    C2542m.m19082a("phone_boost_framgent", "key_back", null);
                } else if (findFragmentById instanceof JunkCleanFinishFragment) {
                    C2542m.m19082a("junk_clean_finish_fragment", "key_back", null);
                } else if (findFragmentById instanceof CPUCoolingFragment) {
                    C2542m.m19082a("cpu_cooling_fragment", "key_back", null);
                } else if (findFragmentById instanceof CPUCoolingFinishFragment) {
                    C2542m.m19082a("cpu_cooling_finish_fragment", "key_back", null);
                } else if (findFragmentById instanceof PowerSavingFragment) {
                    C2542m.m19082a("power_saving_frament", "key_back", null);
                } else if (findFragmentById instanceof PowerSavingFinishFragment) {
                    C2542m.m19082a("power_saving_finish_fragment", "key_back", null);
                } else if (findFragmentById instanceof AntivirusFragment) {
                    C2542m.m19082a("antivirus_fragment", "key_back", null);
                } else if (findFragmentById instanceof AntivirusFinishFragment) {
                    C2542m.m19082a("antivirus_finish_fragment", "key_back", null);
                } else if (findFragmentById instanceof SettingFragment) {
                    C2542m.m19082a("setting_fragment", "key_back", null);
                } else if (findFragmentById instanceof WhiteListFragment) {
                    C2542m.m19082a("white_list_fragment", "key_back", null);
                } else if (findFragmentById instanceof AddWhiteListFragment) {
                    C2542m.m19082a("add_white_list_fragment", "key_back", null);
                } else if (findFragmentById instanceof DocFragment) {
                    C2542m.m19082a("doc_fragment", "key_back", null);
                } else if (findFragmentById instanceof AboutFragment) {
                    C2542m.m19082a("about_fragment", "key_back", null);
                } else if (findFragmentById instanceof FeedBackFragment) {
                    C2542m.m19082a("feed_back_fragment", "key_back", null);
                }
            } catch (Throwable th) {
            }
            try {
                super.onBackPressed();
            } catch (IllegalStateException e) {
            }
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.fragment_container_for_activity);
        if (findFragmentById != null && (findFragmentById instanceof BaseFragment)) {
            ((BaseFragment) findFragmentById).mo3084a(z);
        }
    }

    protected void onStart() {
        super.onStart();
        if (MyApplicationLike.m17418b().m17436g()) {
            ThreadUtil.m19099a(true, new C2383b(this));
        }
        if (et.m18483a().m18515c() != null && !getClass().equals(LockedScreenActivity.class) && !getClass().equals(EnableSmartFeatureActivity.class) && !getClass().equals(LauncherActivity.class) && !getClass().equals(MainActivity.class) && !getClass().equals(PopupAdActivity.class) && !getClass().equals(PopupAfterActivity.class) && !getClass().equals(PopupAppDeletedActivity.class) && !getClass().equals(PopupMemoryJunkCleanActivity.class) && !getClass().equals(FakePopupLsActivity.class)) {
            if (this.f12820b == null) {
                this.f12820b = new UpdateDialog(this);
            }
            if (!this.f12820b.isShowing()) {
                this.f12820b.m19261a();
            }
        }
    }

    protected void onStop() {
        super.onStop();
        if (MyApplicationLike.m17418b().m17437h()) {
            ThreadUtil.m19099a(true, new C2384c(this));
        }
    }
}
