package com.bank.step_definitions;

import com.bank.pages.AccountActivityNavigationPage;
import com.bank.pages.AccountActivityPage;
import com.bank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;


public class AccountActivityNavigationDefs {
    AccountActivityNavigationPage accountActivityNavigationPage = new AccountActivityNavigationPage();
    @When("the user clicks on {string} link on the Account Summary page")
    public void the_user_clicks_on_link_on_the_Account_Summary_page(String link) {

        if (link.equals("Savings")) {
            accountActivityNavigationPage.savingLink.click();

        } else if (link.equals("Brokerage")) {
            accountActivityNavigationPage.brokerageLink.click();

        } else if (link.equals("Checking")) {
            accountActivityNavigationPage.checkingLink.click();

        } else if (link.equals("Credit Card")) {
            accountActivityNavigationPage.creditCardLink.click();

        } else if (link.equals("Loan")) {
            accountActivityNavigationPage.loanLink.click();

        }

    }

    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {
        String expectedTitle="Zero - Account Activity";
        String actualTitle= Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);


    }

    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String expectedSelectedtOption) {

        Select accountDropdown = new Select(accountActivityNavigationPage.accountDropdown);
        String actualDefaultOption = accountDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedSelectedtOption, actualDefaultOption);

    }


}
