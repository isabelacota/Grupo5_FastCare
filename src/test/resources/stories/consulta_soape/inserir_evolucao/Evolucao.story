Scenario: User inserts patient evolution
Given the user is on the evolution data page
When the user insert the evolution comments 'Joao esta melhor'
When the user confirm the submission
Then a success message 'Dados inseridos com sucesso' should be sent to the user on evolution data page