Feature: Purgomalum detects added profanity words

  Scenario Outline: Method contains profanity returns true if added profanity word is found
    When I add "<word>" term to profanitylist
    And I call containsprofanity method with this "<text>"
    Then API returns "<response>"
    Examples:
      | word  | text                      | response |
      | puta  | This text is still clean  | false    |
      | puta  | Hijo de puta              | true     |
      | perra | Hijo de puta              | false    |
      | puta  | Hijo de p_u_ta            | true     |
      | puta  | Hijo de *p*u*ta*          | true     |