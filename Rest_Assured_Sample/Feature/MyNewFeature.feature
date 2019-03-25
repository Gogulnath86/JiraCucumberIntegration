Feature: Checking the login functionality

 Scenario: To verify the Get Rest Calls  # validate the rest ability to handle the Get Rest Calls

 Given I will be able to load the environment file
 When I will be able to perform the get rest calls
 When I will be able to convert into Json file
 Then I will be able to perform the response validation
 
 Scenario Outline:To verify the Post Rest Calls
 
 Given I will be able to load the environment file
 When I will be able to perform the post rest calls for "<name>" and "<job>"
 When I will be able to convert into Json file
 Then I will be able to perform the response validation
 
 Examples:
 |name|job|
 |Gogul|Military|

 Scenario: To verify the Put Rest Calls
 
 Given I will be able to load the environment file
 When I will be able to perform the put rest calls
 When I will be able to convert into Json file
 Then I will be able to perform the response validation 
 
 Scenario: To verify the Patch Rest Calls
 
 Given I will be able to load the environment file
 When I will be able to perform the patch rest calls
 When I will be able to convert into Json file
 Then I will be able to perform the response validation
 
 Scenario: To verify the Get Rest Calls

 Given I will be able to load the environment file
 When I will be able to perform the get rest calls
 When I will be able to convert into Json file
 Then I will be able to perform the response validation
 
 # Add multiple features
 
