Feature: Add-Edit-Delete Discounts

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully
    And Click on the element in the left nav
      | setUpOne   |
      | parameters |
      | discountsN |
  @Regression
  Scenario Outline:User should be able to Add Discounts
    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | descriptionInputN     | <description> |
      | integrationCodeInputN | <code>        |
      | priorityCodeN         | <priority>    |

    And Click on the element in the dialog content
      | toggleBarN |
      | saveButton |

    Then Success Message should be displayed

    And Click on the element in the dialog content
      | addButton |

    And User sending the keys in Dialog content
      | descriptionInputN     | <description> |
      | integrationCodeInputN | <code>        |
      | priorityCodeN         | <priority>    |

    And Click on the element in the dialog content
      | toggleBarN |
      | saveButton |

    Then Already exist message should be displayed

    Examples:
      | description     | code  | priority |
      | Group_3 Project | 98756 | 14789    |

  @Regression
  Scenario Outline:User should be able to Edit Discounts
    And User sending the keys in Dialog content
      | searchDescriptionInputN | <description> |

    And Click on the element in the dialog content
      | searchButton |

    And User edit item in the Dialog
      | <description1> |

    Then Success Message should be displayed

    Examples:
      | description     | description1        |
      | Group_3 Project | Group_3 Project New |

  @Regression
  Scenario Outline:User should be able to Delete Discounts
    And User sending the keys in Dialog content
      | searchDescriptionInputN | <description> |

    And Click on the element in the dialog content
      | searchButton |

    And User delete item from Dialog
      | <description> |

    Then Success Message should be displayed

    Examples:
      | description         |
      | Group_3 Project New |

