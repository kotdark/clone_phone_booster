package utility.quickest.phonebooster.push;

import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.util.ThreadUtil;

public final class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {
    public void onTokenRefresh() {
        WakeLock newWakeLock;
        String token;
        super.onTokenRefresh();
        try {
            newWakeLock = ((PowerManager) MyApplicationLike.getApplication().getSystemService("power")).newWakeLock(1, getClass().getSimpleName());
        } catch (Exception e) {
            newWakeLock = null;
        }
        if (newWakeLock != null) {
            try {
                newWakeLock.acquire();
            } catch (Exception e2) {
            }
        }
        try {
            token = FirebaseInstanceId.getInstance().getToken();
        } catch (Exception e3) {
            token = null;
        }
        ThreadUtil.m19099a(false, new C2529a(this, token, newWakeLock));
    }
}
