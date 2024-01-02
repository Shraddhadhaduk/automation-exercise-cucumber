package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Homepage extends Utility {

    private static final Logger log = LogManager.getLogger(Homepage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Home']")
    WebElement homePageLink;

    @CacheLookup
    @FindBy(css = "a[href='/login']")
    WebElement signUpLink;

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/h2[1]")
    WebElement newUserSignUpText;

    @CacheLookup
    @FindBy (xpath = "//ul[@class='nav navbar-nav']/li")
    List<WebElement> headerTabs;


    public String verifyHomePage(){
        log.info("Verify HomePagelink " + homePageLink.toString());
        return getTextFromElement(homePageLink);
    }

    public void clickOnSignUpLink(){
        clickOnElement(signUpLink);
        log.info("click on signUpLink " + signUpLink.toString());
    }

    public String verifyNewUserSignUpText(){
        log.info("Verify new user signup " + newUserSignUpText.getText());
        return getTextFromElement(newUserSignUpText);
    }
    public void clickOnHeaderTab(String option){
        for (WebElement op: headerTabs) {
            //System.out.println(op.getText());
            if(op.getText().equalsIgnoreCase(option)){
                op.click();
                log.info("CLicking on " + option + " header tab : " + headerTabs.toString());
                break;
            }
        }
    }
}
