Feature:
  <Some interesting description here>
  To test the feature for cucumber Jira Integration

@ClientDemo
Scenario: Validating the ability of rest assured to check the GET Call 

Given User performs GET operation at "https://reqres.in"
Then User should see status code "200"
And Validate the name value "Sam" in the response

@ClientDemo
Scenario Outline: Validating the ability of rest assured to check the POST Call 

Given User creates new request using "<Name>" and "<Job>" and performs post operation at "https://reqres.in"
Then User should get status code "201"
And Validate the job value "Leader" in the response

Examples:
|Name|Job|
|Anderson|Leader|
