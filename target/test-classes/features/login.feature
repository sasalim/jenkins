Feature: to test login functionality

  @tag1
  Scenario Outline: Check login is successful with valid credentials
    Check login is successful with valid credentials

    Given user is on login page
    When user enters <username> and <password>
    And  clicks on login button
    Then user is navigated to the home page

    Examples: 
      | username                | password    |
      | salimsaafi89@gmail.com  | kelibia2023 |
      
      
    @tag2
  Scenario Outline: Check login is failed with invalid credentials
    Check login is failed with invalid credentials

    Given user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then error message

    Examples: 
      | username                 | password   |
      | salimsaafi89@gmail.com   | kelibia    |
      