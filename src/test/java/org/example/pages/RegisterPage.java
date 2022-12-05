package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefinitions.Hooks.driver;

public class RegisterPage   {

     public RegisterPage( ) {
 PageFactory.initElements(Hooks.driver, this);    }

    @FindBy(className = "ico-register")
    public  WebElement registerLink;

    @FindBy(id = "gender-male")
    public  WebElement genderMale;

    @FindBy(id = "gender-female")
    public WebElement genderFemale;

    @FindBy(id = "FirstName")
    public WebElement firstName;

    @FindBy(id = "LastName")
    public WebElement lastName;

    @FindBy(name = "DateOfBirthDay")
    public  WebElement dateOfBirthDay;

    @FindBy(name = "DateOfBirthMonth")
    public  WebElement dateOfBirthMonth;

    @FindBy(name = "DateOfBirthYear")
    public WebElement dateOfBirthYear;

    @FindBy(id = "Email")
    public  WebElement email;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPassword;

    @FindBy(id = "register-button")
    public  WebElement registerButton;



@FindBy(className = "result")
   public WebElement successMessage;








}
