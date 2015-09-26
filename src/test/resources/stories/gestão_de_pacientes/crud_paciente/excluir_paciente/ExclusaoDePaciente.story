Scenario: Exluding pacients so they can`t be found by search
Given the user is in the patient details page
Given the user is receptionist or doctor
When the user selects to exclude the patient with the cpf: '$cpf'
Then patient with the cpf '$cpf' doesn't shows up in future searches and the action is registered in the audit trail
Then an event must be inserted into audit log