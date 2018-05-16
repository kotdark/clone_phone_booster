package utility.quickest.phonebooster.p114d;

import android.os.SystemClock;
import android.text.TextUtils;
import utility.quickest.phonebooster.network.response_data.AdvertisementServiceExpression;
import java.util.ArrayList;
import java.util.List;

/* compiled from: OwnCampaignInfo */
public final class OwnCampaignInfo {
    private final String f13109a;
    private final String f13110b;
    private final String f13111c;
    private final String f13112d;
    private final String f13113e;
    private final String f13114f;
    private final String f13115g;
    private final List<String> f13116h;
    private final List<String> f13117i;
    private final long f13118j;
    private final long f13119k;
    private final boolean f13120l;

    public static OwnCampaignInfo m17677a(AdvertisementServiceExpression advertisementServiceExpression) {
        try {
            return new OwnCampaignInfo(advertisementServiceExpression.Id, advertisementServiceExpression.Title, advertisementServiceExpression.Desc, advertisementServiceExpression.ActionDesc, advertisementServiceExpression.ImageUrl, advertisementServiceExpression.IconUrl, advertisementServiceExpression.TargetUri, advertisementServiceExpression.ImpressionCallbackUrls, advertisementServiceExpression.ClickCallbackUrls, (advertisementServiceExpression.Expire * 1000) + SystemClock.elapsedRealtime(), advertisementServiceExpression.Duration, advertisementServiceExpression.ImageHeight > advertisementServiceExpression.ImageWidth);
        } catch (Throwable th) {
            return null;
        }
    }

    private OwnCampaignInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<String> list, List<String> list2, long j, long j2, boolean z) {
        if (str != null) {
            str = str.trim();
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("id is empty!");
        }
        String trim;
        this.f13109a = str;
        this.f13110b = str2 == null ? "" : str2.trim();
        this.f13111c = str3 == null ? "" : str3.trim();
        this.f13112d = str4 == null ? "" : str4.trim();
        this.f13113e = str5 == null ? "" : str5.trim();
        this.f13114f = str6 == null ? "" : str6.trim();
        this.f13115g = str7 == null ? "" : str7.trim();
        this.f13116h = new ArrayList();
        if (list != null) {
            for (String trim2 : list) {
                if (trim2 != null) {
                    trim2 = trim2.trim();
                }
                if (!TextUtils.isEmpty(trim2)) {
                    this.f13116h.add(trim2);
                }
            }
        }
        this.f13117i = new ArrayList();
        if (list2 != null) {
            for (String trim22 : list2) {
                if (trim22 != null) {
                    trim22 = trim22.trim();
                }
                if (!TextUtils.isEmpty(trim22)) {
                    this.f13117i.add(trim22);
                }
            }
        }
        if (j < 0) {
            j = 0;
        }
        this.f13118j = j;
        if (j2 < 0) {
            j2 = 0;
        }
        this.f13119k = j2;
        this.f13120l = z;
    }

    public String m17678a() {
        return this.f13110b;
    }

    public String m17679b() {
        return this.f13111c;
    }

    public String m17680c() {
        return this.f13112d;
    }

    public String m17681d() {
        return this.f13113e;
    }

    public String m17682e() {
        return this.f13114f;
    }

    public String m17683f() {
        return this.f13115g;
    }

    public List<String> m17684g() {
        return new ArrayList(this.f13116h);
    }

    public List<String> m17685h() {
        return new ArrayList(this.f13117i);
    }

    public long m17686i() {
        return this.f13118j;
    }

    public long m17687j() {
        return this.f13119k;
    }

    public boolean m17688k() {
        return this.f13120l;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OwnCampaignInfo) {
            return this.f13109a.equals(((OwnCampaignInfo) obj).f13109a);
        }
        return false;
    }

    public int hashCode() {
        return this.f13109a.hashCode();
    }
}
