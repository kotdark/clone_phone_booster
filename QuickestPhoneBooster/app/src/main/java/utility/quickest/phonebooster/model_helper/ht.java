package utility.quickest.phonebooster.model_helper;

import com.google.gson.C2365j;
import utility.quickest.phonebooster.network.response_data.VisitCommandServiceExpression;

/* compiled from: PushModel */
class ht implements Runnable {
    final /* synthetic */ VisitCommandServiceExpression f14357a;
    final /* synthetic */ hs f14358b;

    ht(hs hsVar, VisitCommandServiceExpression visitCommandServiceExpression) {
        this.f14358b = hsVar;
        this.f14357a = visitCommandServiceExpression;
    }

    public void run() {
        try {
            is.m18737a("PushCallback", "Visit", System.currentTimeMillis(), new C2365j().m17182a(this.f14357a));
        } catch (Throwable th) {
        }
    }
}
