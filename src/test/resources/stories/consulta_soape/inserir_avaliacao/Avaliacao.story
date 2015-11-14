Scenario: User inserts evaluation data to patient
Given the user is on avaliacao page
When the user insert the diagnosis 'febre'
When the user insert the comments 'none'
When the user insert the definitive diagnosis flag 'S'
When the user confirm the submission
Then a success message 'Dados inseridos com sucesso!' should be sent to the user on avaliacao page
