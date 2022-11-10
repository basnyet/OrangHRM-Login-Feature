Feature: NopCommerce Login functionality Test
   As a customer login with valid and invalid credeantials
   
   Scenario Outline: Login admin account with positive and negative way
  
   Given as a valid user is in a home page
   When user type valid userName and password as <"admin@yourstore.com"> and <"admin">
   Then user clik login button 
   And user able to enter the account
   Then user click logout buttn to exit the page

	Examples:
	|userName|password|
	|admin@yourstore.com|admin|
