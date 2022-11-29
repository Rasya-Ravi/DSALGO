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
@Graph
Feature: Graph

  Scenario: Title of your scenario
    Given The user opens chrome browser and user enter the "https://dsportalapp.herokuapp.com/login"
    When user enter credentials to Login
      | Anu | Smart83! |
    And click on Login button

  Scenario: Graph Module
    Given User is in home page "https://dsportalapp.herokuapp.com/home"
    When user click on Graph getstarted button
    Then user should naviagated to corresponding page with title "Graph"
    When user click Graph link
    Then user should naviagated to corresponding page with title "Graph"
    When user click on TryHere button
    And user enter the<pythoncode>
    Then click the Run button
    Then user navigate to tree home page
    
    When user click Graph Representations link
    Then user should naviagated to corresponding page with title "Graph Representations"
    When user click on TryHere button
    And user enter the<pythoncode>
    Then click the Run button
    Then user navigate to tree home page
    Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"
    When user click on signout

     Examples:
   
   |pythoncode|
   |print("Hello World")|