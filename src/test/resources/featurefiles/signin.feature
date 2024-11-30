Feature: usersignIn

  Scenario: verify can't login is visible
    Given navigates to jira
    When i click on sign in
    Then verify can't login 
    
