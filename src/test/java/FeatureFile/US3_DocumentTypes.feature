Feature: Document types Add,Edit,Delete

Background:
  Given Navigate to Campus
  When Enter username and password and click Login button
  Then User should login successfully

  And Click  on the element in LeftNav
    | setUpOne        |
    | parameters      |
    | documentTypesHB |

  Scenario Outline:  User should be able to Add document types


    When :User Document types  name as "<Name>" as add

    Then Success Message should be displayed

#   When :User Document types  name as "<Name>" as add
#   Then Already exist message should be displayed

    Examples:
      | Name  |
      | emine |


  Scenario Outline: User should be able to edit document types

    And User  sending the keys ibn the Dialog Content
      | searchNameHB | emine |
    And Click  on the element in the Dialog Content
      | searchButton |


    When : User Fields  name as "<Name>"  as Edit
    Then Success Message should be displayed

    Examples:
      | Name |
      | esra |


  Scenario Outline: User should be able to Delete document types

    And User  sending the keys ibn the Dialog Content
      | searchNameHB | esra |

    And Click  on the element in the Dialog Content
      | searchButton |

    When user delete name as "<Name>"
    Then Success Message should be displayed
    Examples:
      | Name |
      | esra |