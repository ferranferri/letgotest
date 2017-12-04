Feature: Json method with all by default options
  When json method is called with a text, a number of options are applied by default.
  For example: it is always applied fill_char option with '*' char for substitution.

  Scenario Outline: Simple text with default options
    When Method json is called with text: "<text>"
    Then "<expected_text>" is returned from API
    Examples:
      | text                              | expected_text                 |
      | This text is clean                | This text is clean            |
      | This text is fucking clean        | This text is ******* clean    |
      | This text is fuc*kiNg clean       | This text is ******* clean    |
      | This text is **f_u-ck_in_g clean  | This text is ********* clean  |
