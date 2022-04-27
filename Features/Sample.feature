Feature: all login tests

  Background: before every scenarios
    Given Browser should be opened
    And It should be maximized

  @login   @valid
  Scenario: to test the functionality of login button for valid input
    Given I am on login page
    #When I enter correct username and password
    When I enter username as "admin" and password as "admin123"
    And I click on login button
    Then I should be redirected to home page

  @login  @invalid
  Scenario: to test the functionality of login button for invalid input
    Given I am on login page
    #When I enter incorrect username and password
    When I enter username as "xyz" and password as "abc"
    And I click on login button
    Then I should get an error

  @login @blank
  Scenario: to test the functionality of login button for blank input
    Given I am on login page
   # When I dont enter username and password
    When I enter username as "" and password as ""
    And I click on login button
    Then I should get another error

    @userReg
    Scenario: to test the functionality of submit button for valid data insertion
      Given I am on user registration page
      When I Enter below data
      | amol | ujagare | amol@gmail.com | 989890 |
      Then record should be added

  @subscription
  Scenario Outline: to test the functionality of submit button for multiple data insertion

    Given I am on subscription page
    When I Enter <name> , <email> , <number>
    And I click on subscribe button
    Then user should be subscribed

    Examples:
      | name      | email       | number |
      | Jayashree | j@gmail.com | 123456 |
      | Mega      | m@gmail.com | 234567 |
      | Rahul     | r@gmail.com | 345678 |
      | Amol      | a@gmail.com | 456789 |


