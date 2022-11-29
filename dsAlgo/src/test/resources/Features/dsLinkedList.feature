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
@LinkedList
Feature: LinkedList
  I want to use this template for my feature file

  
  Scenario: Title of your scenario
    Given The user opens chrome browser and user enter the "https://dsportalapp.herokuapp.com/login"
    When user enter credentials to Login
      | Anu | Smart83! |
    And click on Login button
    
  Scenario: LinkedList Module
    Given User is in home page "https://dsportalapp.herokuapp.com/home"
    When user click on LinkedList getstarted button
    Then user should naviagated to corresponding page with title "Linked List"
    When user click Introduction link
    Then user should naviagated to corresponding page with title "Introduction"
    When user click on TryHere button
    And user enter the<pythoncode>
    Then click the Run button
    Then user navigate to tree home page
    
    When user click Creating LinkedLIst link
    Then user should naviagated to corresponding page with title "Creating Linked LIst"
    When user click on TryHere button
    And user enter the<pythoncode>
    Then click the Run button
    Then user navigate to tree home page
    
    When user click Types of Linked List
    Then user should naviagated to corresponding page with title "Types of Linked List"
    When user click on TryHere button
    And user enter the<pythoncode>
    Then click the Run button
    Then user navigate to tree home page
    
    When user click Implement Linked List in Python
    Then user should naviagated to corresponding page with title "Implement Linked List in Python"
    When user click on TryHere button
    And user enter the<pythoncode>
    Then click the Run button
    Then user navigate to tree home page
    
    When user click Traversal
    Then user should naviagated to corresponding page with title "Traversal"
    When user click on TryHere button
    And user enter the<pythoncode>
    Then click the Run button
    Then user navigate to tree home page
         
    When user click Insertion
    Then user should naviagated to corresponding page with title "Insertion"
    When user click on TryHere button
    And user enter the<pythoncode>
    Then click the Run button
    Then user navigate to tree home page
    
     When user click Deletion
    Then user should naviagated to corresponding page with title "Deletion"
    When user click on TryHere button
    And user enter the<pythoncode>
    Then click the Run button
    Then user navigate to tree home page
    Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"
    
  
  Examples:
   
   |pythoncode|
   |print("Hello World")|