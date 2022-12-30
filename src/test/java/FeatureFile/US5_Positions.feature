Feature: Add-Edit-Delete Positions

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully
    And Click on the element in the left nav
      | humanResources |
      | setUpThreeF    |
      | positionsF     |

  @Regression
  Scenario Outline:User should be able to Add Positions
    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInputF      | <name>      |
      | shortNameInputF | <shortName> |

    And Click on the element in the dialog content
      | saveButton |

    Then Success Message should be displayed

    And Click on the element in the dialog content
      | addButton |

    And User sending the keys in Dialog content
      | nameInputN      | <name>      |
      | shortNameInputF | <shortName> |

    And Click on the element in the dialog content
      | saveButton |

    Then Already exist message should be displayed

    Examples:
      | name  | shortName |
      | felat | group3.   |

  @Regression
  Scenario Outline:User should be able to Edit Positions
    And User sending the keys in Dialog content
      | searchNameInputF | <name> |

    And Click on the element in the dialog content
      | searchButton |

    And User  should edit item in the name Dialog
      | <name1> |

    Then Success Message should be displayed

    Examples:
      | name  | name1     |
      | felat | felatyeni |

  @Regression
  Scenario Outline:User should be able to Delete Positions
    And User sending the keys in Dialog content
      | searchNameInputF | <name> |

    And Click on the element in the dialog content
      | searchButton |

    And User delete items from Dialog
      | <name> |

    Then Success Message should be displayed

    Examples:
      | name      |
      | felatyeni |
