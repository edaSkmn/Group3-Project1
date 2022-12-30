Feature: Attestation Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully
    And Click on the element in left nav
      | humanResources |
      | setUpThreeEs   |
      | attestationsEs |

  @Regression
  Scenario: Create Attestation
    And Click on the element in the Dialog
      | addButton |

    And User sends the keys in Bank Accounts
      | nameEs | john |

    And Click on the element in the Dialog
      | saveButton |

    Then Success Message should be displayed

  @Regression
  Scenario: Edit Attestation
    And User search item from Dialog
      | searchNameHB | john |

    And Click on the element in the Dialog
      | searchButton |

    And Click on the element in the Dialog
      | editButton |

    And User sends the keys in Bank Accounts
      | nameEs | john edit |

    And Click on the element in the Dialog
      | saveButton |

    Then Success Message should be displayed

  @Regression
  Scenario: Delete Attestation
    And User search item from Dialog
      | searchNameHB | john edit |

    And Click on the element in the Dialog
      | searchButton |

    And Click on the element in the Dialog
      | deleteButton |

    And Click on the element in the Dialog
      | deleteDialogBtn |

    Then Success Message should be displayed
