Feature: API throw errors

  Scenario Outline: Simple text with default options
    When Method json is called with text: "<text>" and added words "<words>" and only one "<replace_word>"
    Then "<expected_text>" is returned from API
    Examples:
      | words                       | replace_word        | text                          | expected_text                 |
      | puta                        | CENSORED            | This text is clean            | This text is clean            |
      | puta, puto                  | CENSORED            | This text is fucking clean    | This text is CENSORED clean   |
      | puta, puta                  | CENSORED            | Puta basura                   | CENSORED basura               |
      |                             | CENSORED            | Puta locura                   | Puta locura                   |
      | puta                        | CENSORED            | PuTA basura                   | CENSORED basura               |
      | puta                        | CENSORED            | PUUUUUUUUTAAAAAAA basura      | CENSORED basura               |
      | puta                        | CENSORED            | P.U.T.A basura                | CENSORED basura               |
