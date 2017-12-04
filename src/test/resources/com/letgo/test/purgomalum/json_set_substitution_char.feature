Feature: You can set a custom char that replaces detected words

  Scenario Outline: Simple text with default options
    When Method json is called with text: "<text>" and added words "<words>" and "<replace_char>"
    Then "<expected_text>" is returned from API
    Examples:
      | words                       | replace_char        | text                          | expected_text                 |
      | puta                        | _                   | This text is clean            | This text is clean            |
      | puta, puto                  | _                   | This text is fucking clean    | This text is _______ clean    |
      | puta, puta                  | _                   | Puta basura                   | ____ basura                   |
      | puta                        | ~                   | Puta locura                   | ~~~~ locura                   |
      | puta                        | -                   | PuTA basura                   | ---- basura                   |
      | puta                        | =                   | PUUUUUUUUTAAAAAAA basura      | ==== basura                   |
      | puta                        | '                   | P.U.T.A basura                | '''' basura                   |
