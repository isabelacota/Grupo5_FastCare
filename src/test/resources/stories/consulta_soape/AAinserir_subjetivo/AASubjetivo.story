Scenario: User inserts subjective data to patient
Given the user is on the subjective data page
When the user insert the main complaint 'Dor de cabeça'
When the user insert the history of present illness 'Era uma vez joâo. João estava triste. João bateu a cabeça na parede'
When the user insert the symptomatic interrogation 'Coração partido, gravidez, alérgico a água, problemas para cicatrizar sua perna que foi amputada'
When the user insert the personal and family history 'pai alcóolatra, batia a cabeça na parede também'
When the user insert the lifestyle and socioeconomic and cultural conditions 'Costuma sair com os amigos imaginários para dar um rolê'
When the user insert the orthotics and prosthetics 'Possui uma perna de pau e um olho de vidro'
When the user insert the subjective comments 'Nada a declarar. Tudo que eu comentar pode e será usado contra mim'
When the user confirm the subjetivo submission
Then a success message 'Dados inseridos com sucesso!' should be sent to the user on subjective data page