Feature: to test modification  functionality

  @tag3
Scenario Outline: modification of user name
    
    Given is navigated to the home page
    When clicks on information button
    And  clear  <firstname>
    And  whrite <firstname1>
    And  enter  <password>
    And  clicks save
    Then information is modified
    

    Examples: 
      | firstname |firstname1|password   |
      | salim     | selim    |kelibia2023|
      