package com.bank.step_definitions;

import com.bank.pages.AccountPage;
import com.bank.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import java.util.List;

public class AccountDefs {


    @Then("verify that the page has {string}")
    public void verify_that_the_page_has(String expectedAccountType) {
        String xpath = null;
        String actualAccountType = null;
        xpath = "//h2[contains(text(),'" + expectedAccountType + "')]";
        Boolean flag = false;
        try {
            actualAccountType = Driver.get().findElement(By.xpath(xpath)).getText();
            Assert.assertEquals(expectedAccountType, actualAccountType);
        } catch (NoSuchElementException e) {
            Assert.assertEquals("page has not" + expectedAccountType, expectedAccountType, actualAccountType);
        }

    }
}