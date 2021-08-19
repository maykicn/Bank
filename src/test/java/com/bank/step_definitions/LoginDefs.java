package com.bank.step_definitions;

import com.bank.pages.LoginPage;
import com.bank.pages.HomePage;
import com.bank.utilities.BrowserUtils;
import com.bank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.Keys;



public class LoginDefs {


    @When("click {string}")
    public void click_button(String icon) {
        if (icon.equals("signin")) {
            new HomePage().signinBttn.click();
        } else if (icon.equals("sign in")) {
            LoginPage loginPage=new LoginPage();
            loginPage.logInBttn.click();
            loginPage.advancedBttn.click();
            loginPage.proceedLink.click();

        }

    }
   @When("enter valid credentials")
    public void enter_valid_credentials() {

        new LoginPage().login();

    }

    @Then("verify that {string} page is displayed")
    public void verify_that_page_is_displayed(String expectedTitle) {
        String actualTitle = Driver.get().getTitle();
        BrowserUtils.waitForPageToLoad(5);
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @When("enter with keyword")
    public void enter_with_keyword() {
        LoginPage loginPage=new LoginPage();
        loginPage.logInBttn.sendKeys(Keys.ENTER);
        loginPage.advancedBttn.click();
        loginPage.proceedLink.click();

    }

    @When("enter {string} username and {string} password")
    public void enter_username_and_password(String username, String password) {
        new LoginPage().login(username,password);

    }

    @When("click {string} with invalid credentials")
    public void click_with_invalid_credentials(String string) {
       new LoginPage().logInBttn.click();

    }


    @Then("Verify that {string} error message is displayed")
    public void verify_that_error_message_is_displayed(String expectedError) {
       String actualTitle=new LoginPage().errorMessage.getText();
       Assert.assertEquals(expectedError,actualTitle);

    }

}
