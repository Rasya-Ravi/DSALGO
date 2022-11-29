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
@Array
Feature: Array
Scenario: Title of your scenario
    Given The user opens chrome browser and user enter the "https://dsportalapp.herokuapp.com/login"
    When user enter credentials to Login
      | Anu | Smart83! |
    And click on Login button
    
  Scenario: Array Module
  
    Given User is in home page "https://dsportalapp.herokuapp.com/home"
    When user click on Array getstarted button
    Then user should naviagated to corresponding page with title "Array"
    When user click Arrays in Python link
    Then user should naviagated to corresponding page with title "Arrays in Python"
    When user click on TryHere button
    And user clear the text and enter the<pythoncode>
    Then click the Run button
    Then user navigate to tree home page
    
    When user click Arrays Using List
    Then user should naviagated to corresponding page with title "Arrays Using List"
    When user click on TryHere button
    And user clear the text and enter the<pythoncode>
    Then click the Run button
    Then user navigate to tree home page
    
    When user click Basic Operations in Lists
    Then user should naviagated to corresponding page with title "Basic Operations in Lists"
    When user click on TryHere button
    And user clear the text and enter the<pythoncode>
    Then click the Run button
    Then user navigate to tree home page
    
    When user click Applications of Array
    Then user should naviagated to corresponding page with title "Applications of Array"
    When user click on TryHere button
    And user clear the text and enter the<pythoncode>
    Then click the Run button
    Then user navigate to tree home page
    
    
    When user click Practice Questions 
    Then user should naviagated to corresponding page with title "Practice Questions"
   
    When user click Search The Array 
    Then user should naviagated to corresponding page with title "Assessment"
    And user clear the text and enter the<pythoncode>
    Then click the Run button
    Then user navigate to tree home page
    
    When user click Max Consecutive Ones
    Then user should naviagated to corresponding page with title "Assessment"
    And user clear the text and enter the<pythoncode>
    Then click the Run button
    Then user navigate to tree home page
    
    When user click Find Numbers with Even Number of Digits
    Then user should naviagated to corresponding page with title "Assessment"
    And user clear the text and enter the<pythoncode>
    Then click the Run button
    Then user navigate to tree home page
    
    When user click Squares of a Sorted Array
    Then user should naviagated to corresponding page with title "Assessment"
    And user clear the text and enter the<pythoncode>
    Then click the Run button
    Then user navigate to tree home page
    Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"
    

  Examples:
   
   |pythoncode|
   |print("Hello World")|