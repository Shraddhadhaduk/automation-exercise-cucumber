package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ExtraPage extends Utility {

    private static final Logger log = LogManager.getLogger(ExtraPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Test Cases']")
    WebElement testCaseLink;

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Test Cases']")
    WebElement testCaseText;

    @CacheLookup
    @FindBy(css = "div[class='single-widget'] h2")
    WebElement subscriptionTextElement;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    WebElement subscriptionText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='susbscribe_email']")
    WebElement subscriptionEmail;

    @CacheLookup
    @FindBy(xpath = "//button[@id='subscribe']")
    WebElement arrowButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert-success alert']")
    WebElement successText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cart']")
    WebElement cartLink;

   @CacheLookup
   @FindBy(css = "ul[id='address_delivery'] li:nth-child(4)")
   WebElement deliveryAddress;

   @CacheLookup
   @FindBy(css = "ul[id='address_invoice'] li:nth-child(4)")
   WebElement billingAddress;

    @CacheLookup
    @FindBy (xpath = "//a[normalize-space()='Download Invoice']")
    WebElement downloadInvoiceButtonAfterOrderSuccessMessage;

    @CacheLookup
    @FindBy (xpath = "//a[normalize-space()='Continue']")
    WebElement continueButtonAfterOrderSuccessMessage;


    public void clickOnTestCaseLink() {
        log.info("Click on test case " + testCaseLink.toString());
        clickOnElement(testCaseLink);
    }

    public String VerifyTestCaseText() {
        log.info("Verify test case " + testCaseText.getText());
        return getTextFromElement(testCaseText);
    }

    public void scrollDownToViewFooter() {
        log.info("Scroll down " + subscriptionTextElement.toString());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", subscriptionTextElement);
    }

    public String verifySubscriptionText(){
        log.info("Verify subscription " + subscriptionText.toString());
        return getTextFromElement(subscriptionText);
    }

    public void enterSubscriptionEmail(String email){
        log.info("Enter email " + subscriptionEmail.toString());
        sendTextToElement(subscriptionEmail, email);
    }

    public void clickOnArrowButton(){
        log.info("Click on Arrow " + arrowButton.toString());
        clickOnElement(arrowButton);
    }

    public String verifySuccessText(){
        log.info("Verify success text " + successText.toString());
        return getTextFromElement(successText);
    }

    public void clickOnCart(){
        log.info("Click on cart " + cartLink.toString());
        clickOnElement(cartLink);
    }
    public String verifyDeliveryAddress(){
        log.info("Verify delivery address " + deliveryAddress.toString());
        return getTextFromElement(deliveryAddress);
    }

    public String verifyBillingAddress(){
        log.info("Verify Billing Address " + billingAddress.toString());
        return getTextFromElement(billingAddress);
    }

    public void clickOnDownloadInvoiceButtonAfterOrderSuccessMessage() {
        clickOnElement(downloadInvoiceButtonAfterOrderSuccessMessage);
        log.info("Click on download invoice button : " + downloadInvoiceButtonAfterOrderSuccessMessage.toString());
    }

    public void clickOnContinueButtonAfterOrderSuccessMessage() {
        clickOnElement(continueButtonAfterOrderSuccessMessage);
        log.info("Click on continue button after order success message : " + continueButtonAfterOrderSuccessMessage.toString());
    }

}