package steps;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import requests.POSTRequest;
import utilities.ExcelRead;

public class POSTRequestSteps {

	ExcelRead readExcelReader = new ExcelRead();
	POSTRequest _postRequest = new POSTRequest();

	@Given("^I have the API url to create a user$")
	public void iHaveTheAPIUrlToCreateUser() throws Throwable {
		System.out.println("Get the API URL: " + readExcelReader.readExcel(2, 1, ".\\Data\\WSData.xlsx", "URI"));
	}

	@When("^I call the API with post parameters for user creation$")
	public void iCallTheAPIWithPostParametersForUserCreation() throws Throwable {
		System.out.println("Calling the API URL: " + readExcelReader.readExcel(2, 1, ".\\Data\\WSData.xlsx", "URI"));

	}

	@Then("^User details are created$")
	public void userDetailsAreCreated() throws Throwable {

		System.out.println("Response body is => " + _postRequest.postRequestDetails().getBody().asString());

		String statusCode = Integer.toString(_postRequest.postRequestDetails().getStatusCode());
		String statusLine = _postRequest.postRequestDetails().getStatusLine();

		Headers allHeaders = _postRequest.postRequestDetails().headers();

		System.out.println(statusLine);
		System.out.println("The status code is: " + statusCode);

		String name = _postRequest.postRequestDetails().jsonPath().getString("name");

		// Iterate over all the Headers
		for (Header header : allHeaders) {
			System.out.println("Key: " + header.getName() + "   Value: " + header.getValue());
		}

		// Assert that correct status code is returned.
		Assert.assertEquals(statusCode /* actual value */,
				readExcelReader.readExcel(1, 2, ".\\Data\\WSData.xlsx", "CREATE_Respose") /* expected value */,
				"Status code does not match");
		// Assert that correct Name is returned.
		Assert.assertEquals(name /* actual value */,
				readExcelReader.readExcel(1, 1, ".\\Data\\WSData.xlsx", "CREATE_Respose") /* expected value */,
				"Name does not match");

	}

}
