Feature: UPDATE User details feature

  Scenario: Update user details
    Given I have the API url to update a user's details
    When I call the API with update parameters for updating the user details
    Then User details are updated
