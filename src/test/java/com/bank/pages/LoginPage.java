package com.bank.pages;

import com.bank.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@id='user_login']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='user_password']")
    public WebElement password;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement logInBttn;

    @FindBy(xpath = "//button[@id='details-button']")
    public WebElement advancedBttn;

    @FindBy(xpath = "//a[@id='proceed-link']")
    public WebElement proceedLink;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement errorMessage;

    public void login(){
        LoginPage loginPage= new LoginPage();
        loginPage.username.sendKeys(ConfigurationReader.get("username"));
        loginPage.password.sendKeys(ConfigurationReader.get("password"));

    }
    public void login(String username,String password){
        LoginPage loginPage= new LoginPage();
        loginPage.username.sendKeys(username);
        loginPage.password.sendKeys(password);


    }




}
