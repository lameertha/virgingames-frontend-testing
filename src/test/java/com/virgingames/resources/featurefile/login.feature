Feature: Login functionality
  As A User
  I Want to login to virgin games website
  So I can Login to website

  Scenario Outline: Verify User should not login successfully with incorrect credentials
    Given I am on home page
    And I click on Login page
    When I enter "<username>" in username field
    And I enter "<password>" in password field
    And I click on login button
    Then I should not login to system successfully and shows "<errorMessage>"

    Examples:
      | username | password     | errorMessage                                                              |
      | Lamee    | lameethev1988 | Please try again, your username/email or password has not been recognised |
      | Thenu    | thenuthev2000 | Please try again, your username/email or password has not been recognised |
      | Raj      | rajthev5000 | Please try again, your username/email or password has not been recognised |
