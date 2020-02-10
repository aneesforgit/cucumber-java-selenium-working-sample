Feature: Canada features to be tested

  Scenario Outline: Test quote search scenario for "<language>"
    Given I am in DSA home page
    When I click on Menu button
    And choose Quote under Search
    Then I should be navigated to Quote search page whose URL should end with "/quote/search/"
    When I provide "<quoteNumber>" and hit search button
    Then It should open Quote details page whose url should end with "<quoteSearchDetailsEndsWith>"

    Examples:
| language | quoteNumber   | quoteSearchDetailsEndsWith |
| US       | 3000044485162 | /3000044485162             |
| US       | 3000044484988 | /3000044484988             |

    Examples:
| language | quoteNumber   | quoteSearchDetailsEndsWith |
| Canada   | 3000044485162 | /3000044485162             |
| Canada   | 3000044484988 | /3000044484988             |