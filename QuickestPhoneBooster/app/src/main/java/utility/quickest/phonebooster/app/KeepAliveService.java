package utility.quickest.phonebooster.app;

import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.support.v4.app.NotificationCompat.Builder;
import android.support.v4.view.PointerIconCompat;
import utility.quickest.phonebooster.activity.MainActivity;
import utility.quickest.phonebooster.R;

public final class KeepAliveService extends Service {
    private final BroadcastReceiver f12973a = new C2414b();

    public final class HelperService extends Service {
        public int onStartCommand(Intent intent, int i, int i2) {
            try {
                Context a = MyApplicationLike.getApplication();
                CharSequence string = a.getString(R.string.app_name);
                Intent intent2 = new Intent(a, MainActivity.class);
                intent2.setFlags(335544320);
                startForeground(PointerIconCompat.TYPE_CONTEXT_MENU, new Builder(a).setSmallIcon(R.drawable.ic_launcher).setContentTitle(string).setContentText(string).setContentIntent(PendingIntent.getActivity(a, 0, intent2, 134217728)).build());
                stopSelf();
            } catch (Throwable th) {
            }
            return super.onStartCommand(intent, i, i2);
        }

        public IBinder onBind(Intent intent) {
            return null;
        }
    }

    public void onCreate() {
        super.onCreate();
        registerReceiver(this.f12973a, new IntentFilter("android.intent.action.SCREEN_ON"));
        registerReceiver(this.f12973a, new IntentFilter("android.intent.action.SCREEN_OFF"));
        registerReceiver(this.f12973a, new IntentFilter("android.intent.action.USER_PRESENT"));
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (VERSION.SDK_INT < 24) {
            try {
                Context a = MyApplicationLike.getApplication();
                CharSequence string = a.getString(R.string.app_name);
                Intent intent2 = new Intent(a, MainActivity.class);
                intent2.setFlags(335544320);
                startForeground(PointerIconCompat.TYPE_CONTEXT_MENU, new Builder(a).setSmallIcon(R.drawable.ic_launcher).setContentTitle(string).setContentText(string).setContentIntent(PendingIntent.getActivity(a, 0, intent2, 134217728)).build());
                startService(new Intent(this, HelperService.class));
            } catch (Throwable th) {
            }
        }
        return 1;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }
}
