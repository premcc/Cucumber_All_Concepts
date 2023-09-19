Feature: 
  PractiseFuck

  Scenario: 
    Verify Face


  Scenario Outline: 
    Given user is on login page
    Then he enters "<username>" and "<password>"
    Then click on login button
    And close the browser

    Examples: 
      | username    |  |password|
      |  6301315984| |premchand|
      |6301325985| |hjjhbhbh|
     
    