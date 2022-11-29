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
@signin
Feature: SignIn
  I want to use this template for my feature file


  Scenario: valid and invalid tests
    Given The user opens chrome browser and enters the "https://dsportalapp.herokuapp.com/login"
    When user enter <username>and<password>
    And clicks on Login button
    Then user should see "You are logged in"
   
  Examples:
   |username|password|
   |Ram |sitha02|
   |Anu|Smart83!|
 