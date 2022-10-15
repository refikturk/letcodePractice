package com.cydeo.step_definitions;

import com.cydeo.pages.Letcode_Input;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.security.Key;

public class Input_StepDefinitions {

    Letcode_Input letcode_input = new Letcode_Input();

    @When("User goes to the https:\\/\\/letcode.in\\/edit")
    public void userGoesToTheHttpsLetcodeInEdit() {
        Driver.getDriver().get("https://letcode.in/edit");
    }


    @When("User practices sendKeys method")
    public void user_practices_send_keys_method() {
      letcode_input.fullName.sendKeys("Alex De Souza");
    }

    @When("User practices keyboard actions and TAB Key")
    public void user_practices_keyboard_actions_and_tab_key() {
        letcode_input.passTextAndPressTab.sendKeys(" at Java" + Keys.TAB);
    }

    @When("User practices getAttribute locator")
    public void user_practices_get_attribute_locator() {
        letcode_input.passTextAndPressTab.getAttribute("value");
    }

    @When("user practices clear action")
    public void user_practices_clear_action() {
        letcode_input.clearMe.clear();
    }

    @Then("user practices assertion of isEnabled method")
    public void user_practices_assertion_of_is_enabled_method() {
        Assert.assertFalse(letcode_input.isDisabled.isEnabled());
    }

    @And("user practices assertion of isDisabled method")
    public void userPracticesAssertionOfIsDisabledMethod() {
        Assert.assertTrue(letcode_input.isReadOnly.isEnabled());
    }



}
