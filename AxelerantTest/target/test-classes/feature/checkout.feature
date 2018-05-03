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
Feature: CheckoutTest
  
  @tag1
  Scenario: Add any product to cart and complete the checkout journey by placing an order
    Given user is on Home Page
		When he search for "dress"
		And choose to buy the first item
		And moves to checkout from mini cart
		And enter personal details on checkout page
		And select same delivery address
		And select payment method as cheque payment
		Then place the order