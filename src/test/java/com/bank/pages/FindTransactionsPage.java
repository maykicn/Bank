package com.bank.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.SimpleDateFormat;
import java.util.List;

public class FindTransactionsPage extends BasePage {

    @FindBy(xpath = "//form[@id='find_transactions_form']//button")
    public WebElement findBttn;

    @FindBy(xpath = "(//div[@id='tabs']//li)[2]")
    public WebElement findTransactionTab;

    @FindBy(xpath = "//input[@id='aa_fromDate']")
    public WebElement fromDate;

    @FindBy(xpath = "//input[@id='aa_toDate']")
    public WebElement toDate;

    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']//table//tbody/tr")
    public List<WebElement> datesOfTable;


    @FindBy(xpath = "//input[@id='aa_description']")
    public WebElement descriptionInpt;

    @FindBy(xpath = "//select[@id='aa_type']")
    public WebElement selectType;


    public Boolean isDateBetween(String actualDate, String expectedFromDate, String expectedToDate) {
        Boolean flag = false;
        try {
            SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date Fdate = fmt.parse(expectedFromDate);
            java.util.Date Tdate = fmt.parse(expectedToDate);
            java.util.Date ActualDate = fmt.parse(actualDate);

            if (ActualDate.compareTo(Fdate) >= 0 && ActualDate.compareTo(Tdate) <= 0) {
                flag = true;

            }
        } catch (Exception ex) {


        }

      return flag;
     /*Boolean flag=false;

        int acutalYear, actualMonth, actualDay,
                expectedFromYear,expectedFromMonth, expectedFromDay,
                expectedToYear,expectedToMonth,expectedToDay;
        expectedFromYear=Integer.parseInt(expectedFromDate.substring(0, 4));
        expectedFromMonth=Integer.parseInt(expectedFromDate.substring(5,7));
        expectedFromDay=Integer.parseInt(expectedFromDate.substring(8,10));

        expectedToYear=Integer.parseInt(expectedToDate.substring(0, 4));
        expectedToMonth=Integer.parseInt(expectedToDate.substring(5,7));
        expectedToDay=Integer.parseInt(expectedToDate.substring(8,10));

        acutalYear=Integer.parseInt(actualDate.substring(0,4));
        actualMonth=Integer.parseInt(actualDate.substring(5,7));
        actualDay=Integer.parseInt(actualDate.substring(8,10));

        if (expectedFromYear <= acutalYear && acutalYear <= expectedToYear) {
            if (expectedFromMonth <= actualMonth && actualMonth <= expectedToMonth) {
                if (expectedFromDay <= actualDay && actualDay <= expectedToDay) {
                    flag = true;
                }
            }
        }

        return flag;*/
    }


}
