package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class ProductPage extends Utility {

    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[@href='/products']")
    WebElement productLink;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='All Products']")
    WebElement allProductText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]")
    WebElement viewProduct;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'product-details']/div[2]/div/h2")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'product-information']/p[1]")
    WebElement productCategory;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'product-information']/span/span")
    WebElement productPrice;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'product-information']/p[2]")
    WebElement productAvailability;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'product-information']/p[3]")
    WebElement productCondition;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'product-information']/p[4]")
    WebElement productBrand;

    @CacheLookup
    @FindBy(xpath = "//input[@id='search_product']")
    WebElement searchProduct;

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-search']")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Searched Products']")
    WebElement getSearchedProducts;

    @CacheLookup
    @FindBy(xpath = "//div[@class='productinfo text-center']//p[contains(text(),'Blue Top')]")
    WebElement getProductRelatedSearch;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-image-wrapper']//div//p")
    WebElement blueTop;

    @CacheLookup
    @FindBy(xpath = "//div[@class='modal-content']//div//button")
    WebElement continueAfterAddToCartElement;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-image-wrapper']/div/div/p")
    List<WebElement> productList;

    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-default add-to-cart']")
    WebElement addToProductButton;

    @CacheLookup
    @FindBy(css = "a[href='/product_details/1']")
    WebElement homePageProduct;

    @CacheLookup
    @FindBy(xpath = "//input[@id='quantity']")
    WebElement productQuantity;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    WebElement viewCartLinkInSuccessMessage;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/brand_products/Polo']")
    WebElement poloBrand;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brand - Polo Products']")
    WebElement brandPoloProducts;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/brand_products/Madame']")
    WebElement madame;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brand - Madame Products']")
    WebElement brandMadameProducts;

    @CacheLookup
    @FindBy(xpath = "//div[@class='productinfo text-center']//p[contains(text(),'Men Tshirt')]")
    WebElement menTShirtText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Men Tshirt']")
    WebElement menTShirtShoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='name']")
    WebElement name;

    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//textarea[@id='review']")
    WebElement review;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-review']")
    WebElement submitButton;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Thank you for your review.']")
    WebElement thankYouText;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='recommended items']")
    WebElement recommendedTextElement;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='recommended items']")
    WebElement recommendedItemText;

    @CacheLookup
    @FindBy(xpath = "//div[@id = 'recommended-item-carousel']//div[@class = 'productinfo text-center']/p")
    List<WebElement> recommendedItemsProductsList;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Stylish Dress']")
    WebElement stylishDress;


    public void clickOnProduct(){
        log.info("Click on product " + productLink.toString());
        clickOnElement(productLink);
    }

    public String verifyAllProductText() {
        log.info("Verify all product text " + allProductText.toString());
        return getTextFromElement(allProductText);
    }

    public void clickOnViewProduct() {
        log.info("Click on view product " + viewProduct.toString());
        clickOnElement(viewProduct);
    }

    public String verifyTheURL() {
        waitUntilVisibilityOfElementLocated(By.xpath("//a[normalize-space()='Write Your Review']"), 5);
        log.info("Getting Product Details Page URL : ");
        System.out.println(driver.getCurrentUrl());
        return driver.getCurrentUrl();
    }

    public String getProductName() {
        log.info("Getting product name : " + productName.toString());
        return getTextFromElement(productName);
    }

    public String getProductCategory() {
        log.info("Getting product category : " + productCategory.toString());
        return getTextFromElement(productCategory);
    }

    public String getProductPrice() {
        log.info("Getting product price : " + productPrice.toString());
        return getTextFromElement(productPrice);
    }

    public String getProductAvailability() {
        log.info("Getting product availability : " + productAvailability.toString());
        return getTextFromElement(productAvailability);
    }

    public String getProductCondition() {
        log.info("Getting product condition : " + productCondition.toString());
        return getTextFromElement(productCondition);
    }

    public String getProductBrand() {
        log.info("Getting product brand : " + productBrand.toString());
        return getTextFromElement(productBrand);
    }

    public void enterProductName(String product) {
        log.info("Enter product name " + searchProduct.toString());
        sendTextToElement(searchProduct, product);
    }

    public void clickOnSearchButton() {
        log.info("Click on search " + searchButton.toString());
        clickOnElement(searchButton);
    }

    public String verifySearchedProducts() {
        log.info("Verify searched products " + getSearchedProducts.toString());
        return getTextFromElement(getSearchedProducts);
    }

    public String verifyProductRelatedSearch() {
        log.info("Verify product related search " + getProductRelatedSearch);
        return getTextFromElement(getProductRelatedSearch);
    }

//    public void clickOnBlueTop() throws InterruptedException {
//        log.info("Click on blue top " + blueTop.toString());
//        mouseHoverToElement(blueTop);
//        Thread.sleep(2000);
//        WebElement getADemo = driver.findElement(RelativeLocator.with(By.xpath("//div[@class='product-image-wrapper']//div/a")).below(blueTop));
//        getADemo.click();
//    }

    public void mouseHoverAndClickAddToCartOnProduct(String pName) {

        for (WebElement pr : productList) {
            if (pr.getText().equalsIgnoreCase(pName)) {
                mouseHoverToElement(pr);
                log.info("Hovering mouse over " + pName + " : " + productList.toString());
                try {
                    addToProductButton.click();
                } catch (Exception e) {
                    JavascriptExecutor executor = (JavascriptExecutor) driver;
                    executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[@class='btn btn-default add-to-cart']")));
                }
                log.info("Click on " + pName + " Add to Cart button : " + productList.toString());
                break;
            }
        }
    }

    public void clickOnContinueAfterAddToCart() {
        log.info("Click on continue " + continueAfterAddToCartElement.toString());
        clickOnElement(continueAfterAddToCartElement);
    }

    public void clickOnHomePageProduct() {
        log.info("Click on product " + homePageProduct.toString());
        clickOnElement(homePageProduct);
    }

    public void sendQuantity(String qty) {
        log.info("Change product quantity " + productQuantity.toString());
        productQuantity.clear();
        sendTextToElement(productQuantity, qty);
    }

    public void clickOnAddToCart() {
        log.info("Click on add to cart " + addToCartButton.toString());
        clickOnElement(addToCartButton);
    }

    public void clickOnViewCartLinkInSuccessMessage() {
        log.info("Click on view cart " + viewCartLinkInSuccessMessage.toString());
        clickOnElement(viewCartLinkInSuccessMessage);
    }

    public void clickOnBrand() throws InterruptedException {
        Thread.sleep(5000);
        log.info("Click on brand " + poloBrand.toString());
        clickOnElement(poloBrand);
    }

    public String verifyBrandPoloProducts(){
        log.info("Verify Brand polo products " + brandPoloProducts.toString());
        return getTextFromElement(brandPoloProducts);
    }

    public void clickOnMadame(){
        log.info("Click on Madame " + madame.toString());
        clickOnElement(madame);
    }

    public String verifyBrandMadameProducts(){
        log.info("Verify brand madame products " + brandMadameProducts.toString());
        return getTextFromElement(brandMadameProducts);
    }

    public String verifyMenTShirtText(){
        log.info("Verify Men TShirt Text " + menTShirtText.toString());
        return getTextFromElement(menTShirtText);
    }

    public void enterName(String name1){
        log.info("Enter name " + name.toString());
        sendTextToElement(name, name1);
    }
    public void enterEmail(String email1){
        log.info("Enter email " + email.toString());
        sendTextToElement(email, email1);
    }

    public void enterReview(String review1){
        log.info("Enter review " + review.toString());
        sendTextToElement(review, review1);
    }
    public void clickOnSubmit(){
        log.info("Click on submit " + submitButton.toString());
        clickOnElement(submitButton);
    }

    public String verifyThankYouText(){
        log.info("Verify Thank you text " + thankYouText.toString());
        return getTextFromElement(thankYouText);
    }
    public void scrollDownToViewRecommended() {
        log.info("Scroll down " + recommendedTextElement.toString());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", recommendedTextElement);
    }

    public String verifyRecommendedItemText(){
        log.info("Verify recommended item text " + recommendedItemText.toString());
        return getTextFromElement(recommendedItemText);
    }

    public void clickAddToCartOnRecommendedItems(String pName){
        for (WebElement pr : recommendedItemsProductsList) {
            if(pr.getText().equalsIgnoreCase(pName)) {
                driver.findElement(with(By.xpath("//a[@class='btn btn-default add-to-cart']")).below(pr)).click();
                log.info("Click on " + pName + " Add to Cart button : " + productList.toString());
                break;
            }
        }
    }

    public String verifyStylishDressText(){
        log.info("Verify stylish dress text " + stylishDress.toString());
        return getTextFromElement(stylishDress);
    }




}