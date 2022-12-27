Feature: Grade Levels Add,Edit,Delete

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully
    And Click  on the element in LeftNav
      | setUpOne        |
      | parameters      |
      | GradeLevelsAT   |


  Scenario Outline:  User should be able to Add Locations


    And Click on the element in the Dialog
      | addButton |

    When :User Locations  name as "<Name>" short name as "<ShortName>" order as "<order>"

    And Click on the element in the Dialog
      | saveButton |

    Then Success Message should be displayed

    Examples:
      | Name    | ShortName   |      order     |
      | ahmet   |  Iron Mike  |      240       |

  Scenario Outline:  User should be able to edit


    And Click on the element in the Dialog
      | editButton |

    When :User Locations  name as "<Name>" short name as "<ShortName>" order as "<order>"

    And Click on the element in the Dialog
      | saveButton |

    Then Success Message should be displayed

    Examples:
      | Name       | ShortName    |    order    |
      | ABCCDEF    |   dysvgbn   |     160       |

  Scenario:  User should be able to Add Locations


    And Click on the element in the Dialog
      | deleteButtonAT    |
      | deleteDialogBtn |

    Then Success Message should be displayed