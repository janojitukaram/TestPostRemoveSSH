Feature: used to test the login functionality

  Scenario: User should able to login with valid credentials
    Given user should be in login page
    When user enter credentials with valid username and password
    And user clicked on submit button
    Then user should successfully logged into home screen
