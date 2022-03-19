package stepDefinitions;

import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.AddPlace;
import pojo.Location;
import resources.TestDataBuild;
import resources.Utils;


public class stepDefinitionsDataDrivenExample extends Utils {
	
//	RequestSpecification reqSpec;
//	ResponseSpecification resSpec;
//	Response  response;
//	TestDataBuild data = new TestDataBuild();
//
//	@Given("Add place payload with {string} {string} {string}")
//	public void add_place_payload_with(String string, String string2, String string3) throws IOException {
//	    // Write code here that turns the phrase above into concrete actions
//
//		reqSpec = given()
//		.spec(requestSpecification())
//		.body(data.addPlacePayLoad(string,string2,string3));
//	}
//
//
//
//	
//	
//	@When("when user calls {string} with Post http request")
//	public void when_user_calls_with_post_http_request(String string) throws IOException {
//	    // Write code here that turns the phrase above into concrete actions
//		
//		response = given()
//				.spec(reqSpec).when()
//				.body(data.addPlacePayLoad()).contentType(ContentType.JSON)
//			.post("maps/api/place/add/json")
//			.then().spec(resSpec).extract().response();
//		System.out.println("==========");
//		System.out.println(response.asString()); 
//			
//	}
//	
//	
//	@Then("the API call is success with {int}")
//	public void the_api_call_is_success_with(Integer int1) {
//	    // Write code here that turns the phrase above into concrete actions
//		assertEquals( response.getStatusCode(),200);
//	}
//	
//	
//	@Then("{string} in response body is {string}")
//	public void in_response_body_is(String keyValue, String expectedValue) {
//	    // Write code here that turns the phrase above into concrete actions
//		String resp = response.asString();
//		JsonPath path = new JsonPath(resp);
//		assertEquals(path.get(keyValue).toString(), expectedValue); 
//	}
//	
//	
}
