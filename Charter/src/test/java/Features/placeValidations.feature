Feature: Provide

  @AddPlace
  Scenario: Create a provide line
    Given CustomerId
    When Create Order is run
    Then Order is Completed
