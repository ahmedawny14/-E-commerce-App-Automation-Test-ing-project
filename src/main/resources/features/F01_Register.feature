@smoke

Feature: user could register with a new account

  Scenario: User register by entering valid data
    Given user go to register page
    When user select Gender
    And user enter First Name "Ahmed"
    And user Enter Last Name  "Awny"
    And user Enter Date of birth
    And user enter valid email
    And  user enter matched password and confirmed password "Ahmed_1234"
    And   user clicks on register button
    Then   success message is displayed

