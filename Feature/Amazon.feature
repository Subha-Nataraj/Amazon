Feature: Adactin Login Page Validation
Scenario Outline: Validate the Adactin page with the valid credentials
Given Launch the Web Applications.
When Enter the username "<UserName>" and password "<PassWord>"
And Click the login button
Then Get the next page title
Examples:
|UserName|PassWord|
|NatarajSubha|%nataraj%3|
Scenario: checking the room availability for the particular date
Given Launch second page Application.
When select the location hotel roomtype numberofrooms
When enter the checkindate "23/04/2021" and  checkoutdate "24/04/2021"
And selecting the numberofpersons
Then click the search button

Scenario: checking the price
Given Launch the web application
When click the select button
Then click the continue button

Scenario Outline: Making a Payment
Given Launch the payment page
When Enter the firstname as "<FirstName>" lastname as "<LastName>" address as "<Address>" creditcardno as "<CardNo>"
When Enter the credit card  type
And Enter the CVV number as "<CVV>"
Then click booknow button
Examples:
|FirstName|LastName|Address|CardNo|CVV|
|subha|nataraj|chennai|1234567891011123|809|