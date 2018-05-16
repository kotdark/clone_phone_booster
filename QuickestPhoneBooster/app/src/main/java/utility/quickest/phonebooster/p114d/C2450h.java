package utility.quickest.phonebooster.p114d;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: DeletedAppJunkInfo */
public final class C2450h {
    private final String f13103a;
    private final String f13104b;
    private final LinkedHashSet<C2451i> f13105c;
    private final long f13106d;

    public static C2450h m17667a(String str, String str2, Collection<C2451i> collection) {
        try {
            return new C2450h(str, str2, collection);
        } catch (Exception e) {
            return null;
        }
    }

    private C2450h(String str, String str2, Collection<C2451i> collection) {
        if (str != null) {
            str = str.trim();
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName is empty!");
        }
        this.f13103a = str;
        if (str2 != null) {
            str2 = str2.trim();
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("appName is empty!");
        }
        this.f13104b = str2;
        this.f13105c = new LinkedHashSet();
        if (collection != null) {
            for (C2451i c2451i : collection) {
                if (c2451i != null) {
                    this.f13105c.add(c2451i);
                }
            }
        }
        if (this.f13105c.isEmpty()) {
            throw new IllegalArgumentException("folderJunkList is invalid!");
        }
        Iterator it = this.f13105c.iterator();
        long j = 0;
        while (it.hasNext()) {
            j = ((C2451i) it.next()).m17676b() + j;
        }
        this.f13106d = j;
    }

    public C2450h m17668a(C2451i c2451i) {
        if (c2451i == null) {
            return this;
        }
        Collection arrayList = new ArrayList(this.f13105c);
        arrayList.add(c2451i);
        return C2450h.m17667a(this.f13103a, this.f13104b, arrayList);
    }

    public C2450h m17670b(C2451i c2451i) {
        if (c2451i == null) {
            return this;
        }
        Collection linkedHashSet = new LinkedHashSet(this.f13105c);
        linkedHashSet.remove(c2451i);
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return C2450h.m17667a(this.f13103a, this.f13104b, linkedHashSet);
    }

    public String m17669a() {
        return this.f13103a;
    }

    public String m17671b() {
        return this.f13104b;
    }

    public List<C2451i> m17672c() {
        return new ArrayList(this.f13105c);
    }

    public long m17673d() {
        return this.f13106d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2450h) {
            return this.f13103a.equals(((C2450h) obj).f13103a);
        }
        return false;
    }

    public int hashCode() {
        return this.f13103a.hashCode();
    }
}
