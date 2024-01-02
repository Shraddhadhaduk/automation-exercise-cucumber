package com.automationexercise.steps;

import com.automationexercise.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ProductSteps {
    @When("Click on Product button")
    public void clickOnProductButton(){
        new ProductPage().clickOnProduct();
    }

    @And("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        String actualText = new ProductPage().verifyAllProductText();
        Assert.assertEquals(actualText, "ALL PRODUCTS");
    }

    @Then("Click on {string} of first product")
    public void clickOnViewProductOfFirstProduct(String product) {
        new ProductPage().clickOnViewProduct();
    }

    @And("User is landed to product detail page")
    public void userIsLandedToProductDetailPage() {
        String actualText1 = new ProductPage().verifyTheURL();
        Assert.assertEquals(actualText1, "https://automationexercise.com/product_details/1");
    }

    @And("I should see product name {string}")
    public void iShouldSeeProductName(String name) {
        String actualText2 = new ProductPage().getProductName();
        Assert.assertEquals(actualText2, "Blue Top");
    }

    @And("I should see category {string}")
    public void iShouldSeeCategory(String category) {
        String actualText3 = new ProductPage().getProductCategory();
        Assert.assertEquals(actualText3, "Category: Women > Tops");
    }

    @And("I should see price {string}")
    public void iShouldSeePrice(String price) {
        String actualText4 = new ProductPage().getProductPrice();
        Assert.assertEquals(actualText4, "Rs. 500");
    }

    @And("I should see availability {string}")
    public void iShouldSeeAvailability(String availability) {
        String actualText5 = new ProductPage().getProductAvailability();
        Assert.assertEquals(actualText5, "Availability: In Stock");
    }

    @And("I should see condition {string}")
    public void iShouldSeeCondition(String condition) {
        String actualText6 = new ProductPage().getProductCondition();
        Assert.assertEquals(actualText6, "Condition: New");
    }

    @And("I should see brand {string}")
    public void iShouldSeeBrand(String brand) {
        String actualText7 = new ProductPage().getProductBrand();
        Assert.assertEquals(actualText7, "Brand: Polo");
    }

    @Then("Enter product name {string} in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton(String product) {
        new ProductPage().enterProductName(product);
        new ProductPage().clickOnSearchButton();
    }

    @And("Verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {
        String actualText8 = new ProductPage().verifySearchedProducts();
        Assert.assertEquals(actualText8, "SEARCHED PRODUCTS");
    }

    @And("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {
        String actualText9 = new ProductPage().verifyProductRelatedSearch();
        Assert.assertEquals(actualText9, "Blue Top");
    }

    @And("Hover over first product and click {string}")
    public void hoverOverFirstProductAndClick(String product) {
        new ProductPage().mouseHoverAndClickAddToCartOnProduct(product);
    }

    @Then("Click Continue Shopping button")
    public void clickContinueShoppingButton() throws InterruptedException {
        Thread.sleep(2000);
       new ProductPage().clickOnContinueAfterAddToCart();
    }


    @When("Click {string} for any product on home page")
    public void clickViewProductForAnyProductOnHomePage(String product) {
        new ProductPage().clickOnHomePageProduct();
    }


    @And("I increase the quantity {string}")
    public void iIncreaseTheQuantity(String qty) {
        new ProductPage().sendQuantity(qty);
    }

    @And("Click Add to cart button")
    public void clickAddToCartButton() {
        new ProductPage().clickOnAddToCart();
    }

    @And("Click View Cart button")
    public void clickViewCartButton() {
        new ProductPage().clickOnViewCartLinkInSuccessMessage();
    }

    @And("Verify that product is displayed in cart page with exact quantity")
    public void verifyThatProductIsDisplayedInCartPageWithExactQuantity() {
    }

    @Then("I click on {string} brand in Brands tab")
    public void iClickOnBrandInBrandsTab(String brand) throws InterruptedException {
        Thread.sleep(5000);
        new ProductPage().clickOnBrand();
    }

    @And("I should see BRAND - POLO PRODUCTS page title")
    public void iShouldSeeBRANDPOLOPRODUCTSPageTitle() {
        String actualText4 = new ProductPage().verifyBrandPoloProducts();
        Assert.assertEquals(actualText4, "BRAND - POLO PRODUCTS");
    }

    @And("I click on Madame brand in Brands tab")
    public void iClickOnMadameBrandInBrandsTab() {
        new ProductPage().clickOnMadame();
    }

    @And("I should see BRAND - MADAME PRODUCTS page title")
    public void iShouldSeeBRANDMADAMEPRODUCTSPageTitle() {
        String actualText5 = new ProductPage().verifyBrandMadameProducts();
        Assert.assertEquals(actualText5, "BRAND - MADAME PRODUCTS");
    }


    @And("I enter {string} name at your name field")
    public void iEnterNameAtYourNameField(String name) {
        new ProductPage().enterName(name);
    }

    @And("I enter {string} email at email address field")
    public void iEnterEmailAtEmailAddressField(String email) {
        new ProductPage().enterEmail(email);
    }

    @And("I enter {string} message to review here field")
    public void iEnterMessageToReviewHereField(String review) {
        new ProductPage().enterReview(review);
    }

    @And("I click on review submit button")
    public void iClickOnReviewSubmitButton() {
        new ProductPage().clickOnSubmit();
    }

    @Then("I should see {string} message")
    public void iShouldSeeMessage(String text) {
        String actualText6 = new ProductPage().verifyThankYouText();
        Assert.assertEquals(actualText6, "Thank you for your review.");
    }

    @When("I scroll down up to recommended items text")
    public void iScrollDownUpToRecommendedItemsText() {
        new ProductPage().scrollDownToViewRecommended();
    }

    @Then("I should see {string} text")
    public void iShouldSeeText(String text) {
        String actualText7 = new ProductPage().verifyRecommendedItemText();
        Assert.assertEquals(actualText7, "RECOMMENDED ITEMS");

    }

    @And("I add to cart {string} product from recommended items")
    public void iAddToCartProductFromRecommendedItems(String item) {
        new ProductPage().clickAddToCartOnRecommendedItems(item);

    }

    @Then("I verify the product Stylish Dress in shopping cart")
    public void iVerifyTheProductStylishDressInShoppingCart() {
        String actualText8 = new ProductPage().verifyStylishDressText();
        Assert.assertEquals(actualText8, "Stylish Dress");
    }
}

