package utility.quickest.phonebooster.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.content.FileProvider;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.GridView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import utility.quickest.phonebooster.adapter.ShareGridAdapter;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ViewUtil;
import com.mopub.volley.DefaultRetryPolicy;
import utility.quickest.phonebooster.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class ShareDialogTarget extends Dialog {
    private final Activity f14988a;
    private ShareGridAdapter f14989b;
    private ArrayList<cj> f14990c = new ArrayList();
    private long f14991d;
    private Bitmap f14992e;
    private File f14993f;
    private ci f14994g;
    @BindView
    protected GridView mShareGrid;

    @OnClick
    public void cancel() {
        dismiss();
    }

    public ShareDialogTarget(Activity activity, ci ciVar, long j) {
        super(activity);
        this.f14988a = activity;
        this.f14994g = ciVar;
        this.f14991d = j;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCancelable(false);
        setContentView(R.layout.dialog_share_target);
        ButterKnife.m2792a((Dialog) this);
        this.f14989b = new ShareGridAdapter(this.f14988a, this.mShareGrid);
        this.mShareGrid.setAdapter(this.f14989b);
        m19238a("");
        m19241b();
    }

    public void m19249a() {
        try {
            show();
        } catch (Exception e) {
        }
        try {
            Window window = getWindow();
            LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            window.setAttributes(attributes);
            window.setBackgroundDrawable(new ColorDrawable(0));
        } catch (Throwable th) {
        }
    }

    private void m19241b() {
        m19242c();
        m19244d();
        m19245e();
        m19246f();
        m19247g();
        m19248h();
        this.f14989b.m17354a(this.f14990c);
    }

    private void m19242c() {
        if (m19243c("com.facebook.katana")) {
            this.f14990c.add(new cc(this, R.drawable.ic_share_facebook));
        }
    }

    private void m19244d() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.facebook.orca", "com.facebook.messenger.intents.ShareIntentHandler"));
        intent.setAction("android.intent.action.SEND");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.TEXT", m19240b("http://m.onelink.me/c23d1f0d"));
        if (m19243c("com.facebook.orca") && m19239a(intent)) {
            this.f14990c.add(new cd(this, R.drawable.ic_share_messager, intent));
        }
    }

    private void m19245e() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.whatsapp", "com.whatsapp.ContactPicker"));
        intent.setAction("android.intent.action.SEND");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.TEXT", m19240b("http://m.onelink.me/f35a144d"));
        m19238a("");
        try {
            intent.putExtra("android.intent.extra.STREAM", FileProvider.getUriForFile(MyApplicationLike.getApplication(), "utility.quickest.phonebooster.fileprovider", this.f14993f));
        } catch (Throwable th) {
        }
        if (m19243c("com.whatsapp") && m19239a(intent)) {
            this.f14990c.add(new ce(this, R.drawable.ic_share_whatsapp, intent));
        }
    }

    private void m19246f() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("jp.naver.line.android", "jp.naver.line.android.activity.selectchat.SelectChatActivityLaunchActivity"));
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", m19240b("http://m.onelink.me/d10a631e"));
        if (m19243c("jp.naver.line.android") && m19239a(intent)) {
            this.f14990c.add(new cf(this, R.drawable.ic_share_line, intent));
        }
    }

    private void m19247g() {
        this.f14990c.add(new cg(this, R.drawable.ic_share_copylink));
    }

    private void m19248h() {
        this.f14990c.add(new ch(this, R.drawable.ic_share_more));
    }

    private void m19238a(String str) {
        FileOutputStream fileOutputStream;
        Throwable th;
        FileOutputStream fileOutputStream2 = null;
        try {
            Bitmap decodeResource = BitmapFactory.decodeResource(MyApplicationLike.getApplication().getResources(), R.drawable.ic_share);
            int width = decodeResource.getWidth();
            int height = decodeResource.getHeight();
            this.f14992e = Bitmap.createBitmap(width, height, Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f14992e);
            String str2 = "";
            if (this.f14991d <= 0) {
                str2 = MyApplicationLike.getApplication().getString(R.string.setting_share1);
            } else if (new Random().nextInt(2) == 0) {
                str2 = C2542m.m19078a(MyApplicationLike.getApplication().getString(R.string.share_content), C2542m.m19088b(this.f14991d));
            } else {
                str2 = C2542m.m19078a(MyApplicationLike.getApplication().getString(R.string.share_contentq1), C2542m.m19088b(this.f14991d));
            }
            if (!TextUtils.isEmpty(str)) {
                str2 = str2 + "  " + str;
            }
            canvas.drawColor(-1);
            canvas.drawBitmap(decodeResource, 0.0f, 0.0f, null);
            canvas.translate((float) (width / 4), (float) (height / 3));
            m19236a(str2, width, height, 30).draw(canvas);
            canvas.save(31);
            canvas.restore();
        } catch (Throwable th2) {
        }
        try {
            File file = new File(Environment.getExternalStorageDirectory(), "image_cache");
            file.mkdirs();
            this.f14993f = new File(file, "share_image.png");
            fileOutputStream = new FileOutputStream(this.f14993f);
            try {
                this.f14992e.compress(CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e2) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                fileOutputStream2 = fileOutputStream;
                th = th4;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            fileOutputStream = null;
            if (fileOutputStream != null) {
                fileOutputStream.flush();
                fileOutputStream.close();
            }
        } catch (Throwable th5) {
            th = th5;
            if (fileOutputStream2 != null) {
                fileOutputStream2.flush();
                fileOutputStream2.close();
            }
            throw th;
        }
    }

    private StaticLayout m19236a(String str, int i, int i2, int i3) {
        TextPaint textPaint = new TextPaint();
        textPaint.setDither(true);
        textPaint.setFilterBitmap(true);
        textPaint.setColor(-1);
        textPaint.setTextSize((float) ViewUtil.m18918a((float) i3));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, i / 2, Alignment.ALIGN_NORMAL, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT, 0.0f, false);
        if (i2 > 0 && staticLayout.getHeight() > (i2 * 2) / 3) {
            return m19236a(str, i, i2, i3 - 1);
        }
        return staticLayout;
    }

    private String m19240b(String str) {
        String str2 = "";
        if (this.f14991d <= 0) {
            return MyApplicationLike.getApplication().getString(R.string.setting_share1) + "\n" + str;
        }
        if (new Random().nextInt(2) == 0) {
            return C2542m.m19078a(MyApplicationLike.getApplication().getString(R.string.share_content), C2542m.m19088b(this.f14991d)) + "\n" + str;
        }
        return C2542m.m19078a(MyApplicationLike.getApplication().getString(R.string.share_contentq1), C2542m.m19088b(this.f14991d)) + "\n" + str;
    }

    private boolean m19239a(Intent intent) {
        return MyApplicationLike.getApplication().getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }

    private boolean m19243c(String str) {
        try {
            MyApplicationLike.getApplication().getPackageManager().getPackageInfo(str, 4096);
            return true;
        } catch (Throwable th) {
            return false;
        }
    }
}
