package utility.quickest.phonebooster.adapter;

import java.util.Comparator;

/* compiled from: StorageJunkExpandableListAdapter */
class C2403n implements Comparator<C2408s> {
    final /* synthetic */ StorageJunkExpandableListAdapter f12943a;

    C2403n(StorageJunkExpandableListAdapter storageJunkExpandableListAdapter) {
        this.f12943a = storageJunkExpandableListAdapter;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return m17396a((C2408s) obj, (C2408s) obj2);
    }

    public int m17396a(C2408s c2408s, C2408s c2408s2) {
        if (!c2408s.m17398a() && c2408s2.m17398a()) {
            return 1;
        }
        if (!c2408s.m17398a() || c2408s2.m17398a()) {
            return 0;
        }
        return -1;
    }
}
