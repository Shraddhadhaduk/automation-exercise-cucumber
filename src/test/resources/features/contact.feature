@regression
Feature: Contact Us Page

  Background:
    Given I am on homepage

@author_shraddha @sanity @smoke @regression
      #Test case 6
  Scenario: Contact Us Form
    When Click on 'Contact Us' button
    And  Verify GET IN TOUCH is visible
    Then Enter "Shraddha","tamudhaduk@gmail.com","about product","This product is good"
    And Click Submit button
    And Click OK button
    And Verify success message 'Success! Your details have been submitted successfully.' is visible
    And Click 'Home' button and verify that landed to home page successfully

  @author_shraddha @regression
    #Test case 18
  Scenario: User should view category products
    When I click on products tab
    Then I click on Women category
    And I click on Dress in women category
    And I should see "WOMEN - DRESS PRODUCTS" page title
    Then I click on Men category
    And I click on Tshirts in men category
    And I should see MEN - TSHIRTS PRODUCTS page title

  @author_shraddha @regression
    #Test case 25
    Scenario: User should scroll down and scroll up using Arrow button at bottom right corner
      When Scroll down footer
      Then Verify text SUBSCRIPTION
      And I click on arrow up button at bottom right corner
      And I should see the message "Full-Fledged practice website for Automation Engineers"

  @author_shraddha @regression
    #Test case 26
    Scenario: User should scroll down and scroll up without Arrow button
      When Scroll down footer
      Then Verify text SUBSCRIPTION
      And I scroll up
      And I should see the message "Full-Fledged practice website for Automation Engineers"