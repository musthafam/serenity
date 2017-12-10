package com.musthafa.serenity.steps;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import com.musthafa.serenity.steps.serenity.DemoQAUserSteps;

public class DemoQaSteps {

    @Steps
    DemoQAUserSteps demoQA;

    @Given("User has launched Test URL in Chrome")
    
    public void givenUserHasLaunchedTestURLInChrome() {
    	demoQA.Login_page();
    }

    @When("Enters valid username and password & clicks on Login")
    
    public void whenEntersValidUsernameAndPasswordClicksOnLogin() {
      demoQA.enterusername();
      demoQA.enterpassword();
      demoQA.login();
    }

    @Then("User should get the home screen successfully")
    
    public void thenUserShouldGetTheHomeScreenSuccessfully() {
      demoQA.VerifyAfterLogin();
    }


}
