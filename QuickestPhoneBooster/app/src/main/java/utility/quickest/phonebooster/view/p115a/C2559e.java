package utility.quickest.phonebooster.view.p115a;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;

/* compiled from: AnimationHandler */
class C2559e implements C2558d {
    final Choreographer f15071a;
    final /* synthetic */ C2555a f15072b;

    private C2559e(C2555a c2555a) {
        this.f15072b = c2555a;
        this.f15071a = Choreographer.getInstance();
    }

    public void mo3150a(FrameCallback frameCallback) {
        this.f15071a.postFrameCallback(frameCallback);
    }
}
