## XamproAutomationUsingSeleniumJava

### Project Overview
This repository contains automated test cases for verifying **account registration, login, and profile update functionalities** on the XamPro application. The tests are built using **Selenium WebDriver with Java**. The target application can be accessed here:  
🔗 [XamPro](https://www.xampro.org/)

## 🧪 Test Cases Included

| **Test Case ID** | **Test Case Name**            | **Description**                                                            |
|------------------|--------------------------------|----------------------------------------------------------------------------|
| TC001            | VerifyRegistration             | Verifies the registration process using data from a JSON file.             |
| TC002            | VerifyLogin                    | Checks the login functionality using registered user credentials.          |
| TC003            | VerifyUpdateProfile            | Validates the profile update functionality for a logged-in user.           |


## 🛠️ Framework Features

| **Component**       | **Description**                                                          |
|---------------------|--------------------------------------------------------------------------|
| Selenium WebDriver  | Automates browser interactions for end-to-end testing.                   |
| TestNG              | Manages, groups, and executes test cases with detailed logs.             |
| Maven               | Handles dependencies and builds the project seamlessly.                 |
| Extent Reports      | Generates rich HTML reports with screenshots for failed tests.           |
| Page Object Model   | Separates test logic from UI elements to improve code maintainability.   |

## ⚙️ Prerequisites

| **Software**            | **Version** or **Description**                                  |
|-------------------------|------------------------------------------------------------------|
| Java Development Kit    | JDK 8 or higher                                                  |
| Maven                   | Dependency management tool                                      |
| Selenium WebDriver      | Compatible with Chrome, Firefox, etc.                            |
| Browser                 | Latest version of Chrome, Firefox, or Safari                     |
| TestNG                  | Test framework for organizing and executing tests                |
| Jenkins (Optional)      | For CI/CD pipeline automation                                    |

## 🔄 How to Run the Tests  

### Running Tests via TestNG XML  

| **Test Suite**   | **Description**                                                       | **Command to Run**                          |
|------------------|-----------------------------------------------------------------------|--------------------------------------------|
| master.xml       | Executes the entire test suite, covering all scenarios.               | `mvn test -DsuiteXmlFile=master.xml`       |
| grouping.xml     | Runs specific groups of tests (e.g., Sanity, Regression, Functional).| `mvn test -DsuiteXmlFile=grouping.xml`    |

### 🔄 Running Commands in cmd or Git Bash   

You can run these commands in **Command Prompt (cmd)** or **Git Bash**, as shown below:

#### 1️⃣ **Using Command Prompt (Windows):**  
1. Open **Command Prompt**.
2. Navigate to your project directory:
   
   ```bash
   cd path\to\your\project
   ```
3. Run the command to execute the full test suite:
   
   ```bash
   mvn test -DsuiteXmlFile=master.xml
   ```
4. Or run specific test groups:
   
   ```bash
   mvn test -DsuiteXmlFile=grouping.xml
   ```


   
#### 2️⃣ **Using Git Bash:**
1. Open **Git Bash**.
2. Navigate to your project directory:
   
   ```bash
   cd /c/path/to/your/project
   ```
3. Run the same command to execute the full test suite:
   
   ```bash
   mvn test -DsuiteXmlFile=master.xml
   ```
4. Or run specific test groups:
   
   ```bash
   mvn test -DsuiteXmlFile=grouping.xml
   ```

### 3️⃣ Running Tests Using `run.bat` (Windows Users)  

For convenience, use the provided **`run.bat`** script to run tests:  

1. **Double-click** the `run.bat` file in your project root directory to execute it.
   
   **OR**

2. Open **Command Prompt** or **Git Bash**.

   1. Navigate to your project root directory:
      ```bash
      cd path\to\your\project
      ```
      (In Git Bash, use `cd /c/path/to/your/project`.)

   2. Run the script by typing:
      ```bash
      run.bat
      ```
   
This script automates the Maven test execution. Ensure:
1. **Maven** and **Java** are installed and available in your system’s **PATH**.
2. You run the script from the **project root directory**.

### 4️⃣ Running Tests from an IDE (e.g., Eclipse or IntelliJ IDEA)  

1. **Open your project in your preferred IDE** (Eclipse, IntelliJ IDEA, etc.).
2. Navigate to the `master.xml` or `grouping.xml` file in your project explorer.
3. Right-click on the XML file and select **Run As** -> **TestNG Suite**.
4. The IDE will execute the tests defined in the selected XML file.

## 🛠️ Jenkins Integration
This project supports Jenkins for Continuous Integration and Continuous Delivery (CI/CD). By configuring Jenkins, you can automate the triggering of test executions every time changes are pushed to the repository. This helps ensure that all tests are run consistently, maintaining code quality and stability throughout the development lifecycle.
