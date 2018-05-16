package utility.quickest.phonebooster.push;

import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.util.ThreadUtil;

public final class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        WakeLock newWakeLock;
        super.onMessageReceived(remoteMessage);
        try {
            newWakeLock = ((PowerManager) MyApplicationLike.getApplication().getSystemService(Context.POWER_SERVICE)).newWakeLock(1, getClass().getSimpleName());
        } catch (Exception e) {
            newWakeLock = null;
        }
        if (newWakeLock != null) {
            try {
                newWakeLock.acquire();
            } catch (Exception e2) {
            }
        }
        ThreadUtil.m19099a(false, new C2530b(this, remoteMessage, newWakeLock));
    }
}
