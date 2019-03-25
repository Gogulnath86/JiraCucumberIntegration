package com.test.stepdef;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.log4testng.Logger;

import com.test.Helper.ResourcesHelper;
import com.test.Helper.Reusable_Methods;

//import com.rest.testing.Reusablemethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

//@Listeners(resources.ExtentReporter_NG.class)

public class StepDefinition {
	
	final static Logger logger =Logger.getLogger(StepDefinition.class);
	Properties prop=new Properties();
	Response resp;
	JsonPath js;

	
	@Given("^I will be able to load the environment file$")
	public void i_will_be_able_to_load_the_environment_file() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		String dir1 = System.getProperty("user.home")+"/eclipse-workspace/"+"/Rest_Assured_Sample/";
	    FileInputStream fis=new FileInputStream(dir1+"environ.properties");
		System.out.println(dir1+"environ.properties");
		prop.load(fis);
		
		
	}
	//eclipse-workspace/Rest_Assured_Sample

	@When("^I will be able to perform the get rest calls$")
	public void i_will_be_able_to_perform_the_get_rest_calls() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		String baseURIs=prop.getProperty("BaseURIPost");
		String Resource = prop.getProperty("ResourcePost2");		
		ResourcesHelper rd1 = new ResourcesHelper();
	    resp = (Response) rd1.Pincode_Get_Request(baseURIs,Resource);
		logger.debug(resp);
		 
	}

	@And("^I will be able to convert into Json file$")
	public void i_will_be_able_to_convert_into_Json_file() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hello Buddy! Im clicking the password");
	    js =Reusable_Methods.rawToJson(resp);
	    
	}

	@Then("^I will be able to perform the response validation$")
	public void i_will_be_able_to_perform_the_response_validation() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hello Buddy!! Im clicking the login button");
		//String operaStatus=js.get("Status");
		//System.out.println("Successfully retrieved the response"+ operaStatus);
		
	}

	@When("^I will be able to perform the post rest calls for \"(.*)\" and \"(.*)\"$")
	public void i_will_be_able_to_perform_the_post_rest_calls_for(String name, String job) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hello Buddy Im in post rest calls");
		String BaseURIPost = prop.getProperty("BaseURIPost");
		String ResourcePost = prop.getProperty("ResourcePost");
		logger.debug(job);
		
		ResourcesHelper rd2 = new ResourcesHelper();
		resp = (Response)rd2.Pincode_Post_Request(BaseURIPost,ResourcePost,name,job);
		logger.debug(resp);
		 
	    
	}
	
	@When("^I will be able to perform the put rest calls$")
	public void i_will_be_able_to_perform_the_put_rest_calls() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		String BaseURIPost = prop.getProperty("BaseURIPost");
		String ResourcePost = prop.getProperty("ResourcePost2");
		
		ResourcesHelper rd2 = new ResourcesHelper();
		resp = (Response)rd2.Pincode_put_Request(BaseURIPost,ResourcePost);
		logger.debug(resp);
		 
	    
	}
	@When("^I will be able to perform the patch rest calls$")
	public void i_will_be_able_to_perform_the_patch_rest_calls() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		String BaseURIPost = prop.getProperty("BaseURIPost");
		String ResourcePost = prop.getProperty("ResourcePost");
		
		ResourcesHelper rd2 = new ResourcesHelper();
		resp = (Response)rd2.Pincode_patch_Request(BaseURIPost,ResourcePost);
		logger.debug(resp);
		 
	    
	}
	
}
