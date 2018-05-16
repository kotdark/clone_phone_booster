package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: CleanNotificationModel */
public enum ft {
    JunkWithSize(1),
    JunkWithoutSize(2),
    ProcessWithSize(3),
    ProcessWithoutSize(4),
    FakeLowPower(5),
    LowPower(6),
    VeryLowPower(7),
    Antivirus(8),
    Temperature(9);
    
    private final int mId;

    private ft(int i) {
        this.mId = i;
    }

    public int m18550a() {
        return this.mId;
    }

    public void m18551b() {
        ThreadUtil.m19099a(false, new fu(this));
    }

    public void m18552c() {
        ThreadUtil.m19099a(false, new fv(this));
    }

    public static ft m18549a(int i) {
        switch (i) {
            case 1:
                return JunkWithSize;
            case 2:
                return JunkWithoutSize;
            case 3:
                return ProcessWithSize;
            case 4:
                return ProcessWithoutSize;
            case 5:
                return FakeLowPower;
            case 6:
                return LowPower;
            case 7:
                return VeryLowPower;
            case 8:
                return Antivirus;
            case 9:
                return Temperature;
            default:
                return null;
        }
    }
}
