Feature: Add-Edit-Delete Nationalities under Parameters Setup

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully
    And Click  on the element in LeftNav
      | setUpOne      |
      | parameters    |
      | nationalities |

  @Regression
  Scenario Outline: User should be able to Add Nationalities
    When :User Nationalities name as "<name>" as add
    Then Success message should be displayed

    Examples:
      | name         |
      | Group_3_US12 |

  @Regression
  Scenario Outline: User should be able to edit Nationalities
    And User  sending the keys ibn the Dialog Content
      | searchInput_VA | Group_3_US12 |

    And Click  on the element in the Dialog Content
      | searchButton |

    When : User Fields  name as "<name>"  as Edit Nationalities

    Then Success message should be displayed

    Examples:
      | name    |
      | Group_3 |

  @Regression
  Scenario Outline:  User should be able to Delete Nationalities

    And User  sending the keys ibn the Dialog Content
      | searchInput_VA | Group_3 |

    When user delete name as "<name>"

    Then Success message should be displayed

    Examples:
      | name    |
      | Group_3 |