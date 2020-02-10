Feature: API testing for google

  @api
  Scenario Outline: Home page scenario
    Given I am in google home page
    When I search "<searchQuery>"
    And Hit search button
    Then I should be navigated to search results page

    Examples:
      |searchQuery|
      |selenium|
      |api testing|