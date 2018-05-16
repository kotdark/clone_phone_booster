package utility.quickest.phonebooster.p114d;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import utility.quickest.phonebooster.util.C2541l;
import java.io.File;

/* compiled from: ApkFileInfo */
public final class C2444b {
    private final File f13072a;
    private final long f13073b;
    private final String f13074c;
    private final String f13075d;
    private final Drawable f13076e;
    private final int f13077f;
    private final String f13078g;

    public static C2444b m17613a(File file, PackageManager packageManager) {
        try {
            return new C2444b(file, packageManager);
        } catch (Throwable th) {
            return null;
        }
    }

    private C2444b(File file, PackageManager packageManager) {
        Drawable drawable = null;
        if (packageManager == null) {
            throw new IllegalArgumentException("packageManager is null!");
        } else if (file == null) {
            throw new IllegalArgumentException("file is null!");
        } else if (!file.exists()) {
            throw new IllegalArgumentException("file is not exist!");
        } else if (C2541l.m19072d(file).trim().equalsIgnoreCase("apk")) {
            this.f13072a = file;
            this.f13073b = this.f13072a.length();
            PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(this.f13072a.getAbsolutePath(), 128);
            if (packageArchiveInfo == null) {
                throw new IllegalArgumentException("file is not valid!");
            }
            this.f13074c = packageArchiveInfo.packageName == null ? "" : packageArchiveInfo.packageName.trim();
            if (TextUtils.isEmpty(this.f13074c)) {
                throw new IllegalArgumentException("the package name of file is empty!");
            }
            String trim;
            try {
                trim = packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f13074c, 128)).toString().trim();
            } catch (Throwable th) {
                Object obj = drawable;
            }
            if (TextUtils.isEmpty(trim)) {
                trim = this.f13072a.getName();
            }
            this.f13075d = trim == null ? "" : trim.trim();
            try {
                drawable = packageManager.getApplicationIcon(this.f13074c);
            } catch (Throwable th2) {
            }
            this.f13076e = drawable;
            this.f13077f = packageArchiveInfo.versionCode;
            this.f13078g = packageArchiveInfo.versionName == null ? "" : packageArchiveInfo.versionName;
        } else {
            throw new IllegalArgumentException("file is not apk!");
        }
    }

    public File m17614a() {
        return this.f13072a;
    }

    public long m17615b() {
        return this.f13073b;
    }

    public String m17616c() {
        return this.f13074c;
    }

    public String m17617d() {
        return this.f13075d;
    }

    public Drawable m17618e() {
        return this.f13076e;
    }

    public int m17619f() {
        return this.f13077f;
    }

    public String m17620g() {
        return this.f13078g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2444b) {
            return this.f13072a.equals(((C2444b) obj).f13072a);
        }
        return false;
    }

    public int hashCode() {
        return this.f13072a.hashCode();
    }
}
