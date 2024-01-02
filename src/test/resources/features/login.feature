@regression
Feature: Login functionality
  As a user I should be able to register successfully

  Background:
    Given I am on homepage

  @author_shraddha @regression @smoke @sanity
    #Test case 2
  Scenario: Login User with Correct email and password
    When Click Signup link
    Then Verify Login to your account is visible
    And Enter "tamudhaduk@gmail.com" email address and "Dhaduk@123" password
    And Click login button
#    And Click 'Delete Account button
#    And Verify that ACCOUNT DELETED! is visible

  @author_shraddha @regression
  #Test case 3
  Scenario: Login User with incorrect email and password
    When Click Signup link
    Then Verify Login to your account is visible
    And Enter "tamudhaduk@gmail.com" email address and "Dhaduk@123" password
    And Click login button
    And Verify error 'Your email or password is incorrect!' is visible

  @author_shraddha @regression
  #Text case 4
  Scenario: Logout User
    When Click Signup link
    Then Verify Login to your account is visible
    And Enter "tamudhaduk@gmail.com" email address and "Dhaduk@123" password
    And Click login button
    And Verify that Logged in as username is visible

  @author_shraddha @regression
     #Test case 12
  Scenario: User should add products in cart
    When I click on the products tab
    Then I add product Men TShirt to the cart
    And I click on continue shopping link
    And I add product Blue Top to the cart
    And I click view cart in popup
    Then I verify product "Blue Top" in shopping cart
    Then I verify product "Men Tshirt" in shopping cart


