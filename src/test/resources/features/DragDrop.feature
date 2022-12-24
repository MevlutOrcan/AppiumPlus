@c
Feature: DragDrop
  Scenario: DragDrop
    Given App loaded
    When   User on the main page
    And   User clicks to "API Demos" button
    Then  User on the "API Demos" monitor
    And   User clicks to "Views" button
    Then  User on the "Views" monitor
    When  User clicks to "Drag and Drop" button
    And User drags first ball drops to second ball
    Then User sees the fourth ball
    And screenshot al