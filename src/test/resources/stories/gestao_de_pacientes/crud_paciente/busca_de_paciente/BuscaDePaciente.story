Scenario: Looking up a patient in database by name
Given the user is on the search page
Given the user is doctor
When the doctor looks up field 'Jorge'
Then they should see a list of patients that met that criteria


Scenario: Looking up a patient in database by cpf
Given the user is on the search page
Given the user is doctor
When the doctor looks up field '65006961317'
Then they should see a list of patients that met that criteria


Scenario: Looking up a nonexistent patient in database 
Given the user is on the search page
Given the user is doctor
When the doctor looks up field 'Caique'
Then they should see a list of patients that met that criteria

