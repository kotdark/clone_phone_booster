package utility.quickest.phonebooster.model_helper;

/* compiled from: SettingModel */
public enum il {
    Celsius(1),
    Fahrenheit(2);
    
    private final int mId;

    private il(int i) {
        this.mId = i;
    }

    private int m18723a() {
        return this.mId;
    }

    private static il m18726b(int i) {
        switch (i) {
            case 1:
                return Celsius;
            case 2:
                return Fahrenheit;
            default:
                return null;
        }
    }
}
