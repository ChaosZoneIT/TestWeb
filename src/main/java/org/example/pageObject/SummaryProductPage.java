package org.example.pageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SummaryProductPage {

    private static final SelenideElement summaryProductContainer = $(By.xpath("//div[contains(@class, 'StyledStickySideBar')]//div[contains(@class, 'StyledPriceInfoWrapper')]"));
    private static final SelenideElement firstPayment = summaryProductContainer.find(By.xpath(".//div[@data-qa='PRD_TotalUpfront']//div[@class='sc-feUZmu gSyZgc dt_typography variant_h4']"));

    private static final SelenideElement monthlyPayment = summaryProductContainer.find(By.xpath(".//div[contains(@class,'priceRightSection')]//div[@class='dt_price_change']/div"));

    private static final SelenideElement addBasketBtn = summaryProductContainer.find(By.xpath(".//button[@data-qa='PRD_AddToBasket']"));

    public static String getFirstPayment() {
        return firstPayment.innerHtml();
    }

    public static String getMonthlyPayment() {
        return monthlyPayment.innerHtml();
    }

    public static void clickAddToBasket() {
        addBasketBtn.click();
    }
}
