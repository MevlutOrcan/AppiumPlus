@b
Feature: Switches

  Background: First Functions
    Given App loaded
    When   User on the main page
    And   User clicks to "API Demos" button
    Then  User on the "API Demos" monitor
    And   User clicks to "Preference" button
    Then  User on the "Preference" monitor
    When  User clicks to "9. Switch" button

  Scenario: Switches
    And   User clicks check box
    And   User cliks switch button
    And   screenshot al

     Scenario: SwitchesControl
       And check box secili olmali
       And ilk switch butonu kapali
       And ikici switch butonu acik
       Then screenshot al


