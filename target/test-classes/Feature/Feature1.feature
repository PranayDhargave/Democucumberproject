@tag
Feature: Login Functionslity
  I want to test the login functionslity

  @tag1
  Scenario Outline: Title of your scenario
    Given I navigate to application "https://codepen.io/login?secure=true"
    When I enter username "<username>" and password "<password>"
    And I click on login button
    Then I should able to login
    Examples:
    |username|password|
    |lmohit|mohitl|

  @tag1
  Scenario Outline: UnSuccessful login
    Given I navigate to application "https://codepen.io/login?secure=true"
    When I enter username "<username>" and password "<password>"
    And I click on login button
    Then I should not able to login
    Examples:
		|username|password|
    |krishna|krishna123|
    |gajanan|krishna|