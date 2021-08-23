package com.bank.step_definitions;

import com.bank.pages.PayBillsPage;
import com.bank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class PayBillsDefs {
    PayBillsPage payBillsPage = new PayBillsPage();

    @When("Enter amount to be sent {string}")
    public void enter_amount_to_be_sent(String amount) {
        payBillsPage.amountInpt.sendKeys(amount);
    }

    @When("Enter date {string}")
    public void enter_date(String date) {
        payBillsPage.dateInpt.sendKeys(date);

    }

    @Then("verify that {string} mesagge is displayed")
    public void verify_that_mesagge_is_displayed(String expectedSuccesfullyMessage) {
        String actualSuccesfullyMessage = payBillsPage.succesfullyMessage.getText();
        Assert.assertEquals(expectedSuccesfullyMessage, actualSuccesfullyMessage);
    }

    @When("try without amount to be sent {string}")
    public void try_without_amount_to_be_sent(String amount) {
        payBillsPage.amountInpt.sendKeys(amount);

    }

    @When("try without date {string}")
    public void try_without_date(String date) {
        payBillsPage.dateInpt.sendKeys(date);
    }


    @Then("verify that error {string} mesagge is displayed with {string}")
    public void verify_that_error_mesagge_is_displayed_with(String expectedErrorMessage, String input) {
        String actualErrorMessage = null;
        if (input.equals("amount")) {
            actualErrorMessage = payBillsPage.amountInpt.getAttribute("validationMessage");
            Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
        } else if (input.equals("date")) {
            actualErrorMessage = payBillsPage.dateInpt.getAttribute("validationMessage");
            Assert.assertEquals(expectedErrorMessage, actualErrorMessage);

        }


    }

    @When("Enter alphabetical or special characters as {string}")
    public void enter_alphabetical_or_special_characters_as(String amount) {
        payBillsPage.amountInpt.sendKeys(amount);
        BrowserUtils.waitFor(3);

    }

    @When("Enter alphabetical characters as {string}")
    public void enter_alphabetical_characters_as(String data) {
        payBillsPage.dateInpt.sendKeys(data);
        BrowserUtils.waitFor(3);

    }

    @Then("verify that alphabetical or special characters should not accept for {string}")
    public void verify_that_alphabetical_or_special_characters_should_not_accept_for(String input) {
        if (input.equals("amount")) {
            Assert.assertEquals("", payBillsPage.amountInpt.getText());


        } else if (input.equals("date")) {
            Assert.assertEquals("", payBillsPage.dateInpt.getText());


        }

    }


}
