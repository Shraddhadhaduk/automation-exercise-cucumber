package com.automationexercise.steps;

import com.automationexercise.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ExtraSteps {
    @When("Click on Test Cases button")
    public void clickOnTestCasesButton() {
     new ExtraPage().clickOnTestCaseLink();
    }

    @Then("Verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully() {
        String actualText = new ExtraPage().VerifyTestCaseText();
        Assert.assertEquals(actualText, "TEST CASES");
    }

    @When("Scroll down to footer")
    public void scrollDownToFooter() {
        new ExtraPage().scrollDownToViewFooter();
    }

    @Then("Verify text {string}")
    public void verifyTextSUBSCRIPTION(String text) {
        String actualText = new ExtraPage().verifySubscriptionText();
        Assert.assertEquals(actualText, "SUBSCRIPTION");
    }

    @And("Enter email address {string} in input and click arrow button")
    public void enterEmailAddressInInputAndClickArrowButton(String email) {
        new ExtraPage().enterSubscriptionEmail(email);
        new ExtraPage().clickOnArrowButton();
    }


    @And("Verify success message You have been successfully subscribed! is visible")
    public void verifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() {
        String actualText1 = new ExtraPage().verifySuccessText();
        Assert.assertEquals(actualText1, "You have been successfully subscribed!");
    }
    @When("Click Cart button")
    public void clickCartButton() {
        new ExtraPage().clickOnCart();
    }

    @When("I add product {string} to the cart")
    public void iAddProductToTheCart(String product) {
        new ProductPage().mouseHoverAndClickAddToCartOnProduct(product);
    }

    @And("I click on view cart in popup")
    public void iClickOnViewCartInPopup() {
        new ProductPage().clickOnViewCartLinkInSuccessMessage();
    }

    @And("I should see the welcome text on shopping cart page {string}")
    public void iShouldSeeTheWelcomeTextOnShoppingCartPage(String text) {
        Assert.assertEquals(new ShoppingCartPage().getShoppingCartWelcomeText(),text);
    }

    @And("I click on Proceed to Checkout button")
    public void iClickOnProceedToCheckoutButton() {
        new ShoppingCartPage().clickOnProceedToCheckoutButton();

    }

    @And("I click on register link in the checkout popup")
    public void iClickOnRegisterLinkInTheCheckoutPopup() {
        new ShoppingCartPage().clickOnRegisterLoginLinkOnCheckoutPopup();
    }

    @And("I send name {string} and email {string} to signup")
    public void iSendNameAndEmailToSignup(String name, String email) {
        new ShoppingCartPage().sendDataToSignupFields(name, email);
    }

    @And("I click on button {string}")
    public void iClickOnButton(String button) {
        new LoginPage().clickOnLoginPageButton(button);
    }

    @And("I fill all details in signup page {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void iFillAllDetailsInSignupPage(String title, String Password, String Day, String Month, String Year, String FirstName, String LastName, String Address1, String Address2, String Country, String State, String City, String ZipCode, String MobileNumber) {
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

    @And("I click on Create Account button")
    public void iClickOnCreateAccountButton() {
        new LoginPage().clickOnCreateAccount();
    }

    @Then("I see account created message {string}")
    public void iSeeAccountCreatedMessage(String message) {
        Assert.assertEquals(new LoginPage().getAccountCreatedMessage(), message);
    }

    @And("I click on continue button")
    public void iClickOnContinueButton() {
        new LoginPage().clickOnContinueButton();
    }

    @Then("I should see the text {string} {string}")
    public void iShouldSeeTheText(String text, String name) {
        Assert.assertEquals(new LoginPage().getLoggedInAsUserNameText(), text + name);
    }

    @And("I click on header menu option {string}")
    public void iClickOnHeaderMenuOption(String option) {
        new Homepage().clickOnHeaderTab(option);

    }

    @And("I should see the text on checkout page {string}")
    public void iShouldSeeTheTextOnCheckoutPage(String checkOut) {
        new ShoppingCartPage().clickOnProceedToCheckoutButton();
    }

    @And("I enter details into comment area {string}")
    public void iEnterDetailsIntoCommentArea(String message) {
        new ShoppingCartPage().sendTextToCommentArea(message);
    }

    @And("I click on place order button")
    public void iClickOnPlaceOrderButton() {
        new ShoppingCartPage().clickOnPlaceOrderButton();

    }

    @And("I enter payment details {string} {string} {string} {string} and {string}")
    public void iEnterPaymentDetailsAnd(String name, String cNumber, String CVCNumber, String eMonth, String eYear) {
        new PaymentPage().sendPaymentDetails(name, cNumber, CVCNumber, eMonth, eYear);
    }

    @And("I click on Pay and Confirm Order button")
    public void iClickOnPayAndConfirmOrderButton() {
        new ShoppingCartPage().clickOnPayAndConfirmOrderButton();
    }

    @Then("I should see the order confirmation message {string}")
    public void iShouldSeeTheOrderConfirmationMessage(String message) {
        String actualText2 = new ShoppingCartPage().verifyOrderSuccessfulMessage();
        Assert.assertEquals(actualText2, "Congratulations! Your order has been confirmed!");
    }

    @Then("I should see the account deleted message {string}")
    public void iShouldSeeTheAccountDeletedMessage(String message) {
        new LoginPage().clickOnDeleteAccountLink();
        String actualText3 = new LoginPage().verifyDeleteAccountText();
        Assert.assertEquals(actualText3, "ACCOUNT DELETED!");
    }

    @Then("I click on continue button after deleting account")
    public void iClickOnContinueButtonAfterDeletingAccount() {
        new LoginPage().clickOnContinueButton();
    }

    @Then("I should see the login page text {string}")
    public void iShouldSeeTheLoginPageText(String text) {
        new NewLoginPage().verifyLoginText();
    }

    @And("I enter {string} email and {string} password for login")
    public void iEnterEmailAndPasswordForLogin(String email, String password) {
        new NewLoginPage().enterLoginEmail(email);
        new NewLoginPage().enterLoginPassword(password);
    }

    @And("I click on header menu option Logout")
    public void iClickOnHeaderMenuOptionLogout() {
        new ShoppingCartPage().clickOnLogOut();
    }

    @Then("I click on cross button to remove the product from the cart")
    public void iClickOnCrossButtonToRemoveTheProductFromTheCart() {
        new ShoppingCartPage().clickOnCrossButton();
    }

    @Then("I should see the delivery address is same address filled at the time registration of account {string}")
    public void iShouldSeeTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount(String Address1) {
        String actualText4 = new ExtraPage().verifyDeliveryAddress();
        Assert.assertEquals(actualText4, "449A kingston");
    }

    @And("I should see billing address is same address filled at the time registration of account {string}")
    public void iShouldSeeBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount(String address) {
        String actualText5 = new ExtraPage().verifyBillingAddress();
        Assert.assertEquals(actualText5, "449A kingston");
    }

    @And("I click on download invoice after order success")
    public void iClickOnDownloadInvoiceAfterOrderSuccess() {
        new ExtraPage().clickOnDownloadInvoiceButtonAfterOrderSuccessMessage();
    }

    @And("I click on continue button after order success")
    public void iClickOnContinueButtonAfterOrderSuccess() {
        new ExtraPage().clickOnContinueButtonAfterOrderSuccessMessage();
    }
}
