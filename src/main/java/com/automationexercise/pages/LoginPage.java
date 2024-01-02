package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.Objects;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[2]")
    WebElement name;

    @CacheLookup
    @FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Signup')]")
    WebElement signUpButton;

    @CacheLookup
    @FindBy(xpath = "//b[contains(text(),'Enter Account Information')]")
    WebElement enterAccountInformationText;

    @CacheLookup
    @FindBy (id = "id_gender1")
    WebElement titleAsMrRadioButton;

    @CacheLookup
    @FindBy (id = "id_gender2")
    WebElement titleAsMrsRadioButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @CacheLookup
    @FindBy(css = "#days")
    WebElement day;

    @CacheLookup
    @FindBy(xpath = "//select[@id='months']")
    WebElement month;

    @CacheLookup
    @FindBy(xpath = "//select[@id='years']")
    WebElement years;

    @CacheLookup
    @FindBy(xpath = "//input[@id='newsletter']")
    WebElement newsletter;

    @CacheLookup
    @FindBy(xpath = "//input[@id='optin']")
    WebElement option;

    @CacheLookup
    @FindBy(xpath = "//input[@id='first_name']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='last_name']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='address1']")
    WebElement address1;

    @CacheLookup
    @FindBy(xpath = "//input[@id='address2']")
    WebElement address2;

    @CacheLookup
    @FindBy(xpath = "//select[@id='country']")
    WebElement country;

    @CacheLookup
    @FindBy(xpath = "//input[@id='state']")
    WebElement state;

    @CacheLookup
    @FindBy(xpath = "//input[@id='city']")
    WebElement city;

    @CacheLookup
    @FindBy(xpath = "//input[@id='zipcode']")
    WebElement zipcode;

    @CacheLookup
    @FindBy(xpath = "//input[@id='mobile_number']")
    WebElement mobileNumber;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Create Account')]")
    WebElement createAccountButton;

    @CacheLookup
    @FindBy(xpath = "//b[contains(text(),'Account Created!')]")
    WebElement accountCreatedText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[10]/a[1]")
    WebElement loggedInAsLink;

    @CacheLookup
    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]")
    WebElement deleteAccountLink;

    @CacheLookup
    @FindBy(xpath = "//b[contains(text(),'Account Deleted!')]")
    WebElement accountDeletedText;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Login to your account')]")
    WebElement loginToYourAccountText;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Email Address already exist!']")
    WebElement alreadyExistEmailText;

    @CacheLookup
    @FindBy (xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;

    @CacheLookup
    @FindBy (xpath = "//button[normalize-space()='Signup']")
    WebElement signupButton;

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Account Created!']")
    WebElement accountCreatedMessage;

    @CacheLookup
    @FindBy (xpath = "//li[10]//a[1]")
    WebElement loggedInAsTab;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue Shopping']")
    WebElement continueShoppingButton;

    public void enterName(String value){
        log.info("Enter email " + name.toString());
        sendTextToElement(name , value);
    }

    public void enterEmail(String value){
        log.info("Enter password " + email.toString());
        sendTextToElement(email, value);
    }

    public void clickOnSignUpButton(){
        clickOnElement(signUpButton);
        log.info("click on signUpLink " + signUpButton.toString());
    }
    public String verifyEnterAccountText(){
        log.info("Verify Enter account text " + enterAccountInformationText.toString());
        return getTextFromElement(enterAccountInformationText);
    }

    public void ClickOnRadioButton(String title){
        if (title.equalsIgnoreCase("Mr")){
            clickOnElement(titleAsMrRadioButton);
            log.info("Selecting radio button against Mr.");
        } else {
            clickOnElement(titleAsMrsRadioButton);
            log.info("Selecting radio button against Mrs.");
        }
    }

    public void enterPassword(String value){
        log.info("Enter password " + password.toString());
        sendTextToElement(password, value);
    }
    public void enterDay(String value){
        log.info("Enter Day " + day.toString());
        selectByVisibleTextFromDropDown(day, value);
    }

    public void enterMonth(String value){
        log.info("Enter month " + month.toString());
        selectByVisibleTextFromDropDown(month, value);
    }

    public void enterYear(String value){
        log.info("Enter year " + years.toString());
        selectByVisibleTextFromDropDown(years, value);
    }
    public void clickOnNewsletter(){
        log.info("Click on checkbox " + newsletter.toString());
        clickOnElement(newsletter);
    }

    public void clickOnOption(){
        log.info("Click on option " + option.toString());
        clickOnElement(option);
    }

    public void enterFirstName(String value){
        log.info("Enter first name " + firstName.toString());
        sendTextToElement(firstName, value);
    }

    public void enterLastName(String value){
        log.info("Enter last name " + lastName.toString());
        sendTextToElement(lastName, value);
    }
    public void enterAddress1(String address){
        log.info("Enter address1 " + address1.toString());
        sendTextToElement(address1, address);
    }
    public void enterAddress2(String address){
        log.info("Enter address2 " + address2.toString());
        sendTextToElement(address2, address);
    }
    public void selectCountry(String value){
        log.info("Select country " + country.toString());
        selectByVisibleTextFromDropDown(country, value);
    }
    public void enterState(String value){
        log.info("Enter state " + state.toString());
        sendTextToElement(state, value);
    }
    public void enterCity(String value){
        log.info("Enter city " + city.toString());
        sendTextToElement(city, value);
    }
    public void enterZipcode(String value){
        log.info("Enter code " + zipcode.toString());
        sendTextToElement(zipcode, value);
    }
    public void enterMobileNumber(String value){
        log.info("Enter number " + mobileNumber.toString());
        sendTextToElement(mobileNumber, value);
    }
    public void clickOnCreateAccount(){
        log.info("Click on create account " + createAccountButton.toString());
        clickOnElement(createAccountButton);
    }
    public String verifyAccountCreatedText(){
        log.info("Verify account created text " + accountCreatedText.toString());
        return getTextFromElement(accountCreatedText);
    }
    public void clickOnContinueButton(){
        log.info("Click on continue button " + continueButton.toString());
        clickOnElement(continueButton);
    }
    public void clickOnDeleteAccountLink(){
        log.info("Click on Delete account link " + deleteAccountLink.toString());
        clickOnElement(deleteAccountLink);
    }

    public String verifyDeleteAccountText(){
        log.info("Verify Account deleted Text " + accountDeletedText.toString());
        return getTextFromElement(accountCreatedText);
    }

    public String verifyLoginToYourAccountText(){
        log.info("Verify Login Account text " + loginToYourAccountText.toString());
        return getTextFromElement(loginToYourAccountText);
    }
    public String verifyEmailAddressAlreadyExist(){
        log.info("Verify Email exist Text " + alreadyExistEmailText.toString());
        return getTextFromElement(alreadyExistEmailText);
    }

    public void clickOnLoginPageButton(String button){
        if (Objects.equals(button, "Login")){
            clickOnElement(loginButton);
            log.info("Clicking on Login button : " + loginButton.toString());
        } else if (Objects.equals(button, "Signup")) {
            clickOnElement(signupButton);
            log.info("Clicking on Signup button : " + signupButton.toString());
        } else {
            System.out.println("No button clicked");
        }
    }

    public String getAccountCreatedMessage() {
        log.info("Getting account created message : " + accountCreatedMessage.toString());
        return getTextFromElement(accountCreatedMessage);
    }

    public String getLoggedInAsUserNameText(){
        log.info("Getting text from login page : " + loggedInAsTab.toString());
        return getTextFromElement(loggedInAsTab);
    }

    public void clickOnContinueShoppingButton(){
        log.info("Click on continue shopping button " + continueShoppingButton.toString());
        clickOnElement(continueShoppingButton);
    }





}
