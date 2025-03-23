package org.example.utils;

import com.codeborne.selenide.Configuration;

public class WebDriverConfiguration {


    public WebDriverConfiguration() {
        AppProperties config = AppProperties.getInstance();
        String webDriver = config.getWebDriverPath();
        System.setProperty(config.getWebDriverName(), System.getProperty("user.dir") + webDriver);
        Configuration.browser = config.getWebBrowseName();
        Configuration.timeout = 5000;
        Configuration.browserSize = "1920x1080";
    }
}
