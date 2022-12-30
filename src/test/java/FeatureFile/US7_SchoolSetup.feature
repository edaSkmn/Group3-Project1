Feature: Locations Add,Edit,Delete

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully
    And Click  on the element in LeftNav
      | setUpOne      |
      | SchoolSetupAT |
      | LocationsAT   |

  @Regression
  Scenario Outline:  User should be able to Add Locations
    And Click on the element in the Dialog
      | addButton |

    When :User Locations  name as "<Name>" short name as "<ShortName>" capasity as "<capasity>"

    And Click on the element in the Dialog
      | lacotiontypeAT1 |
      | lacotiontypeAT2 |
      | saveButton |

    Then Success Message should be displayed

    Examples:
      | Name  | ShortName  |   capasity    |
      | M.Ali |  G.O.A.T   |      96       |

  @Regression
  Scenario Outline:  User should be able to Add Locations
    And Click on the element in the Dialog
      | editButton |

    When :User Locations  name as "<Name>" short name as "<ShortName>" capasity as "<capasity>"

    And Click on the element in the Dialog
      | lacotiontypeAT1 |
      | lacotiontypeAT2 |
      | saveButton |

    Then Success Message should be displayed

    Examples:
      | Name  | ShortName  |   capasity    |
      | M.Ali |  G.O.A.T   |      100      |

  @Regression
  Scenario:  User should be able to delete
    And Click on the element in the Dialog
      | deleteButton    |

    And Click on the element in the Dialog
      | deleteDialogBtn |

    Then Success Message should be displayed

