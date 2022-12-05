package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {

        PageFactory.initElements(Hooks.driver,this);
    }
    @FindBy(className = "ico-login")
    public WebElement loginLink;


    @FindBy (id="Email")
    public WebElement email;

    @FindBy (id="Password")
    public WebElement password;

    @FindBy (xpath = "//*[@class='button-1 login-button']")
    public WebElement LoginBtn;

    @FindBy (className = "ico-account")
   public  WebElement myAccountLink;

    @FindBy (xpath = "//*[@class='message-error validation-summary-errors']")
    public WebElement errorMessage;






}
