@f
Feature: Scrolling

  Background: Scroll
    Given App loaded
    And User on the main page
    And User clicks to "API Demos" button
    And User clicks to "Views" button


  Scenario:
    And User clicks to Switches button



  Scenario:
    And User clicks "Switches" button

  @g
  Scenario: Scroll with reusable
    And User clicks to "Switches" button

#1.sinde direk biz UiScrollable kendi elimiz ile yazarak ekranda elementi bulana kadar scroll yap ve tıkla dedik
#2.sinde parametreli olarak reusable class icindeki scrollWithUiScrollable methodunu kullanarak scrool yaptırdık
#3.sinde parametreli olarak reusable methodu icinde tapOnElementWithText methodu ıle
# once clıck yapmayı dene eger ekranda click yapacagin text yok ise scrooll yap sonra clıck yapmayı dene seklınde bu methodu kullandık