Scenario: User inserts evaluation data to patient
Given the user is on visit page
When the user clicks on 'Inserir dados da avaliacao'
When the user insert the diagnosis 'febre'
When the user insert the presumed diagnosis 'none'
When the user insert the comments 'none'
When the user confirm the submission
Then a message 'Dados inseridos com sucesso!' should be sent to the user on visit page