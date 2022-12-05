package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Random;

public class HoverCategoryStepDefinition {
HomePage homePage = new HomePage();

     int randomCategory= new Random().nextInt(3);
int randomSubCategory= new Random().nextInt(3);

    @When("user hover a category and select sub category")
    public void userHoverACategoryAndSelectSubCategory() {


        Actions actions =new Actions(Hooks.driver);
        actions.moveToElement(homePage.categories().get(randomCategory)).perform();
        String mainCategory= homePage.categories().get(randomCategory).getText();
         homePage.subCategories(randomCategory).get(randomSubCategory).click();

    }

    @Then("user should find the sub category name in page title")
    public void userShouldFindTheSubCategoryNameInPageTitle() {
         String subCategory=homePage.subCategories(randomCategory).get(randomSubCategory).getText();
          String pageTitle=homePage.pageTitle.getText();
         Assert.assertTrue( pageTitle.contains(subCategory));
    }
}
