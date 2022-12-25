Feature: Bank Account Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully
    And Click on the element in left nav
      | setUpOne       |
      | parameters     |
      | bankAccountsEs |

  Scenario: Create Bank Account
    And Click on the element in the Dialog
      | addButton |

    And User sends the keys in Bank Accounts
      | nameEs            | sam                         |
      | ibanEs            | TR12 1234 5555 6666 7777 89 |
      | integrationCodeEs | xywz                        |

    And Click on the element in the Dialog
      | currencyEs    |
      | currencyTRYEs |
      | saveButton    |

    Then Success message should be displayed

  Scenario: Edit Bank Account
    And User search item from Dialog
      | searchNameHB | sam |

    And Click on the element in the Dialog
      | searchButton |

    And Click on the element in the Dialog
      | editButton |

    And User sends the keys in Bank Accounts
      | nameEs | sam edit |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete Bank Account
    And User search item from Dialog
      | searchNameHB | sam edit|

    And Click on the element in the Dialog
      | searchButton |

    And Click on the element in the Dialog
      | deleteButton |

    And Click on the element in the Dialog
      | deleteDialogBtn |

    Then Success message should be displayed



