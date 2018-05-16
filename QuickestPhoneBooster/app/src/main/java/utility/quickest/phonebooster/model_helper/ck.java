package utility.quickest.phonebooster.model_helper;

import com.mobpower.p116a.C2601a;

/* compiled from: AdvertisementModel */
class ck implements Runnable {
    final /* synthetic */ C2601a f14039a;
    final /* synthetic */ ch f14040b;

    ck(ch chVar, C2601a c2601a) {
        this.f14040b = chVar;
        this.f14039a = c2601a;
    }

    public void run() {
        if (this.f14039a != null) {
            Runnable[] runnableArr = (Runnable[]) this.f14040b.f14033b.get(this.f14039a);
            if (runnableArr != null && runnableArr.length > 0 && runnableArr[0] != null) {
                runnableArr[0].run();
            }
        }
    }
}
