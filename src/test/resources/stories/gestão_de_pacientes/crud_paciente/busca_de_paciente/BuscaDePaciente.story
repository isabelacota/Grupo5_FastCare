Scenario: Looking up a pacient in database
Given the user is on the initial page
Given the user is receptionist or doctor
When the user looks up a pacient name '$name'
Then they should see the pacient data