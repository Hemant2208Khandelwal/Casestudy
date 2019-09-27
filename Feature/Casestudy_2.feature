Feature: Login Action

Scenario Outline: Successful Login with Valid Credentials
	Given User opens the application
	When User click on to Signin link
	And User enters "<username>" and "<password>"
	Then  Message displayed login successfully

  Examples: 
      | username  |  password   |
      | Lalitha   | Password123 |
      | Admin     | Password456 |