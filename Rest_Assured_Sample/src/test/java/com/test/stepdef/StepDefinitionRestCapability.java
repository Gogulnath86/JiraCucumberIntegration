package com.test.stepdef;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertThat;
import static org.testng.Assert.assertEquals;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import org.testng.log4testng.Logger;
import com.test.Helper.Reusable_Methods;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;



public class StepDefinitionRestCapability {
	final static Logger logger =Logger.getLogger(StepDefinitionRestCapability.class);
	Response response;
	String firstname;
	int statuscode;
	int status;
	boolean code;
	RequestSpecification request;
	String name;

	@Given("^Accessing the URL Endpoint for Get \"([^\"]*)\"$")
	public void User_performs_GET_Operation_at(String URI) throws Throwable {
		
		RestAssured.baseURI=URI;
		RestAssured.useRelaxedHTTPSValidation();
		response = given().
				header("Content-Type","application/json").
				when().
				get("/api/users/2").
				then().and().extract().response();
	}

	@Given("^Accessing the URL Endpoint \"([^\"]*)\"$")
	public void accessing_the_URL_Endpoint_https_reqres_in_api_users_for_post(String URI) throws Throwable {

		RestAssured.baseURI=URI;
		request = RestAssured.given().header("Content-Type","application/json").when();
	}


	@When("^Performing the post function for given endpoint for \"([^\"]*)\" and \"([^\"]*)\"$")
	public void performing_the_post_function_for_given_endpoint_for_and(String Name, String Job) throws Throwable {

		HashMap<String, String> requestParams = new HashMap<String, String>();
		requestParams.put("name", Name); 
		requestParams.put("job", Job);
		request.body(requestParams);
		response = request.post("/api/users/2");
		String respon=response.asString();
		System.out.println(respon);
		code = respon.contains("Military");
	}

	@When("^Performing the patch function for given endpoint for \"([^\"]*)\"$")
	public void Performing_the_patch_function_for_given_endpoint_for(String csvSheetPath) throws Throwable {

		String csvFile = csvSheetPath;
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";

		try {
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {

				String[] values = line.split(cvsSplitBy);
				name  = values[0];
				System.out.println(name);
			}
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}

		HashMap<String, String> requestParams = new HashMap<String, String>();
		requestParams.put("name", name); 
		request.body(requestParams);
		response = request.patch("/api/users/2");
		String respon=response.asString();
		code = respon.contains("AryaStark");
	}

	@When("^Performing the put function for given endpoint updating the name code$")
	public void Performing_the_put_function_for_given_endpoint_updating_the_name_code() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		HashMap<String, String> requestParams = new HashMap<String, String>();
		requestParams.put("name", "Jack"); 
		requestParams.put("job", "Military");
		request.body(requestParams);
		response = request.put("/api/users/2");
		String respon=response.asString();
		System.out.println(respon);
		code = respon.contains("Jack");
	}

	@When("^Performing the get function for given endpoint$")
	public void performing_the_get_function_for_given_endpoint() throws Throwable {

		String respon=response.asString();
		System.out.println(respon);
		code = respon.contains("Janet"); 	
	}

	@When("^Receiving and validate the Json response$")
	public void receiving_and_validate_the_Json_response() throws Throwable {

		statuscode = response.getStatusCode();
		System.out.println(statuscode);
	}

	@Then("^Assert the name attribute from received response$")
	public void assert_the_name_attribute_from_received_response() throws Throwable {

		assertEquals(code, true);
		assertEquals(statuscode, 200);
		System.out.println("I have completed the testing");
	}

	@Then("^Assert the Job attribute from received response$")
	public void assert_the_Job_attribute_from_received_response() throws Throwable {

		assertEquals(code, true);
		assertEquals(statuscode, 201);
		System.out.println("I have completed the testing");
	}
}
