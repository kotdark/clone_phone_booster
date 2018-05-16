package utility.quickest.phonebooster.model_helper;

/* compiled from: BatteryModel */
public enum fk {
    VERY_FAST(1000),
    SLOW(300000);
    
    private final long mTime;

    private fk(long j) {
        if (j < 0) {
            j = 0;
        }
        this.mTime = j;
    }

    private long m18524a() {
        return this.mTime;
    }
}
