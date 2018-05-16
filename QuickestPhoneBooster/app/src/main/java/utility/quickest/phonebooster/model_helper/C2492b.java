package utility.quickest.phonebooster.model_helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.SparseArray;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.CustomEvent;
import com.google.gson.C2365j;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.network.C2522c;
import utility.quickest.phonebooster.network.response_data.AdConfigServiceExpression;
import utility.quickest.phonebooster.network.response_data.AdUnitServiceExpression;
import utility.quickest.phonebooster.p114d.C2443a;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

/* compiled from: AdvertisementModel */
public final class C2492b {
    private static volatile C2492b f13955a = null;
    private static final SharedPreferences f13956l = MyApplicationLike.getApplication().getSharedPreferences("ad_config", 0);
    private static final Editor f13957m = f13956l.edit();
    private boolean f13958b = false;
    private boolean f13959c = false;
    private EnumMap<db, List<List<AdvertisementModel>>> f13960d = new EnumMap(db.class);
    private String f13961e = "";
    private final EnumMap<db, List<cv>> f13962f = new EnumMap(db.class);
    private final EnumSet<db> f13963g = EnumSet.noneOf(db.class);
    private cu f13964h = null;
    private cw f13965i = null;
    private final Set<cy> f13966j = new LinkedHashSet();
    private final EnumMap<db, Set<cz>> f13967k = new EnumMap(db.class);

    public static C2492b m18285a() {
        if (f13955a == null) {
            synchronized (C2492b.class) {
                if (f13955a == null) {
                    f13955a = new C2492b();
                }
            }
        }
        return f13955a;
    }

    public void m18322a(cu cuVar) {
        ThreadUtil.m19102b();
        this.f13964h = cuVar;
    }

    public void m18323a(cw cwVar) {
        ThreadUtil.m19102b();
        this.f13965i = cwVar;
    }

    public void m18324a(cy cyVar) {
        ThreadUtil.m19102b();
        if (cyVar != null) {
            this.f13966j.add(cyVar);
        }
    }

    public void m18327b(cy cyVar) {
        ThreadUtil.m19102b();
        if (cyVar != null) {
            this.f13966j.remove(cyVar);
        }
    }

    public boolean m18326a(db dbVar) {
        ThreadUtil.m19102b();
        if (dbVar == null) {
            return false;
        }
        if (this.f13960d != null) {
            List<List> list = (List) this.f13960d.get(dbVar);
            if (list != null) {
                for (List<AdvertisementModel> list2 : list) {
                    if (list2 != null) {
                        for (AdvertisementModel c2491o : list2) {
                            if (c2491o != null) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
            }
        }
        return false;
    }

    public void m18328b(db dbVar) {
        ThreadUtil.m19102b();
        m18325a(dbVar, null);
    }

    public void m18325a(db dbVar, cz czVar) {
        ThreadUtil.m19102b();
        m18302b(dbVar, czVar);
    }

    public List<cv> m18329c(db dbVar) {
        ThreadUtil.m19102b();
        return m18292a(dbVar, true, true);
    }

    public boolean m18330d(db dbVar) {
        ThreadUtil.m19102b();
        if (m18292a(dbVar, false, false).isEmpty()) {
            return false;
        }
        return true;
    }

    private C2492b() {
        ThreadUtil.m19099a(false, new C2493c(this));
    }

    private List<cv> m18292a(db dbVar, boolean z, boolean z2) {
        ThreadUtil.m19102b();
        if (dbVar == null) {
            return new ArrayList();
        }
        List<cv> list;
        if (z) {
            list = (List) this.f13962f.remove(dbVar);
        } else {
            list = (List) this.f13962f.get(dbVar);
        }
        if (list == null) {
            return new ArrayList();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cv cvVar = (cv) it.next();
            boolean i = cvVar.m18411i();
            if (!i) {
                it.remove();
            }
            if (z2 && cvVar.f14062a != null) {
                try {
                    Answers.getInstance().logCustom((CustomEvent) new CustomEvent("AdSourceValid-" + cvVar.f14062a.f13887a.getType() + "-" + cvVar.f14062a.adId).putCustomAttribute("value", String.valueOf(i)));
                } catch (Throwable th) {
                }
            }
        }
        return list;
    }

    private void m18302b(db dbVar, cz czVar) {
        ThreadUtil.m19102b();
        if (!this.f13958b) {
            m18324a(new C2495d(this, dbVar, czVar));
        } else if (dbVar != null && m18292a(dbVar, false, false).isEmpty()) {
            m18309c(dbVar, czVar);
            if (!this.f13963g.contains(dbVar)) {
                this.f13963g.add(dbVar);
                ThreadUtil.m19098a(new C2497e(this, dbVar), 200);
            }
        } else if (czVar != null) {
            czVar.mo3073a();
        }
    }

    private EnumMap<db, List<List<AdvertisementModel>>> m18307c() {
        ThreadUtil.m19102b();
        EnumMap<db, List<List<AdvertisementModel>>> enumMap = new EnumMap(db.class);
        if (this.f13960d != null) {
            for (Entry entry : this.f13960d.entrySet()) {
                if (entry != null) {
                    db dbVar = (db) entry.getKey();
                    List<List> list = (List) entry.getValue();
                    if (!(dbVar == null || list == null)) {
                        List arrayList = new ArrayList();
                        for (List list2 : list) {
                            if (list2 != null) {
                                arrayList.add(new ArrayList(list2));
                            }
                        }
                        enumMap.put(dbVar, arrayList);
                    }
                }
            }
        }
        return enumMap;
    }

    private void m18311d() {
        ThreadUtil.m19102b();
        ThreadUtil.m19096a(new C2501h(this));
    }

    private void m18314e() {
        ThreadUtil.m19102b();
        if (!this.f13959c) {
            this.f13959c = true;
            ThreadUtil.m19103c(new C2504j(this, C2490a.m18243a().m18244b()));
        }
    }

    private void m18317f() {
        ThreadUtil.m19102b();
        if (!this.f13966j.isEmpty()) {
            for (cy a : new ArrayList(this.f13966j)) {
                a.mo3139a();
            }
        }
    }

    private void m18309c(db dbVar, cz czVar) {
        ThreadUtil.m19102b();
        if (dbVar != null && czVar != null) {
            Set set = (Set) this.f13967k.get(dbVar);
            if (set == null) {
                set = new LinkedHashSet();
                this.f13967k.put(dbVar, set);
            }
            set.add(czVar);
        }
    }

    private void m18315e(db dbVar) {
        ThreadUtil.m19102b();
        if (dbVar != null) {
            Set<cz> set = (Set) this.f13967k.remove(dbVar);
            if (set != null) {
                for (cz a : set) {
                    a.mo3073a();
                }
            }
        }
    }

    private static List<cv> m18300b(C2443a c2443a, db dbVar, List<List<AdvertisementModel>> list) {
        List<cv> arrayList = new ArrayList();
        if (c2443a == null || dbVar == null || list == null || list.isEmpty()) {
            return arrayList;
        }
        for (List list2 : list) {
            if (!(list2 == null || list2.isEmpty())) {
                List[] listArr = new List[list2.size()];
                CountDownLatch countDownLatch = new CountDownLatch(list2.size());
                for (int i = 0; i < list2.size(); i++) {
                    AdvertisementModel c2491o = (AdvertisementModel) list2.get(i);
                    if (c2491o == null) {
                        countDownLatch.countDown();
                    } else {
                        ThreadUtil.m19097a("SubFetchAdTask", new C2508n(c2491o, c2443a, listArr, i, countDownLatch));
                    }
                }
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                }
                for (Collection collection : listArr) {
                    if (collection != null) {
                        arrayList.addAll(collection);
                    }
                }
            }
            if (arrayList.size() >= dbVar.getCount()) {
                break;
            }
        }
        return arrayList;
    }

    private static C2509p m18306c(AdConfigServiceExpression adConfigServiceExpression) {
        if (adConfigServiceExpression == null || adConfigServiceExpression.AdUnitDetails == null) {
            return null;
        }
        C2509p c2509p = new C2509p();
        for (Entry entry : adConfigServiceExpression.AdUnitDetails.entrySet()) {
            if (entry != null) {
                String str = (String) entry.getKey();
                List<AdUnitServiceExpression> list = (List) entry.getValue();
                db a = db.m18426b(str);
                if (!(a == null || list == null)) {
                    SparseArray sparseArray = new SparseArray();
                    for (AdUnitServiceExpression adUnitServiceExpression : list) {
                        if (adUnitServiceExpression != null) {
                            AdvertisementModel a2 = C2492b.m18287a(a, adUnitServiceExpression);
                            if (a2 != null) {
                                List list2 = (List) sparseArray.get(adUnitServiceExpression.AdPlacementPriority);
                                if (list2 == null) {
                                    list2 = new ArrayList();
                                    sparseArray.put(adUnitServiceExpression.AdPlacementPriority, list2);
                                }
                                list2.add(a2);
                            }
                        }
                    }
                    List arrayList = new ArrayList();
                    for (int i = 0; i < sparseArray.size(); i++) {
                        List list3 = (List) sparseArray.valueAt(i);
                        if (!(list3 == null || list3.isEmpty())) {
                            arrayList.add(list3);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        c2509p.f14490a.put(a, arrayList);
                    }
                }
            }
        }
        try {
            JSONObject jSONObject = new JSONObject(C2542m.m19077a(adConfigServiceExpression.VerificationToken, true));
            try {
                c2509p.f14491b = jSONObject.getString("id");
            } catch (Throwable th) {
            }
            try {
                c2509p.f14492c = jSONObject.getString("name");
            } catch (Throwable th2) {
            }
            try {
                c2509p.f14493d = jSONObject.getString("ver_code");
            } catch (Throwable th3) {
            }
            try {
                c2509p.f14494e = jSONObject.getString("ver_name");
            } catch (Throwable th4) {
            }
            try {
                c2509p.f14495f = jSONObject.getString("installer");
            } catch (Throwable th5) {
            }
            try {
                c2509p.f14496g = jSONObject.getString("checksum");
            } catch (Throwable th6) {
            }
        } catch (Throwable th7) {
        }
        return c2509p;
    }

    private static AdvertisementModel m18287a(db dbVar, AdUnitServiceExpression adUnitServiceExpression) {
        try {
            String toLowerCase = adUnitServiceExpression.AdPlacementType.trim().toLowerCase();
            Object obj = -1;
            switch (toLowerCase.hashCode()) {
                case -346547686:
                    if (toLowerCase.equals("admob_inter")) {
                        obj = 6;
                        break;
                    }
                    break;
                case 3260:
                    if (toLowerCase.equals("fb")) {
                        obj = 4;
                        break;
                    }
                    break;
                case 3491:
                    if (toLowerCase.equals("mp")) {
                        obj = 1;
                        break;
                    }
                    break;
                case 110470:
                    if (toLowerCase.equals("own")) {
                        obj = null;
                        break;
                    }
                    break;
                case 92668925:
                    if (toLowerCase.equals("admob")) {
                        obj = 3;
                        break;
                    }
                    break;
                case 104081947:
                    if (toLowerCase.equals("mopub")) {
                        obj = 7;
                        break;
                    }
                    break;
                case 182875867:
                    if (toLowerCase.equals("admob_exp")) {
                        obj = 2;
                        break;
                    }
                    break;
                case 1274173337:
                    if (toLowerCase.equals("fb_inter")) {
                        obj = 5;
                        break;
                    }
                    break;
            }
            switch (obj) {
                case null:
                    return new cm(dbVar, adUnitServiceExpression.AdPlacementName, adUnitServiceExpression.AdRequestTimeoutInSeconds, adUnitServiceExpression.AdRequestCount, 0, adUnitServiceExpression.AdExpireInSeconds, adUnitServiceExpression.AdPlacementCPC, adUnitServiceExpression.AdPlacementChance, (long) (adUnitServiceExpression.AdDisappearInSeconds * 1000.0f), adUnitServiceExpression.AdPlacementId, null);
                case 1:
                    return new cc(dbVar, adUnitServiceExpression.AdPlacementName, adUnitServiceExpression.AdRequestTimeoutInSeconds, adUnitServiceExpression.AdRequestCount, 0, adUnitServiceExpression.AdExpireInSeconds, adUnitServiceExpression.AdPlacementCPC, adUnitServiceExpression.AdPlacementChance, (long) (adUnitServiceExpression.AdDisappearInSeconds * 1000.0f), adUnitServiceExpression.AdPlacementId, null);
                case 2:
                    return new an(dbVar, adUnitServiceExpression.AdPlacementName, adUnitServiceExpression.AdRequestTimeoutInSeconds, adUnitServiceExpression.AdRequestCount, 0, adUnitServiceExpression.AdExpireInSeconds, adUnitServiceExpression.AdPlacementCPC, adUnitServiceExpression.AdPlacementChance, (long) (adUnitServiceExpression.AdDisappearInSeconds * 1000.0f), adUnitServiceExpression.AdPlacementId);
                case 3:
                    return new GANativeAdModel(dbVar, adUnitServiceExpression.AdPlacementName, adUnitServiceExpression.AdRequestTimeoutInSeconds, adUnitServiceExpression.AdRequestCount, 0, adUnitServiceExpression.AdExpireInSeconds, adUnitServiceExpression.AdPlacementCPC, adUnitServiceExpression.AdPlacementChance, (long) (adUnitServiceExpression.AdDisappearInSeconds * 1000.0f), adUnitServiceExpression.AdPlacementId);
                case 4:
                    return new bh(dbVar, adUnitServiceExpression.AdPlacementName, adUnitServiceExpression.AdRequestTimeoutInSeconds, adUnitServiceExpression.AdRequestCount, 0, adUnitServiceExpression.AdExpireInSeconds, adUnitServiceExpression.AdPlacementCPC, adUnitServiceExpression.AdPlacementChance, (long) (adUnitServiceExpression.AdDisappearInSeconds * 1000.0f), adUnitServiceExpression.AdPlacementId);
                case 5:
                    return new ax(dbVar, adUnitServiceExpression.AdPlacementName, adUnitServiceExpression.AdRequestTimeoutInSeconds, adUnitServiceExpression.AdRequestCount, 0, adUnitServiceExpression.AdExpireInSeconds, adUnitServiceExpression.AdPlacementCPC, adUnitServiceExpression.AdPlacementChance, (long) (adUnitServiceExpression.AdDisappearInSeconds * 1000.0f), adUnitServiceExpression.AdPlacementId);
                case 6:
                    return new C2510q(dbVar, adUnitServiceExpression.AdPlacementName, adUnitServiceExpression.AdRequestTimeoutInSeconds, adUnitServiceExpression.AdRequestCount, 0, adUnitServiceExpression.AdExpireInSeconds, adUnitServiceExpression.AdPlacementCPC, adUnitServiceExpression.AdPlacementChance, (long) (adUnitServiceExpression.AdDisappearInSeconds * 1000.0f), adUnitServiceExpression.AdPlacementId, null);
                case 7:
                    return new bs(dbVar, adUnitServiceExpression.AdPlacementName, adUnitServiceExpression.AdRequestTimeoutInSeconds, adUnitServiceExpression.AdRequestCount, 0, adUnitServiceExpression.AdExpireInSeconds, adUnitServiceExpression.AdPlacementCPC, adUnitServiceExpression.AdPlacementChance, (long) (adUnitServiceExpression.AdDisappearInSeconds * 1000.0f), adUnitServiceExpression.AdPlacementId);
                default:
                    return null;
            }
        } catch (Throwable th) {
            return null;
        }
    }

    private static void m18304b(String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            Field declaredField;
            Class cls = Class.forName("com.facebook.ads.internal.f.i");
            try {
                Method declaredMethod = cls.getDeclaredMethod("a", new Class[]{Context.class});
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(cls, new Object[]{MyApplicationLike.getApplication()});
            } catch (Throwable th) {
            }
            if (str != null) {
                try {
                    declaredField = cls.getDeclaredField("d");
                    declaredField.setAccessible(true);
                    declaredField.set(cls, str);
                } catch (Throwable th2) {
                }
            }
            if (str2 != null) {
                try {
                    declaredField = cls.getDeclaredField("e");
                    declaredField.setAccessible(true);
                    declaredField.set(cls, str2);
                } catch (Throwable th3) {
                }
            }
            if (str3 != null) {
                try {
                    Integer valueOf = Integer.valueOf(str3.trim());
                    Field declaredField2 = cls.getDeclaredField("g");
                    declaredField2.setAccessible(true);
                    declaredField2.set(cls, valueOf);
                } catch (Throwable th4) {
                }
            }
            if (str4 != null) {
                try {
                    declaredField = cls.getDeclaredField("f");
                    declaredField.setAccessible(true);
                    declaredField.set(cls, str4);
                } catch (Throwable th5) {
                }
            }
            if (str5 != null) {
                try {
                    declaredField = cls.getDeclaredField("h");
                    declaredField.setAccessible(true);
                    declaredField.set(cls, str5);
                } catch (Throwable th6) {
                }
            }
            if (str6 != null) {
                try {
                    cls = Class.forName("com.facebook.ads.internal.f.f");
                    declaredField = cls.getDeclaredField("h");
                    declaredField.setAccessible(true);
                    declaredField.set(cls, str6);
                } catch (Throwable th7) {
                }
            }
        } catch (Throwable th8) {
        }
    }

    private static void m18301b(C2443a c2443a, da daVar) {
        String str = null;
        try {
            Locale locale = Locale.getDefault();
            if (locale != null) {
                str = locale.getCountry();
            }
            AdConfigServiceExpression adConfigServiceExpression = (AdConfigServiceExpression) C2522c.m18847a().m18841a(C2542m.m19076a(c2443a.m17612b()), str).mo1131a().m2659b();
            if (adConfigServiceExpression == null) {
                daVar.f14066a = -3;
                return;
            }
            C2509p c = C2492b.m18306c(adConfigServiceExpression);
            if (c == null) {
                daVar.f14066a = -3;
                return;
            }
            daVar.f14067b = c;
            daVar.f14068c = adConfigServiceExpression;
            daVar.f14066a = 0;
        } catch (IOException e) {
            daVar.f14066a = -2;
        }
    }

    private static AdConfigServiceExpression m18318g() {
        try {
            return (AdConfigServiceExpression) new C2365j().m17179a(f13956l.getString("key_ad_config", ""), AdConfigServiceExpression.class);
        } catch (Throwable th) {
            return null;
        }
    }

    private static void m18312d(AdConfigServiceExpression adConfigServiceExpression) {
        if (adConfigServiceExpression != null) {
            try {
                f13957m.putString("key_ad_config", new C2365j().m17182a((Object) adConfigServiceExpression)).commit();
            } catch (Throwable th) {
            }
        }
    }
}
