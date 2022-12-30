Feature: Departments Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully
    And Click  on the element in LeftNav
      | setUpOne    |
      | schoolSetup |
      | departments |

  @Regression
  Scenario Outline: Create  Departments
    When : user Fields  name as "<Name>"  Code as "<Code>"
    Then Success Message should be displayed
    Examples:
      | Name    | Code |
      | Group_3 | US_8 |

  @Regression
  Scenario Outline: User should be able to edit Departments
    When : User Fields  name as "<name>"  as Edit Nationalities
    Then Success message should be displayed
    Examples:
      | name |
      | US_8 |

  @Regression
  Scenario Outline:  User should be able to Delete Departments
    When User Delete name as "<name>"
    Then Success message should be displayed
    Examples:
      | name |
      | US_8 |