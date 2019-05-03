@signupvalidationtesting1 
Feature: signup  Functionality Feature 
Scenario: test app 
	Given  Tap on Next CTA 
	Then   Tap on Register option CTA. 
Scenario Outline: Invalid data for signup test. 
	And   Enter first Name "<First Name>" in first name text field. 
	And   Enter last Name "<Last Name>" in Last name text field. 
	#	And   Select the Date Of Birth. 
	And   Enter email address "<Email>" in Email address text field. 
	And   Enter password "<Password>". 
	And Tap on Submit CTA. 
	Then Verify "<First NameVal>" for validation message for First name field. 
	Then  Verify "<Last NameVal>" for validation message for Last name field. 
	Then  Verify "<EmailVal>" for message for email address field. 
	Then  Verify "<passwordVal>" for validation message for password field. 
	Then  Verify "<signupErrorMsg>" validation for all invalid credentials. 
	
	Examples: 
		|  First Name      |    Last Name  | Email            |Password      |  First NameVal                  |  Last NameVal              | EmailVal                        |passwordVal                |signupErrorMsg             |
		|                  |               |                  |              | Please enter your first name    | Please enter your last name| Please enter your email address |Please enter your password |                           |                    
		|   Test           |               |                  |              |                                 | Please enter your last name| Please enter your email address |Please enter your password |                           |                    
		|   Test           |   Test        |                  |              |                                 |                            | Please enter your email address |Please enter your password |                           |                    
		|   Test           |   Test        | Test@@gmail.com  |              |                                 |                            | Please enter your email address |Please enter your password |                           |                    
		|   Test           |   Test        | test@gamil.com   | 12345678     |                                 |                            |                                 |Please enter your password |                           |                    
		|   Test           |   Test        | test@gamil.com   | Test@123     |                                 |                            |                                 |                           |   User already registered |                    

@signupvalidationtesting		
Scenario Outline: valid data for signup test. 
   Given  Tap on Next CTA 
	Then   Tap on Register option CTA. 
	Given  Close the alert message. 
	Then   Enter first Name "<First Name>" in first name text field. 
	Then   Enter last Name "<Last Name>" in Last name text field. 
	#	Then   Select the Date Of Birth. 
	Then   Enter email address "<Email>". 
	And   Enter password "<Password>". 
	Then   Tap on Register button. 
	Examples: 
		|  First Name          |    Last Name    | Email            |Password            |
		|Test                  |   Test          | test             | Test@123           |
	@signupvalidationtesting		
Scenario: 
	Then Tap on user profile. 
#	Then Verify the User Name. 
	
#@LoginTest 
#Scenario Outline: valid data for login test. 
#	Given  Tap on Next CTA 
#	Then   Tap on login CTA. 
#	Then   Enter useremail address "<Email>". 
#	And    Enter user password "<Password>". 
#	Then   Tap on Login button. 
#	Then Tap on user profile. 
#	Examples: 
#		| Email            |Password             |
#		| test1@gmail.com  | Test@1234           |
#		
	
	

	