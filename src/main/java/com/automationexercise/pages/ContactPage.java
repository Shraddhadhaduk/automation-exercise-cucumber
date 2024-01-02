package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends Utility {

    private static final Logger log = LogManager.getLogger(ContactPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Contact us']")
    WebElement contactUs;

    @CacheLookup
    @FindBy (xpath = "//h2[normalize-space()='Get In Touch']")
    WebElement getInTouchText;

    @CacheLookup
    @FindBy (xpath = "//input[@placeholder='Name']")
    WebElement nameField;

    @CacheLookup
    @FindBy (xpath = "//input[@placeholder='Email']")
    WebElement emailField;

    @CacheLookup
    @FindBy (xpath = "//input[@placeholder='Subject']")
    WebElement subjectField;

    @CacheLookup
    @FindBy (xpath = "//textarea[@id='message']")
    WebElement messageField;

    @CacheLookup
    @FindBy(xpath = "//input[@name='upload_file']")
    WebElement upload;

    @CacheLookup
    @FindBy(xpath = "//input[@name='submit']")
    WebElement submitButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='status alert alert-success']")
    WebElement successText;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Home']")
    WebElement homeButton;


    public void clickOnContactUs(){
        log.info("Click on contactus " + contactUs.toString());
        clickOnElement(contactUs);
    }

    public String verifyGetInTouch(){
        log.info("Verify get in touch " + getInTouchText.toString());
        return getTextFromElement(getInTouchText);
    }

    public void enterName(String name){
        log.info("Enter Name " + nameField.toString());
        sendTextToElement(nameField, name);
    }

    public void enterEmail(String email){
        log.info("Enter Name " + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void enterSubject(String subject){
        log.info("Enter Name " + subjectField.toString());
        sendTextToElement(subjectField, subject);
    }

    public void enterMessage(String message){
        log.info("Enter Message " + messageField.toString());
        sendTextToElement(messageField, message);
    }
    public void uploadFile(){
        log.info("Uploading file " + upload.toString());
        upload.sendKeys("D:/Study/texting.txt");
    }
    public void clickOnSubmit(){
        log.info("Click on submit button " + submitButton.toString());
        clickOnElement(submitButton);
    }
    public void acceptPopupMessage(){
        acceptAlert();
        log.info("Accepting the alert : ");
    }

    public String verifySuccessText(){
        log.info("Verify success text " + successText.toString());
        return getTextFromElement(successText);
    }

    public void clickOnHomeButton(){
        clickOnElement(homeButton);
    }



}
