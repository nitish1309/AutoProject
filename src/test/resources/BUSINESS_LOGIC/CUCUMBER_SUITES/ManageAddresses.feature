Feature: Manage Addresses
Background: User is successfully LaunchedApplication
When user opens "Chrome" browser with exe as
When user opens URL as 
When user click on cancel
When user click on login
When user click on my profile
When user enter "n.svastav@gmail.com" as username
When user enter "Vaijapur@13" as password
When user click on login button
When user is login successfully

@RegressionTest
Scenario Outline: validate manage address funtionality
When user click on manage addreses
When user click on ad me addresss
When user enter <name> as name
When user enter <mobileNumber> as mobile number
When user enter <pinCode> as pincode
When user enter <locality> as locality
When user enter <address> as address details
When user select Home as address type
When user click on Save button 
Then address added sucessfully
When user click on delete saved address
Then saved address delete

Examples:
|name|mobileNumber|pinCode|locality|address|
|Nitish|8888888888|423701|pune|NationalHighway|