Scenario: Inserting a pacient in database
Given the user is on the initial page
Given the user is receptionist or doctor
When the user click the insert pacient button
Then they should see a form to enter the pacient data

Scenario: Looking up a pacient in database
Given the user is on the initial page
Given the user is receptionist or doctor
When the user looks up a pacient name '$name'
Then they should see the pacient data