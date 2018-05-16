package utility.quickest.phonebooster.p114d;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: AppJunkInfo */
public final class C2445c {
    private final String f13079a;
    private final LinkedHashSet<C2451i> f13080b;
    private final long f13081c;

    public static C2445c m17621a(String str, Collection<C2451i> collection) {
        try {
            return new C2445c(str, collection);
        } catch (Exception e) {
            return null;
        }
    }

    private C2445c(String str, Collection<C2451i> collection) {
        if (str != null) {
            str = str.trim();
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName is empty!");
        }
        this.f13079a = str;
        this.f13080b = new LinkedHashSet();
        if (collection != null) {
            for (C2451i c2451i : collection) {
                if (c2451i != null) {
                    this.f13080b.add(c2451i);
                }
            }
        }
        if (this.f13080b.isEmpty()) {
            throw new IllegalArgumentException("folderJunkList is invalid!");
        }
        Iterator it = this.f13080b.iterator();
        long j = 0;
        while (it.hasNext()) {
            j = ((C2451i) it.next()).m17676b() + j;
        }
        this.f13081c = j;
    }

    public C2445c m17622a(C2451i c2451i) {
        if (c2451i == null) {
            return this;
        }
        Collection arrayList = new ArrayList(this.f13080b);
        arrayList.add(c2451i);
        return C2445c.m17621a(this.f13079a, arrayList);
    }

    public C2445c m17624b(C2451i c2451i) {
        if (c2451i == null) {
            return this;
        }
        Collection linkedHashSet = new LinkedHashSet(this.f13080b);
        linkedHashSet.remove(c2451i);
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return C2445c.m17621a(this.f13079a, linkedHashSet);
    }

    public String m17623a() {
        return this.f13079a;
    }

    public List<C2451i> m17625b() {
        return new ArrayList(this.f13080b);
    }

    public long m17626c() {
        return this.f13081c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2445c) {
            return this.f13079a.equals(((C2445c) obj).f13079a);
        }
        return false;
    }

    public int hashCode() {
        return this.f13079a.hashCode();
    }
}
