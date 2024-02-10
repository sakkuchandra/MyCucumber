package StepDefinitions;

import cucumber.api.java.After;  
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 
import cucumber.api.java.en.And;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APICall 
{
	private RequestSpecification request;
	private  static  final  String  BASE_URL="api.openweathermap.org/data/2.5/weather";
			
	private Response response;
	
	
	@Given("^I Open weather map$")
	
	public void I_Open_weather_map()throws Throwable
	{
		/*
		RestAssured.baseURI=BASE_URL;
		request=RestAssured.given();
		request.header("Content-Type","application/json");
		*/
		RestAssured.baseURI="";
		
	}
	
	@When("^I Request latitude longitude apikey$")
	
	public void I_request_latitude_longitue_apikey()throws Throwable
	{
		//RequestSpecification rs=RestAssured.given();
		//rs.contentType(ContentType.JSON);
		//rs.queryParams(BASE_URL, rs, null)
		RequestSpecification rs=RestAssured.given();
		Response response=rs.get("https://api.openweathermap.org/data/2.5/weather?lat=35&lon=139&id=524901&appid=2d24c89c7632fedfd8bc53293481dab7");
		System.out.println("Response Body is =>  " + response.asString());
		//.queryParam("id", "524901")
		//.queryParam("lat", 35)
		//.queryParam("lon", 139)
		//.queryParam("appid","2d24c89c7632fedfd8bc53293481dab7")
		//.when().get("api.openweathermap.org/data/2.5/weather?lat=35&lon=139&id=524901&appid=2d24c89c7632fedfd8bc53293481dab7")
		//.getStatusLine();
		//.prettyPrint();
	}
	
	
	
	

}
