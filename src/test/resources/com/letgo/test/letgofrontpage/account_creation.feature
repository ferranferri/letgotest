Feature: As a non-registered user, I can create an account

  Scenario: User
    Given Chrome Driver Is Started
    And URL "https://us.letgo.com/en" is loaded
    Then Select stay at US
    And Click login
    And Click Sing Up
    And Fill email and password
    And Fill Full Name Field
    And Click Complete button


