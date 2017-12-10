package com.musthafa.serenity.steps.serenity;

import org.junit.Assert;

import com.musthafa.serenity.pages.DemoQAPage;

import net.thucydides.core.annotations.Step;

public class DemoQAUserSteps {

	DemoQAPage demoQAPage;

    @Step
    public void enterusername() {
    	demoQAPage.enter_username();
    }

    @Step
    public void enterpassword() {
    	demoQAPage.enter_password();
    }

    @Step
    public void login() {
    	demoQAPage.login();
    }
    
    @Step
    public void Login_page() {
    	demoQAPage.open();
    }
    
    @Step
    public void VerifyAfterLogin() {
    	Assert.assertTrue(demoQAPage.verify_after_login());
    }
    
    

    
}