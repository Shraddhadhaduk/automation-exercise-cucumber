package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends Utility {
    private static final Logger log = LogManager.getLogger(CategoryPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Category']")
    WebElement categoryText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Women']")
    WebElement women;

    @CacheLookup
    @FindBy(xpath = "//div[@id='Women']//a[contains(text(),'Dress')]")
    WebElement dress;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Women - Dress Products']")
    WebElement womenDressProductsText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Men']")
    WebElement men;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Tshirts']")
    WebElement tShirts;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Men - Tshirts Products']")
    WebElement menTShirtProductsText;

    public String verifyCategory(){
        log.info("Verify category " + categoryText.toString());
        return getTextFromElement(categoryText);
    }

    public void clickOnWomen() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Click on women " + women.toString());
        clickOnElement(women);
    }
    public void clickOnDress(){
        log.info("Click on tops " + dress.toString());
        clickOnElement(dress);
    }
    public String verifyWomenTopsProductText(){
        log.info("Verify tops products text " + womenDressProductsText.toString());
        return getTextFromElement(womenDressProductsText);
    }

    public void clickOnMen(){
        log.info("Click on men " + men.toString());
        clickOnElement(men);
    }

    public void clickOnTShirt(){
        log.info("Click on TShirt " + tShirts.toString());
        clickOnElement(tShirts);
    }
    public String verifyMenTShirtProductsText(){
        log.info("Verify TShirt product text " + menTShirtProductsText.toString());
        return getTextFromElement(menTShirtProductsText);
    }

}
