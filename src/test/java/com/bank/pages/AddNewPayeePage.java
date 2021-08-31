package com.bank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewPayeePage extends BasePage{

    @FindBy(xpath = "//li[@id='pay_bills_tab']/a")
    public WebElement payBillsTab;

    @FindBy(xpath = "//li[contains(a,'Add New Payee')]")
    public WebElement addNewPayeeTab;

    @FindBy(xpath = "//input[@id='np_new_payee_name']")
    public WebElement payeeName;

    @FindBy(xpath = "//textarea[@id='np_new_payee_address']")
    public WebElement payeeAddress;

    @FindBy(xpath = "//input[@id='np_new_payee_account']")
    public WebElement account;

    @FindBy(xpath = "//input[@id='np_new_payee_details']")
    public WebElement payeeDetails;

    @FindBy(xpath = "//div[@id='alert_content']")
    public WebElement messageText;

    @FindBy(xpath = "//input[@id='add_new_payee']")
    public WebElement addBttn;









}
