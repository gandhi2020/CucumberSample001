@test01
  Feature: Login to Orange HRM website

    Scenario Outline: Login to orangehrm
      Given user is on login page of website2
      When user entered "<username>" and "<password>" in website2
      And user clicked login button of website2
      Then user should logged successfully in website2

      Examples:
        | username  | password |
        | Admin     | admin123 |

