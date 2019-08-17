package steps;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import requests.DELETERequest;
import utilities.ExcelRead;

public class DELETERequestSteps {

	ExcelRead readExcelReader = new ExcelRead();
	DELETERequest _deleteRequest = new DELETERequest();

	@Given("^I have the API url to delete a user's details$")
	public void i_have_the_API_url_to_delete_a_user_s_details() throws Throwable {

		System.out.println("Get the API URL: " + readExcelReader.readExcel(4, 1, ".\\Data\\WSData.xlsx", "URI"));
	}

	@When("^I call the API to delete the user's details$")
	public void i_call_the_API_to_delete_the_user_s_details() throws Throwable {

		System.out.println("Calling the API URL: " + readExcelReader.readExcel(4, 1, ".\\Data\\WSData.xlsx", "URI"));

	}

	@Then("^User details are deleted$")
	public void user_details_are_deleted() throws Throwable {

		System.out.println("Response body is => " + _deleteRequest.deleteRequestDetails().getBody().asString());

		String statusCode = Integer.toString(_deleteRequest.deleteRequestDetails().getStatusCode());
		String statusLine = _deleteRequest.deleteRequestDetails().getStatusLine();

		Headers allHeaders = _deleteRequest.deleteRequestDetails().headers();

		System.out.println(statusLine);
		System.out.println("The status code is: " + statusCode);

		// Iterate over all the Headers
		for (Header header : allHeaders) {
			System.out.println("Key: " + header.getName() + "   Value: " + header.getValue());
		}

		// Assert that correct status code is returned.
		Assert.assertEquals(statusCode /* actual value */,
				readExcelReader.readExcel(1, 0, ".\\Data\\WSData.xlsx", "DELETE_Response") /* expected value */,
				"Status code does not match");
	}
}


