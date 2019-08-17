Feature: GET User details feature

  Scenario: Get the user details
    Given I have the API url to get users details
    When I call the API url
    Then I get the users details
