package com.bank.pages;


import com.bank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{






public String getAccountType(String xpath){

   return Driver.get().findElement(By.xpath(xpath)).getText();

}



}
