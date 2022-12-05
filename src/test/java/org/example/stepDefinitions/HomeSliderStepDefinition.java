package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomeSliderStepDefinition {

    HomePage homePage = new HomePage();

    @When("user click on first slider")
    public void userClickOnFirstSlider()   {

        homePage.slider1.click();

    }

    @Then("user navigates first slider product page")
    public void userNavigatesFirstSliderProductPage() {
        WebDriverWait wait =new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://demo.nopcommerce.com/nokia-lumia-1020"));
        String expectedUrl="https://demo.nopcommerce.com/nokia-lumia-1020";
        String actualUrl=Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);

    }



    @When("user click on second slider")
    public void userClickOnSecondSlider() throws InterruptedException {

        homePage.sliderControl.click();
        homePage.slider2.click();

    }



    @Then("user navigates second slider product page")
    public void userNavigatesSecondSliderProductPage() {
        WebDriverWait wait =new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.urlToBe("https://demo.nopcommerce.com/iphone-6"));

        String expectedUrl="https://demo.nopcommerce.com/iphone-6";
        String actualUrl=Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
    }



}
