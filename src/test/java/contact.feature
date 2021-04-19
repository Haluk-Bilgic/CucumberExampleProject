Feature: Contact Us Test

  Scenario: Go to Website

    Given Navigate to Website
    And Click on contact us button
    And Select subject Heading
    And Type email
    And Type order reference
    And Type a message
    When Click on submit button
    Then Verify success message