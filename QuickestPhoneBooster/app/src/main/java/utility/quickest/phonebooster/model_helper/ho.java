package utility.quickest.phonebooster.model_helper;

/* compiled from: MiscHelper */
public enum ho {
    Junk(true),
    Memory(true),
    Cpu(true),
    Power(true),
    AntiVirus(true),
    LockedScreen(false),
    OneKey(false),
    AlwaysNoti(false);
    
    private final boolean mIsBase;

    private ho(boolean z) {
        this.mIsBase = z;
    }
}
