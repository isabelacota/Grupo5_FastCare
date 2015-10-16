Scenario: User inserts a valid patient in the database
Given the user is on the insertion page
When the user insert the patient's name 'Jorge'
When the user insert the patient's cpf '65006961317'
When the user insert the patient's gender 'M'
When the user insert the patient's phone '98887666'
When the user insert the patient's health insurance plan 'Unimed'
When the user confirm the submission
Then the patient is added to the database
Then an event is added to the audit log
Then a message "patient inserted" should be sent to the user

Scenario: User inserts a patient with invalid cpf in the database
Given the user is on the insertion page
When the user insert the patient's name 'Jorge'
When the user insert the patient's cpf '1234567890'
When the user insert the patient's gender 'M'
When the user insert the patient's phone '98887666'
When the user insert the patient's health insurance plan 'Unimed'
When the user confirm the submission
Then the patient is added to the database
Then an event is added to the audit log
Then a message "invalid cpf" should be sent to the user

Scenario: User inserts a patient that already exists in the database
Given the user is on the insertion page
When the user insert the patient's name 'Jorge'
When the user insert the patient's cpf '123.456.789-0'
When the user insert the patient's gender 'M'
When the user insert the patient's phone '98887666'
When the user insert the patient's health insurance plan 'Unimed'
When the user confirm the submission
Then the patient is added to the database
Then an event is added to the audit log
Then a message "patient already exists" should be sent to the user
