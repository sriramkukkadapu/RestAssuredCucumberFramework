package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;

public class TestDataBuild {

	public AddPlace addPlacePayLoad() {
		
		AddPlace p = new AddPlace();
		
		p.setAccuracy(50);
		p.setAddress("29, side layout, cohen 09");
		p.setLanguage("French-IN");
		
		Location location = new Location();
		location.setLat(-38.383494);
		location.setLng(33.427362);
		
		p.setLocation(location);
		
		p.setName("Frontline house");
		List<String> types = new ArrayList<String>();
		types.add("shoe park");
		types.add("shop");
		
		p.setTypes(types);
		p.setPhone_number("(+91) 983 893 3937");
		p.setWebsite("http://google.com");
		return p;
	}
	
public AddPlace addPlacePayLoad(String name, String language, String address) {
		
		AddPlace p = new AddPlace();
		
		p.setAccuracy(50);
		p.setAddress(address);
		p.setLanguage(language);
		
		Location location = new Location();
		location.setLat(-38.383494);
		location.setLng(33.427362);
		
		p.setLocation(location);
		
		p.setName(name);
		List<String> types = new ArrayList<String>();
		types.add("shoe park");
		types.add("shop");
		
		p.setTypes(types);
		p.setPhone_number("(+91) 983 893 3937");
		p.setWebsite("http://google.com");
		return p;
	}

public String deletePlacePayload(String placeId){
		return  "{\n"
	    		+ "    \"place_id\": \""+placeId+"\"\n"
	    		+ "}";
}
}
