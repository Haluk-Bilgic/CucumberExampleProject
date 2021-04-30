Feature: Register Test

  Scenario Outline: Create An Account

    Given Navigate to Websitee
    And click Sign in botton
    And type email"<Email>"
    And click on Create an Account button
    And choose title
    And type firstaname"<firstname>" and lastname"<lastname>"
    And type password"<password>"
    And type Company"<Company>"
    And type address"<address>"
    Examples:
      | Email | firstname | lastname | password | Company | address |

    |haluk@hotmail.com|haluk|bilgic| 1234|tecno city|yucetepe mah.|
      |ahmet@hotmail.com|ahmet|bilgic| 6745|teknokent|hedef mah.|
      |yucel@hotmail.com|mehmet|yucel| 2783|anit kent|sirintepe mah.|



