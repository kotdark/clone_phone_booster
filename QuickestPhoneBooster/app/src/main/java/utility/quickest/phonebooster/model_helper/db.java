package utility.quickest.phonebooster.model_helper;

/* compiled from: AdvertisementModel */
public enum db {
    JUNK1(1, "junk1"),
    PROCESS1(1, "process1"),
    LOCKED_SCREEN(1, "locked_screen"),
    ONE_KEY_CLEAN(1, "one_key_clean"),
    SPLASH(1, "splash"),
    JUNK_INTER(1, "junk_inter"),
    PROCESS_INTER(1, "process_inter"),
    ONE_KEY_BOOST(1, "one_key_boost"),
    SAVE_POWER(1, "save_power"),
    WANT_QUIT(1, "want_quit"),
    SPLASH2(1, "splash2"),
    CPU_COOL(1, "cpu_cool"),
    SAVE_POWER2(1, "save_power2"),
    MAIN_CAROUSEL(1, "main_carousel"),
    CPU_COOL2(1, "cpu_cool2"),
    ANTI_VIRUS(1, "anti_virus"),
    ANTI_VIRUS_INTER(1, "anti_virus_inter");
    
    private final int mCount;
    private final String mType;

    private db(int i, String str) {
        if (i < 1) {
            i = 1;
        }
        this.mCount = i;
        this.mType = str == null ? "" : str.trim();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static utility.quickest.phonebooster.model_helper.db m18426b(java.lang.String r3) {
        /*
        if (r3 != 0) goto L_0x0013;
    L_0x0002:
        r0 = "";
    L_0x0005:
        r1 = -1;
        r2 = r0.hashCode();
        switch(r2) {
            case -2029589210: goto L_0x00b3;
            case -2002050389: goto L_0x008c;
            case -1644740430: goto L_0x00c0;
            case -1300308000: goto L_0x00cd;
            case -1147600086: goto L_0x0069;
            case -1146776112: goto L_0x003d;
            case -1005146206: goto L_0x0027;
            case -895866265: goto L_0x0048;
            case -831450338: goto L_0x0080;
            case -618184771: goto L_0x00da;
            case 101487849: goto L_0x001c;
            case 501133184: goto L_0x0099;
            case 582740801: goto L_0x0032;
            case 752131279: goto L_0x00a6;
            case 1354982949: goto L_0x0053;
            case 1409735619: goto L_0x0074;
            case 1655314188: goto L_0x005e;
            default: goto L_0x000d;
        };
    L_0x000d:
        r0 = r1;
    L_0x000e:
        switch(r0) {
            case 0: goto L_0x00e7;
            case 1: goto L_0x00eb;
            case 2: goto L_0x00ef;
            case 3: goto L_0x00f3;
            case 4: goto L_0x00f7;
            case 5: goto L_0x00fb;
            case 6: goto L_0x00ff;
            case 7: goto L_0x0103;
            case 8: goto L_0x0107;
            case 9: goto L_0x010b;
            case 10: goto L_0x010f;
            case 11: goto L_0x0113;
            case 12: goto L_0x0117;
            case 13: goto L_0x011b;
            case 14: goto L_0x011f;
            case 15: goto L_0x0123;
            case 16: goto L_0x0127;
            default: goto L_0x0011;
        };
    L_0x0011:
        r0 = 0;
    L_0x0012:
        return r0;
    L_0x0013:
        r0 = r3.trim();
        r0 = r0.toLowerCase();
        goto L_0x0005;
    L_0x001c:
        r2 = "junk1";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x000d;
    L_0x0025:
        r0 = 0;
        goto L_0x000e;
    L_0x0027:
        r2 = "process1";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x000d;
    L_0x0030:
        r0 = 1;
        goto L_0x000e;
    L_0x0032:
        r2 = "locked_screen";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x000d;
    L_0x003b:
        r0 = 2;
        goto L_0x000e;
    L_0x003d:
        r2 = "one_key_clean";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x000d;
    L_0x0046:
        r0 = 3;
        goto L_0x000e;
    L_0x0048:
        r2 = "splash";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x000d;
    L_0x0051:
        r0 = 4;
        goto L_0x000e;
    L_0x0053:
        r2 = "junk_inter";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x000d;
    L_0x005c:
        r0 = 5;
        goto L_0x000e;
    L_0x005e:
        r2 = "process_inter";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x000d;
    L_0x0067:
        r0 = 6;
        goto L_0x000e;
    L_0x0069:
        r2 = "one_key_boost";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x000d;
    L_0x0072:
        r0 = 7;
        goto L_0x000e;
    L_0x0074:
        r2 = "save_power";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x000d;
    L_0x007d:
        r0 = 8;
        goto L_0x000e;
    L_0x0080:
        r2 = "want_quit";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x000d;
    L_0x0089:
        r0 = 9;
        goto L_0x000e;
    L_0x008c:
        r2 = "splash2";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x000d;
    L_0x0095:
        r0 = 10;
        goto L_0x000e;
    L_0x0099:
        r2 = "cpu_cool";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x000d;
    L_0x00a2:
        r0 = 11;
        goto L_0x000e;
    L_0x00a6:
        r2 = "save_power2";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x000d;
    L_0x00af:
        r0 = 12;
        goto L_0x000e;
    L_0x00b3:
        r2 = "main_carousel";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x000d;
    L_0x00bc:
        r0 = 13;
        goto L_0x000e;
    L_0x00c0:
        r2 = "cpu_cool2";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x000d;
    L_0x00c9:
        r0 = 14;
        goto L_0x000e;
    L_0x00cd:
        r2 = "anti_virus";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x000d;
    L_0x00d6:
        r0 = 15;
        goto L_0x000e;
    L_0x00da:
        r2 = "anti_virus_inter";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x000d;
    L_0x00e3:
        r0 = 16;
        goto L_0x000e;
    L_0x00e7:
        r0 = JUNK1;
        goto L_0x0012;
    L_0x00eb:
        r0 = PROCESS1;
        goto L_0x0012;
    L_0x00ef:
        r0 = LOCKED_SCREEN;
        goto L_0x0012;
    L_0x00f3:
        r0 = ONE_KEY_CLEAN;
        goto L_0x0012;
    L_0x00f7:
        r0 = SPLASH;
        goto L_0x0012;
    L_0x00fb:
        r0 = JUNK_INTER;
        goto L_0x0012;
    L_0x00ff:
        r0 = PROCESS_INTER;
        goto L_0x0012;
    L_0x0103:
        r0 = ONE_KEY_BOOST;
        goto L_0x0012;
    L_0x0107:
        r0 = SAVE_POWER;
        goto L_0x0012;
    L_0x010b:
        r0 = WANT_QUIT;
        goto L_0x0012;
    L_0x010f:
        r0 = SPLASH2;
        goto L_0x0012;
    L_0x0113:
        r0 = CPU_COOL;
        goto L_0x0012;
    L_0x0117:
        r0 = SAVE_POWER2;
        goto L_0x0012;
    L_0x011b:
        r0 = MAIN_CAROUSEL;
        goto L_0x0012;
    L_0x011f:
        r0 = CPU_COOL2;
        goto L_0x0012;
    L_0x0123:
        r0 = ANTI_VIRUS;
        goto L_0x0012;
    L_0x0127:
        r0 = ANTI_VIRUS_INTER;
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: utility.quickest.phonebooster.model_helper.db.b(java.lang.String):utility.quickest.phonebooster.model_helper.db");
    }

    public int getCount() {
        return this.mCount;
    }

    public String getType() {
        return this.mType;
    }
}
