package utility.quickest.phonebooster.model_helper;

import android.text.TextUtils;
import utility.quickest.phonebooster.network.response_data.VirusInfoServiceExpression;
import utility.quickest.phonebooster.p112b.C2429a;
import utility.quickest.phonebooster.p114d.C2443a;
import utility.quickest.phonebooster.p114d. AppVirusInfo;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AntivirusHelper */
final class dj implements Runnable {
    final /* synthetic */ C2443a f14096a;

    dj(C2443a c2443a) {
        this.f14096a = c2443a;
    }

    public void run() {
        Throwable th;
        try {
            List<VirusInfoServiceExpression> a = dh.m18437b(this.f14096a);
            if (a != null) {
                List arrayList = new ArrayList();
                for (VirusInfoServiceExpression virusInfoServiceExpression : a) {
                    if (virusInfoServiceExpression != null) {
                        if (virusInfoServiceExpression.AppId != null) {
                            virusInfoServiceExpression.AppId = virusInfoServiceExpression.AppId.trim();
                        }
                        if (!TextUtils.isEmpty(virusInfoServiceExpression.AppId)) {
                            if (virusInfoServiceExpression.VirusDescription != null) {
                                virusInfoServiceExpression.VirusDescription = virusInfoServiceExpression.VirusDescription.trim();
                            }
                            if (!TextUtils.isEmpty(virusInfoServiceExpression.VirusDescription) && virusInfoServiceExpression.AppVersion >= 0) {
                                arrayList.add( AppVirusInfo.m17653a(virusInfoServiceExpression.AppId, virusInfoServiceExpression.VirusDescription, virusInfoServiceExpression.AppVersion));
                            }
                        }
                    }
                }
                 AppVirusInfo.m17657a(C2429a.m17452a(), arrayList);
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        ThreadUtil.m19099a(false, new dk(this));
        if (th != null) {
            throw new RuntimeException(th);
        }
    }
}
