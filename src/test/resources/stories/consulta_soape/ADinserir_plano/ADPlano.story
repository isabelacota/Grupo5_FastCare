Scenario: User inserts patient plan
Given the user is on the plan data page
When the user insert the behavior 'Tomar gardenal 7x ao dia'
When the user insert the plan comments 'Nao esquecer de tomar água, tomar banho e escovar os dentes antes de dormir'
When the user confirm the submission
Then a success message 'Dados inseridos com sucesso!' should be sent to the user on plan data page