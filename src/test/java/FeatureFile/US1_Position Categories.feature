Feature: Add-Edit-Delete Position Categories

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully
    And Click on the element in the left nav
      | humanResources      |
      | setUpThreeN         |
      | positionCategoriesN |

  @Regression
  Scenario Outline:User should be able to Add Position Categories
    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInputN | <name> |

    And Click on the element in the dialog content
      | saveButton |

    Then Success Message should be displayed

    And Click on the element in the dialog content
      | addButton |

    And User sending the keys in Dialog content
      | nameInputN | <name> |

    And Click on the element in the dialog content
      | saveButton |

    Then Already exist message should be displayed

    Examples:
      | name    |
      | Group3! |

  @Regression
  Scenario Outline:User should be able to Edit Position Categories
    And User sending the keys in Dialog content
      | searchNameInputN | <name> |

    And Click on the element in the dialog content
      | searchButton |

    And User edit item in the Dialog
      | <name1> |

    Then Success Message should be displayed

    Examples:
      | name    | name1       |
      | Group3! | Group-3 New |

  @Regression
  Scenario Outline:User should be able to Delete Position Categories
    And User sending the keys in Dialog content
      | searchNameInputN | <name> |

    And Click on the element in the dialog content
      | searchButton |

    And User delete item from Dialog
      | <name> |

    Then Success Message should be displayed

    Examples:
      | name        |
      | Group-3 New |

