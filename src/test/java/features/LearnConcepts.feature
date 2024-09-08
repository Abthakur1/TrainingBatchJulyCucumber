Feature: This feature is used to learn cucumber concepts

  @Regression
  Scenario: Test Basics 1
    When I go to login page
    And I enter username in email field
    And I enter password in the password field
    And I click on submit button
    Then I verify that Shopping Cart page is displayed


@Smoke
  Scenario: Test Basics 2
    When I click Buttons option
    And I click on checkboxes option
    Then I verify that checkboxes are displayed