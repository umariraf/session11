Feature: New Account Page 
	As a .... I want .... so that ... 

Scenario Outline: Users would be able to add new account 
	Given a user already logged in as "techfiosdemo@gmail.com" and "abc123" 
	When user navigate to Bank Cash -> New Account Page 
	Then New Accounts Page should display 
	When user submits "<title>", "<description>" and "<initial balance>" 
	Then created account should be posted 
	Examples: 
		| title | description|initial balance|
		| Stine | Golf       |10000          |
		#| Mike  | Tennis     |2 000         | 