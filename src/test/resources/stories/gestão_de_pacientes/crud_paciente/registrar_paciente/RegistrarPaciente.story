Scenario: User inserts a patient in the database
Given the user is on the insertion page
When the user insert the patient's name 'Jorge'
When the user insert the patient's cpf '123.456.789-0'
When the user insert the patient's birth date '04/12/91'
When the user insert the patient's gender 'M'
When the user insert the patient's phone '98887666'
When the user insert the patient's health insurance plan 'Unimed'
When the user confirm the submission
Then the patient is added to the database
Then an event is added to the audit log
Then a message "patient inserted" should be sent to the user

