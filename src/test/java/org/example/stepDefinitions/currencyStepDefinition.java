package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.CurrencyPage;
import org.example.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class currencyStepDefinition {

HomePage homePage= new HomePage();
    @When("user select euro option")
    public void selectEuroOption()
 {
     Select select = new Select(homePage.currency);
     select.selectByVisibleText("Euro");

 }

    @Then("the price of products will be with euro")
    public void thePriceOfProductsWillBeWithEuro() {

       for(int i =0 ;i<homePage.prices().size();i++ ) {

           String ProductPrice= homePage.prices() .get(i).getText();
           Assert.assertTrue(ProductPrice.contains("€"));

      }
    }



}

