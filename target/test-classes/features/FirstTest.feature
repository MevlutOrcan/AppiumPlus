Feature:  Ilk test
@a
  Scenario: Ilk test
    Given App loaded
    And   User on the main page
    And   User clicks to API Demos Button
    Then  User on the API Demos monitor
    And   User clicks preference button
    Then  User on the Preference monitor
    And   User clicks Preference Dependencies button
    And   Check box must be choosed
    And   User clicks WIFI Settings
    Then  User sees to WIFI Settings popup
    And   User sends text
    And   User clicks to OK button
