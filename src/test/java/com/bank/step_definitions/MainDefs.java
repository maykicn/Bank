package com.bank.step_definitions;

import com.bank.utilities.ConfigurationReader;
import com.bank.utilities.Driver;
import io.cucumber.java.en.When;

public class MainDefs {

    @When("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
}
