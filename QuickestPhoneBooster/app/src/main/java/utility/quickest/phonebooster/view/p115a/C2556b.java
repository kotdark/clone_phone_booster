package utility.quickest.phonebooster.view.p115a;

import android.view.Choreographer.FrameCallback;

/* compiled from: AnimationHandler */
class C2556b implements FrameCallback {
    final /* synthetic */ C2555a f15070a;

    C2556b(C2555a c2555a) {
        this.f15070a = c2555a;
    }

    public void doFrame(long j) {
        this.f15070a.f15067e = System.currentTimeMillis();
        this.f15070a.m19266a(this.f15070a.f15067e);
        if (this.f15070a.f15065c.size() > 0) {
            this.f15070a.m19267b().mo3150a(this);
        }
    }
}
