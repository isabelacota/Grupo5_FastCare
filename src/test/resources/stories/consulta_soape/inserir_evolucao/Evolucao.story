Scenario: User inserts patient evolution
Given the user is on visit page
When the user clicks on 'Inserir evolucao do paciente'
When the user insert the comments 'Joao esta melhor'
When the user confirm the submission
Then a message 'Comentarios inseridos com sucesso' should be sent to the user on plan data page