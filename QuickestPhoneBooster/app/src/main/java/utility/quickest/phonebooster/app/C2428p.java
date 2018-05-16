package utility.quickest.phonebooster.app;

/* compiled from: MyApplicationLike */
public enum C2428p {
    VIRUS("VIRUS"),
    JUNK("JUNK"),
    TRASH("TRASH"),
    PROCESS("PROCESS"),
    CPU("CPU"),
    BATTERY("BATTERY");
    
    private final String mKey;

    private C2428p(String str) {
        this.mKey = str;
    }

    public static C2428p m17451b(String str) {
        try {
            String toUpperCase = str.toUpperCase();
            for (C2428p c2428p : C2428p.values()) {
                if (toUpperCase.contains(c2428p.mKey)) {
                    return c2428p;
                }
            }
            return null;
        } catch (Throwable th) {
            return null;
        }
    }
}
