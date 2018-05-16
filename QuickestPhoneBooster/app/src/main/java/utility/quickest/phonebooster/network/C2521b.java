package utility.quickest.phonebooster.network;

import utility.quickest.phonebooster.network.request_data.SubmitFeedbackRequest;
import utility.quickest.phonebooster.network.request_data.UploadInstalledAppRequest;
import utility.quickest.phonebooster.network.response_data.AdConfigServiceExpression;
import utility.quickest.phonebooster.network.response_data.AdvertisementListServiceExpression;
import utility.quickest.phonebooster.network.response_data.AppUpdateServiceExpression;
import utility.quickest.phonebooster.network.response_data.ConfigurationServiceExpression;
import utility.quickest.phonebooster.network.response_data.JunkDirServiceExpression;
import utility.quickest.phonebooster.network.response_data.VirusInfoServiceExpression;
import java.util.List;
import java.util.Map;
import okhttp3.bk;
import p022b.C0466h;
import p022b.p025b.C0437a;
import p022b.p025b.C0442f;
import p022b.p025b.C0445i;
import p022b.p025b.C0451o;
import p022b.p025b.C0456t;
import p022b.p025b.C0458v;
import p022b.p025b.C0459w;

/* compiled from: NormalServiceApi */
public interface C2521b {
    @C0442f
    @C0458v
    C0466h<bk> m18838a(@C0459w String str);

    @C0451o(a = "/api/v1/collect/feedback")
    C0466h<bk> m18839a(@C0445i(a = "X-User-Id") String str, @C0437a SubmitFeedbackRequest submitFeedbackRequest);

    @C0451o(a = "/api/v1/collect/installled")
    C0466h<bk> m18840a(@C0445i(a = "X-User-Id") String str, @C0437a UploadInstalledAppRequest uploadInstalledAppRequest);

    @C0442f(a = "https://ads.goclean.tech/api/v1/adconfig")
    C0466h<AdConfigServiceExpression> m18841a(@C0445i(a = "X-User-Id") String str, @C0456t(a = "countrycode") String str2);

    @C0442f(a = "https://ads.goclean.tech/api/v1/ads")
    C0466h<AdvertisementListServiceExpression> m18842a(@C0445i(a = "X-User-Id") String str, @C0456t(a = "type") String str2, @C0456t(a = "count") Integer num, @C0456t(a = "groupId") String str3);

    @C0442f(a = "/api/v1/Update")
    C0466h<AppUpdateServiceExpression> m18843a(@C0445i(a = "X-User-Id") String str, @C0456t(a = "channelName") String str2, @C0456t(a = "packageName") String str3);

    @C0451o(a = "/api/v1/resource/trashlist")
    C0466h<List<JunkDirServiceExpression>> m18844a(@C0445i(a = "X-User-Id") String str, @C0437a Map<String, Integer> map);

    @C0442f(a = "/api/v1/resource/virusbase")
    C0466h<List<VirusInfoServiceExpression>> m18845b(@C0445i(a = "X-User-Id") String str);

    @C0442f(a = "/api/v1/configuration")
    C0466h<ConfigurationServiceExpression> m18846b(@C0445i(a = "X-User-Id") String str, @C0445i(a = "X-Display-Ads") String str2);
}
