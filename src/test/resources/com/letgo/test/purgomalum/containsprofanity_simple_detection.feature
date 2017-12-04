Feature: Purgomalum detects profanity words

  Scenario Outline: Method containsprofanity returns true if profanity word is found
    When I call containsprofanity method with this "<text>"
    Then API returns "<response>"
    Examples:
      | text                        | response |
      | This text is clean          | false    |
      | This text is fucked         | true     |
      | This text is f u c k e d    | true     |
      | This text is f_u_c_k_e_d    | true     |
      | This text is f u_ck_e_d     | true     |

