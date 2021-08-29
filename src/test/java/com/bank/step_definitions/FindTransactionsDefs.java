package com.bank.step_definitions;

import com.bank.pages.FindTransactionsPage;
import com.bank.utilities.BrowserUtils;
import com.bank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindTransactionsDefs {
    FindTransactionsPage findTransactionsPage = new FindTransactionsPage();

    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() {
        findTransactionsPage.findTransactionTab.click();

    }

    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String fromDate, String toDate) {

        findTransactionsPage.fromDate.sendKeys(fromDate);
        findTransactionsPage.toDate.sendKeys(toDate);

    }

    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String expextedFromDate, String expectedToDate) {

        String actualDate;
        for (WebElement element : findTransactionsPage.datesOfTable) {
            actualDate = element.getText().substring(0, 10);
            Assert.assertTrue(findTransactionsPage.isDateBetween(actualDate, expextedFromDate, expectedToDate));

        }


    }

    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {
        List<String> actualDate = new ArrayList<>();
        List<String> expectedDate = new ArrayList<>();
        for (WebElement element : findTransactionsPage.datesOfTable) {
            actualDate.add(element.getText().substring(0, 10));
            expectedDate.add(element.getText().substring(0, 10));
        }

        Collections.sort(expectedDate);
        Collections.reverse(expectedDate);
        Assert.assertEquals(expectedDate, actualDate);
    }


    @Then("the results table should only not contain transactions dated {string}")
    public void the_results_table_should_only_not_contain_transactions_dated(String expectedDate) {

        Boolean flag = true;
        String actualDate;
        for (WebElement element : findTransactionsPage.datesOfTable) {
            actualDate = element.getText().substring(0, 10);
            if (actualDate.equals(expectedDate)) {
                flag = false;
            }
            Assert.assertTrue(flag);

        }
    }

    @When("the user enters description {string}")
    public void the_user_enters_description(String descriptionText) {

        new FindTransactionsPage().descriptionInpt.sendKeys(descriptionText);
    }

    @Then("results table should only show descriptions containing {string}")
    public void results_table_should_only_show_descriptions_containing(String expectedDescription) {
        String actualDescription = "";
        Boolean flag = true;
        for (WebElement element : findTransactionsPage.datesOfTable) {
            actualDescription = element.getText().substring(11, 17);
            if (!actualDescription.equals(expectedDescription)) {
                flag = false;
            }
        }
        Assert.assertTrue(flag);

    }

    @Then("results table should not show descriptions containing {string}")
    public void results_table_should_not_show_descriptions_containing(String unexpectedDescription) {

        String actualDescription = "";
        Boolean flag = true;
        for (WebElement element : findTransactionsPage.datesOfTable) {
            actualDescription = element.getText().substring(11, 17);
            if (actualDescription.equals(unexpectedDescription)) {
                flag = false;
            }
        }
        Assert.assertTrue(flag);

    }

    @Then("results table should show at least one result under {string}")
    public void results_table_should_show_at_least_one_result_under(String expectedResult) {
        BrowserUtils.waitFor(1);
        int i = 0;
        if (expectedResult.equals("Deposit")) {
            i = 3;
            Boolean flag = false;
            while (!flag) {

                 if (Driver.get().findElement(By.xpath("(//div[@id='filtered_transactions_for_account']//table//tr/td)[" + i + "]")).getText().equals("")) {
                    i = i + 4;
                } else {
                    flag = true;
                }
            }
            Assert.assertTrue(flag);

        } else if (expectedResult.equals("Withdrawal")) {
            i = 4;
            Boolean flag = false;
            while (!flag) {

                if (Driver.get().findElement(By.xpath("(//div[@id='filtered_transactions_for_account']//table//tr/td)[" + i + "]")).getText().equals("")) {
                    i = i + 4;
                } else {
                    flag = true;
                }

            }
            Assert.assertTrue(flag);
        }


    }

    @When("user selects type {string}")
    public void user_selects_type(String select) {
        FindTransactionsPage findTransactionsPage = new FindTransactionsPage();
        Select select1 = new Select(findTransactionsPage.selectType);
        select1.selectByVisibleText(select);
        findTransactionsPage.findBttn.click();


    }

    @Then("results table should show no result under {string}")
    public void results_table_should_show_no_result_under(String unexpectedResult) {
        int i = 0;
        WebElement element;
        Boolean flag = true;
        BrowserUtils.waitFor(1);
        int size = findTransactionsPage.datesOfTable.size();
        if (unexpectedResult.equals("Deposit")) {
            i = 3;
            for (int j = size; j > 0; j--) {

                element = Driver.get().findElement(By.xpath("(//div[@id='filtered_transactions_for_account']//table//tr/td)[" + i + "]"));
                if (element.getText().equals("")) {
                    i = i + 4;

                } else {
                    flag = false;
                    break;
                }
            }

            Assert.assertTrue(flag);

        } else if (unexpectedResult.equals("Withdrawal")) {
            i = 4;
            for (int j = size; j > 0; j--) {

                element = Driver.get().findElement(By.xpath("(//div[@id='filtered_transactions_for_account']//table//tr/td)[" + i + "]"));
                if (element.getText().equals("")) {
                    i = i + 4;

                } else {
                    flag = false;
                    break;
                }
            }

           Assert.assertTrue(flag);


        }


    }

}
