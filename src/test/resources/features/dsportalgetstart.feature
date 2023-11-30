 Feature: Handling Ds Algo Portal Page 
 
  Scenario: The user opens DS Algo portal link
    Given The user opens DS Algo portal link
    When  clicks the Get Started button
    Then The user should be redirected to homepage
    
  Scenario: The user open Data Structures Option1
    Given The user clicks Data Structures drop down option1
    When selects Array from list
    Then Array alert msg without sign - You are not logged in
    
  Scenario: The user open Data Structures Option2
    Given The user clicks Data Structures drop down option2
    When selects Linked List from list
    Then Linked List alert msg without sign - You are not logged in
    
  Scenario: The user open Data Structures Option3
    Given The user clicks Data Structures drop down option3
    When selects Stack from list
    Then Stack alert msg without sign - You are not logged in
    
  Scenario: The user open Data Structures Option4
    Given The user clicks Data Structures drop down option4
    When selects Queue from list
    Then Queue alert msg without sign - You are not logged in
    
  Scenario: The user open Data Structures Option5
    Given The user clicks Data Structures drop down option5
    When selects Tree from list
    Then Tree alert msg without sign - You are not logged in    
   
  Scenario: The user open Data Structures Option6
    Given The user clicks Data Structures drop down option6
    When selects Graph from list
    Then Graph alert msg without sign - You are not logged in    
  