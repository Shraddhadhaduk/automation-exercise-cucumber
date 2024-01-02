package com.automationexercise.steps;

import com.automationexercise.pages.Homepage;
import com.automationexercise.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Random;

public class RegisterSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("Click {string} link")
    public void clickSignupLink(String signupOrLogin) {
        new Homepage().clickOnSignUpLink();
    }

    @And("Verify {string} is visible")
    public void verifyNewUserSignupIsVisible(String text) {
        String actualText = new Homepage().verifyNewUserSignUpText();
        Assert.assertEquals(actualText, "New User Signup!");
    }

    @Then("Enter name and email address")
    public void enterNameAndEmailAddress() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        new LoginPage().enterName("Shraddha");
        new LoginPage().enterEmail("Piyush" + randomInt + "@gmail.com");

    }
    @And("Click {string} button")
    public void clickSignupButton(String button) {
        new LoginPage().clickOnSignUpButton();
    }

    @And("Verify that {string} is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible(String text) {
         String actualText1 = new LoginPage().verifyEnterAccountText();
         Assert.assertEquals(actualText1, "ENTER ACCOUNT INFORMATION");
    }

    @And("enter {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void enter(String title, String Password, String Day, String Month, String Year, String FirstName, String LastName, String Address1, String Address2, String Country, String State, String City, String ZipCode, String MobileNumber) {
    new LoginPage().ClickOnRadioButton(title);
    new LoginPage().enterPassword(Password);
    new LoginPage().enterDay(Day);
    new LoginPage().enterMonth(Month);
    new LoginPage().enterYear(Year);
    new LoginPage().enterFirstName(FirstName);
    new LoginPage().enterLastName(LastName);
    new LoginPage().enterAddress1(Address1);
    new LoginPage().enterAddress2(Address2);
    new LoginPage().selectCountry(Country);
    new LoginPage().enterState(State);
    new LoginPage().enterCity(City);
    new LoginPage().enterZipcode(ZipCode);
    new LoginPage().enterMobileNumber(MobileNumber);
}


    @And("Select checkbox {string}")
    public void selectCheckboxSignUpForOurNewsletter(String checkBox) {
        new LoginPage().clickOnNewsletter();
    }

    @And("Click {string}")
    public void clickCreateAccountButton(String button) {
        new LoginPage().clickOnCreateAccount();
    }


    @And("Verify that ACCOUNT CREATED! is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {
        String actualText2 = new LoginPage().verifyAccountCreatedText();
        Assert.assertEquals(actualText2, "ACCOUNT CREATED!");
    }

    @And("Click Continue button")
    public void clickContinueButton() {
        new LoginPage().clickOnContinueButton();
    }

    @And("Click Delete Account button")
    public void clickDeleteAccountButton() {
        new LoginPage().clickOnDeleteAccountLink();
    }

    @And("Verify that {string} is visible and click {string} button")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton(String text) {
        String actualText3 = new LoginPage().verifyDeleteAccountText();
        Assert.assertEquals(actualText3, "ACCOUNT DELETED!");
        new LoginPage().clickOnContinueButton();
    }

    @Then("Enter name and already registered email address")
    public void enterNameAndAlreadyRegisteredEmailAddress() {
        new LoginPage().enterName("Shraddha");
        new LoginPage().enterEmail("Piyush@gmail.com");
    }

    @And("Verify error Email Address already exist! is visible")
    public void verifyErrorEmailAddressAlreadyExistIsVisible() {
        new LoginPage().verifyEmailAddressAlreadyExist();
    }
}

