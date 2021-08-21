package com.bank.pages;


import com.bank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class AccountSummaryPage extends BasePage{

    @FindBy(xpath ="//h2[@class='board-header']")
    public List<WebElement> accountTypes;

    @FindBy(xpath = "(//table[@class='table'])[3]//tr/th")
    public List<WebElement> creditAccountColumn;










}
