package com.bank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchaseForeignCurrencyPage extends BasePage {

    @FindBy(xpath = "//li[contains(a,'Purchase Foreign Currency')]")
    public WebElement purchaseForeignCurrencyTab;

    @FindBy(xpath = "//select[@id='pc_currency']")
    public WebElement currencySelect;

    @FindBy(xpath = "//input[@id='pc_amount']")
    public WebElement currencyAmount;

    @FindBy(xpath = "//input[@id='pc_calculate_costs']")
    public WebElement calculateCostBttn;

    @FindBy(xpath = "//input[@id='pc_inDollars_false']")
    public WebElement selectedCurrencyRadioBttn;




}
