# Autor: Rodrigo Acosta Restrepo

  @stories
  Feature: uTest register
    As a user, I want to be able to register on the uTest page
  @scenario1
  Scenario: Enter the registry by clicking on Join Today
    Given than Rodrigo wants to register in uTest
    When He clicks on the Join Today button
    Then he opens the registration form

    @scenario2
    Scenario: Upload form to fill out
      Given than Rodrigo inserts data in the form
      When He starts the record
      Then He creates a new user on uTest page