package utility.quickest.phonebooster.network;

import utility.quickest.phonebooster.network.request_data.SubmitLogRequest;
import okhttp3.bk;
import p022b.C0466h;
import p022b.p025b.C0437a;
import p022b.p025b.C0445i;
import p022b.p025b.C0451o;
import p022b.p025b.C0455s;

/* compiled from: LogServiceApi */
public interface C2520a {
    @C0451o(a = "/api/logging/{eventType}")
    C0466h<bk> m18837a(@C0445i(a = "X-User-Id") String str, @C0455s(a = "eventType") String str2, @C0437a SubmitLogRequest submitLogRequest);
}
