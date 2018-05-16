package utility.quickest.phonebooster.app;

import android.app.Application;
import android.content.Context;

public final class MyGeneratedApplication extends Application {
    private final MyApplicationLike mMyApplicationLike = new MyApplicationLike(this);

    public void onCreate() {
        super.onCreate();
        this.mMyApplicationLike.m17432c();
    }

    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        this.mMyApplicationLike.m17428a(context);
    }
}
