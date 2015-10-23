Scenario: User inserts subjective data to patient
Given the user is on appointment page
When the user insert the patient's name 'Jorge'
When the user insert the patient's cpf '65006961317'
When the user insert the patient's gender 'M'
When the user insert the patient's health insurance plan 'Unimed'
When the user insert the patient's phone '98887666'
When the user confirm the submission
Then a message 'Paciente inserido com sucesso' should be sent to the user on registration page