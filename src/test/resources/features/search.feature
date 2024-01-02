@regression
Feature: As a user
  I should able to add to product in the cart

  Background:
    Given I am on homepage

  @author_shraddha @regression @sanity @smoke
    #Test case 20
  Scenario: User should search product and verify cart after login
    When I click on "products" tab
    And Verify user is navigated to "ALL PRODUCTS" page successfully
    Then I enter product name "Men Tshirt" in search bar
    And I click on search button
    Then I should see the text "SEARCHED PRODUCTS" on the page
    And I add product "Men Tshirt" to the cart
    And I click on "view cart" in popup
    And Click Signup link
    Then Verify text Login to your account is visible
    And I enter "tamudhaduk@gmail.com" email and "Dhaduk@123" password for loginpage
    And Click on "login"
    And I click on header menu option Cart
    Then I verify the product "Men Tshirt" in shopping cart