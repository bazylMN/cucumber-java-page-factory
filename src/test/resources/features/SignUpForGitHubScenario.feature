Feature: As a user i want to visit cucumber pages

  Scenario: Try to sign up for GitHub
    Given I go to https://github.com/ page
    When I fill form fields with data
    |login    |loginfirst     |
    |email    |email@first.pl |
    |password |first123       |
    Then I should see form with filled fields
