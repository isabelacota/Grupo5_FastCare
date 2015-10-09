Scenario: Looking up a patient in database
Given the user is on the initial page
Given the user is doctor
When the user clicks on search patient button
Then the user should be on search patient page
When the doctor looks up a patient name '$name' or cpf '$cpf' or phone '$phone' or gender '$gender' or birth '$birth' or diagnosis '$diagnosis'
Then they should see a list of patients that met that criteria
Then an event must be inserted into audit log


Scenario: Looking up a patient in database
Given the user is on the initial page
Given the user is receptionist
When the user clicks on search patient button
Then the user should be on search patient page
When the receptionist looks up a patient name '$name' or cpf '$cpf' or phone '$phone' or gender '$gender' or birth '$birth'
Then they should see a list of patients that met that criteria
Then an event must be inserted into audit log