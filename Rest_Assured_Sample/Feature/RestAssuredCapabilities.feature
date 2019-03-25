Feature: Demonstrating Rest Assured Behavioural driven functionalities
Scenario: Validating the ability of rest assured to check the GET call method

Given Accessing the URL Endpoint for Get "https://reqres.in" 
When Performing the get function for given endpoint
And  Receiving and validate the Json response
Then Assert the name attribute from received response


Scenario Outline: Validating the ability of rest assured to check the POST call method

Given Accessing the URL Endpoint "https://reqres.in"
When Performing the post function for given endpoint for "<name>" and "<job>"
And  Receiving and validate the Json response
Then Assert the Job attribute from received response 

Examples:
|name|job|
|Baratheon|Military|

Scenario: Validating the ability of rest assured to check the PUT call method

Given Accessing the URL Endpoint "https://reqres.in"
When Performing the put function for given endpoint updating the name code
And  Receiving and validate the Json response
Then Assert the name attribute from received response 

Scenario: Validating the ability of rest assured to check the Patch call method

Given Accessing the URL Endpoint "https://reqres.in"
When Performing the patch function for given endpoint for "TestData//testdata.csv" 
And  Receiving and validate the Json response
Then Assert the name attribute from received response


