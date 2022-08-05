Feature: Login functionality test feature

Scenario: Perform google search

	Given User is on Google  Home Page 

	When User search for New Hindi Movies

	Then Hindi Movies results should display successfully