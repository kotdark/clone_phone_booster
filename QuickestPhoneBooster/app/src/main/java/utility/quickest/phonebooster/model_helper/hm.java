package utility.quickest.phonebooster.model_helper;

/* compiled from: MiscHelper */
public enum hm {
    JUNK(120000),
    MEMORY(120000),
    CPU(120000),
    SAVE_POWER(120000);
    
    private final long mLongEnoughIntervalAfterLastAction;

    private hm(long j) {
        if (j < 0) {
            j = 0;
        }
        this.mLongEnoughIntervalAfterLastAction = j;
    }

    private long m18662a() {
        return this.mLongEnoughIntervalAfterLastAction;
    }
}
