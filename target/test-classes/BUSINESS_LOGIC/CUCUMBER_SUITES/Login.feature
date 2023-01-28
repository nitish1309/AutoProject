Feature: Login functionality
Background: User is successfully LaunchedApplication
Given user opens "Chrome" browser with exe as
Given user opens URL as 

@SmokeTest
Scenario: Login functionality with valid credentials
When user click on cancel
When user click on login
When user click on my profile
When user enter "n.svastav@gmail.com" as username
When user enter "Vaijapur@13" as password
When user click on login button
Then user is login successfully
 