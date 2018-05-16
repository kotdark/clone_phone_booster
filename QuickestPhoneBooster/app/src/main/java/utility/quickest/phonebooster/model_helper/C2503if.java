package utility.quickest.phonebooster.model_helper;

/* compiled from: RuntimeRemoteConfigModel */
public enum C2503if {
    Junk("junk"),
    Process("process"),
    SavePower("savepower"),
    CpuCool("cpucool"),
    AntiVirus("antivirus");
    
    private final String mId;

    private C2503if(String str) {
        this.mId = str == null ? "" : str.trim();
    }
}
