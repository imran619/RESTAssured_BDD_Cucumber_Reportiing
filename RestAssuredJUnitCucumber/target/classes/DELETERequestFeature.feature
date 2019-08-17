Feature: DELETE User details feature

  Scenario: Delete user details
    Given I have the API url to delete a user's details
    When I call the API to delete the user's details
    Then User details are deleted
