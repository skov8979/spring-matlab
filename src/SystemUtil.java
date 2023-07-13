package io.threatrix.util;

import io.threatrix.config.StaticConfig;

import java.io.File;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class SystemUtil {

    private static final Runtime runtime = Runtime.getRuntime();

    public static File getUserWorkingDir() {
        return new File(System.getProperty("user.home"),".threatrix");
    }
}
