Scenario: User inserts a valid patient in the database
Given the user is on the insertion page
When the user insert the patient's name 'Jorge'
When the user insert the patient's cpf '65006961317'
When the user insert the patient's gender 'M'
When the user insert the patient's health insurance plan 'Unimed'
When the user insert the patient's phone '98887666'
When the user confirm the submission
Then a success message 'Paciente inserido com sucesso' should be sent to the user on registration page

Scenario: User inserts a patient with invalid cpf in the database
Given the user is on the insertion page
When the user insert the patient's name 'Jorge'
When the user insert the patient's cpf '1234567890'
When the user insert the patient's gender 'M'
When the user insert the patient's health insurance plan 'Unimed'
When the user insert the patient's phone '98887666'
When the user confirm the submission
Then a error message 'CPF com formato inválido' should be sent to the user on registration page

Scenario: User inserts a patient that already exists in the database
Given the user is on the insertion page
When the user insert the patient's name 'Jorge' 
When the user insert the patient's cpf '65006961317'
When the user insert the patient's gender 'M'
When the user insert the patient's health insurance plan 'Unimed'
When the user insert the patient's phone '98887666'
When the user confirm the submission
Then a error message 'CPF já existente!' should be sent to the user on registration page
