Feature: Search by keyword

  Scenario: Searching for a term
    Given Didier wants to search a product in the page
    When he searches for "dress"
    Then all the result titles should contain the word "dress"

  Scenario: Login Successful
    Given Didier has an active account
    When he inserts their credentials digegu0532@gmail.com and didi123
    Then he should have access to manage his account

  //Scenario: successful purchase
    //Given Didier has an active account
    //When he wants to buy a product
    //Then he should have access to manage his account