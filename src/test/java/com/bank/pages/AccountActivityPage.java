package com.bank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountActivityPage extends BasePage {
    @FindBy(xpath = "//li[@id='account_activity_tab']/a")
    public WebElement accountActivityTab;

    @FindBy(xpath = "//select[@id='aa_accountId']")
    public WebElement accountDropdown;

    @FindBy(xpath = "//div[@id='all_transactions_for_account']//table//tr//th")
    public List<WebElement> transactionsTableColumn;


}
