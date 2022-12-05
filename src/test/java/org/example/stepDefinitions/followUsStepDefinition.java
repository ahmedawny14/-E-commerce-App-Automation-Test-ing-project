package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class followUsStepDefinition {
    HomePage homePage = new HomePage();
    @When("user click on facebook link")
    public void userClickOnFacebookLink() {
        homePage.faceBookLink.click();
    }


    @Then("user should navigate to facebook website")
    public void userShouldNavigateToFacebookWebsite() throws InterruptedException {
        Set<String>windows= Hooks.driver.getWindowHandles();
        Iterator<String> iterator=windows.iterator();
       String tab1= iterator.next();
       String tab2= iterator.next();
       Hooks.driver.switchTo().window(tab2);
       Thread.sleep(1000);
       String expectedResult="https://www.facebook.com/nopCommerce";
       String actualRessult=Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualRessult,expectedResult);

     }

    @When("user click on twitter link")
    public void userClickOnTwitterLink() {
        homePage.twitterLink.click();
    }

    @Then("user should navigate to twitter website")
    public void userShouldNavigateToTwitterWebsite() throws InterruptedException {

        Set<String>windows= Hooks.driver.getWindowHandles();
        Iterator<String> iterator=windows.iterator();
        String tab1= iterator.next();
        String tab2= iterator.next();
        Hooks.driver.switchTo().window(tab2);
        Thread.sleep(1000);
        String expectedResult="https://twitter.com/nopCommerce";
        String actualResult=Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult);

    }

    @When("user click on rrs link")
    public void userClickOnRrsLink() {
        homePage.rssLink.click();

    }

    @Then("user should navigate to rrs website")
    public void userShouldNavigateToRrsWebsite() throws InterruptedException {
        Set<String>windows= Hooks.driver.getWindowHandles();
        Iterator<String> iterator=windows.iterator();
        String tab1= iterator.next();
        String tab2= iterator.next();
        Hooks.driver.switchTo().window(tab2);
        Thread.sleep(1000);
        String expectedResult="https://demo.nopcommerce.com/news/rss/1";
        String actualResult=Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult);
    }

    @When("user click on youtube link")
    public void userClickOnYoutubeLink() {
        homePage.youtubeLink.click();

    }

    @Then("user should navigate to youtube website")
    public void userShouldNavigateToYoutubeWebsite() throws InterruptedException {
        Set<String>windows= Hooks.driver.getWindowHandles();
        Iterator<String> iterator=windows.iterator();
        String tab1= iterator.next();
        String tab2= iterator.next();
        Hooks.driver.switchTo().window(tab2);
        Thread.sleep(1000);
        String expectedResult="https://www.youtube.com/user/nopCommerce";
        String actualResult=Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult);
    }
}
