package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.util.ThreadUtil;
import com.mobpower.p116a.C2494c;
import com.mobpower.p116a.C2601a;
import com.mobpower.p116a.C2602b;
import java.util.List;
import java.util.Map;

/* compiled from: AdvertisementModel */
class ch implements C2494c {
    final /* synthetic */ long f14032a;
    final /* synthetic */ Map f14033b;
    final /* synthetic */ cg f14034c;

    ch(cg cgVar, long j, Map map) {
        this.f14034c = cgVar;
        this.f14032a = j;
        this.f14033b = map;
    }

    public void mo3135a(C2602b c2602b) {
        ThreadUtil.m19099a(false, new ci(this, c2602b));
    }

    public void mo3136a(List<C2601a> list) {
        ThreadUtil.m19099a(false, new cj(this, list));
    }

    public void mo3134a(C2601a c2601a) {
        ThreadUtil.m19099a(false, new ck(this, c2601a));
    }

    public void mo3137b(C2601a c2601a) {
    }

    public void mo3138c(C2601a c2601a) {
    }

    public void mo3133a() {
    }
}
