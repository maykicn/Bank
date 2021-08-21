package com.bank.step_definitions;

import com.bank.pages.AccountSummaryPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccountSummaryDefs {

    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();


    @Then("verify that the page has {string}")
    public void verify_that_the_page_has(String expectedAccountType) {
        String actualAccountType = null;
        List<WebElement> accountTypes = accountSummaryPage.accountTypes;
        for (int i = 0; i < accountTypes.size(); i++) {
            if (expectedAccountType.equals(accountTypes.get(i).getText())) {
                actualAccountType = accountTypes.get(i).getText();
            }
        }
        Assert.assertEquals(expectedAccountType, actualAccountType);

    }

    @Then("verify that Credit Account has columns {string}")
    public void verify_that_Credit_Account_has_columns(String expectedColumnName) {
        String actualColumnName = null;
        for (WebElement column : accountSummaryPage.creditAccountColumn) {
            if (expectedColumnName.equals(column.getText())) {
                actualColumnName = column.getText();
            }
        }
        Assert.assertEquals(expectedColumnName, actualColumnName);


    }

}