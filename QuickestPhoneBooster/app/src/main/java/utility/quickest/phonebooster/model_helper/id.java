package utility.quickest.phonebooster.model_helper;

/* compiled from: RuntimeRemoteConfigModel */
public enum id {
    JunkScanQuick(true, "junk_scan_quick", false),
    NewMainAd(false, "new_main_ad", false),
    IncludeSysApp(true, "include_sys_app", false),
    NewCpuNoti(true, "new_cpu_noti", false),
    AlwaysNoti(true, "always_noti", false);
    
    private final boolean mDefaultValue;
    private final boolean mIsEnabled;
    private final String mKey;

    private id(boolean z, String str, boolean z2) {
        this.mIsEnabled = z;
        this.mKey = str == null ? "" : str.trim();
        this.mDefaultValue = z2;
    }
}
