package utility.quickest.phonebooster.model_helper;

/* compiled from: RuntimeRemoteConfigModel */
public enum ie {
    HighMemColorGap(true, "high_mem_color_gap", 101, 0, 101);
    
    private final long mDefaultValue;
    private final boolean mIsEnabled;
    private final String mKey;
    private final long mMaxValue;
    private final long mMinValue;

    private ie(boolean z, String str, long j, long j2, long j3) {
        this.mIsEnabled = z;
        this.mKey = str == null ? "" : str.trim();
        this.mDefaultValue = j;
        this.mMinValue = j2;
        this.mMaxValue = j3;
    }
}
