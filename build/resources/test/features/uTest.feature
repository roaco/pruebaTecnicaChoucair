# Autor: Rodrigo Acosta Restrepo

  @stories
  Feature: uTest register
    As a user, I want to be able to register on the uTest page
  @scenario1
  Scenario Outline: Enter the registry by clicking on Join Today
    Given than Rodrigo wants to register in uTest
    When He clicks on the Join Today button
      | strFirstName | strLastName  | strEmailAddress  | strMonthBirth  | strDayBirth  | strYearBirth | strInputLanguage | strInputCity | strInputZIP  | strInputCountry  | strPassword | strConfirmPassword  |
      |<strFirstName>|<strLastName>|<strEmailAddress>|<strMonthBirth>|<strDayBirth>|<strYearBirth>|<strInputLanguage>|<strInputCity>|<strInputZIP>|<strInputCountry>|<strPassword>|<strConfirmPassword>|
    Then he opens the registration form
    | strAnswerd   |
    | <strAnswerd> |
    Examples:
      | strFirstName | strLastName  | strEmailAddress  | strMonthBirth  | strDayBirth  | strYearBirth | strInputLanguage | strInputCity | strInputZIP  | strInputCountry  | strPassword | strConfirmPassword  | strAnswerd      |
      | Rodrigo      | Acosta       | rodrigo4@test.com  | January       | 20           |  1994        | Spanish          |  Armenia     | 630001       |  Colombia        | Prueba123*   | Prueba123*        | Complete Setup  |