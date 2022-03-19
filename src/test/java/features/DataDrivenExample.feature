#Feature: Validating Place API's  
#
#Scenario Outline: Verify if place is being added by using Add place API
#
#Given Add place payload with "<name>" "<language>" "<address>"
#When when user calls "AddPlaceAPI" with Post http request
#Then the API call is success with 200
#And "status" in response body is "OK"
#And "scope" in response body is "APP"
#
#
#Examples:
#	| name  | language |	address |
#	| House	|	French	 |	world cross center |
#	
#	
#	  
#
