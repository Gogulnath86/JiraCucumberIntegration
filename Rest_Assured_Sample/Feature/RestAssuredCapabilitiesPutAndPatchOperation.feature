Feature: Performing PUT and PATCH call
@ClientDemo
Scenario Outline: Validating the ability of rest assured to check the PUT Call 

Given User creates update request using "<Name>" and "<Job>" and performs put operation at "https://reqres.in"
Then User should get status code "200"
And Validate the job value "Developer" in the response

Examples:
|Name|Job|
|Austin|Developer|

@ClientDemo
Scenario: Validating the ability of rest assured to check the PATCH Call 

Given User performs PATCH operation at "https://reqres.in" and updates data through csv "TestData//testdata.csv" 
Then User should see status code "200"
And Validate the name value "AryaStark" in the response
