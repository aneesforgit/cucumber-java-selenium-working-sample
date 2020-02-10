Feature: DSA smoke tests

  @dsa @preCodeRegression @codeLockRegression
  Scenario Outline: Simple page loading
    Given I am in DSA home page
    When I click on Menu button
    And choose Quote under Search
    Then I should be navigated to Quote search page whose URL should end with "/quote/search/"
    When I provide "<quoteNumber>" and hit search button
    Then It should open Quote details page whose url should end with "<quoteSearchDetailsEndsWith>"

    Examples:
      |quoteNumber|quoteSearchDetailsEndsWith|
      |3000044485162|/3000044485162          |
      |3000044484988|/3000044484988          |