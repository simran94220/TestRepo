# TestRepo
Test Repo
# Answer
Answer of Selenium Test and API Test

Under folder Selenium, I have TravelAgency problem salved with selenium webdriver and test ng.
APITest folder has the collection file for GET method testing. 

in this website , found many 419 :page expired error hence ignore such condition. My code shall work while website is not throwing such error.

In automation I have automated important tests like: 
1. login with positive user, 
2. logout with positive user, 
3. register user
4. book flight ticket

more test cases can be bellow:
1. test case to validate email address ( wrong email address without @ should throw error) in popup on login page to include @
2. test case to validate empty password in login page
3. test case to validate wrong crdentials in login page. assert on message "These credentials do not match our records."
4. test case for forgot password
5. in reset password field enter wrong email and assert on message" We can't find a user with that e-mail address."
6. register user without filling name, company etc. Validate for each field popup error message
7. register for already used email address and assert for error message
8. book flight for positive case (source and destination exist in dropdown and filled in passanger details)
9. book flight for negative case ( either of source of destination is wrong)


In Get https://api.spacexdata.com/v4/launches/latest, I see bellow 
1.Response name not null,
2.Response flight_number not null,
3.Status code is 200

there can be below more tests for this GET api:

according to schem have assetion on all required fields:
1. date_utc
2. date_unix
3. date_local
4. date_precision
5. upcoming
6. auto_update
