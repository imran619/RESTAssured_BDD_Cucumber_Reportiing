Feature: GET User details feature

  Scenario: Create user details
    Given I have the API url to create a user
    When I call the API with post parameters for user creation
    Then User details are created
