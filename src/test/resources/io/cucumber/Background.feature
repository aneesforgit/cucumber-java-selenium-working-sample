Feature: Search Menu options

  Background:
    Given I am in DSA home page
    When I click on Menu button

  Scenario Outline: Quote search
    And choose Quote under Search
    Then I should be navigated to Quote search page whose URL should end with "/quote/search/"
    When I provide "<quoteNumber>" and hit search button
    Then It should open Quote details page whose url should end with "<quoteSearchDetailsEndsWith>"

    Examples:
      |quoteNumber|quoteSearchDetailsEndsWith|
      |3000044485162|/3000044485162          |
      |3000044484988|/3000044484988          |

  Scenario Outline: Order search
    And choose Order under Search
    Then I should be navigated to Quote search page whose URL should end with "/order/search/"
    When I provide "<orderNumber>" and hit search button
    Then It should open Quote details page whose url should end with "<orderSearchDetailsEndsWith>"

    Examples:
      |orderNumber|orderSearchDetailsEndsWith|
      |3000044485162|/3000044485162          |
      |3000044484988|/3000044484988          |
