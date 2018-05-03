#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: SubscriberTest

	Background: 
   User navigates to automationpractice.com  
   Given I am on automationpractice.com page 
	  
  @tag1
  Scenario: Subscribe to the newsletter
   When I enter email address in subscriber field "newsubscriber@test.com"
   And I click on submit button
   Then Receive successfully subscribed message

  