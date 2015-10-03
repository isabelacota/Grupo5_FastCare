Scenario: Looking up a patient in database
Given the user is on the initial page
Given the user is doctor
When the user clicks on 'Buscar Paciente'
Then the user is on buscar paciente page
When the user looks up a pacient name '$name' or cpf '$cpf' or phone '$phone' or gender '$gender' or birth '$birth' or diagnosis '$diagnosis'
Then they should see a list of pacients that met that criteria
Then an event must be inserted into audit log


Scenario: Looking up a patient in database
Given the user is on the initial page
Given the user is receptionist
When the user clicks on 'Buscar Paciente'
Given the user is on buscar paciente page
When the user looks up a pacient name '$name' or cpf '$cpf' or phone '$phone' or gender '$gender' or birth '$birth'
Then they should see a list of pacients that met that criteria
Then an event must be inserted into audit log