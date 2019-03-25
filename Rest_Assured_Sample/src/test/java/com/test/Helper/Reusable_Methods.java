package com.test.Helper;

import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class Reusable_Methods {

	public static XmlPath rawToXML(Response r)
	{		
		String respon=r.asString();
		System.out.println(respon);
		XmlPath x= new XmlPath(respon);
		return x;
	}
	
	public static JsonPath rawToJson(Response r)
	{ 
		String respon=r.asString();
		System.out.println(respon);
		JsonPath x=new JsonPath(respon);
		return x;
	}

}