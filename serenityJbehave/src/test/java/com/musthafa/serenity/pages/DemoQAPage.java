package com.musthafa.serenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://store.demoqa.com/wp-login.php")
public class DemoQAPage extends PageObject {

    @FindBy(name="log")
    private WebElementFacade username;
   
    @FindBy(name="pwd")
    private WebElementFacade password;

    @FindBy(name="wp-submit")
    private WebElementFacade login_button;
    
    @FindBy(className="ab-item")
    private WebElementFacade Online_store;

    public void enter_username() {
    	username.type("zmmm");
    }
    
    public void enter_password() {
    	password.type("Ambattur123");
    }

    public void login() {
    	login_button.click();
    }
    
    public boolean verify_after_login()
    {
		if(Online_store.isPresent())
    	return true;
		else return false;
    	
    }

    }