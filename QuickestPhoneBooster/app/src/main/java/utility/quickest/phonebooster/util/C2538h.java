package utility.quickest.phonebooster.util;

/* compiled from: EicarVirusUtil */
public final class C2538h {
    private static final String f14699a = C2542m.m19077a("WDVPIVAlQEFQWzRcUFpYNTQoUF4pN0NDKTd9JEVJQ0FSLVNUQU5EQVJELUFOVElWSVJVUy1URVNULUZJTEUhJEgrSCo=", false).trim();

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m19060a(java.lang.String r10) {
        /*
        r1 = 0;
        r3 = new java.util.zip.ZipFile;	 Catch:{ Throwable -> 0x008d, all -> 0x0077 }
        r0 = utility.quickest.phonebooster.util.C2535e.m19034c(r10);	 Catch:{ Throwable -> 0x008d, all -> 0x0077 }
        r3.<init>(r0);	 Catch:{ Throwable -> 0x008d, all -> 0x0077 }
        r4 = r3.entries();	 Catch:{ Throwable -> 0x0067, all -> 0x008b }
    L_0x000e:
        r0 = r4.hasMoreElements();	 Catch:{ Throwable -> 0x0067, all -> 0x008b }
        if (r0 == 0) goto L_0x0070;
    L_0x0014:
        r0 = r4.nextElement();	 Catch:{ Throwable -> 0x0055, all -> 0x005f }
        r0 = (java.util.zip.ZipEntry) r0;	 Catch:{ Throwable -> 0x0055, all -> 0x005f }
        r6 = r0.getSize();	 Catch:{ Throwable -> 0x0055, all -> 0x005f }
        r8 = 68;
        r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r2 != 0) goto L_0x004c;
    L_0x0024:
        r2 = new java.io.BufferedReader;	 Catch:{ Throwable -> 0x0055, all -> 0x005f }
        r5 = new java.io.InputStreamReader;	 Catch:{ Throwable -> 0x0055, all -> 0x005f }
        r0 = r3.getInputStream(r0);	 Catch:{ Throwable -> 0x0055, all -> 0x005f }
        r5.<init>(r0);	 Catch:{ Throwable -> 0x0055, all -> 0x005f }
        r2.<init>(r5);	 Catch:{ Throwable -> 0x0055, all -> 0x005f }
        r0 = f14699a;	 Catch:{ Throwable -> 0x0092, all -> 0x0090 }
        r5 = r2.readLine();	 Catch:{ Throwable -> 0x0092, all -> 0x0090 }
        r0 = r0.equals(r5);	 Catch:{ Throwable -> 0x0092, all -> 0x0090 }
        if (r0 == 0) goto L_0x004d;
    L_0x003e:
        r0 = "EICAR";
        if (r2 == 0) goto L_0x0046;
    L_0x0043:
        r2.close();	 Catch:{ Throwable -> 0x007f, all -> 0x008b }
    L_0x0046:
        if (r3 == 0) goto L_0x004b;
    L_0x0048:
        r3.close();	 Catch:{ Throwable -> 0x0081 }
    L_0x004b:
        return r0;
    L_0x004c:
        r2 = r1;
    L_0x004d:
        if (r2 == 0) goto L_0x000e;
    L_0x004f:
        r2.close();	 Catch:{ Throwable -> 0x0053, all -> 0x008b }
        goto L_0x000e;
    L_0x0053:
        r0 = move-exception;
        goto L_0x000e;
    L_0x0055:
        r0 = move-exception;
        r0 = r1;
    L_0x0057:
        if (r0 == 0) goto L_0x000e;
    L_0x0059:
        r0.close();	 Catch:{ Throwable -> 0x005d, all -> 0x008b }
        goto L_0x000e;
    L_0x005d:
        r0 = move-exception;
        goto L_0x000e;
    L_0x005f:
        r0 = move-exception;
        r2 = r1;
    L_0x0061:
        if (r2 == 0) goto L_0x0066;
    L_0x0063:
        r2.close();	 Catch:{ Throwable -> 0x0083, all -> 0x008b }
    L_0x0066:
        throw r0;	 Catch:{ Throwable -> 0x0067, all -> 0x008b }
    L_0x0067:
        r0 = move-exception;
        r0 = r3;
    L_0x0069:
        if (r0 == 0) goto L_0x006e;
    L_0x006b:
        r0.close();	 Catch:{ Throwable -> 0x0087 }
    L_0x006e:
        r0 = r1;
        goto L_0x004b;
    L_0x0070:
        if (r3 == 0) goto L_0x0075;
    L_0x0072:
        r3.close();	 Catch:{ Throwable -> 0x0085 }
    L_0x0075:
        r0 = r1;
        goto L_0x004b;
    L_0x0077:
        r0 = move-exception;
        r3 = r1;
    L_0x0079:
        if (r3 == 0) goto L_0x007e;
    L_0x007b:
        r3.close();	 Catch:{ Throwable -> 0x0089 }
    L_0x007e:
        throw r0;
    L_0x007f:
        r1 = move-exception;
        goto L_0x0046;
    L_0x0081:
        r1 = move-exception;
        goto L_0x004b;
    L_0x0083:
        r2 = move-exception;
        goto L_0x0066;
    L_0x0085:
        r0 = move-exception;
        goto L_0x0075;
    L_0x0087:
        r0 = move-exception;
        goto L_0x006e;
    L_0x0089:
        r1 = move-exception;
        goto L_0x007e;
    L_0x008b:
        r0 = move-exception;
        goto L_0x0079;
    L_0x008d:
        r0 = move-exception;
        r0 = r1;
        goto L_0x0069;
    L_0x0090:
        r0 = move-exception;
        goto L_0x0061;
    L_0x0092:
        r0 = move-exception;
        r0 = r2;
        goto L_0x0057;
        */
        throw new UnsupportedOperationException("Method not decompiled: utility.quickest.phonebooster.util.h.a(java.lang.String):java.lang.String");
    }
}
