# Test Plan: Salesforce Login Module

**Test Plan ID:** TP-SF-LOGIN-001  
**Author:** Senior QA Lead  
**Created Date:** 2026-10-04  
**Target Application:** Salesforce CRM (`https://login.salesforce.com/?locale=in`)  
**Template Version:** RICE POT Generic QA Template (Profile B - Test Plan)  

---

## 1. Test Plan ID and Title
* **ID:** `TP-SF-LOGIN-001`
* **Title:** Functional & Automation Test Plan for Salesforce Login Module

---

## 2. Objective and References
### 2.1 Objective
The objective of this test plan is to define the testing strategy, scope, environment, coverage, and criteria for verifying the authentication functionality of the Salesforce Login portal (`https://login.salesforce.com/?locale=in`). This ensures that valid user credentials authenticate successfully, invalid attempts are properly rejected, and regression suite execution is stable across builds.

### 2.2 References
* **Application URL:** [Salesforce Login Portal](https://login.salesforce.com/?locale=in)
* **Master QA Template:** [04_RICE_POT_Generic_QA_Template.md](file:///d:/Playwright_Interview/LearnJSTSPlaywright/00_chapter_Prompt_Eng/04_RICE_POT_Generic_QA_Template.md)
* **Problem Statement:** [02_Problem_Statement.md](file:///d:/Playwright_Interview/LearnJSTSPlaywright/00_chapter_Prompt_Eng/02_Problem_Statement.md)

---

## 3. In Scope and Out of Scope

### 3.1 In Scope
* Functional verification of the Salesforce Login page controls (Username input, Password input, Login button).
* Verification of valid user authentication.
* Verification of invalid user authentication handling.
* Regression testing of login functionality using automated Selenium + Java + TestNG framework.
* Target Browser: Google Chrome.
* Target Environment: QA.

### 3.2 Out of Scope
* Multi-Factor Authentication (MFA) & Single Sign-On (SSO) integration testing.
* Forgot Password / Password Reset workflow.
* Performance, Load, and Stress testing.
* Security Vulnerability and Penetration testing.
* Cross-browser testing beyond Google Chrome.

---

## 4. Requirements and Planned Coverage

| Requirement ID | Requirement Description | Test Level / Type | Planned Test Cases | Coverage Status |
| :--- | :--- | :--- | :--- | :--- |
| **REQ-SF-LOG-01** | System shall allow users with valid credentials to log in successfully and redirect to home dashboard. | Functional / Positive | `TC-SF-LOGIN-001` | Covered |
| **REQ-SF-LOG-02** | System shall reject invalid credentials and display an appropriate error message without opening a session. | Functional / Negative | `TC-SF-LOGIN-002` | Covered |
| **REQ-SF-LOG-03** | System shall maintain authentication stability and regression integrity across builds. | Regression / Automation | `TC-SF-LOGIN-003` | Covered |

---

## 5. Test Approach, Levels, and Types

### 5.1 Test Approach
Testing will follow a structured automated and manual approach using the Page Object Model (POM) pattern in Selenium WebDriver with Java, TestNG, and Maven.

### 5.2 Test Levels
* **System Integration Testing (SIT):** UI-level end-to-end verification on the QA environment.
* **Regression Testing:** Automated suite execution to verify system stability.

### 5.3 Test Types
* **Functional Testing:** Verifying positive and negative authentication behavior.
* **Automated Regression Testing:** Execution via Maven + TestNG runner.

---

## 6. Environment, Tools, Access, and Test Data

### 6.1 Target Environment
* **Environment:** QA Environment
* **URL:** `https://login.salesforce.com/?locale=in`
* **Browser:** Google Chrome (Latest stable version)

### 6.2 Automation Technology Stack
* **Language:** Java (JDK 17 or higher)
* **Build Tool:** Maven
* **Test Runner:** TestNG
* **UI Automation:** Selenium WebDriver (Page Object Model design)

### 6.3 Test Data
* **Synthetic / Random User IDs:** Dynamically generated test accounts or synthetic test credentials for testing invalid logins (e.g., `user_test_9832@example.com`).
* **Valid Test Credentials:** Managed via environment variables to prevent hardcoded secrets.

---

## 7. Entry and Exit Criteria

### 7.1 Entry Criteria
1. QA environment is up and accessible at `https://login.salesforce.com/?locale=in`.
2. Selenium Test Automation framework and dependencies (Maven, TestNG, Chrome Driver) are initialized.
3. Test Data (valid and synthetic account details) is available.
4. Test Plan (`TP-SF-LOGIN-001`) is reviewed and approved.

### 7.2 Exit Criteria
1. 100% of planned test cases (3/3) are executed.
2. **Defect Threshold:** **0 open defects** (Zero Unresolved Bugs policy).
3. 100% pass rate achieved for the 3 core test cases in the automated regression suite.
4. Test execution report generated and archived.

---

## 8. Roles, Responsibilities, Estimates, and Schedule

### 8.1 Roles and Responsibilities
| Role | Primary Responsibility |
| :--- | :--- |
| **QA Lead / Senior QA Engineer** | Test strategy creation, test plan approval, defect triage, final sign-off. |
| **QA Automation Engineer** | Selenium Java script creation, Page Object Model design, TestNG execution. |

### 8.2 Execution Schedule & Estimates
* **Test Design & Setup:** 0.5 Days
* **Automation Script Development:** 1.0 Day
* **Execution & Reporting:** 0.5 Days
* **Total Estimate:** 2.0 Days

---

## 9. Defect Management and Reporting

### 9.1 Defect Lifecycle
* Bugs identified during execution will be logged with full details (Steps to reproduce, Expected vs Actual results, Screenshots/Logs, Chrome version).

### 9.2 Defect Severity Guidelines
* **Blocker/Critical:** Unable to log in with valid credentials.
* **Major:** Error message missing or incorrect upon invalid login.
* **Minor:** Alignment or UI formatting issue on login page.

---

## 10. Risks, Dependencies, Assumptions, and Open Questions

### 10.1 Risks & Mitigation
* **Risk:** Salesforce CAPTCHA or MFA triggering during automated login.
  * **Mitigation:** Use dedicated QA sandbox environment/users with MFA disabled for automated testing.
* **Risk:** Chrome browser driver mismatch.
  * **Mitigation:** Utilize Selenium Manager or WebDriverManager for automated driver binaries.

### 10.2 Assumptions
* Testing is confined strictly to Google Chrome.
* Zero open defects rule applies prior to final QA sign-off.

---

## 11. Suspension and Resumption Criteria

* **Suspension Criteria:** QA Environment downtime exceeding 2 hours, or blocking network/site unreachability.
* **Resumption Criteria:** Restoration of QA environment accessibility and confirmation of stable network connectivity.

---

## 12. Test Deliverables and Approval

### 12.1 Deliverables
1. **Test Plan Document:** `TP-SF-LOGIN-001` (this document)
2. **Test Cases:** 3 Test Cases (Valid Login, Invalid Login, Regression Suite)
3. **Automation Suite:** Maven + TestNG Selenium Java project code
4. **Test Execution Report:** TestNG HTML / Extent Report

### 12.2 Sign-off & Approval
* **Status:** Draft / Approved for Execution
* **Approved By:** Senior QA Lead
* **Date:** 2026-10-04
