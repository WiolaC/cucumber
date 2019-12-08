Feature: Powitania w różnych językach

  Scenario Outline: Powitanie w języku polskim
    Given Stworzona instancja klasy obiektu HelloWorld
    When Wprowadzono język <jezyk>
    Then Wyświetlony został komunikat <powitanie>

    Examples:
      | jezyk | powitanie        |
      | "pl"  | "Witaj Świecie!" |
      | "en"  | "Hello world!"   |
      | "cs"  | "cos"            |
      | "de"  | "Język nieznany!" |



