Scenario: User inserts patient plan
Given the user is on the plan data page
When the user insert the behavior 'none'
When the user insert the plan comments 'none'
When the user confirm the submission
Then a success message 'Dados inseridos com sucesso!' should be sent to the user on plan data page