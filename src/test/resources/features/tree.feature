Feature: Handling Tree options

  Scenario: User clicks gets into Tree page 
    Given User is logged in and on Home Page for Tree
    When User clicks on Tree Get started button or from drop menu tree item
    Then User is on tree Intro page 
    
   Scenario: User is on Tree page for clicks on Overview of Trees
   Given User is on Tree page for clicks Overview of Trees
    When  Tree user clicks on Overview of Tree
    And Tree User clicks on try here  
    Then Tree User lands on tryEditor page
    
   Scenario Outline: Tree User redirected to try me page to run invalid code
    Given Tree User is on tryEditor page
    When Tree The user enters sheet "<Sheetname>" and <RowNumber>
    And  Tree User clicks Run to execute code
    Then Tree User gets a error message and dismisses it

   Examples: 
      | Sheetname | RowNumber |
      | TestCode  |         0 |
  

  Scenario Outline: Tree User redirected to try me page to run python code
    Given Tree User is on tryEditor page for python code
    When Tree The user enters valid sheet "<Sheetname>" and <RowNumber>
    And  Tree User clicks Run to execute valid code
    Then Tree User gets a valid output

    Examples: 
      | Sheetname | RowNumber |
      | TestCode  |         1|
    
  
  Scenario: User is back on Tree page for clicks on Terminologies
   Given User is on Tree page for clicks Terminologies
    When user clicks on Terminologies
    And Tree User clicks on try here 
    Then Tree User lands on tryEditor page 
    
  Scenario Outline: Tree User redirected to try me page to run invalid code
    Given Tree User is on tryEditor page
    When Tree The user enters sheet "<Sheetname>" and <RowNumber>
    And  Tree User clicks Run to execute code
    Then Tree User gets a error message and dismisses it

   Examples: 
      | Sheetname | RowNumber |
      | TestCode  |         0 |
    

  Scenario Outline: Tree User redirected to try me page to run python code
    Given Tree User is on tryEditor page for python code
    When Tree The user enters valid sheet "<Sheetname>" and <RowNumber>
    And  Tree User clicks Run to execute valid code
    Then Tree User gets a valid output

    Examples: 
      | Sheetname | RowNumber |
      | TestCode  |         1|

  
   
   Scenario: User is back on Tree page for clicks on Types of Trees
   Given User is on Tree page for clicks Types of Trees
    When user clicks on Types of Trees
    And Tree User clicks on try here 
    Then Tree User lands on tryEditor page 
    
  Scenario Outline: Tree User redirected to try me page to run invalid code
    Given Tree User is on tryEditor page
    When Tree The user enters sheet "<Sheetname>" and <RowNumber>
    And  Tree User clicks Run to execute code
    Then Tree User gets a error message and dismisses it

   Examples: 
      | Sheetname | RowNumber |
      | TestCode  |         0 |


  Scenario Outline: Tree User redirected to try me page to run python code
    Given Tree User is on tryEditor page for python code
    When Tree The user enters valid sheet "<Sheetname>" and <RowNumber>
    And  Tree User clicks Run to execute valid code
    Then Tree User gets a valid output

    Examples: 
      | Sheetname | RowNumber |
      | TestCode  |         1|
   
  
      
   
   Scenario: User is back on Tree page for clicks on Tree Traversals
   Given User is on Tree page for clicks Tree Traversals
    When user clicks on Tree Traversals
    And Tree User clicks on try here 
    Then Tree User lands on tryEditor page 
    
  Scenario Outline: Tree User redirected to try me page to run invalid code
    Given Tree User is on tryEditor page
    When Tree The user enters sheet "<Sheetname>" and <RowNumber>
    And  Tree User clicks Run to execute code
    Then Tree User gets a error message and dismisses it

   Examples: 
      | Sheetname | RowNumber |
      | TestCode  |         0 |
  

  Scenario Outline: Tree User redirected to try me page to run python code
    Given Tree User is on tryEditor page for python code
    When Tree The user enters valid sheet "<Sheetname>" and <RowNumber>
    And  Tree User clicks Run to execute valid code
    Then Tree User gets a valid output

    Examples: 
      | Sheetname | RowNumber |
      | TestCode  |         1|
  
  
  Scenario: User is back on Tree page for clicks on Traversals-Illustration
   Given User is on Tree page for clicks Traversals-Illustration
    When user clicks on Traversals-Illustration
    And Tree User clicks on try here 
    Then Tree User lands on tryEditor page 
    
  Scenario Outline: Tree User redirected to try me page to run invalid code
    Given Tree User is on tryEditor page
    When Tree The user enters sheet "<Sheetname>" and <RowNumber>
    And  Tree User clicks Run to execute code
    Then Tree User gets a error message and dismisses it

   Examples: 
      | Sheetname | RowNumber |
      | TestCode  |         0 |
   

  Scenario Outline: Tree User redirected to try me page to run python code
    Given Tree User is on tryEditor page for python code
    When Tree The user enters valid sheet "<Sheetname>" and <RowNumber>
    And  Tree User clicks Run to execute valid code
    Then Tree User gets a valid output

    Examples: 
      | Sheetname | RowNumber |
      | TestCode  |         1|
     
  
  
   Scenario: User is back on Tree page for clicks on Binary Trees
   Given User is on Tree page for clicks Binary Trees
    When user clicks on Binary Trees
    And Tree User clicks on try here 
    Then Tree User lands on tryEditor page 
    
   Scenario Outline: Tree User redirected to try me page to run invalid code
    Given Tree User is on tryEditor page
    When Tree The user enters sheet "<Sheetname>" and <RowNumber>
    And  Tree User clicks Run to execute code
    Then Tree User gets a error message and dismisses it

   Examples: 
      | Sheetname | RowNumber |
      | TestCode  |         0 |
   

  Scenario Outline: Tree User redirected to try me page to run python code
    Given Tree User is on tryEditor page for python code
    When Tree The user enters valid sheet "<Sheetname>" and <RowNumber>
    And  Tree User clicks Run to execute valid code
    Then Tree User gets a valid output

    Examples: 
      | Sheetname | RowNumber |
      | TestCode  |         1|
    
  
    
  Scenario: User is back on Tree page for clicks on Types of Binary Trees
   Given User is on Tree page for clicks Types of Binary Trees
    When user clicks on Types of Binary Trees
    And Tree User clicks on try here 
    Then Tree User lands on tryEditor page 
    
  Scenario Outline: Tree User redirected to try me page to run invalid code
    Given Tree User is on tryEditor page
    When Tree The user enters sheet "<Sheetname>" and <RowNumber>
    And  Tree User clicks Run to execute code
    Then Tree User gets a error message and dismisses it

   Examples: 
      | Sheetname | RowNumber |
      | TestCode  |         0 |
     

  Scenario Outline: Tree User redirected to try me page to run python code
    Given Tree User is on tryEditor page for python code
    When Tree The user enters valid sheet "<Sheetname>" and <RowNumber>
    And  Tree User clicks Run to execute valid code
    Then Tree User gets a valid output

    Examples: 
      | Sheetname | RowNumber |
      | TestCode  |         1|
  
  
  Scenario: User is back on Tree page for clicks on Implementation in Python
   Given User is on Tree page for clicks Implementation in Python
    When user clicks on Implementation in Python
    And Tree User clicks on try here 
    Then Tree User lands on tryEditor page 
    
  Scenario Outline: Tree User redirected to try me page to run invalid code
    Given Tree User is on tryEditor page
    When Tree The user enters sheet "<Sheetname>" and <RowNumber>
    And  Tree User clicks Run to execute code
    Then Tree User gets a error message and dismisses it

   Examples: 
      | Sheetname | RowNumber |
      | TestCode  |         0 |
 

  Scenario Outline: Tree User redirected to try me page to run python code
    Given Tree User is on tryEditor page for python code
    When Tree The user enters valid sheet "<Sheetname>" and <RowNumber>
    And  Tree User clicks Run to execute valid code
    Then Tree User gets a valid output

    Examples: 
      | Sheetname | RowNumber |
      | TestCode  |         1|
     
  
  Scenario: User is back on Tree page for clicks on Binary Tree Traversals
   Given User is on Tree page for clicks Binary Tree Traversals
    When user clicks on Binary Tree Traversals
    And Tree User clicks on try here 
    Then Tree User lands on tryEditor page 
    
 Scenario Outline: Tree User redirected to try me page to run invalid code
    Given Tree User is on tryEditor page
    When Tree The user enters sheet "<Sheetname>" and <RowNumber>
    And  Tree User clicks Run to execute code
    Then Tree User gets a error message and dismisses it

   Examples: 
      | Sheetname | RowNumber |
      | TestCode  |         0 |
  

  Scenario Outline: Tree User redirected to try me page to run python code
    Given Tree User is on tryEditor page for python code
    When Tree The user enters valid sheet "<Sheetname>" and <RowNumber>
    And  Tree User clicks Run to execute valid code
    Then Tree User gets a valid output

    Examples: 
      | Sheetname | RowNumber |
      | TestCode  |         1|
     
   
   Scenario: User is back on Tree page for clicks on Implementation of Binary Trees
   Given User is on Tree page for clicks Implementation of Binary Trees
    When user clicks on Implementation of Binary Trees
    And Tree User clicks on try here 
    Then  Tree User lands on tryEditor page 
    
  Scenario Outline: Tree User redirected to try me page to run invalid code
    Given Tree User is on tryEditor page
    When Tree The user enters sheet "<Sheetname>" and <RowNumber>
    And  Tree User clicks Run to execute code
    Then Tree User gets a error message and dismisses it

   Examples: 
      | Sheetname | RowNumber |
      | TestCode  |         0 |


  Scenario Outline: Tree User redirected to try me page to run python code
    Given Tree User is on tryEditor page for python code
    When Tree The user enters valid sheet "<Sheetname>" and <RowNumber>
    And  Tree User clicks Run to execute valid code
    Then Tree User gets a valid output

    Examples: 
      | Sheetname | RowNumber |
      | TestCode  |         1|
     
  
  
   Scenario: User is back on Tree page for clicks on Applications of Binary trees
   Given User is on Tree page for clicks Applications of Binary trees
    When user clicks on Applications of Binary trees
    And Tree User clicks on try here 
    Then Tree User lands on tryEditor page
    
  Scenario Outline: Tree User redirected to try me page to run invalid code
    Given Tree User is on tryEditor page
    When Tree The user enters sheet "<Sheetname>" and <RowNumber>
    And  Tree User clicks Run to execute code
    Then Tree User gets a error message and dismisses it

   Examples: 
      | Sheetname | RowNumber |
      | TestCode  |         0 |


  Scenario Outline: Tree User redirected to try me page to run python code
    Given Tree User is on tryEditor page for python code
    When Tree The user enters valid sheet "<Sheetname>" and <RowNumber>
    And  Tree User clicks Run to execute valid code
    Then Tree User gets a valid output

    Examples: 
      | Sheetname | RowNumber |
      | TestCode  |         1|
     
  
          
  Scenario: User is back on Tree page for clicks on Binary Search Trees
   Given User is on Tree page for clicks Binary Search Trees
    When user clicks on Binary Search Trees
    And Tree User clicks on try here
    Then Tree User lands on tryEditor page
    
  Scenario Outline: Tree User redirected to try me page to run invalid code
    Given Tree User is on tryEditor page
    When Tree The user enters sheet "<Sheetname>" and <RowNumber>
    And  Tree User clicks Run to execute code
    Then Tree User gets a error message and dismisses it

   Examples: 
      | Sheetname | RowNumber |
      | TestCode  |         0 |
   
  Scenario Outline: Tree User redirected to try me page to run python code
    Given Tree User is on tryEditor page for python code
    When Tree The user enters valid sheet "<Sheetname>" and <RowNumber>
    And  Tree User clicks Run to execute valid code
    Then Tree User gets a valid output

    Examples: 
      | Sheetname | RowNumber |
      | TestCode  |         1|
 
  
  
   Scenario: User is back on Tree page for clicks on Implementation Of BST
   Given User is on Tree page for clicks Implementation Of BST
    When  user clicks on Implementation Of BST
    And Tree User clicks on try here 
    Then Tree User lands on tryEditor page 
    
  Scenario Outline: Tree User redirected to try me page to run invalid code
    Given Tree User is on tryEditor page
    When Tree The user enters sheet "<Sheetname>" and <RowNumber>
    And  Tree User clicks Run to execute code
    Then Tree User gets a error message and dismisses it

   Examples: 
      | Sheetname | RowNumber |
      | TestCode  |         0 |


  Scenario Outline: Tree User redirected to try me page to run python code
    Given Tree User is on tryEditor page for python code
    When Tree The user enters valid sheet "<Sheetname>" and <RowNumber>
    And  Tree User clicks Run to execute valid code
    Then Tree User gets a valid output

    Examples: 
      | Sheetname | RowNumber |
      | TestCode  |         1|
     
  
      
  Scenario: User is back on Tree page for clicks on Practice Questions
   Given User is on Tree page for clicks Practice Questions
   When Tree user clicks on practice questions
   Then Tree User lands on practice page
      
          
   