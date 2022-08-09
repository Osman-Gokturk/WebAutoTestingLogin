# WebAutoTestingLogin

This shows an  web autmation made with the help of Selenium,TestNG libraries of java for the web site ("https:www.bluerentalcars.com/").  It will open the web site, click for login page, send the relevant credentials for the login and verify if it is logged in(success) or not. 

As it is a POM model, for code readibility and reusability it is created with an architecture in 3 folders. Pages folder to provide views. utilities folder to provide useful methods, and a test folder to provide running methods or tests.   
. 

* the pages folder contains:
  * 1-HomePage class to contain a constructor wich refer to the PageFactory.  This page contains web element "loginButton" to go to the login page
  * 2-LoginPage, which comes after. This page contains a Constructor refering to PageFactory as usual, and username, password and submit WebElements. Also, in the case of failed login, the pop-up page appear for a short time on the Login Page. Thus, an invalid credentials message element .
  * 3-DefaulPage or SuccessLoginPage. a userIDLoged webElement can be used to assert the test. 

* Utilities Folder:
  * Driver Class to prepare and use drivers. 
  * Configuration Reader class to get data from configuration file.
  * Usefull methods classs. 


* Tests Folder. 
  * one or more  test classes to run. One can write tests in the same class as well. 
