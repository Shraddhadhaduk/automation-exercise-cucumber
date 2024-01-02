package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class NewLoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(NewLoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Login to your account']")
    WebElement loginText;

    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement loginEmail;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement loginPassword;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButtonOnLogin;

    @CacheLookup
    @FindBy (xpath = "//p[normalize-space()='Email Address already exist!']")
    WebElement emailAlreadyExistErrorMessage;

    @CacheLookup
    @FindBy (xpath = "//a[normalize-space()='Logout']")
    WebElement logoutButtonOnLogin;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    WebElement incorrectText;

    @CacheLookup
    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[10]/a[1]")
    WebElement loggedInText;


    public void verifyLoginText() {
        log.info("Login to your account message" + loginText.toString());
        getTextFromElement(loginText);
    }

    public void enterLoginEmail(String loginEmailAdd) {
        log.info("Enter email" + loginEmail.toString());
        sendTextToElement(loginEmail, loginEmailAdd);
    }

    public void enterLoginPassword(String loginPasswordAdd) {
        log.info("Enter password" + loginPassword.toString());
        sendTextToElement(loginPassword, loginPasswordAdd);
    }

    public void iClickOnLoginButtonOnLoginPage() {
        log.info("Click on Login Button" + loginButtonOnLogin.toString());
        clickOnElement(loginButtonOnLogin);
    }

    public String getEmailAlreadyExistErrorMessage() {
        log.info("Email already exists" + loginPassword.toString());
        return getTextFromElement(emailAlreadyExistErrorMessage);
    }

    public void iClickOnLogoutButtonOnLoginPage() {
        log.info("Click on Logout Button" + logoutButtonOnLogin.toString());
        clickOnElement(logoutButtonOnLogin);
    }

    public String getCurrentURL(){
        log.info("Getting Login Page URL ");
        System.out.println(driver.getCurrentUrl());
        return driver.getCurrentUrl();
    }

    public String verifyIncorrectText(){
        log.info("Verify incorrect text " + incorrectText.toString());
        return getTextFromElement(incorrectText);
    }

    public String verifyLoggedInText(){
        log.info("Verify logged in " + loggedInText.toString());
        return getTextFromElement(loggedInText);
    }

}
