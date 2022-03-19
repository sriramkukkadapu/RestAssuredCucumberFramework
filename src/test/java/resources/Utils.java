package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Utils {
	
	public static RequestSpecification reqSpec;
	public RequestSpecification requestSpecification() throws IOException {
		
		if(reqSpec ==null) {
		PrintStream ps = new PrintStream(new FileOutputStream("log.txt"));
		
		reqSpec = new RequestSpecBuilder()
				.setBaseUri(getGlobalValue("baseUrl"))
				.setContentType(ContentType.JSON)
				.addQueryParam("key", "qaclick123")
				.addFilter(RequestLoggingFilter.logRequestTo(ps))
				.addFilter(ResponseLoggingFilter.logResponseTo(ps))
				.build();
		
		return  reqSpec;
		}
		else
			return  reqSpec;
				
	}
	
	public ResponseSpecification responseSpecification(int statusCode) {
		ResponseSpecification resSpec = new ResponseSpecBuilder()
				.expectContentType(ContentType.JSON)
				.expectStatusCode(statusCode).build();
		return resSpec;
	}
	
	public static String  getGlobalValue(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/java/resources/global.properties");
		prop.load(fis);
		return prop.getProperty(key);
	}
	
}
