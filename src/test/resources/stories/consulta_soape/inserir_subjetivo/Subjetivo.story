Scenario: User inserts subjective data to patient
Given the user is on the visit page
When the user clicks on 'Inserir dados subjetivos'
When the user insert the main complaint 'dor de cabeca'
When the user insert the history of present illness 'none'
When the user insert the symptomatic interrogation 'none'
When the user insert the personal and family history 'none'
When the user insert the lifestyle and socioeconomic and cultural conditions 'sedentario'
When the user insert the orthotics and prosthetics 'none'
When the user insert the comments 'none'
When the user confirm the subjetivo submission
Then a message 'Dados inseridos com sucesso!' should be sent to the user on visit page