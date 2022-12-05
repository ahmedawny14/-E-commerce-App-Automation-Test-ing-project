package org.example.stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.RegisterPage;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class RegisterStepDefinition {

    RegisterPage registerPage = new RegisterPage();

    @Given("user go to register page")
    public void goToRegister() {
        registerPage.registerLink.click();
    }

    @When("user select Gender")
    public void selectGender() {
        registerPage.genderMale.click();
    }

    @And("user enter First Name {string}")
    public void userEnterFirstName(String firstName) {
        registerPage.firstName.sendKeys(firstName);

    }

    @And("user Enter Last Name  {string}")
    public void userEnterLastName(String lastName) {
        registerPage.lastName.sendKeys(lastName);

    }



    @And("user Enter Date of birth")
    public void enterDateOfBirth() {
        Select day = new Select(registerPage.dateOfBirthDay);
        day.selectByValue("21");

        Select month = new Select(registerPage.dateOfBirthMonth);
        month.selectByValue("10");

        Select year = new Select(registerPage.dateOfBirthYear);
        year.selectByValue("1997");
    }

    @And("user enter valid email")
    public void enterEmail( ) {
        registerPage.email.sendKeys( "ahmedeldaly685@gmail.com");
    }

    @And("user enter matched password and confirmed password {string}")
    public void userEnterMatchedPasswordAndConfirmedPassword(String password) {
        registerPage.password.sendKeys(password);
        registerPage.confirmPassword.sendKeys(password);
    }


    @And("user clicks on register button")
    public void clickOnRegisterButton() {
        registerPage.registerButton.click();
    }

    @Then("success message is displayed")
    public void couldRegister() {
        String expectedMessage = "Your registration completed";
        String actualMessage = registerPage.successMessage.getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualMessage, expectedMessage);
        String expectedMessageColor = "rgba(76, 177, 124, 1)";
        String actualMessageColor = (registerPage.successMessage.getCssValue("color"));
        softAssert.assertEquals(actualMessageColor, expectedMessageColor);
        softAssert.assertAll();
    }





}
