package utility.quickest.phonebooster.util;

import android.text.TextUtils;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.network.C2522c;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import okhttp3.bk;
import p022b.as;

/* compiled from: FileUtil */
public final class C2541l {
    private static String f14707a = null;

    public static File m19069a(String str, String str2) {
        Throwable th;
        OutputStream outputStream;
        InputStream inputStream;
        if (str != null) {
            str = str.trim();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str2 != null) {
            str2 = str2.trim();
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        File file = new File(str2);
        file.delete();
        try {
            as a = C2522c.m18847a().m18838a(str).mo1131a();
            if (a == null || !a.m2658a()) {
                return null;
            }
            byte[] bArr = new byte[2048];
            try {
                InputStream bufferedInputStream = new BufferedInputStream(((bk) a.m2659b()).m2775c());
                try {
                    OutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        if (read < 0) {
                            break;
                        }
                        try {
                            bufferedOutputStream.write(bArr, 0, read);
                        } catch (Throwable th2) {
                            th = th2;
                            outputStream = bufferedOutputStream;
                            inputStream = bufferedInputStream;
                        }
                    }
                    bufferedOutputStream.flush();
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e) {
                        }
                    }
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.flush();
                            bufferedOutputStream.close();
                        } catch (IOException e2) {
                        }
                    }
                    return file;
                } catch (Throwable th3) {
                    th = th3;
                    outputStream = null;
                    inputStream = bufferedInputStream;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e3) {
                        }
                    }
                    if (outputStream != null) {
                        try {
                            outputStream.flush();
                            outputStream.close();
                        } catch (IOException e4) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                outputStream = null;
                inputStream = null;
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.flush();
                    outputStream.close();
                }
                throw th;
            }
        } catch (IOException e5) {
            return null;
        }
    }

    public static long m19067a(File file) {
        long j = 0;
        try {
            for (File file2 : file.listFiles()) {
                try {
                    if (file2.isFile()) {
                        j += file2.length();
                    }
                } catch (Throwable th) {
                }
            }
        } catch (Throwable th2) {
        }
        return j;
    }

    public static void m19070b(File file) {
        try {
            for (File file2 : file.listFiles()) {
                try {
                    if (file2.isFile()) {
                        file2.delete();
                    }
                } catch (Throwable th) {
                }
            }
        } catch (Throwable th2) {
        }
    }

    public static synchronized File m19068a(String str) {
        File file = null;
        synchronized (C2541l.class) {
            if (str != null) {
                str = str.trim();
            }
            if (!TextUtils.isEmpty(str)) {
                if (f14707a == null) {
                    try {
                        String absolutePath = MyApplicationLike.getApplication().getExternalCacheDir().getAbsolutePath();
                        if (absolutePath.contains("utility.quickest.phonebooster")) {
                            f14707a = absolutePath.replace("utility.quickest.phonebooster", "%s");
                        }
                    } catch (Throwable th) {
                    }
                }
                if (f14707a != null) {
                    try {
                        file = new File(String.format(f14707a, new Object[]{str}));
                    } catch (Throwable th2) {
                    }
                }
            }
        }
        return file;
    }

    public static String m19071c(File file) {
        Throwable th;
        String str = null;
        BufferedReader bufferedReader;
        try {
            StringBuilder stringBuilder = new StringBuilder();
            bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    Object trim = readLine.trim();
                    if (!TextUtils.isEmpty(trim)) {
                        if (stringBuilder.length() > 0) {
                            stringBuilder.append("\n");
                        }
                        stringBuilder.append(trim);
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            str = stringBuilder.toString();
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                }
            }
        } catch (Throwable th4) {
            Throwable th5 = th4;
            bufferedReader = null;
            th = th5;
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Throwable th6) {
                }
            }
            throw th;
        }
        return str;
    }

    public static String m19072d(File file) {
        try {
            if (file.isFile()) {
                String name = file.getName();
                int lastIndexOf = name.lastIndexOf(46);
                if (lastIndexOf >= 0) {
                    return name.substring(lastIndexOf + 1);
                }
            }
        } catch (Throwable th) {
        }
        return "";
    }
}
