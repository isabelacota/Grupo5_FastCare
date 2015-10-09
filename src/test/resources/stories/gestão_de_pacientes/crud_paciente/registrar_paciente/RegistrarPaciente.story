Scenario: User inserts a patient in the database
Given the user is on the initial page
When the user click on "Register a patient"
Given the user is on the registration page
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
Then an event must be inserted into audit log
Then a message "patient inserted" should be sent to the user


Scenario: User tries to insert a patient that already exists in the database
Given the user is on the initial page
When the user click on "Register a patient"
Given the user is on the registration page
Given the user is a receptionist or doctor
Then the user should see a field to insert the patient's full name
When the user insert the patient's name
Then the user should see a field to insert the patient's gender
When the user insert the patient's gender
Then the user should see a field to insert the patient's cpf
When the user insert the patient's cpf
Then the user sees a message saying that a patient with the same cpf already exists
When the user confirms that he wants to register the patient anyways
Then the user should see a field to insert the patient's birth time and date
When the user insert the patient's birth time and date
Then the user should see a field to insert the patient's phone
When the user insert the patient's phone
Then the user should see a field to insert the patient's address
When the user insert the patient's address
Then the user should see a page asking for confirmation to submit
When the user confirm the submission
Then the patient is added to the database
Then an event must be inserted into audit log
Then a message "patient inserted" should be sent to the user