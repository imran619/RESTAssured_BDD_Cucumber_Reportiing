package steps;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import requests.PUTRequest;
import utilities.ExcelRead;

public class UPDATERequestSteps {

	ExcelRead readExcelReader = new ExcelRead();
	PUTRequest _putRequest = new PUTRequest();

	@Given("^I have the API url to update a user's details$")
	public void i_have_the_API_url_to_update_a_user_s_details() throws Throwable {

		System.out.println("Get the API URL: " + readExcelReader.readExcel(3, 1, ".\\Data\\WSData.xlsx", "URI"));

	}

	@When("^I call the API with update parameters for updating the user details$")
	public void i_call_the_API_with_update_parameters_for_updating_the_user_details() throws Throwable {

		System.out.println("Calling the API URL: " + readExcelReader.readExcel(3, 1, ".\\Data\\WSData.xlsx", "URI"));

	}

	@Then("^User details are updated$")
	public void user_details_are_updated() throws Throwable {

		System.out.println("Response body is => " + _putRequest.putRequestDetails().getBody().asString());

		String statusCode = Integer.toString(_putRequest.putRequestDetails().getStatusCode());
		String statusLine = _putRequest.putRequestDetails().getStatusLine();

		Headers allHeaders = _putRequest.putRequestDetails().headers();

		System.out.println(statusLine);
		System.out.println("The status code is: " + statusCode);

		String name = _putRequest.putRequestDetails().jsonPath().getString("name");

		// Iterate over all the Headers
		for (Header header : allHeaders) {
			System.out.println("Key: " + header.getName() + "   Value: " + header.getValue());
		}

		// Assert that correct status code is returned.
		Assert.assertEquals(statusCode /* actual value */,
				readExcelReader.readExcel(1, 2, ".\\Data\\WSData.xlsx", "PUT_Response") /* expected value */,
				"Status code does not match");
		// Assert that correct Name is returned.
		Assert.assertEquals(name /* actual value */,
				readExcelReader.readExcel(1, 1, ".\\Data\\WSData.xlsx", "PUT_Response") /* expected value */,
				"Name does not match");

	}

}
