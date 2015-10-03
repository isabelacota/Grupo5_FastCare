Scenario: User inserts a patient in the database
Given the user is on the initial page
When the user click on "Register a patient"
Given the user is a receptionist or doctor
Then the user should see a field to insert the patient's full name
When the user insert the patient's name
Then the user should see a field to insert the patient's gender
When the user insert the patient's gender
Then the user should see a field to insert the patient's cpf
When the user insert the patient's cpf
Then the user should see a field to insert the patient's birth time and date
When the user insert the patient's birth time and date
Then the user should see a field to insert the patient's phone
When the user insert the patient's phone
Then the user should see a page asking for confirmation to submit
When the user confirm the submission
Then the patient is added to the database
Then an event is added to the trilha de auditoria
Then a message "patient inserted" should be sent to the user
