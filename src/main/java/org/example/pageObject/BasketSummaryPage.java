package org.example.pageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasketSummaryPage {
    private static final SelenideElement basketSummaryContainer = $(By.xpath("//div[@id='basketSummary']"));
    private static final SelenideElement firstPaymentValue = basketSummaryContainer.find(By.xpath(".//span[@data-qa='BKT_TotalupFront']"));
    private static final SelenideElement firstPaymentCurrency = basketSummaryContainer.find(By.xpath(".//span[@data-qa='BKT_TotalupFrontSymbol']"));

    private static final SelenideElement monthlyPaymentValue = basketSummaryContainer.find(By.xpath(".//span[@data-qa='BKT_TotalMonthly']"));
    private static final SelenideElement monthlyPaymentCurrency = basketSummaryContainer.find(By.xpath(".//span[@data-qa='BKT_TotalMonthlySymbol']"));

    public static String getFullFirstPayment() {
        return firstPaymentValue.innerText() + " " + firstPaymentCurrency.innerText();
    }

    public static String getFullMonthlyPayment() {
        return monthlyPaymentValue.innerText() + " " + monthlyPaymentCurrency.innerText();
    }
}
