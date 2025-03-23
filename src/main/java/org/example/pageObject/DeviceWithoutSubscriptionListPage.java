package org.example.pageObject;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class DeviceWithoutSubscriptionListPage {

    private static final ElementsCollection smartphones = $$(By.xpath("//div[contains(@class, 'StyledCards')]/div[contains(@class, 'StyledCard')]"));

    public static void clickSmartphoneWithoutSubscriptOnList(Integer position) {
        smartphones.get(position).find("a").click();
    }
}
