package utility.quickest.phonebooster.p112b;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.util.AppUtil;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.concurrent.Future;

/* compiled from: SharedPrefHelper */
public final class  SharedPrefHelper {
    private static volatile  SharedPrefHelper f13006d = null;
    private Long f13007A = null;
    private Long f13008B = null;
    private Boolean f13009C = null;
    private Long f13010D = null;
    private Integer f13011E;
    private String f13012F = null;
    private String f13013G = null;
    private Boolean f13014H = null;
    private Boolean f13015I = null;
    private Long f13016J = null;
    private String f13017K = null;
    private Boolean f13018L = null;
    private Integer f13019M = null;
    private Long f13020N = null;
    private Long f13021O = null;
    private Long f13022P = null;
    private Long f13023Q = null;
    private Long f13024R = null;
    private String f13025S = null;
    private String f13026T = null;
    private Boolean f13027U = null;
    private String f13028V = null;
    private String f13029W = null;
    private Integer f13030X = null;
    private Boolean f13031Y = null;
    private Long f13032Z = null;
    private final SharedPreferences f13033a = MyApplicationLike.getApplication().getSharedPreferences("global_data", 0);
    private Long aa = null;
    private Integer ab = null;
    private Long ac = null;
    private Long ad = null;
    private Long ae = null;
    private Boolean af = null;
    private Boolean ag = null;
    private Long ah = null;
    private Long ai = null;
    private final Editor f13034b = this.f13033a.edit();
    private Future<?> f13035c = null;
    private String f13036e = null;
    private Integer f13037f;
    private Integer f13038g;
    private Integer f13039h;
    private Long f13040i = null;
    private String f13041j = null;
    private String f13042k = null;
    private Long f13043l = null;
    private Boolean f13044m = null;
    private Boolean f13045n = null;
    private Boolean f13046o = null;
    private Long f13047p = null;
    private String f13048q = null;
    private Boolean f13049r = null;
    private Boolean f13050s = null;
    private Long f13051t = null;
    private String f13052u = null;
    private Long f13053v = null;
    private Boolean f13054w = null;
    private Long f13055x = null;
    private Long f13056y = null;
    private Long f13057z = null;

    public static  SharedPrefHelper m17454a() {
        if (f13006d == null) {
            synchronized ( SharedPrefHelper.class) {
                if (f13006d == null) {
                    f13006d = new  SharedPrefHelper();
                }
            }
        }
        return f13006d;
    }

    public synchronized String m17486b() {
        if (this.f13036e == null) {
            try {
                this.f13036e = this.f13033a.getString("key_account_info", null);
                if (this.f13036e == null) {
                    this.f13036e = "";
                }
            } catch (Exception e) {
                this.f13036e = "";
            }
        }
        return this.f13036e;
    }

    public synchronized void m17483a(String str) {
        this.f13036e = str == null ? "" : str.trim();
        this.f13034b.putString("key_account_info", this.f13036e);
        ac();
    }

    public synchronized int m17491c() {
        if (this.f13037f == null) {
            try {
                this.f13037f = Integer.valueOf(this.f13033a.getInt("key_current_app_version", 0));
            } catch (Exception e) {
                this.f13037f = Integer.valueOf(0);
            }
        }
        return this.f13037f.intValue();
    }

    public synchronized void m17481a(int i) {
        this.f13037f = Integer.valueOf(i);
        this.f13034b.putInt("key_current_app_version", this.f13037f.intValue());
        ac();
    }

    public synchronized int m17496d() {
        if (this.f13038g == null) {
            try {
                this.f13038g = Integer.valueOf(this.f13033a.getInt("key_from_app_version", 0));
            } catch (Exception e) {
                this.f13038g = Integer.valueOf(0);
            }
        }
        return this.f13038g.intValue();
    }

    public synchronized void m17487b(int i) {
        this.f13038g = Integer.valueOf(i);
        this.f13034b.putInt("key_from_app_version", this.f13038g.intValue());
        ac();
    }

    public synchronized int m17501e() {
        if (this.f13039h == null) {
            try {
                this.f13039h = Integer.valueOf(this.f13033a.getInt("key_init_app_version", 0));
            } catch (Exception e) {
                this.f13039h = Integer.valueOf(0);
            }
        }
        return this.f13039h.intValue();
    }

    public synchronized void m17492c(int i) {
        this.f13039h = Integer.valueOf(i);
        this.f13034b.putInt("key_init_app_version", this.f13039h.intValue());
        ac();
    }

    public synchronized long m17506f() {
        if (this.f13040i == null) {
            try {
                this.f13040i = Long.valueOf(this.f13033a.getLong("key_curr_ver_first_run_time", 0));
            } catch (Exception e) {
                this.f13040i = Long.valueOf(0);
            }
        }
        return this.f13040i.longValue();
    }

    public synchronized void m17482a(long j) {
        this.f13040i = Long.valueOf(j);
        this.f13034b.putLong("key_curr_ver_first_run_time", this.f13040i.longValue());
        ac();
    }

    public synchronized String m17511g() {
        if (this.f13041j == null) {
            try {
                this.f13041j = this.f13033a.getString("key_google_ad_id", null);
                if (this.f13041j == null) {
                    this.f13041j = "";
                }
            } catch (Exception e) {
                this.f13041j = "";
            }
        }
        return this.f13041j;
    }

    public synchronized String m17515h() {
        if (this.f13042k == null) {
            try {
                this.f13042k = this.f13033a.getString("key_google_ad_status", null);
                if (this.f13042k == null) {
                    this.f13042k = "";
                }
            } catch (Exception e) {
                this.f13042k = "";
            }
        }
        return this.f13042k;
    }

    public synchronized void m17484a(String str, String str2) {
        this.f13041j = str == null ? "" : str.trim();
        this.f13034b.putString("key_google_ad_id", this.f13041j);
        this.f13042k = str2 == null ? "" : str2.trim();
        this.f13034b.putString("key_google_ad_status", this.f13042k);
        ac();
    }

    public synchronized long m17519i() {
        if (this.f13043l == null) {
            try {
                this.f13043l = Long.valueOf(this.f13033a.getLong("key_last_upload_installed_app_time", 0));
            } catch (Exception e) {
                this.f13043l = Long.valueOf(0);
            }
        }
        return this.f13043l.longValue();
    }

    public synchronized void m17488b(long j) {
        this.f13043l = Long.valueOf(j);
        this.f13034b.putLong("key_last_upload_installed_app_time", this.f13043l.longValue());
        ac();
    }

    public synchronized boolean m17526j() {
        if (this.f13044m == null) {
            try {
                this.f13044m = Boolean.valueOf(this.f13033a.getBoolean("key_clean_notification_is_enabled", true));
            } catch (Exception e) {
                this.f13044m = Boolean.valueOf(true);
            }
        }
        return this.f13044m.booleanValue();
    }

    public synchronized void m17485a(boolean z) {
        this.f13044m = Boolean.valueOf(z);
        this.f13034b.putBoolean("key_clean_notification_is_enabled", this.f13044m.booleanValue());
        ac();
    }

    public synchronized boolean m17529k() {
        if (this.f13045n == null) {
            try {
                this.f13045n = Boolean.valueOf(this.f13033a.getBoolean("key_join_ue_plan_is_enabled", true));
            } catch (Exception e) {
                this.f13045n = Boolean.valueOf(true);
            }
        }
        return this.f13045n.booleanValue();
    }

    public synchronized void m17490b(boolean z) {
        this.f13045n = Boolean.valueOf(z);
        this.f13034b.putBoolean("key_join_ue_plan_is_enabled", this.f13045n.booleanValue());
        ac();
    }

    public synchronized boolean m17532l() {
        boolean z = true;
        synchronized (this) {
            if (AppUtil.m19016a(true, false)) {
                z = false;
            }
            if (this.f13046o == null) {
                try {
                    this.f13046o = Boolean.valueOf(this.f13033a.getBoolean("key_locked_screen_is_enabled", z));
                } catch (Exception e) {
                    this.f13046o = Boolean.valueOf(z);
                }
            }
            z = this.f13046o.booleanValue();
        }
        return z;
    }

    public synchronized void m17495c(boolean z) {
        this.f13046o = Boolean.valueOf(z);
        this.f13034b.putBoolean("key_locked_screen_is_enabled", this.f13046o.booleanValue());
        ac();
    }

    public synchronized long m17533m() {
        if (this.f13047p == null) {
            try {
                this.f13047p = Long.valueOf(this.f13033a.getLong("key_locked_screen_confirm_time", 0));
            } catch (Exception e) {
                this.f13047p = Long.valueOf(0);
            }
        }
        return this.f13047p.longValue();
    }

    public synchronized void m17493c(long j) {
        this.f13047p = Long.valueOf(j);
        this.f13034b.putLong("key_locked_screen_confirm_time", this.f13047p.longValue());
        ac();
    }

    public synchronized String m17535n() {
        if (this.f13048q == null) {
            try {
                this.f13048q = this.f13033a.getString("key_app_update_info", null);
                if (this.f13048q == null) {
                    this.f13048q = "";
                }
            } catch (Exception e) {
                this.f13048q = "";
            }
        }
        return this.f13048q;
    }

    public synchronized void m17489b(String str) {
        this.f13048q = str == null ? "" : str.trim();
        this.f13034b.putString("key_app_update_info", this.f13048q);
        ac();
    }

    public synchronized boolean m17538o() {
        if (this.f13049r == null) {
            try {
                this.f13049r = Boolean.valueOf(this.f13033a.getBoolean("key_splash_need_confirm", true));
            } catch (Exception e) {
                this.f13049r = Boolean.valueOf(true);
            }
        }
        return this.f13049r.booleanValue();
    }

    public synchronized void m17500d(boolean z) {
        this.f13049r = Boolean.valueOf(z);
        this.f13034b.putBoolean("key_splash_need_confirm", this.f13049r.booleanValue());
        ac();
    }

    public synchronized boolean m17540p() {
        if (this.f13050s == null) {
            try {
                this.f13050s = Boolean.valueOf(this.f13033a.getBoolean("key_is_need_one_key_clean_sc", true));
            } catch (Exception e) {
                this.f13050s = Boolean.valueOf(true);
            }
        }
        return this.f13050s.booleanValue();
    }

    public synchronized void m17505e(boolean z) {
        this.f13050s = Boolean.valueOf(z);
        this.f13034b.putBoolean("key_is_need_one_key_clean_sc", this.f13050s.booleanValue());
        ac();
    }

    public synchronized long m17541q() {
        if (this.f13051t == null) {
            try {
                this.f13051t = Long.valueOf(this.f13033a.getLong("key_one_key_clean_confirm_time", 0));
            } catch (Exception e) {
                this.f13051t = Long.valueOf(0);
            }
        }
        return this.f13051t.longValue();
    }

    public synchronized void m17498d(long j) {
        this.f13051t = Long.valueOf(j);
        this.f13034b.putLong("key_one_key_clean_confirm_time", this.f13051t.longValue());
        ac();
    }

    public synchronized String m17543r() {
        if (this.f13052u == null) {
            try {
                this.f13052u = this.f13033a.getString("key_fcm_token", null);
                if (this.f13052u == null) {
                    this.f13052u = "";
                }
            } catch (Exception e) {
                this.f13052u = "";
            }
        }
        return this.f13052u;
    }

    public synchronized void m17494c(String str) {
        this.f13052u = str == null ? "" : str.trim();
        this.f13034b.putString("key_fcm_token", this.f13052u);
        ac();
    }

    public synchronized long m17545s() {
        if (this.f13053v == null) {
            try {
                this.f13053v = Long.valueOf(this.f13033a.getLong("key_last_stat_locked_screen_enable_time", 0));
            } catch (Exception e) {
                this.f13053v = Long.valueOf(0);
            }
        }
        return this.f13053v.longValue();
    }

    public synchronized void m17503e(long j) {
        this.f13053v = Long.valueOf(j);
        this.f13034b.putLong("key_last_stat_locked_screen_enable_time", this.f13053v.longValue());
        ac();
    }

    public synchronized boolean m17548t() {
        if (this.f13054w == null) {
            try {
                this.f13054w = Boolean.valueOf(this.f13033a.getBoolean("key_need_total_ls_and_okc_hint", true));
            } catch (Exception e) {
                this.f13054w = Boolean.valueOf(true);
            }
        }
        return this.f13054w.booleanValue();
    }

    public synchronized void m17510f(boolean z) {
        this.f13054w = Boolean.valueOf(z);
        this.f13034b.putBoolean("key_need_total_ls_and_okc_hint", this.f13054w.booleanValue());
        ac();
    }

    public synchronized long m17549u() {
        if (this.f13055x == null) {
            try {
                this.f13055x = Long.valueOf(this.f13033a.getLong("key_clean_junk_noti_time", 0));
            } catch (Exception e) {
                this.f13055x = Long.valueOf(0);
            }
        }
        return this.f13055x.longValue();
    }

    public synchronized void m17508f(long j) {
        this.f13055x = Long.valueOf(j);
        this.f13034b.putLong("key_clean_junk_noti_time", this.f13055x.longValue());
        ac();
    }

    public synchronized long m17551v() {
        if (this.f13056y == null) {
            try {
                this.f13056y = Long.valueOf(this.f13033a.getLong("key_clean_process_noti_time", 0));
            } catch (Exception e) {
                this.f13056y = Long.valueOf(0);
            }
        }
        return this.f13056y.longValue();
    }

    public synchronized void m17512g(long j) {
        this.f13056y = Long.valueOf(j);
        this.f13034b.putLong("key_clean_process_noti_time", this.f13056y.longValue());
        ac();
    }

    public synchronized long m17553w() {
        if (this.f13057z == null) {
            try {
                this.f13057z = Long.valueOf(this.f13033a.getLong("key_clean_fake_low_power_noti_time", 0));
            } catch (Exception e) {
                this.f13057z = Long.valueOf(0);
            }
        }
        return this.f13057z.longValue();
    }

    public synchronized void m17516h(long j) {
        this.f13057z = Long.valueOf(j);
        this.f13034b.putLong("key_clean_fake_low_power_noti_time", this.f13057z.longValue());
        ac();
    }

    public synchronized long m17555x() {
        if (this.f13007A == null) {
            try {
                this.f13007A = Long.valueOf(this.f13033a.getLong("key_clean_temp_noti_time", 0));
            } catch (Exception e) {
                this.f13007A = Long.valueOf(0);
            }
        }
        return this.f13007A.longValue();
    }

    public synchronized void m17520i(long j) {
        this.f13007A = Long.valueOf(j);
        this.f13034b.putLong("key_clean_temp_noti_time", this.f13007A.longValue());
        ac();
    }

    public synchronized long m17557y() {
        if (this.f13008B == null) {
            try {
                this.f13008B = Long.valueOf(this.f13033a.getLong("key_clean_any_noti_time", 0));
            } catch (Exception e) {
                this.f13008B = Long.valueOf(0);
            }
        }
        return this.f13008B.longValue();
    }

    public synchronized void m17523j(long j) {
        this.f13008B = Long.valueOf(j);
        this.f13034b.putLong("key_clean_any_noti_time", this.f13008B.longValue());
        ac();
    }

    public synchronized boolean m17558z() {
        if (this.f13009C == null) {
            try {
                this.f13009C = Boolean.valueOf(this.f13033a.getBoolean("key_rate_is_done", false));
            } catch (Exception e) {
                this.f13009C = Boolean.valueOf(false);
            }
        }
        return this.f13009C.booleanValue();
    }

    public synchronized void m17514g(boolean z) {
        this.f13009C = Boolean.valueOf(z);
        this.f13034b.putBoolean("key_rate_is_done", this.f13009C.booleanValue());
        ac();
    }

    public synchronized long m17455A() {
        if (this.f13010D == null) {
            try {
                this.f13010D = Long.valueOf(this.f13033a.getLong("key_rate_time", 0));
            } catch (Exception e) {
                this.f13010D = Long.valueOf(0);
            }
        }
        return this.f13010D.longValue();
    }

    public synchronized void m17527k(long j) {
        this.f13010D = Long.valueOf(j);
        this.f13034b.putLong("key_rate_time", this.f13010D.longValue());
        ac();
    }

    public synchronized int m17456B() {
        if (this.f13011E == null) {
            try {
                this.f13011E = Integer.valueOf(this.f13033a.getInt("key_rate_count", 0));
            } catch (Exception e) {
                this.f13011E = Integer.valueOf(0);
            }
        }
        return this.f13011E.intValue();
    }

    public synchronized void m17497d(int i) {
        this.f13011E = Integer.valueOf(i);
        this.f13034b.putInt("key_rate_count", this.f13011E.intValue());
        ac();
    }

    public synchronized String m17457C() {
        if (this.f13012F == null) {
            try {
                this.f13012F = this.f13033a.getString("key_af_media_source", null);
                if (this.f13012F == null) {
                    this.f13012F = "";
                }
            } catch (Exception e) {
                this.f13012F = "";
            }
        }
        return this.f13012F;
    }

    public synchronized void m17499d(String str) {
        this.f13012F = str == null ? "" : str.trim();
        this.f13034b.putString("key_af_media_source", this.f13012F);
        ac();
    }

    public synchronized String m17458D() {
        if (this.f13013G == null) {
            try {
                this.f13013G = this.f13033a.getString("key_af_campaign", null);
                if (this.f13013G == null) {
                    this.f13013G = "";
                }
            } catch (Exception e) {
                this.f13013G = "";
            }
        }
        return this.f13013G;
    }

    public synchronized void m17504e(String str) {
        this.f13013G = str == null ? "" : str.trim();
        this.f13034b.putString("key_af_campaign", this.f13013G);
        ac();
    }

    public synchronized boolean m17459E() {
        if (this.f13015I == null) {
            try {
                this.f13015I = Boolean.valueOf(this.f13033a.getBoolean("key_has_show_low_power_noti", false));
            } catch (Exception e) {
                this.f13015I = Boolean.valueOf(false);
            }
        }
        return this.f13015I.booleanValue();
    }

    public synchronized void m17518h(boolean z) {
        this.f13015I = Boolean.valueOf(z);
        this.f13034b.putBoolean("key_has_show_low_power_noti", this.f13015I.booleanValue());
        ac();
    }

    public synchronized long m17460F() {
        if (this.f13016J == null) {
            try {
                this.f13016J = Long.valueOf(this.f13033a.getLong("key_next_alarm_time", 0));
            } catch (Exception e) {
                this.f13016J = Long.valueOf(0);
            }
        }
        return this.f13016J.longValue();
    }

    public synchronized void m17530l(long j) {
        this.f13016J = Long.valueOf(j);
        this.f13034b.putLong("key_next_alarm_time", this.f13016J.longValue());
        ac();
    }

    public synchronized String m17461G() {
        if (this.f13017K == null) {
            try {
                this.f13017K = this.f13033a.getString("key_remote_config_data_json", null);
                if (this.f13017K == null) {
                    this.f13017K = "";
                }
            } catch (Exception e) {
                this.f13017K = "";
            }
        }
        return this.f13017K;
    }

    public synchronized void m17509f(String str) {
        this.f13017K = str == null ? "" : str.trim();
        this.f13034b.putString("key_remote_config_data_json", this.f13017K);
        ac();
    }

    public synchronized boolean m17462H() {
        if (this.f13018L == null) {
            try {
                this.f13018L = Boolean.valueOf(this.f13033a.getBoolean("key_can_main_carousel_ad", false));
            } catch (Exception e) {
                this.f13018L = Boolean.valueOf(false);
            }
        }
        return this.f13018L.booleanValue();
    }

    public synchronized void m17522i(boolean z) {
        this.f13018L = Boolean.valueOf(z);
        this.f13034b.putBoolean("key_can_main_carousel_ad", this.f13018L.booleanValue());
        ac();
    }

    public synchronized int m17463I() {
        if (this.f13019M == null) {
            try {
                this.f13019M = Integer.valueOf(this.f13033a.getInt("key_temperature_unit", 0));
            } catch (Exception e) {
                this.f13019M = Integer.valueOf(0);
            }
        }
        return this.f13019M.intValue();
    }

    public synchronized void m17502e(int i) {
        this.f13019M = Integer.valueOf(i);
        this.f13034b.putInt("key_temperature_unit", this.f13019M.intValue());
        ac();
    }

    public synchronized void m17534m(long j) {
        this.f13020N = Long.valueOf(j);
        this.f13034b.putLong("key_cpu_cool_time", this.f13020N.longValue());
        ac();
    }

    public synchronized long m17464J() {
        if (this.f13021O == null) {
            try {
                this.f13021O = Long.valueOf(this.f13033a.getLong("key_antivirus_noti_time", 0));
            } catch (Exception e) {
                this.f13021O = Long.valueOf(0);
            }
        }
        return this.f13021O.longValue();
    }

    public synchronized void m17536n(long j) {
        this.f13021O = Long.valueOf(j);
        this.f13034b.putLong("key_antivirus_noti_time", this.f13021O.longValue());
        ac();
    }

    public synchronized void m17537o(long j) {
        this.f13022P = Long.valueOf(j);
        this.f13034b.putLong("key_antivirus_use_time", this.f13022P.longValue());
        ac();
    }

    public synchronized long m17465K() {
        long j = 0;
        synchronized (this) {
            if (this.f13023Q == null) {
                try {
                    this.f13023Q = Long.valueOf(this.f13033a.getLong("key_last_enter_fg_time", 0));
                } catch (Exception e) {
                    this.f13023Q = Long.valueOf(0);
                }
            }
            if (this.f13023Q.longValue() >= 0) {
                j = this.f13023Q.longValue();
            }
            this.f13023Q = Long.valueOf(j);
            j = this.f13023Q.longValue();
        }
        return j;
    }

    public synchronized void m17539p(long j) {
        if (j < 0) {
            j = 0;
        }
        this.f13023Q = Long.valueOf(j);
        this.f13034b.putLong("key_last_enter_fg_time", this.f13023Q.longValue());
        ac();
    }

    public synchronized long m17466L() {
        long j = 0;
        synchronized (this) {
            if (this.f13024R == null) {
                try {
                    this.f13024R = Long.valueOf(this.f13033a.getLong("key_last_enter_bg_time", 0));
                } catch (Exception e) {
                    this.f13024R = Long.valueOf(0);
                }
            }
            if (this.f13024R.longValue() >= 0) {
                j = this.f13024R.longValue();
            }
            this.f13024R = Long.valueOf(j);
            j = this.f13024R.longValue();
        }
        return j;
    }

    public synchronized void m17542q(long j) {
        if (j < 0) {
            j = 0;
        }
        this.f13024R = Long.valueOf(j);
        this.f13034b.putLong("key_last_enter_bg_time", this.f13024R.longValue());
        ac();
    }

    public synchronized String m17467M() {
        if (this.f13025S == null) {
            try {
                this.f13025S = this.f13033a.getString("key_session_id", null);
                if (this.f13025S == null) {
                    this.f13025S = "";
                }
            } catch (Exception e) {
                this.f13025S = "";
            }
        }
        return this.f13025S;
    }

    public synchronized void m17513g(String str) {
        this.f13025S = str == null ? "" : str.trim();
        this.f13034b.putString("key_session_id", this.f13025S);
        ac();
    }

    public synchronized String m17468N() {
        if (this.f13026T == null) {
            try {
                this.f13026T = this.f13033a.getString("key_session_from", null);
                if (this.f13026T == null) {
                    this.f13026T = "";
                }
            } catch (Exception e) {
                this.f13026T = "";
            }
        }
        return this.f13026T;
    }

    public synchronized void m17517h(String str) {
        this.f13026T = str == null ? "" : str.trim();
        this.f13034b.putString("key_session_from", this.f13026T);
        ac();
    }

    public synchronized boolean m17469O() {
        boolean z = true;
        synchronized (this) {
            if (this.f13027U != null) {
                z = this.f13027U.booleanValue();
            } else {
                try {
                    z = this.f13033a.getBoolean("key_need_stat_frc_fetch_duration", true);
                } catch (Throwable th) {
                }
                if (z) {
                    try {
                        this.f13034b.putBoolean("key_need_stat_frc_fetch_duration", false);
                        ac();
                    } catch (Throwable th2) {
                    }
                }
                this.f13027U = Boolean.valueOf(false);
            }
        }
        return z;
    }

    public synchronized String m17470P() {
        if (this.f13028V == null) {
            try {
                this.f13028V = this.f13033a.getString("key_function_hint_json", null);
                if (this.f13028V == null) {
                    this.f13028V = "";
                }
            } catch (Exception e) {
                this.f13028V = "";
            }
        }
        return this.f13028V;
    }

    public synchronized void m17521i(String str) {
        this.f13028V = str == null ? "" : str.trim();
        this.f13034b.putString("key_function_hint_json", this.f13028V);
        ac();
    }

    public synchronized String m17471Q() {
        if (this.f13029W == null) {
            try {
                this.f13029W = this.f13033a.getString("key_function_hint_count_json", null);
                if (this.f13029W == null) {
                    this.f13029W = "";
                }
            } catch (Exception e) {
                this.f13029W = "";
            }
        }
        return this.f13029W;
    }

    public synchronized void m17524j(String str) {
        this.f13029W = str == null ? "" : str.trim();
        this.f13034b.putString("key_function_hint_count_json", this.f13029W);
        ac();
    }

    public synchronized boolean m17472R() {
        if (this.f13031Y == null) {
            try {
                this.f13031Y = Boolean.valueOf(this.f13033a.getBoolean("key_test_mode_is_enabled", false));
            } catch (Exception e) {
                this.f13031Y = Boolean.valueOf(false);
            }
        }
        return this.f13031Y.booleanValue();
    }

    public synchronized void m17525j(boolean z) {
        this.f13031Y = Boolean.valueOf(z);
        this.f13034b.putBoolean("key_test_mode_is_enabled", this.f13031Y.booleanValue());
        ac();
    }

    public synchronized long m17473S() {
        if (this.f13032Z == null) {
            try {
                this.f13032Z = Long.valueOf(this.f13033a.getLong("key_main_page_junk_popup_time", 0));
            } catch (Exception e) {
                this.f13032Z = Long.valueOf(0);
            }
        }
        return this.f13032Z.longValue();
    }

    public synchronized void m17544r(long j) {
        this.f13032Z = Long.valueOf(j);
        this.f13034b.putLong("key_main_page_junk_popup_time", this.f13032Z.longValue());
        ac();
    }

    public synchronized long m17474T() {
        if (this.aa == null) {
            try {
                this.aa = Long.valueOf(this.f13033a.getLong("key_main_page_junk_popup_ok_time", 0));
            } catch (Exception e) {
                this.aa = Long.valueOf(0);
            }
        }
        return this.aa.longValue();
    }

    public synchronized void m17546s(long j) {
        this.aa = Long.valueOf(j);
        this.f13034b.putLong("key_main_page_junk_popup_ok_time", this.aa.longValue());
        ac();
    }

    public synchronized int m17475U() {
        if (this.ab == null) {
            try {
                this.ab = Integer.valueOf(this.f13033a.getInt("key_main_page_junk_popup_cancel_count", 0));
            } catch (Exception e) {
                this.ab = Integer.valueOf(0);
            }
        }
        return this.ab.intValue();
    }

    public synchronized void m17507f(int i) {
        this.ab = Integer.valueOf(i);
        this.f13034b.putInt("key_main_page_junk_popup_cancel_count", this.ab.intValue());
        ac();
    }

    public synchronized long m17476V() {
        if (this.ac == null) {
            try {
                this.ac = Long.valueOf(this.f13033a.getLong("key_net_update_time", 0));
            } catch (Exception e) {
                this.ac = Long.valueOf(0);
            }
        }
        return this.ac.longValue();
    }

    public synchronized void m17547t(long j) {
        this.ac = Long.valueOf(j);
        this.f13034b.putLong("key_net_update_time", this.ac.longValue());
        ac();
    }

    public synchronized long m17477W() {
        if (this.ad == null) {
            try {
                this.ad = Long.valueOf(this.f13033a.getLong("key_net_trashlist_time", 0));
            } catch (Exception e) {
                this.ad = Long.valueOf(0);
            }
        }
        return this.ad.longValue();
    }

    public synchronized void m17550u(long j) {
        this.ad = Long.valueOf(j);
        this.f13034b.putLong("key_net_trashlist_time", this.ad.longValue());
        ac();
    }

    public synchronized long m17478X() {
        if (this.ae == null) {
            try {
                this.ae = Long.valueOf(this.f13033a.getLong("key_net_virusbase_time", 0));
            } catch (Exception e) {
                this.ae = Long.valueOf(0);
            }
        }
        return this.ae.longValue();
    }

    public synchronized void m17552v(long j) {
        this.ae = Long.valueOf(j);
        this.f13034b.putLong("key_net_virusbase_time", this.ae.longValue());
        ac();
    }

    public synchronized boolean m17479Y() {
        if (this.af == null) {
            try {
                this.af = Boolean.valueOf(this.f13033a.getBoolean("key_always_noti_is_enabled", false));
            } catch (Exception e) {
                this.af = Boolean.valueOf(false);
            }
        }
        return this.af.booleanValue();
    }

    public synchronized void m17528k(boolean z) {
        this.af = Boolean.valueOf(z);
        this.f13034b.putBoolean("key_always_noti_is_enabled", this.af.booleanValue());
        ac();
    }

    public synchronized boolean m17480Z() {
        if (this.ag == null) {
            try {
                this.ag = Boolean.valueOf(this.f13033a.getBoolean("key_need_always_noti_hint", true));
            } catch (Exception e) {
                this.ag = Boolean.valueOf(true);
            }
        }
        return this.ag.booleanValue();
    }

    public synchronized void m17531l(boolean z) {
        this.ag = Boolean.valueOf(z);
        this.f13034b.putBoolean("key_need_always_noti_hint", this.ag.booleanValue());
        ac();
    }

    public synchronized long aa() {
        if (this.ah == null) {
            try {
                this.ah = Long.valueOf(this.f13033a.getLong("key_last_stat_always_noti_enable_time", 0));
            } catch (Exception e) {
                this.ah = Long.valueOf(0);
            }
        }
        return this.ah.longValue();
    }

    public synchronized void m17554w(long j) {
        this.ah = Long.valueOf(j);
        this.f13034b.putLong("key_last_stat_always_noti_enable_time", this.ah.longValue());
        ac();
    }

    public synchronized long ab() {
        if (this.ai == null) {
            try {
                this.ai = Long.valueOf(this.f13033a.getLong("key_last_stat_clean_noti_enable_time", 0));
            } catch (Exception e) {
                this.ai = Long.valueOf(0);
            }
        }
        return this.ai.longValue();
    }

    public synchronized void m17556x(long j) {
        this.ai = Long.valueOf(j);
        this.f13034b.putLong("key_last_stat_clean_noti_enable_time", this.ai.longValue());
        ac();
    }

    private  SharedPrefHelper() {
    }

    private synchronized void ac() {
        if (this.f13035c != null) {
            this.f13035c.cancel(false);
        }
        this.f13035c = ThreadUtil.m19096a(new C2431c(this));
    }
}
