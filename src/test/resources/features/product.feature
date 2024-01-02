@regression
Feature: Product page
  As a user, i would like to navigate to the product page

  Background:
    Given I am on homepage

  @author_shraddha @regression @smoke @sanity
  #Test case 8
  Scenario: Verify All Products and product detail page
    When  Click on Product button
    And Verify user is navigated to ALL PRODUCTS page successfully
    Then Click on 'View Product' of first product
    And User is landed to product detail page
    And I should see product name "Blue Top"
    And I should see category "Category: Women > Tops"
    And I should see price "Rs. 500"
    And I should see availability "Availability: In Stock"
    And I should see condition "Condition: New"
    And I should see brand "Brand: Polo"

  @author_shraddha @regression
    #Test case 9
  Scenario: Search Product
    When  Click on Product button
    And Verify user is navigated to ALL PRODUCTS page successfully
    Then Enter product name "Blue Top" in search input and click search button
    And Verify SEARCHED PRODUCTS is visible
    And Verify all the products related to search are visible

  @author_shraddha @regression
  #Test case 13
  Scenario: Verify Product quantity in Cart
    When  Click 'View Product' for any product on home page
    Then  I should see product name "Blue Top"
    And I should see category "Category: Women > Tops"
    And I should see price "Rs. 500"
    And I should see availability "Availability: In Stock"
    And I should see condition "Condition: New"
    And I should see brand "Brand: Polo"
    And I increase the quantity "4"
    And Click Add to cart button
    And Click View Cart button
    And Verify that product is displayed in cart page with exact quantity

  @author_shraddha @regression
   #Test case 19
  Scenario: User should view and cart brand products
    When Click on Product button
    Then  I click on "Polo" brand in Brands tab
    And I should see BRAND - POLO PRODUCTS page title
    And I click on Madame brand in Brands tab
    And I should see BRAND - MADAME PRODUCTS page title

  @author_shraddha @regression
    #Test case 21
  Scenario: User should add review on product
    When I click on products tab
    Then Verify user is navigated to ALL PRODUCTS page successfully
    And  Click on 'View Product' of first product
    And I enter "Shraddha" name at your name field
    And I enter "tamudhaduk@gmail.com" email at email address field
    And I enter "This is a nice product." message to review here field
    And I click on review submit button
    Then I should see "Thank you for your review." message

  @author_shraddha @regression
    #Test case 22
    Scenario: User should add to cart from recommended items
      When I scroll down up to recommended items text
      Then I should see "RECOMMENDED ITEMS" text
      And I add to cart "Stylish Dress" product from recommended items
      And Click View Cart button
      Then I verify the product Stylish Dress in shopping cart






