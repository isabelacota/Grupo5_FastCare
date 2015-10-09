Scenario: update an existing patient fields
Given the user is on the patient page
Given the user is a doctor
When the user clicks to update the patient data
Then the patient data is updated on the database