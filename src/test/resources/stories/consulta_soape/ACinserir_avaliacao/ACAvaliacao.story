Scenario: User inserts evaluation data to patient
Given the user is on avaliacao page
When the user insert the diagnosis 'J12 - Pneumonia viral não classificada em outra parte'
When the user insert the diagnosis 'J129 - Pneumonia viral não especificada'
When the user insert the avaliation comments 'É possível que ele precise viajar para a fazenda do tio Bob, que nem seu cachorrinho Rex'
When the user insert the definitive diagnosis flag 'S'
When the user confirm the submission
Then a success message 'Dados inseridos com sucesso!' should be sent to the user on avaliacao page
