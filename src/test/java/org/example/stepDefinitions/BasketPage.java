package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.utils.WebDriverConfiguration;

import static org.example.pageObject.BasePage.openBasePage;
import static org.example.pageObject.BasketSummaryPage.getFullFirstPayment;
import static org.example.pageObject.BasketSummaryPage.getFullMonthlyPayment;
import static org.example.pageObject.CookiesPage.acceptRequiredCookies;
import static org.example.pageObject.DeviceWithoutSubscriptionListPage.clickSmartphoneWithoutSubscriptOnList;
import static org.example.pageObject.DeviceWithoutSubscriptionMenuPage.clickSmartphoneWithoutSubscript;
import static org.example.pageObject.SummaryProductPage.*;
import static org.example.pageObject.TopNavigationBarPage.clickMenuDevice;
import static org.example.pageObject.TopNavigationBarPage.getQuantityInBasket;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketPage extends WebDriverConfiguration {

    String firstPaymentInDescriptionProduct;
    String monthlyPaymentInDescriptionProduct;

    @Given("User navigation to device without subscription")
    public void user_navigation_to_device_without_subscription() {
        openBasePage();
        acceptRequiredCookies();
        clickMenuDevice();
        clickSmartphoneWithoutSubscript();
        clickSmartphoneWithoutSubscriptOnList(1);
    }

    @When("User add device to basket")
    public void user_add_device_to_basket() {
        firstPaymentInDescriptionProduct = getFirstPayment();
        monthlyPaymentInDescriptionProduct = getMonthlyPayment();
        clickAddToBasket();
    }

    @Then("Device has the same price on page nad basket and basket has one product")
    public void device_has_the_same_price_on_page_nad_basket_and_basket_has_one_product() {
        String firstPayment = getFullFirstPayment();
        String monthlyPayment = getFullMonthlyPayment();

        assertEquals(firstPaymentInDescriptionProduct, firstPayment, "First payment value");
        assertEquals(monthlyPaymentInDescriptionProduct, monthlyPayment, "Monthly payment value");
        openBasePage();
        Integer count = getQuantityInBasket();
        assertEquals(1, count);
    }

}
