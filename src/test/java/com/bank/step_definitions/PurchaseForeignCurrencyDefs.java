package com.bank.step_definitions;

import com.bank.pages.PurchaseForeignCurrencyPage;
import com.bank.utilities.BrowserUtils;
import com.bank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class PurchaseForeignCurrencyDefs {
    PurchaseForeignCurrencyPage purchaseForeignCurrencyPage = new PurchaseForeignCurrencyPage();

    @Given("the user accesses the Purchase foreign currency cash tab")
    public void the_user_accesses_the_Purchase_foreign_currency_cash_tab() {

        purchaseForeignCurrencyPage.purchaseForeignCurrencyTab.click();

    }

    @Then("following currencies should be available")
    public void following_currencies_should_be_available(List<String> expectedSelectList) {
        Boolean flag = false;
        String error="";
        String actual="";
        WebElement selectElement = purchaseForeignCurrencyPage.currencySelect;
        Select select = new Select(selectElement);
        List<WebElement> actualSelectList = select.getOptions();



        outside:for (String expected : expectedSelectList) {
            for (WebElement actualElement : actualSelectList) {
                if (expected.equals(actualElement.getText())) {
                    flag = true;
                    error="";
                    actual="";
                    continue outside;
                }else{
                    error = expected;
                    actual=actualElement.getText();
                }


            }

            if(!error.equals("")){
                flag=false;
                System.out.println(error+" is not available");
                Assert.assertEquals(expected,actual);
                break outside;
            }
        }

        Assert.assertTrue(flag);
    }

    @When("user tries to calculate cost without selecting a currency")
    public void user_tries_to_calculate_cost_without_selecting_a_currency() {

        purchaseForeignCurrencyPage.currencyAmount.sendKeys("100");
        purchaseForeignCurrencyPage.calculateCostBttn.click();

    }

    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {

        String expectedAlertMessage = Driver.get().switchTo().alert().getText();
        Assert.assertNotEquals(expectedAlertMessage,"");

    }

    @When("user tries to calculate cost without entering a value")
    public void user_tries_to_calculate_cost_without_entering_a_value() {

        Select select=new Select(purchaseForeignCurrencyPage.currencySelect);
        select.selectByIndex(2);
        purchaseForeignCurrencyPage.selectedCurrencyRadioBttn.click();
        purchaseForeignCurrencyPage.calculateCostBttn.click();
    }


}




