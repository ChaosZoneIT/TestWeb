package org.example.pageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CookiesPage {
    private static final SelenideElement onlyRequired = $(By.id("didomi-notice-disagree-button"));

    public static void acceptRequiredCookies() {
        onlyRequired.click();
    }
}
