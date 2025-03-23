package org.example.pageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DeviceWithoutSubscriptionMenuPage {
    private static final SelenideElement smartphone = $(By.xpath("//a[contains(@href, 'kategoria/telefony/lista/produkty?hardwareOnlySale=true')]"));

    public static void clickSmartphoneWithoutSubscript() {
        smartphone.click();
    }
}
