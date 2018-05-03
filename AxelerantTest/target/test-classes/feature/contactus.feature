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

@tag
Feature: ContactUSTest
  
  Background: 
   User navigates to automationpractice.com  
   Given I am on automationpractice page 

  @tag1
  Scenario: Fill in the Contact us form and Submit it.
   When I click on Contact Us link
   And I choose Subject Heading as "Customer Service"
   And I enter Email Address as "test@test.com"
   And I enter Message as "test message"
   And I click on send button
   Then Message send success alert

  @tag2
  Scenario: Submit the form without entering email and verify if the error message shown is "Invalid email address."
   When I click on Contact Us link	
   And I choose Subject Heading as "Customer Service"
   And I enter Email Address as "test"
   And I enter Message as "test message"
   And I click on send button
   Then error alert should be available
   	