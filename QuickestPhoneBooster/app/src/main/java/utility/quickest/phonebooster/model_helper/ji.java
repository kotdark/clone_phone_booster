package utility.quickest.phonebooster.model_helper;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: TemperatureModel */
final class ji implements FilenameFilter {
    ji() {
    }

    public boolean accept(File file, String str) {
        return str != null && str.startsWith("thermal_zone");
    }
}
