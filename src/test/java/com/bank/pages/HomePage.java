package com.bank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//button[@id='signin_button']")
    public WebElement signinBttn;


}
