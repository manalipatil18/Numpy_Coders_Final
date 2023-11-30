Feature: Title of home page Get Started Clicks

  Scenario: clicks of the Get Started button data structures
    Given User Open Home Page
    When clicks on the Get Started button Data Structure Introduction
    Then DS alert with a message You are not logged in

  Scenario: clicks of the Get Started button Linked List
    Given User Open Home Page linked list
    When clicks on the Get Started button Linked List
    Then Linked List alert with a message You are not logged in

  Scenario: clicks of the Get Started button Stack
    Given User Open Home Page Stack
    When clicks on the Get Started button Stack
    Then Stack alert with a message You are not logged in


  Scenario: clicks of the Get Started button Array
    Given User Open Home Page Array
    When clicks on the Get Started button Array
    Then Array alert with a message You are not logged in


  Scenario: clicks of the Get Started button Queue
    Given User Open Home Page Queue
    When clicks on the Get Started button Queue
    Then Queue alert with a message You are not logged in


  Scenario: clicks of the Get Started button Tree
    Given User Open Home Page
    When clicks on the Get Started button Tree
    Then Tree alert with a message You are not logged in


  Scenario: clicks of the Get Started button Graph
    Given User Open Home Page Graph
    When clicks on the Get Started button Graph
    Then Graph alert with a message You are not logged in

