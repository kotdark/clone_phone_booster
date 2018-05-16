package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.model_helper.es;
import utility.quickest.phonebooster.model_helper.gx;

/* compiled from: StorageJunkCleanFragment */
/* synthetic */ class hl {
    static final /* synthetic */ int[] f13821a = new int[gx.values().length];
    static final /* synthetic */ int[] f13822b = new int[es.values().length];

    static {
        try {
            f13822b[es.ReadyToScan.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f13822b[es.Scanning.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f13822b[es.ReadyToScanAndKill.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f13822b[es.Killing.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f13821a[gx.ReadyToScan.ordinal()] = 1;
        } catch (NoSuchFieldError e5) {
        }
        try {
            f13821a[gx.Scanning.ordinal()] = 2;
        } catch (NoSuchFieldError e6) {
        }
        try {
            f13821a[gx.ReadyToScanAndDoAction.ordinal()] = 3;
        } catch (NoSuchFieldError e7) {
        }
        try {
            f13821a[gx.DoingAction.ordinal()] = 4;
        } catch (NoSuchFieldError e8) {
        }
    }
}
