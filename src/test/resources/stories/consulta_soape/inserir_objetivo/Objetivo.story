Scenario: User inserts objective data to patient
Given the user is on objective data page
When the user insert the height '1m60'
When the user insert the weight '48kg'
When the user insert the temperature '36.5'
When the user insert the blood pressure '8 por 6'
When the user insert the heart rate '80'
When the user insert the respiratory rate 'none'
When the user insert the oxygen saturation 'none'
When the user insert the gas carbon saturation 'none'
When the user insert the capillary blood glucose 'none'
When the user insert the objective comments 'none'
When the user confirm the objective submission
Then a message 'Dados inseridos com sucesso!' should be sent to the user on visit page