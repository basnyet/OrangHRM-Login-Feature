@Gurudemo @SignOn
Feature: Guru99 Demo Signon 
       As a user sign on with valid user name and password
       
    @SanityTest   
    Scenario Outline: User sign on different kind of user name and password
    
    Given user is in home page
    When user click Signon button to Sigon
    When user type to different "<userName>" and "<password>" for sign in
    And user click submit button 
    Then user should see positive massage as "Login Successfully"
    And user should see negative massage as "Enter your userName and password correct"
    Then user click sign off button to logout the page
        
        Examples:
        |userName|password|
       |Admin|admin123|
#        |Abc12|dimn124|
        |Admin|admin|
#        |123fjc|adcfg|
        
    