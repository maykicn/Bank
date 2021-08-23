package com.bank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillsPage extends BasePage {
    @FindBy(xpath = "//li[@id='pay_bills_tab']/a")
    public WebElement payBillsTab;

    @FindBy(xpath = "//input[@id='sp_amount']")
    public WebElement amountInpt;

    @FindBy(xpath = "//input[@id='sp_date']")
    public WebElement dateInpt;

    @FindBy(xpath = "//div[@id='alert_content']//span")
    public WebElement succesfullyMessage;

    @FindBy(xpath = "//input[@id='pay_saved_payees']")
    public WebElement payBttn;



}
