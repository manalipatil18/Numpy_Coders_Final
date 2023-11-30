Feature: Feature to test array functionality

  Scenario: To check array functionality
    Given The user is in the homepage after logged in
    When The user clicks the Get Started button in Array Panel
    Then The user redirected to ARRAY Data Structure Page

  Scenario: To check Arrays in Python
    Given The user is in the Array page after logged in
    When The user clicks Arrays in Python button
    And The user clicks "Try Here" button in Arrays in Python page
    Then The user should be redirected to a page having an tryEditor with a Run button to test
      | array = [100,500,300,200]\nprint(array.index(300)) |

  Scenario: To check Arrays Using List link
    Given The user is in the Arrays in Python page after navigating back from tryEditor
    When The user clicks Arrays Using List link
    And The user clicks "Try Here" button in Arrays Using List page
    Then The user should be redirected to tryEditor page
      | countries = ["india", "Australia", "bhutan", "Africa"]\ncountries.append("Japan")\nprint(countries) |

  Scenario: To check Basic Operations in Lists
    Given The user is in the Arrays Using List page after navigating back from tryEditor
    When The user clicks Basic Operations in Lists link
    And The user clicks "Try Here" button in Basic Operations in Lists page
    Then The user should be redirected to the next page
      | animals = ["Elephant","bear","lion","zebra","monkey"]\nanimals.pop(2)\nprint(animals) |

  Scenario: To check Applications of Array features
    Given The user is in the Basic Operations in Lists page after navigating back from tryEditor
    When The user clicks Applications of Array link
    And The user clicks "Try Here" button in Applications of Array page
    Then The user should be redirected to the new page having an tryEditor and a Run button.
      | produce = ["products : cost(in dollars)", "vegetables :  Fifty", "Fruits  : Thirty", "snacks : Ten"]\nfor x in produce:\nprint(x) |

    Scenario: To check Practice Questions
     Given The user is in the Applications of Array page after navigating back from tryEditor
    When The user clicks on Practice Questions link
   And The user clicks on the Search the array link
   Then The user should be redirected to the new page having one question on the left side and tryEditor, Run button.
  
   Scenario: To check Practice Questions No two
   Given The user is in the Practice question page after navigating back from Search the array tryEditor
   When The user clicks on Max consecutive ones link
   Then The user should be redirected to the new page having one question related with Max consecutive ones
 
   Scenario: To check Practice Questions No three
  Given The user is in the Practice question page after navigating back from Max consecutive ones tryEditor
   When The user clicks on the Find numbers with even number of digits link
  Then The user should be redirected to the new page having one question related to the corresponding topic
 
   Scenario: To check Practice Questions No Four
  Given The user is in the Practice question page after navigating back from Find numbers with even number of digits tryEditor
   When The user clicks on the Squares of a sorted Array link
  Then The user should be redirected to the new page having one question related to Squares of a sorted Array topic
 
 
 
   Scenario: To check Arrays in Python invalid inputs
    Given Given The user is in the Applications of Array page after testing the positive scenarios
    When The user clicks on Arrays in Python for testing negative input
    And The user clicks on Try here button for entering negative input
    Then User navigates to tryEditer page for entering Arrays in Python_negative input
      | System.out.println("Numpy Ninja") |

  Scenario: To check Arrays Using List_ invalid inputs
    Given Given The user is in the Applications of Array page after testing the negative scenarios
    When The user clicks on Arrays Using List for testing negative input
    And The user clicks on Try here button for entering negative values in the tryEditor page
    Then User navigates to tryEditer page for entering Arrays Using List_ invalid inputs
      | System.out.println("hello") |
      
   Scenario: To check Basic Operations in Lists invalid inputs
    Given  The user is in the Applications of Array page after testing the negative scenarios of Arrays Using List
    When The user clicks on Basic Operations in Lists link for testing negative values
    And The user clicks on Try here button for entering negative values for the third time
    Then User navigates to tryEditer page for entering Basic Operations in Lists invalid inputs
      | vgfgfyfgyg |
         
    Scenario: To check Applications of Array invalid inputs
    Given The user is in the Applications of Array page after testing the negative scenarios of Basic Operations in Lists
    When The user clicks on Applications of Array link for testing negative values
    And The user clicks on Try here button for entering negative values for the fourth time
    Then User navigates to tryEditer page for entering Applications of Array link invalid inputs
      | sdf sfsfsfs ddfdfdfd |  
      
      
      
      
      
      
