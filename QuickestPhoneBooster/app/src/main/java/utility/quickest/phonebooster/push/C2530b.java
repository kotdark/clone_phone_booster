package utility.quickest.phonebooster.push;

import android.os.PowerManager.WakeLock;
import com.google.firebase.messaging.RemoteMessage;
import utility.quickest.phonebooster.model_helper.hq;

/* compiled from: MyFirebaseMessagingService */
class C2530b implements Runnable {
    final /* synthetic */ RemoteMessage f14526a;
    final /* synthetic */ WakeLock f14527b;
    final /* synthetic */ MyFirebaseMessagingService f14528c;

    C2530b(MyFirebaseMessagingService myFirebaseMessagingService, RemoteMessage remoteMessage, WakeLock wakeLock) {
        this.f14528c = myFirebaseMessagingService;
        this.f14526a = remoteMessage;
        this.f14527b = wakeLock;
    }

    public void run() {
        hq.m18670a().m18674a(this.f14526a, this.f14527b);
    }
}
