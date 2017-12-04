Feature: You can add words to list of profanity words
  In this case you add your own profanity word or words

  Scenario Outline: Simple text with default options
    When Method json is called with text: "<text>" and added words "<words>"
    Then "<expected_text>" is returned from API
    Examples:
      | words                                                           | text                          | expected_text                 |
      | puta                                                            | This text is clean            | This text is clean            |
      | puta, puto                                                      | This text is fucking clean    | This text is ******* clean    |
      | puta, puta                                                      | Puta basura                   | **** basura                   |
      | puta, puto, bueno, malo, alto, bajo, sucio, asco, duro, blando  | This text is blando           | This text is ******           |
      | puta                                                            | PUTA basura                   | **** basura                   |
      | puta                                                            | PuTA basura                   | **** basura                   |
      | puta                                                            | PUUUUUUUUTAAAAAAA basura      | **** basura                   |
      | puta                                                            | P.U.T.A basura                | **** basura                   |
      | puta, puto, bueno, malo, alto, b_a_j_o                          | B__A__J__O presion            | ******* presion               |
