package com.test.Helper;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import java.util.Properties;

import org.junit.Assert;
import org.testng.log4testng.Logger;

import com.google.gson.JsonObject;
//import com.rest.testing.Reusablemethods;

//import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import io.restassured.path.*;

public class ResourcesHelper {
	
	public Response Pincode_Get_Request(String BaseURI, String Resource)
	{
	String baseURIs=BaseURI;
	String Resources = Resource;
	System.out.println(baseURIs);
	RestAssured.baseURI=baseURIs;
	//RestAssured.useRelaxedHTTPSValidation();
	Response res = given().
	
	       header("Content-Type","application/json").
	       when().
	       get(Resources).
	       then().assertThat().statusCode(201).and().contentType("application/json").and().extract().response();
	       System.out.println(res);
	       JsonPath js =Reusable_Methods.rawToJson(res);
		   String operaStatus=js.get("job");
		   System.out.println("The Operation Status is"+ operaStatus);
	      return res;
	}
	
	public Response Pincode_Post_Request(String BaseURIPost, String ResourcePost, String Name, String Job)
	{
		String baseURIs=BaseURIPost;
		String Resources = ResourcePost;
		System.out.println(baseURIs);
		RestAssured.baseURI=baseURIs;
		
		RequestSpecification request = RestAssured.given().header("Content-Type","application/json").when();
		
		HashMap<String, String> requestParams = new HashMap<String, String>();
		
		//JsonObject requestParams = new JsonObject();
		requestParams.put("name", Name); 
		requestParams.put("job", Job);
		request.body(requestParams);
		Response response = request.post(Resources);
		JsonPath js =Reusable_Methods.rawToJson(response);
	    String operaStatus=js.get("job");
	    System.out.println("The Operation Status is"+ operaStatus);
		System.out.println(response.toString());
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 201);
	
		return response;
		
		
	}
	
	public Response Pincode_put_Request(String BaseURIPost, String ResourcePost)
	{
		String baseURIs=BaseURIPost;
		String Resources = ResourcePost;
		System.out.println(baseURIs);
		RestAssured.baseURI=baseURIs;
		
		RequestSpecification request = RestAssured.given().header("Content-Type","application/json").when();
		
		HashMap<String, String> requestParams = new HashMap<String, String>();
		
		//JsonObject requestParams = new JsonObject();
		requestParams.put("name", "Gogul"); 
		requestParams.put("job", "Software");
		request.body(requestParams);
		Response response = request.put(Resources);
		JsonPath js =Reusable_Methods.rawToJson(response);
	    String operaStatus=js.get("job");
	    System.out.println("The Operation Status is"+ operaStatus);
	    
		System.out.println(response.toString());
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200);
		return response;
		
		
	}
	
	public Response Pincode_patch_Request(String BaseURIPost, String ResourcePost)
	{
		String baseURIs=BaseURIPost;
		String Resources = ResourcePost;
		System.out.println(baseURIs);
		RestAssured.baseURI=baseURIs;
		
		RequestSpecification request = RestAssured.given().header("Content-Type","application/json").when();;
		
		HashMap<String, String> requestParams = new HashMap<String, String>();
		
		
		requestParams.put("job", "Leader");
		request.body(requestParams);
		Response response = request.put("/api/users/2");
		JsonPath js =Reusable_Methods.rawToJson(response);
	    String operaStatus=js.get("job");
	    System.out.println("The Operation Status is"+ operaStatus);
	    
		System.out.println(response.toString());
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200);
		return response;
		
		
	}
}
