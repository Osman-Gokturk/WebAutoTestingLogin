# WebAutoTestingLogin

This shows a PAgeObjectModel framework of Selenium for a web site ("https:www.bluerentalcars.com/") for the 3 pages:the Home page, the Login Form, and the Default Page(SuccessLoginPage).

Three folders are created to contain pages, tests, and utilities. 
the pages folders contains:
* 1-HomePage class to contain a constructor wich refer to the PageFactory.  This page contains web element "loginButton" to go to the login page
* 2-LoginPage, which comes after. This page contains a Constructor refering to PageFactory as usual, and username, password and submit WebElements. Also, in the case of failed login, the pop-up page appear for a short time on the Login Page. Thus, an invalid credentials message element .
* 3-DefaulPage or SuccessLoginPage. a userIDLoged can be used to assert the test. 

* Utilities Folder:
* Driver Class to prepare and use drivers. 
* Configuration Reader class to get data from configuration file.
* Usefull methods classs. 


* Tests Folder. 
* one or more  test class to run. One can write tests in the same class as well. 
