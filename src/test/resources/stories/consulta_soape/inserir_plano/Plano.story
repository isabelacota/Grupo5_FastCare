Scenario: User inserts patient plan
Given the user is on visit page
When the user clicks on 'Inserir plano do paciente'
When the user insert the behavior 'none'
When the user insert the comments 'none'
When the user confirm the submission
Then a message 'Plano inserido com sucesso' should be sent to the user on visit page