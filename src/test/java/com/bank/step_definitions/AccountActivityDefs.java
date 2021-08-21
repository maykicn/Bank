package com.bank.step_definitions;

import com.bank.pages.AccountActivityPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityDefs {

    AccountActivityPage accountActivityPage = new AccountActivityPage();

    @Then("verify that default option is {string}")
    public void verify_that_default_option_is(String expectedDefaultOption) {
        Select accountDropdown = new Select(accountActivityPage.accountDropdown);
        String actualDefaultOption = accountDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedDefaultOption, actualDefaultOption);
    }

    @Then("verify that account dropdown has {string}")
    public void verify_that_account_dropdown_has(String expectedOptions) {
        String actualOption = null;
        Select accountDropdown = new Select(accountActivityPage.accountDropdown);
        List<WebElement> options = accountDropdown.getOptions();
        for (WebElement option : options) {
            if (option.getText().equals(expectedOptions)) {
                actualOption = option.getText();
            }
        }
        Assert.assertEquals(expectedOptions, actualOption);


    }


    @Then("verify that Show Transactions table has {string}")
    public void verify_that_Show_Transactions_table_has(String expectedColumn) {
        String actualColumn = null;
        for (WebElement element : accountActivityPage.transactionsTableColumn) {
            if (element.getText().equals(expectedColumn)) {
                actualColumn = element.getText();
            }
        }
        Assert.assertEquals(expectedColumn, actualColumn);


    }


}
