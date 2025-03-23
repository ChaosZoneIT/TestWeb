package org.example.pageObject;

import static com.codeborne.selenide.Selenide.open;

public class BasePage {

    public static void openBasePage() {
        open("https://t-mobile.pl");
    }
}
