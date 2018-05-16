package utility.quickest.phonebooster.p114d;

import java.io.File;

/* compiled from: FolderJunkInfo */
public final class C2451i {
    private final File f13107a;
    private final long f13108b;

    public static C2451i m17674a(File file, long j) {
        try {
            return new C2451i(file, j);
        } catch (Exception e) {
            return null;
        }
    }

    private C2451i(File file, long j) {
        if (file == null) {
            throw new IllegalArgumentException("folderFile is null!");
        }
        this.f13107a = file;
        if (j <= 0) {
            throw new IllegalArgumentException("junkSize is less or equal zero!");
        }
        this.f13108b = j;
    }

    public File m17675a() {
        return this.f13107a;
    }

    public long m17676b() {
        return this.f13108b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2451i) {
            return this.f13107a.equals(((C2451i) obj).f13107a);
        }
        return false;
    }

    public int hashCode() {
        return this.f13107a.hashCode();
    }
}
