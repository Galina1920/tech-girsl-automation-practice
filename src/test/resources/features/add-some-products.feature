Feature: add some products to cart
@Run
  Scenario: User successfully adds blouse to cart
    Given shop page is displayed
    And user hovers the Women tab
    And user clicks on Blouses link
    And Blouses page is displayed
    When user adds blouse to cart
    Then success message is displayed
