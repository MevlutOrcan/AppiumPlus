Feature: Api Demos
@q
  Scenario: PopUp Test
    Given App loaded
    And User on the main page
    And User clicks to "API Demos" button
    And User clicks to "Views" button
    And User clicks to "Popup Menu" button
    And User clicks 0 Button
  And User clicks to "Search" button
  And User wait 2 sec
  And screenshot al
