Feature: Test basket with product
  Scenario: Adding product to basket
    Given User navigation to device without subscription
    When User add device to basket
    Then Device has the same price on page nad basket and basket has one product