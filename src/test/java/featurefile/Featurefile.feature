Feature: Login 
Scenario: Login Functionality 
	Given user navigates to the website 75health
	When user click on signin 
	And  user login to application using Username as "demo@kaaspro.com" and Password as "1" 
	Then homepage is populated