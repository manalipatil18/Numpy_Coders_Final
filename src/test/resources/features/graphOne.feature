
Feature:  Feature to test Graph functionality

  Scenario: User opens Graph data structure page
    Given The user entered the homepage after logged in
    When The user clicks on the drop down button and clicks on graph
    Then The user redirected to Graph Data Structure Page
    
   Scenario Outline:  User enters inavlaid values in tryEditor page in Graph
    Given The user is in Graph data structure page
    And User clicks on Graph link and Try here button in the next page
    When The user enter sheet "<Sheetname>" and <RowNumber>
    And User Clicks on Run button and handles the Alert message
    Then User navigates back to the previous page
    
    Examples: 
      | Sheetname  | RowNumber | 
      | TestCode   |     0     | 
      
      
   Scenario Outline:  User enters valid values in tryEditor page in Graph   
       Given The user is in Graph data structure page after testing invalid input
       And User clicks Try here button and navigates to the next page
       When The user enters sheet "<Sheetname>" and <RowNumber> for testing valid values
       Then User gets the output and navigates back.
   Examples: 
      | Sheetname  | RowNumber | 
      | TestCode   |     1     | 
      
      
  Scenario Outline:  User enters invlaid values in tryEditor page in Graph Representations
    Given The user is in Graph data structure page after testing one set of inputs 
    And User clicks on Graph Representations link and Try here button in the next page
    When The user enters sheet "<Sheetname>" and <RowNumber> for testing invalid values  
    And User Clicks on Run button  
    Then User handles the alert and  navigates back to the previous page  
  
   Examples: 
      | Sheetname  | RowNumber | 
      | TestCode   |     0     | 
      
      
    Scenario Outline:  User enters valid values in tryEditor page in Graph Representations
      Given The user is in Graph Representations page after testing invalid values
       And User clicks Try here button and navigates to the next page for testing positive inputs.
       When The user enters sheet "<Sheetname>" and <RowNumber> for the fourth time
      Then User gets the output
    
     Examples: 
      | Sheetname  | RowNumber | 
      | TestCode   |     1     | 
      
      
      
    
    