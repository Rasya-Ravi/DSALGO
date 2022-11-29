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
@Home
Feature: Register
  I want to use this template for my feature file

  @tag1
   Scenario: Home and Register
    Given The user opens chrome browser and enter the url 
    When The user clicks the "Get Started" button
    Then The user should be redirected to homepage and user should see six panes with different data structures
    When The user clicks "Data Structures" drop down
    Then user should see six different data structure entries in that dropdown
    When The user clicks any of the "Get Started" buttons below the data structures
    Then It should alert the user with a message "You are not logged in"
    When The user selects any data structure from home page
    Then It should alert the user with a message "You are not logged in"
    Then The user should be redirected to Register page 
    When user clicks on Register link
    And enter the <username> and <password> and <Confirmpswd>
    And click on Register button
    Then user should see "New Account Created."
    
   
    Examples:
    |username|password|Confirmpswd|
    |Ammu|Ninja|Ninj|
    |Ayaan17|Tester126!|Tester126!|