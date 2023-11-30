Feature: Handling stack options

  Scenario: User clicks gets into stack page
    Given User is logged in and on Home Page for stack
    When User clicks on stack Get started button or from drop menu stack item
    Then User is on stack Intro page

  Scenario: User on operation in stack page
    Given User is on opertaion stack Intro page
    When user clicks on opertaion in stack
    And User clicks on try here
    Then User lands on tryEditor page of stack

  Scenario: User redirected to try me page to run invalid code
    Given User lands on Editor page for invalid code
    When User enters invalid code to run on editor in stack
      | System.out.println("Hi Java"); |
    And User clicks Run to execute code for stack
    Then User gets a error message and dismisses it in stack

  Scenario: User redirected to try me page to run python code
    Given User lands on Editor page valid code
    When User enters python code to run on editor of stack
      | print 'hello'; |
    And User clicks Run to execute pythone code
    Then User gets a valid output in stack

  Scenario: The user back to Stack page
    Given The user is on Stack page for clicks on implementation
    When user clicks on implementation
    And User clicks on try here
    Then User lands on tryEditor page of stack

  Scenario: User redirected to try me page to run invalid code
    Given User lands on Editor page for invalid code
    When User enters invalid code to run on editor in stack
      | System.out.println("Hi Java"); |
    And User clicks Run to execute code for stack
    Then User gets a error message and dismisses it in stack

  Scenario: User redirected to try me page to run python code
    Given User lands on Editor page valid code
    When User enters python code to run on editor of stack
      | print 'hello'; |
    And User clicks Run to execute pythone code
    Then User gets a valid output in stack

  Scenario: The user again back to Stack page
    Given The user on Stack page for clicks on Applications
    When user clicks on Applications
    And User clicks on try here
    Then User lands on tryEditor page of stack

  Scenario: User redirected to try me page to run invalid code
    Given User lands on Editor page for invalid code
    When User enters invalid code to run on editor in stack
      | System.out.println("Hi Java"); |
    And User clicks Run to execute code for stack
    Then User gets a error message and dismisses it in stack

  Scenario: User redirected to try me page to run python code
    Given User lands on Editor page valid code
    When User enters python code to run on editor of stack
      | print 'hello'; |
    And User clicks Run to execute pythone code
    Then User gets a valid output in stack

  Scenario: The user again Stack page
    Given The user is on Stack page for click practice quest
    When user clicks on practice questions
    Then User lands on practice page
