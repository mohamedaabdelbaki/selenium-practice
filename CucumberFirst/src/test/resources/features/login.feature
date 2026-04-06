Feature: Login feature

  Scenario: verify user can see logOut btn

  Given user logedin
    When user enter valid email,password,login
    Then user should  see logout Btn