package com.bank.step_definitions;

import com.bank.utilities.BrowserUtils;
import com.bank.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("\tthis is coming from BEFORE");

        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();

    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }

        BrowserUtils.waitForPageToLoad(5);
        Driver.closeDriver();

    }

    @Before("@db")
    public void setUpdb(){

        System.out.println("\tthis is coming from BEFORE db");
    }

    @After("@db")
    public void closeDb(){
        System.out.println("\tthis is coming from AFTER db");
    }


}