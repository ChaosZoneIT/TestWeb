package org.example.utils;

import java.io.*;
import java.util.Properties;

public final class AppProperties {

    private static final String CONFIG_PATH = System.getProperty("user.dir") + "/src/test/resources/config.properties";
    private Properties prop;
    private static AppProperties instance = null;

    private AppProperties() {
        prop = new Properties();
        try (FileInputStream input = new FileInputStream(CONFIG_PATH)) {
            prop.load(input);
        } catch (IOException io) {
            prop = null;
            io.printStackTrace();
        }
    }

    public static synchronized AppProperties getInstance() {
        if (instance == null) {
            instance = new AppProperties();
        }
        return instance;

    }

    public String getWebDriverPath() {
        if (prop != null) {
            return prop.getProperty("webDiver", "Webdriver not set");
        }
        return "";
    }

    public String getWebDriverName() {
        if (prop != null) {
            return prop.getProperty("webDiverName", "WebdriverName not set");
        }
        return "";
    }

    public String getWebBrowseName() {
        if (prop != null) {
            return prop.getProperty("browse", "Browse not set");
        }
        return "";
    }
}
