package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.testng.asserts.SoftAssert;

public class SearchStepDefinition {
     HomePage homepage = new HomePage();

    @When("user go to search field")
    public void userGoToSearchField() {
        homepage.searchItem.click();

    }

    @And("user search with {string}")
    public void userSearchWith(String arg0) {
        homepage.searchItem.sendKeys(arg0);
        homepage.searchBtn.click();
     }

    @Then("user should find {string} in search result")
    public void userShouldFindInSearchResult(String arg0) {
        SoftAssert softAssert=new SoftAssert();
        String expectedUrl="https://demo.nopcommerce.com/search?q=";
        String actualUrl=Hooks.driver.getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedUrl));
       for (int i =0 ; i<homepage.productItems().size();i++)
       {
           String productItem = homepage.productItems().get(i).getText().toLowerCase();
           softAssert.assertTrue(productItem.contains(arg0));

       }
       softAssert.assertAll();
    }

    @Then("user should find {string} in Product result Details")
    public void userShouldFindInProductResultDetails(String arg0) {
        SoftAssert softAssert=new SoftAssert();
         homepage.productItem.click();
        String productItem = homepage.sku.getText();
        softAssert.assertTrue(productItem.contains(arg0));
softAssert.assertAll();
    }



}
