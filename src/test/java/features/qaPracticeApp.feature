Feature: QA Practice App Automation

  Background: Do the setup
    Given I do the selenium setup

  Scenario: Login Test
    Given I launch to the app
    When I go to login page
    And I enter username in email field
    And I enter password in the password field
    And I click on submit button
    Then I verify that Shopping Cart page is displayed
    And I close the browser

    Scenario: Button Test
      Given I launch to the app
      When I click Buttons option
      And I click on checkboxes option
      Then I verify that checkboxes are displayed
      And I close the browser

      Scenario Outline: Test Login with paramteres
        Given I launch to the app with urls as <url>
        When I go to login page
        And I enter username as <username> in email field
        And I enter password as <password> in the password field
        And I click on submit button
        Then I verify that Shopping Cart page is displayed
        And I close the browser
        Examples:
          | url                              | username        | password |  |
          | https://qa-practice.netlify.app/ | admin@admin.com | admin123 |  |
