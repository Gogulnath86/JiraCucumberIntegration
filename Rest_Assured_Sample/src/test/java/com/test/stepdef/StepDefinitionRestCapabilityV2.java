package com.test.stepdef;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.testng.log4testng.Logger;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StepDefinitionRestCapabilityV2 {
	final static Logger logger =Logger.getLogger(StepDefinitionRestCapabilityV2.class);
	Response response;
	boolean verifyName, verifyJob;
	String firstname;
	int statuscode;
	int status;
	int code;
	RequestSpecification request;
	String name;

	//**************************************Scenario 1****************************//

	@Given("^User performs GET operation at \"([^\"]*)\"$")

	public void User_performs_GET_Operation_at(String URI) throws Throwable {

		RestAssured.baseURI=URI;
		RestAssured.useRelaxedHTTPSValidation();
		response = given().
				header("Content-Type","application/json").
				when().
				get("/api/users/2").
				then().and().extract().response();
	}


	@Then("^User should see status code \"([^\"]*)\"$")
	public void user_should_see_status_code(int statuscode) throws Throwable {
		code = response.getStatusCode();
		System.out.println(statuscode);
		assertEquals(code,statuscode);


	}

	@Then("^Validate the name value \"([^\"]*)\" in the response$")
	public void Validate_the_name_value_in_the_response(String Name) throws Throwable {

		String respon=response.asString();
		System.out.println(respon);
		verifyName = respon.contains(Name); 
		assertEquals(verifyName, true);

	}
	//*********************************************************************************//
	//***************************Scenario 2********************************************//


	@Given("^User creates new request using \"([^\"]*)\" and \"([^\"]*)\" and performs post operation at \"([^\"]*)\"$")
	public void user_creates_new_request_using_and_performs_post_operation_at(String Name, String Job, String URI) throws Throwable {
		RestAssured.baseURI=URI;
		HashMap<String, String> requestParams = new HashMap<String, String>();
		requestParams.put("name", Name); 
		requestParams.put("job", Job);
		request = RestAssured.given().header("Content-Type","application/json").when();
		request.body(requestParams);
		response = request.post("/api/users/2");
		
	}

////	@When("^User performs POST operation at \"([^\"]*)\"$")
////	public void user_performs_POST_operation_at(String URI) throws Throwable {


	@Then("^User should get status code \"([^\"]*)\"$")
	public void user_should_get_status_code(int statuscode) throws Throwable {
		
		code = response.getStatusCode();
		System.out.println(statuscode);
		assertEquals(code,statuscode);
		
	}

	@Then("^Validate the job value \"([^\"]*)\" in the response$")
	public void Validate_the_Job_value_in_the_response(String Job) throws Throwable {
		String respon=response.asString();
		System.out.println(respon);
		verifyJob = respon.contains(Job);
	    assertEquals(verifyJob, true);
	}

	//*********************************************************************************//
		//***************************Scenario 3********************************************//


	@Given("^User creates update request using \"([^\"]*)\" and \"([^\"]*)\" and performs put operation at \"([^\"]*)\"$")
		public void user_creates_update_request_using_and_and_performs_put_operation_at(String Name, String Job, String URI) throws Throwable {
			RestAssured.baseURI=URI;
			HashMap<String, String> requestParams = new HashMap<String, String>();
			requestParams.put("name", Name); 
			requestParams.put("job", Job);
			request = RestAssured.given().header("Content-Type","application/json").when();
			request.body(requestParams);
			response = request.put("/api/users/2");
			
		}

	//*********************************************************************************//
			//***************************Scenario 4********************************************//


	@Given("^User performs PATCH operation at \"([^\"]*)\" and updates data through csv \"([^\"]*)\"$")
	public void user_performs_PATCH_operation_at_and_updates_data_through_csv(String URI, String csvSheetPath) throws Throwable {
		
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
		RestAssured.baseURI=URI;
		HashMap<String, String> requestParams = new HashMap<String, String>();
		requestParams.put("name", name); 
		request = RestAssured.given().header("Content-Type","application/json").when();
		request.body(requestParams);
		response = request.patch("/api/users/2");
		
	}
				
			}

		




