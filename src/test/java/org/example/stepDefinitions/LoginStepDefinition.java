package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.LoginPage;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class LoginStepDefinition {

    LoginPage loginPage = new LoginPage();
    SoftAssert softAssert = new SoftAssert();

    @Given("user should navigate to login page")
    public void goToLogin()
    {

        loginPage.loginLink.click();
    }

    @When("user enter email {string} and password {string}")
    public void userEnterEmailAndPassword(String email, String password) {
        loginPage.email.sendKeys(email);
        loginPage.password.sendKeys(password);


    }

    @And("user click on login button")
    public void ClickLogin() throws InterruptedException {
      loginPage.LoginBtn.click();
    }



    @Then("user login to the web application successfully")
    public void couldLogin() throws InterruptedException {
   String expectedUrl="https://demo.nopcommerce.com/";
   String actualUrl=Hooks.driver.getCurrentUrl();
    softAssert.assertEquals(actualUrl,expectedUrl);
   boolean expectedResult = true;
   boolean actualResult= loginPage.myAccountLink.isDisplayed();
   softAssert.assertEquals(actualResult,expectedResult);
   softAssert.assertAll();
     }


    @Then("user could not login to the web application")
    public void couldNotLogin()
    {
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.";
        String actualMessage = loginPage.errorMessage.getText();
        softAssert.assertTrue(actualMessage.contains(expectedMessage) );
        String expectedMessageColor = "#e4434b";
        String actualMessageColor =  Color.fromString(loginPage.errorMessage.getCssValue("color")).asHex();;

        softAssert.assertEquals(actualMessageColor, expectedMessageColor);
        softAssert.assertAll();
    }



}
