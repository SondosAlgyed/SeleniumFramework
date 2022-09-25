Feature: User Registration
  i want to check that the user can register in our e_commerce website
 Scenario Outline:  User Registration
    Given the user in home page
    When I click on register link
    And I entered "<firstname>", "<lastname>","<Email>","<password>"
    Then the registration page displayed successfully
    Examples:
				| firstname | lastname | Email | password |
				| sondos | Ali | sondoots@gmail.com | 123456 |
				| dodos | algyed | tessttt@gmail.com | 12345675 |

   









