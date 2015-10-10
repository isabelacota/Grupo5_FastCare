Scenario: Looking up a patient in database
Given the user is on the search page
Given the user is doctor
When the doctor looks up a patient name 'Robson' or cpf '' or phone '' or gender '' or birth ''
Then they should see a list of patients that met that criteria
Then an event must be inserted into audit log


hen they should see a list of patients that met that criteria
