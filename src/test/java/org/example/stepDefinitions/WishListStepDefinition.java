package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class WishListStepDefinition {
    HomePage homePage = new HomePage();

    @When("user click on wishlist button of product")
    public void userClickOnWishlistButtonOfProduct() {
        homePage.wishlistButton.click();
    }

    @Then("success message should be displayed")
    public void successMessageIsDisplayed() {
        String expectedMessage="The product has been added to your wishlist";
        String actualMessage= homePage.successMessage.getText();
        SoftAssert  softAssert= new SoftAssert();
        softAssert.assertTrue(actualMessage.contains(expectedMessage));
        String expectedColor="#4bb07a";
        String actualColor= Color.fromString(homePage.successMessage.getCssValue("background-color")).asHex();
        softAssert.assertEquals(actualColor,expectedColor);


    }

    @And("user click on wishlist link")
    public void userClickOnWishlistLink() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(homePage.successMessage));
        homePage.wishListLink.click();

    }

    @Then("user will find the quantity of products not equal zero")
    public void userWillFindTheQuantityOfProductsNotEqualZero() {
        String itemQuantity= homePage.itemQuantity.getAttribute("value");
        Assert.assertNotEquals(itemQuantity ,0);
    }
}


