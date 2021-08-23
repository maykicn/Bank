package com.bank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountActivityNavigationPage extends BasePage {

    @FindBy(xpath = "//a[contains(.,'Savings')]")
    public WebElement savingLink;

    @FindBy(xpath = "//a[contains(.,'Brokerage')]")
    public WebElement brokerageLink;

    @FindBy(xpath = "//a[contains(.,'Checking')]")
    public WebElement checkingLink;

    @FindBy(xpath = "//a[contains(.,'Credit Card')]")
    public WebElement creditCardLink;

    @FindBy(xpath = "//a[contains(.,'Loan')]")
    public WebElement loanLink;

    @FindBy(xpath = "//select[@id='aa_accountId']")
    public WebElement accountDropdown;





}
