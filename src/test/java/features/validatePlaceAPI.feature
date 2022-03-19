Feature: Validating Place API's  

@AddPlace
Scenario Outline: Verify if place is being added by using Add place API

Given Add place payload with "<name>" "<language>" "<address>"
When when user calls "addPlaceAPI" with "Post" http request
Then the API call is success with 200
And "status" in response body is "OK"
And "scope" in response body is "APP"
And verify place_Id created maps to "<name>" using "getPlaceAPI"

	  
Examples:
	| name  | language |	address |
	| House1	|	French	 |	world cross center |
#	| House2	|	English	 |	Chruch cross center |

@DeletePlace
Scenario: Verify if Delete Place functionality is working

Given DeletePlace payload
When when user calls "deletePlaceAPI" with "Post" http request
Then the API call is success with 200
And "status" in response body is "OK"

