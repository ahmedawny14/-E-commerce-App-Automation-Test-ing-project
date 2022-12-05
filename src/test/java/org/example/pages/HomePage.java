package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Hooks.driver, this);
    }

    @FindBy(id="customerCurrency")
    public WebElement currency;



    @FindBy( css = "span[class='price actual-price']")
    public  WebElement productsPrice;

    public List<WebElement>prices()
    {

        List<WebElement>prices= Hooks.driver.findElements(By.cssSelector("span[class='price actual-price']"));
        return  prices;
    }

    @FindBy(id = "small-searchterms")
    public WebElement searchItem;

    @FindBy(xpath = "//*[@class='button-1 search-box-button']")
    public WebElement searchBtn;

    @FindBy(className = "product-item")
    public WebElement productItem;

    @FindBy(className = "sku")
    public WebElement sku;

    @FindBy(css ="div[class='page-title']")
    public WebElement pageTitle;

    @FindBy(xpath="//*[@id=\"nivo-slider\"]/a[1]")
    public WebElement slider1;

    @FindBy(xpath="//*[@id=\"nivo-slider\"]/a[2]")
    public WebElement slider2;

    @FindBy(linkText="1")
    public WebElement sliderControl;


    @FindBy(className="facebook")
    public WebElement faceBookLink;

    @FindBy(className="twitter")
    public WebElement twitterLink;

    @FindBy(className="rss")
    public WebElement rssLink;

    @FindBy(className="youtube")
    public WebElement youtubeLink;

    @FindBy(xpath="//div[@class='master-wrapper-content']//div[3]//div[1]//div[2]//div[3]//div[2]//button[3]")
    public WebElement wishlistButton;

    @FindBy(className ="wishlist-label")
    public WebElement wishListLink;

    @FindBy(xpath="//div[@class='bar-notification success']")
    public WebElement successMessage;

    @FindBy(className="qty-input")
    public WebElement itemQuantity;






    public List<WebElement> productItems() {
        List<WebElement> productItems = Hooks.driver.findElements(By.className("product-item"));
        return productItems;
    }

    public List<WebElement> categories() {
        List<WebElement> categories = Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li"));
        return categories;
    }

    public List<WebElement> subCategories(int randomCategory) {
        randomCategory=randomCategory+1;

return Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li["+randomCategory+" ]/ul[@class=\"sublist first-level\"]/li"));
    }



}
