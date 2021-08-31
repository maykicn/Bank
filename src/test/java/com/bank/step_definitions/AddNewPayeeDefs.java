package com.bank.step_definitions;

import com.bank.pages.AddNewPayeePage;
import com.bank.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Map;

public class AddNewPayeeDefs {

    AddNewPayeePage addNewPayeePage = new AddNewPayeePage();

    @Given("Add New Payee tab")
    public void add_New_Payee_tab() {
        addNewPayeePage.addNewPayeeTab.click();

    }

    @Given("creates new payee using following information")
    public void creates_new_payee_using_following_information(Map<String, String> dataTable) {

        for (String key : dataTable.keySet()) {

            switch (key) {

                case "Payee Name":

                    addNewPayeePage.payeeName.sendKeys(dataTable.get(key));
                    break;

                case "Payee Address":

                    addNewPayeePage.payeeAddress.sendKeys(dataTable.get(key));
                    break;

                case "Account":

                    addNewPayeePage.account.sendKeys(dataTable.get(key));
                    break;

                case "Payee details":

                    addNewPayeePage.payeeDetails.sendKeys(dataTable.get(key));
                    break;


            }

        }

        addNewPayeePage.addBttn.click();

    }

    @Then("message The new payee {string} should be displayed")
    public void message_The_new_payee_should_be_displayed(String expectedMessage) {

        String actualMessage="";

        actualMessage=addNewPayeePage.messageText.getText();

        Assert.assertEquals(expectedMessage,actualMessage);

    }


}
