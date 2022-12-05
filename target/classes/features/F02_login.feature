@smoke

  Feature: user login to the web application

    Scenario: user login with valid email and password
      Given user should navigate to login page
      When user enter email "ahmedeldaly685@gmail.com" and password "Ahmed_1234"
      And user click on login button
      Then user login to the web application successfully


    Scenario: user login with invalid email and password
      Given user should navigate to login page
      When user enter email "ahmed123@gmail.com" and password "Ahmed1234"
      And user click on login button
      Then user could not login to the web application