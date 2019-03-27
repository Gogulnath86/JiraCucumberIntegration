Feature: Performing GET and POST call

@ClientDemo
Scenario: Validating the ability of rest assured to check the GET Call 

Given User performs GET operation at "https://reqres.in"
Then User should see status code "200"
And Validate the name value "Janet" in the response