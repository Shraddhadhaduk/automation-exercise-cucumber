package com.automationexercise.steps;

import com.automationexercise.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SearchSteps {
    @When("I click on {string} tab")
    public void iClickOnTab(String product){
        new ProductPage().clickOnProduct();
    }

    @And("Verify user is navigated to {string} page successfully")
    public void verifyUserIsNavigatedToPageSuccessfully(String page) {
        String actualText = new ProductPage().verifyAllProductText();
        Assert.assertEquals(actualText, "ALL PRODUCTS");
    }

    @Then("I enter product name {string} in search bar")
    public void iEnterProductNameInSearchBar(String name) {
        new CheckOutPage().enterProductName(name);
    }

    @And("I click on search button")
    public void iClickOnSearchButton() {
        new CheckOutPage().clickOnSearchButton();
    }

    @Then("I should see the text {string} on the page")
    public void iShouldSeeTheTextOnThePage(String text) {
        String actualText1 = new CheckOutPage().verifyMenTShirtText();
        Assert.assertEquals(actualText1, "Men Tshirt");
    }

    @And("I add product Men Tshirt to the cart")
    public void iAddProductMenTshirtToTheCart(String product) {
        new ProductPage().mouseHoverAndClickAddToCartOnProduct(product);
    }

    @And("I click on {string} in popup")
    public void iClickOnInPopup(String value) {
        new ProductPage().clickOnViewCartLinkInSuccessMessage();
    }


    @And("I click on header menu option Signup \\/ Login")
    public void iClickOnHeaderMenuOptionSignupLogin(String option) {
        new Homepage().clickOnSignUpLink();

    }

    @Then("Verify text Login to your account is visible")
    public void verifyTextLoginToYourAccountIsVisible() {
        new NewLoginPage().verifyLoginText();
    }
    @And("I enter {string} email and {string} password for loginpage")
    public void iEnterEmailAndPasswordForLoginpage(String email, String password) {
        new NewLoginPage().enterLoginEmail(email);
        new NewLoginPage().enterLoginPassword(password);
    }

    @And("Click on {string}")
    public void clickOn(String button) {
        new LoginPage().clickOnLoginPageButton(button);
    }

    @And("I click on header menu option Cart")
    public void iClickOnHeaderMenuOptionCart() {
        new CheckOutPage().clickOnCartLink();
    }

    @Then("I verify the product {string} in shopping cart")
    public void iVerifyTheProductInShoppingCart(String text) {
        String actualText1 = new CheckOutPage().verifyMenTShirtShoppingCartText();
        Assert.assertEquals(actualText1, "Men Tshirt");
    }
}
