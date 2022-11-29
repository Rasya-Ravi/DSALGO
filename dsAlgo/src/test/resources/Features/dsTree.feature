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
@Tree
Feature: Tree
  I want to use this template for my feature file

 
  Scenario: Tree Module
    Given The user opens chrome browser and user enter the "https://dsportalapp.herokuapp.com/login"
    When user enter credentials to Login
    |Anu|Smart83!|
    And click on Login button
    And user click on Tree getstarted button
    Then user should navigated to Tree module and user can see fourteen child modules
   
    When user click Overview of Trees
    Then user should naviagated to corresponding page with title Overview of Trees
    When user click on TryHere button
    And user enter the<pythoncode>
    Then click the Run button
    Then user navigate to tree home page
   
    When user clicks the terminologies button
    Then user should navigate to Terminologies module
    When user clicks on TryHere button
    And user enters <pythoncode>
    Then clicks the Run button
    And user navigate to tree home page
   
    When user clicks Types of Trees
    Then user should navigate to Types of tree page
    When the user clicks the TryHere buton
    And the user enter<pythoncode>
    Then click the run button
    And naviagte to tree home page
    
    When user click Tree Traversals
    Then user should navigate to Tree Traversals module
    When user clicks Tryhere button
    And user enter TT module<pythoncode>
    When click the TT module run button
    Then user navigate to TT home page
   
    When user clicks on Traversals Illustration
    Then user should navigate to Traversals Illustration module
    When user clicks TL Tryhere button
    And user enter TL module<pythoncode>
    When click the TL module run button
    Then user navigate to TL home page
   
    When user click on Binary Trees
    Then user should navigate to Binary Tree module
    When user clicks BT Tryhere button
    And user enter BT module<pythoncode>
    When user click the BT module run button
    Then user navigate to BT home page
    
    When user click on Types of Binary Trees
    Then user should navigate to Types of Binary Trees module
    When user clicks TBT Tryhere button
    And user enter TBT module<pythoncode>
    When user click the TBT module run button
    Then user navigate to TBT home page
   
    When user click on Implementation of Python
    Then user should navigate to Implementation of Python module
    When user clicks on IOP Tryhere button
    And user enter IOP module<pythoncode>
    When user click the IOP module run button
    Then user navigate to IOP home page
    
    When user click on Binary Tree Traversals
    Then user should navigate to Binary Tree Traversals module
    When user clicks on BTT Tryhere button
    And user enter BTT module<pythoncode>
    When user click the BTT module run button
    Then user navigate to BTT home page
    
    When user click on Implementation of Binary Trees
    Then user should navigate to Implementation of Binary Trees module
    When user clicks on IOBT Tryhere button
    And user enter IOBT module<pythoncode>
    When user click the IOBT module run button
    Then user navigate to IOBT home page
    
    When user click on Applications of Binary Trees
    Then user should navigate to Applications of Binary Trees module
    When user clicks on AOBT Tryhere button
    And user enter AOBT module<pythoncode>
    When user click the AOBT module run button
    Then user navigate to AOBT home page
        
    When user click on Binary Search Trees
    Then user should navigate to Binary Search Trees module
    When user clicks on BST Tryhere button
    And user enter BST module<pythoncode>
    When user click the BST module run button
    Then user navigate to BST home page
    
    When user click on Implementaion of BST
    Then user should navigate to Implementaion of BST module
    When user clicks on IOBST Tryhere button
    And user enter IOBST module<pythoncode>
    When user click the IOBST module run button
    Then user navigate to IOBST home page
    
    
Examples:
   
   |pythoncode|
   |print("Hello World")|
   
