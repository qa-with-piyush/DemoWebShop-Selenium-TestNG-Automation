\# DemoWebShop Selenium TestNG Automation



\## Project Overview



This project is a Selenium WebDriver automation framework built using Java, TestNG, Maven, and the Page Object Model (POM).



The project automates the main shopping flow of the Demo Web Shop application, including user registration, login, product search, dynamic lowest-price selection, shopping cart, checkout, and order confirmation.



\## Application Under Test



Demo Web Shop



https://demowebshop.tricentis.com/



\## Tech Stack



\- Java

\- Selenium WebDriver

\- TestNG

\- Maven

\- Page Object Model (POM)

\- Log4j2

\- TestNG Listeners

\- Extent Reports

\- Eclipse IDE



\## Project Structure



```text

DemoWebShop-Selenium-TestNG-Automation

│

├── src

│   └── test

│       ├── java

│       │   ├── base

│       │   │   ├── EcommerceBase.java

│       │   │   └── LoginBaseSetup.java

│       │   │

│       │   ├── pageObjects

│       │   │   ├── CheckoutPage.java

│       │   │   ├── HomePage.java

│       │   │   ├── LoginPage.java

│       │   │   ├── ProductPage.java

│       │   │   └── RegistrationPage.java

│       │   │

│       │   ├── testCases

│       │   │   ├── TC001\_Registration.java

│       │   │   ├── TC002\_Login.java

│       │   │   └── TC003\_Product.java

│       │   │

│       │   └── utilities

│       │       ├── Listeners.java

│       │       └── RandomDataUtils.java

│       │

│       └── resources

│           └── log4j2.properties

│

├── .mvn

├── pom.xml

├── testng.xml

├── .gitignore

└── Structure



Test Scenarios



TC001 - Registration

&#x20;Open Demo Web Shop

&#x20;Navigate to Registration

&#x20;Select gender

&#x20;Enter randomly generated first name and last name

&#x20;Enter randomly generated email

&#x20;Enter password and confirm password

&#x20;Register the user

&#x20;Verify successful registration





TC002 - Login

&#x20;Register a new user

&#x20;Logout from the application

&#x20;Navigate to Login

&#x20;Login using the registered credentials

&#x20;Verify successful login





TC003 - Product Search and Checkout

&#x20;Login to the application

&#x20;Search for "Gift Card"

&#x20;Retrieve all available product prices

&#x20;Identify the lowest-priced product dynamically

&#x20;Open the lowest-priced product

&#x20;Enter recipient details

&#x20;Add the product to the shopping cart

&#x20;Navigate to the shopping cart

&#x20;Proceed to checkout

&#x20;Enter billing information

&#x20;Select Cash on Delivery

&#x20;Review the order

&#x20;Confirm the order

&#x20;Verify successful order processing

&#x20;Capture the order number

&#x20;Key Automation Features

&#x20;Page Object Model



The framework separates page locators and page actions from test cases using the Page Object Model.



Dynamic Lowest Price Selection



The framework retrieves the prices of all matching products and determines the lowest price dynamically instead of using a hardcoded product.



Random Test Data



Random user information such as names, email addresses, ZIP codes, and phone numbers is generated during test execution.



Explicit Waits



Explicit waits are used for elements that require synchronization during checkout and order confirmation.



Logging



Log4j2 is used to generate execution logs for important test steps.



TestNG Listener



A custom TestNG listener is included for test execution and reporting activities.



Reporting



Extent Reports are integrated into the project for test execution reporting.



Test Execution

Using Maven



Open a terminal in the project directory and run:



mvn clean test

Using TestNG



The test suite can also be executed using:



testng.xml

CI Integration



The project is configured for Jenkins Continuous Integration.



The CI execution flow is:



GitHub

&#x20;  ↓

Jenkins

&#x20;  ↓

Maven

&#x20;  ↓

TestNG

&#x20;  ↓

Selenium Tests

&#x20;  ↓

Logs and Reports

GitHub Repository



The source code is maintained in GitHub:



https://github.com/qa-with-piyush/DemoWebShop-Selenium-TestNG-Automation



Author



Piyush Bhagchandani

