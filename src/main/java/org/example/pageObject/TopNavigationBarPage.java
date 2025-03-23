package org.example.pageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TopNavigationBarPage {
    private static final SelenideElement device = $(new By.ByCssSelector("#main-menu ul.menu.level-1 li:first-child button[aria-haspopup='menu']"));
    private static final SelenideElement quantityInBasket = $(By.xpath("//a[@data-ga-ea='basket']//div"));


    public static void clickMenuDevice() {
        device.click();
    }

    public static Integer getQuantityInBasket() {
        return Integer.parseInt(quantityInBasket.innerText());
    }
}
