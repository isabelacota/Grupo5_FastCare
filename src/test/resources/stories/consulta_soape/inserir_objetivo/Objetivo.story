Scenario: User inserts objective data to patient
Given the user is on the objective data page
When the user insert the height '1.60'
When the user insert the weight '48'
When the user insert the temperature '36.5'
When the user insert the heart rate '80'
When the user insert the systolic pressure '8'
When the user insert the diastolic pressure '6'
When the user insert the respiratory rate '1'
When the user insert the oxygen saturation '1'
When the user insert the gas carbon saturation '1'
When the user insert the capillary blood glucose '1'
When the user insert the objective comments 'lala'
When the user confirm the objective submission
Then a success message 'Dados inseridos com sucesso!' should be sent to the user on objective data page