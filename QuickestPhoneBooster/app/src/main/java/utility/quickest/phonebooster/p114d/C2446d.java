package utility.quickest.phonebooster.p114d;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: AppRunningInfo */
public final class C2446d {
    private final String f13082a;
    private final LinkedHashSet<C2453k> f13083b;
    private final long f13084c;

    public static C2446d m17627a(String str, Collection<C2453k> collection) {
        try {
            return new C2446d(str, collection);
        } catch (Exception e) {
            return null;
        }
    }

    private C2446d(String str, Collection<C2453k> collection) {
        if (str != null) {
            str = str.trim();
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName is empty!");
        }
        this.f13082a = str;
        this.f13083b = new LinkedHashSet();
        if (collection != null) {
            for (C2453k c2453k : collection) {
                if (c2453k != null) {
                    this.f13083b.add(c2453k);
                }
            }
        }
        if (this.f13083b.isEmpty()) {
            throw new IllegalArgumentException("processRunningList is invalid!");
        }
        Iterator it = this.f13083b.iterator();
        long j = 0;
        while (it.hasNext()) {
            j = ((C2453k) it.next()).m17690a() + j;
        }
        this.f13084c = j;
    }

    public C2446d m17628a(C2453k c2453k) {
        if (c2453k == null) {
            return this;
        }
        Collection arrayList = new ArrayList(this.f13083b);
        arrayList.add(c2453k);
        return C2446d.m17627a(this.f13082a, arrayList);
    }

    public String m17629a() {
        return this.f13082a;
    }

    public long m17630b() {
        return this.f13084c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2446d) {
            return this.f13082a.equals(((C2446d) obj).f13082a);
        }
        return false;
    }

    public int hashCode() {
        return this.f13082a.hashCode();
    }
}
