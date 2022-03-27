package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@DeletePlace")
	public void beforeScenario() throws IOException
	{
		//System.out.println("=======> Running the ");
		//write code to get place id
		//execute code only when place id is null
		stepDefinitions sd = new stepDefinitions();
		if(sd.place_id == null) {
		sd.add_place_payload_with("Shetty", "French", "Asia");
		sd.when_user_calls_with_http_request("addPlaceAPI", "POST");
		sd.verify_place_id_created_maps_to_using("Shetty", "getPlaceAPI");
		}
	}

}
