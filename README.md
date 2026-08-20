# DemoWebShop Selenium TestNG Automation

## Project Overview

This project is a Selenium WebDriver automation framework built using Java, TestNG, Maven, and the Page Object Model (POM).

The project automates the main shopping flow of the Demo Web Shop application, including user registration, login, product search, dynamic lowest-price selection, shopping cart, checkout, and order confirmation.

## Application Under Test

Demo Web Shop

https://demowebshop.tricentis.com/

## Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- Log4j2
- TestNG Listeners
- Extent Reports
- Eclipse IDE

## Project Structure

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
│       │   │   ├── TC001_Registration.java
│       │   │   ├── TC002_Login.java
│       │   │   └── TC003_Product.java
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
Open Demo Web Shop
Navigate to Registration
Select gender
Enter randomly generated first name and last name
Enter randomly generated email
Enter password and confirm password
Register the user
Verify successful registration


TC002 - Login
Register a new user
Logout from the application
Navigate to Login
Login using the registered credentials
Verify successful login


TC003 - Product Search and Checkout
Login to the application
Search for "Gift Card"
Retrieve all available product prices
Identify the lowest-priced product dynamically
Open the lowest-priced product
Enter recipient details
Add the product to the shopping cart
Navigate to the shopping cart
Proceed to checkout
Enter billing information
Select Cash on Delivery
Review the order
Confirm the order
Verify successful order processing
Capture the order number
Key Automation Features
Page Object Model

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
   ↓
Jenkins
   ↓
Maven
   ↓
TestNG
   ↓
Selenium Tests
   ↓
Logs and Reports


GitHub Repository

The source code is maintained in GitHub:

https://github.com/qa-with-piyush/DemoWebShop-Selenium-TestNG-Automation

Author

Piyush Bhagchandani
