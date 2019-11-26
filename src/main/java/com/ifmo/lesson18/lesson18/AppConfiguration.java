package com.itmo.patterns;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by xmitya on 01.12.16.
 */
public class AppConfiguration {
    private static final File CFG_FILE = new File("app_config.properties");

    private static AppConfiguration instance;

    private final Properties properties;

    private AppConfiguration() {
        properties = new Properties();

        try {
            properties.load(new FileInputStream(CFG_FILE));
        } catch (IOException e) {
            throw new IllegalStateException("Unable load application configuration: "
                    + CFG_FILE.getAbsolutePath(), e);
        }
    }

    public static AppConfiguration getConfiguration() {
        if (instance == null)
            instance = new AppConfiguration();

        return instance;
    }

    public String getParam(String key) {
        return properties.getProperty(key);
    }


}
