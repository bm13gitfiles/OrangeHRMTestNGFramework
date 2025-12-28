# OrangeHRM TestNG Automation Framework

A robust automation framework built for **OrangeHRM** using **Java, Selenium WebDriver, TestNG, and Maven**.  
This project demonstrates end-to-end testing of OrangeHRM modules with reusable utilities, reporting, and data-driven capabilities.

---

## 🚀 Features
- **Page Object Model (POM)** for maintainability
- **TestNG integration**: parallel execution, grouping, and reporting
- **Data-driven testing**: Excel utilities for test data management
- **Custom reports**: ExtentReports integration for rich HTML reports
- **Reusable utilities**: property file handling, WebDriver commons, listeners
- **Screenshots**: captured on failure and for validation steps

---

## 🛠️ Tech Stack
- **Language**: Java 17+
- **Build Tool**: Maven
- **Testing Framework**: TestNG
- **Automation Tool**: Selenium WebDriver
- **Reporting**: ExtentReports
- **Design Pattern**: Page Object Model (POM)

---


## 📂 Project Structure


OrangeHRMTestNGFramework/
├── src/main/java/demo/orangehrm/framework/   # Core framework classes
├── src/test/java/demo/orangehrm/framework/   # Test cases & step definitions
├── Config/                                   # Config.properties
├── TestData/                                 # Excel test data
├── Reports/                                  # ExtentReports output
├── Screenshots/                              # Captured screenshots
├── test-output/                              # TestNG default reports
├── pom.xml                                    # Maven dependencies
└── testng.xml                                 # TestNG suite configuration





## ⚙️ Setup & Execution

### Prerequisites
- Install **Java 17+**
- Install **Maven 3.8+**
- Install a browser driver (e.g., ChromeDriver) and ensure it’s on your PATH

### Clone the repository
```bash
git clone https://github.com/bm13gitfiles/OrangeHRMTestNGFramework.git
cd OrangeHRMTestNGFramework



##Generate reports
After execution, view reports in - Reports/ExtentReport.html

##Sample Screenshots
Screenshots are automatically captured during test execution and stored in the Screenshots/ folder.


Author
Balu  
ISTQB-certified Senior QA Analyst | 9+ years in Life Sciences & eCommerce QA
Specialist in AEM, Agile QA, Automation, Accessibility, and AI-driven scenario generation



## 📂 Project Structure
