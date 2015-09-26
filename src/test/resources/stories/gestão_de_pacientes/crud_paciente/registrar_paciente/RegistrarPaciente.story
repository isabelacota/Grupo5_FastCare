Scenario: User inserts a patient in the database
Given the user is on the initial page
Then the user should click on "Register a patient"
Given the user is a receptionist or doctor
Then the user should see a field to insert the patient's full name
When the user insert the patient's name
Then the user should see a field to insert the patient's gender
When the user insert the patient's gender
Then the user should see a field to insert the patient's cpf
When the user insert the patient's cpf
Then the user should see a field to insert the patient's birth time and date
When the user insert the patient's birth time and date
Then the user should see a field to insert the patient's contact number
When the user insert the patient's contact number
Then the user should see a field to insert the patient's address
When the user insert the patient's address
Then the user should see a page asking for confirmation to submit
When the user confirm the submission
Then the patient is added to the database
Then a message "patient inserted" should be sent to the user
