Feature:Add-Edit-Delete Fields under Parameters Setup

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully
    And Click  on the element in LeftNav
      | setUpOne    |
      | parameters  |
      | fieldsOneHB |


  Scenario Outline:User should be able to Add Fields



    When : User Fields  name as "<Name>"  Code as "<Code>"
    Then Success Message should be displayed

    When : User Fields  name as "<Name>"  Code as "<Code>"
    Then Already exist message should be displayed

    Examples:
      | Name     | Code    |
      | suleyman | 456yhbn |


  Scenario Outline: User should be able to Edit Fields

    And User  sending the keys ibn the Dialog Content
      | searchNameHB | suleyman |
    And Click  on the element in the Dialog Content
      | searchButton |

    When : User Fields  name as "<Name>"  as Edit
    Then Success Message should be displayed

    Examples:
      | Name          |
      | suleyman yeni |

  Scenario Outline: User should be able to Delete Fields

    And User  sending the keys ibn the Dialog Content

      | searchNameHB | esra yeni |
    And Click  on the element in the Dialog Content
      | searchButton |

    When user delete name as "<Name>"
    Then Success Message should be displayed
    Examples:
      | Name          |
      | suleyman yeni |