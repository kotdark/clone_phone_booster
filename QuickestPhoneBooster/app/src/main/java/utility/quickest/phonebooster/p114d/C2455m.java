package utility.quickest.phonebooster.p114d;

/* compiled from: SwitchInfo */
public enum C2455m {
    Normal(2),
    Vibrate(1),
    Silent(0);
    
    private final int mId;

    private C2455m(int i) {
        this.mId = i;
    }

    public int m17695a() {
        return this.mId;
    }

    public static C2455m m17694a(int i) {
        switch (i) {
            case 0:
                return Silent;
            case 1:
                return Vibrate;
            case 2:
                return Normal;
            default:
                return null;
        }
    }
}
