$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DELETERequestFeature.feature");
formatter.feature({
  "line": 1,
  "name": "DELETE User details feature",
  "description": "",
  "id": "delete-user-details-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Delete user details",
  "description": "",
  "id": "delete-user-details-feature;delete-user-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I have the API url to delete a user\u0027s details",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I call the API to delete the user\u0027s details",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User details are deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "DELETERequestSteps.i_have_the_API_url_to_delete_a_user_s_details()"
});
formatter.result({
  "duration": 883643912,
  "status": "passed"
});
formatter.match({
  "location": "DELETERequestSteps.i_call_the_API_to_delete_the_user_s_details()"
});
formatter.result({
  "duration": 96553479,
  "status": "passed"
});
formatter.match({
  "location": "DELETERequestSteps.user_details_are_deleted()"
});
formatter.result({
  "duration": 7349649737,
  "status": "passed"
});
formatter.uri("GETRequestFeature.feature");
formatter.feature({
  "line": 1,
  "name": "GET User details feature",
  "description": "",
  "id": "get-user-details-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Get the user details",
  "description": "",
  "id": "get-user-details-feature;get-the-user-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I have the API url to get users details",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I call the API url",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I get the users details",
  "keyword": "Then "
});
formatter.match({
  "location": "GETRequestSteps.i_have_the_API_url_to_get_users_details()"
});
formatter.result({
  "duration": 11606082,
  "status": "passed"
});
formatter.match({
  "location": "GETRequestSteps.i_call_the_API_url()"
});
formatter.result({
  "duration": 639999,
  "status": "passed"
});
formatter.match({
  "location": "GETRequestSteps.i_get_the_users_details()"
});
formatter.result({
  "duration": 6310138916,
  "error_message": "java.lang.AssertionError: Name does not match expected [Eve2] but found [Eve]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:513)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:135)\r\n\tat org.testng.Assert.assertEquals(Assert.java:116)\r\n\tat org.testng.Assert.assertEquals(Assert.java:190)\r\n\tat steps.GETRequestSteps.i_get_the_users_details(GETRequestSteps.java:67)\r\n\tat ✽.Then I get the users details(GETRequestFeature.feature:6)\r\n",
  "status": "failed"
});
formatter.uri("POSTRequestFeature.feature");
formatter.feature({
  "line": 1,
  "name": "GET User details feature",
  "description": "",
  "id": "get-user-details-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Create user details",
  "description": "",
  "id": "get-user-details-feature;create-user-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I have the API url to create a user",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I call the API with post parameters for user creation",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User details are created",
  "keyword": "Then "
});
formatter.match({
  "location": "POSTRequestSteps.iHaveTheAPIUrlToCreateUser()"
});
formatter.result({
  "duration": 61744295,
  "status": "passed"
});
formatter.match({
  "location": "POSTRequestSteps.iCallTheAPIWithPostParametersForUserCreation()"
});
formatter.result({
  "duration": 49539370,
  "status": "passed"
});
formatter.match({
  "location": "POSTRequestSteps.userDetailsAreCreated()"
});
formatter.result({
  "duration": 5950910329,
  "status": "passed"
});
formatter.uri("PUTRequestFeature.feature");
formatter.feature({
  "line": 1,
  "name": "UPDATE User details feature",
  "description": "",
  "id": "update-user-details-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Update user details",
  "description": "",
  "id": "update-user-details-feature;update-user-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I have the API url to update a user\u0027s details",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I call the API with update parameters for updating the user details",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User details are updated",
  "keyword": "Then "
});
formatter.match({
  "location": "UPDATERequestSteps.i_have_the_API_url_to_update_a_user_s_details()"
});
formatter.result({
  "duration": 47156080,
  "status": "passed"
});
formatter.match({
  "location": "UPDATERequestSteps.i_call_the_API_with_update_parameters_for_updating_the_user_details()"
});
formatter.result({
  "duration": 62062973,
  "status": "passed"
});
formatter.match({
  "location": "UPDATERequestSteps.user_details_are_updated()"
});
formatter.result({
  "duration": 6144560626,
  "status": "passed"
});
});