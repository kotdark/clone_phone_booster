package utility.quickest.phonebooster.util;

/* compiled from: NetworkUtil */
public enum C2543n {
    OFFLINE("Offline"),
    WIFI("WiFi"),
    MOBILE_2G("2G"),
    MOBILE_3G("3G"),
    MOBILE_4G("4G"),
    UNKNOWN("Unknown");
    
    private final String mDesc;

    private C2543n(String str) {
        this.mDesc = str;
    }

    public String m19095a() {
        return this.mDesc;
    }
}
