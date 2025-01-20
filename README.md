# Tutorials Ninja E-Commerce Testing

## 🌟 Overview
The **Tutorials Ninja** platform is a feature-rich e-commerce website offering a wide variety of products, including electronics, fashion, home goods, and more. The platform provides essential functionalities such as browsing, cart management, and checkout, ensuring a seamless shopping experience.

This project focuses on performing both **manual** and **automated testing** to ensure the platform's full functionality and optimal user experience.

---

## 🛠️ Key Functionalities
### Expanded Functional Areas
1. **User Registration and Login**
2. **Product Browsing and Display**
3. **Search Functionality**
4. **Cart Management**
5. **Checkout Process**
6. **Order History**
7. **Account Management (Update Details)**
8. **Promo Codes and Discounts**
9. **Multi-currency Support**
10. **Mobile and Cross-browser Compatibility**
11. **Security Features**
12. **Error Handling**

---

## 🔍 Testing Scope
### **1. Usability Testing**
- Ensure the platform is user-friendly and intuitive.
- Evaluate browsing, cart management, and checkout efficiency.

### **2. Functionality Testing**
- Test core features such as:
  - Registration and login
  - Product browsing and search
  - Cart and checkout workflows

### **3. Performance Testing**
- Simulate high-traffic scenarios (e.g., sales events).
- Assess load times, stability, and scalability.

### **4. Security Testing**
- Conduct a comprehensive security audit to:
  - Identify vulnerabilities
  - Ensure data protection

### **5. Compatibility Testing**
- Test across:
  - Multiple devices (desktop, tablet, mobile)
  - Browsers (Chrome, Firefox, Safari, Edge, etc.)

---

## 🧪 Testing Approach
### **Manual Testing**
- Perform exploratory testing to identify usability issues and edge cases.
- Validate workflows manually, focusing on critical features:
  - Login
  - Product search
  - Cart management
  - Checkout

### **Automation Testing (Selenium)**
- Automate critical workflows, including:
  - Adding products to the cart
  - Completing checkout
  - Applying promo codes
- Use Selenium for **regression testing** to ensure stability after updates.

---

## ⚙️ Framework and Tools
### **Cucumber Framework with POM (Page Object Model)**
**Automation Testing Highlights:**

#### **Login Functionality**
- Automate login using **valid** and **invalid credentials**.
- Validate multi-factor authentication (MFA) and error messages.

#### **Product Search and Filters**
- Automate product searches to ensure filters (e.g., category, price, rating) return accurate results.
- Test sorting functionality (e.g., price, best sellers).

#### **Checkout Process**
- Automate adding items to the cart and completing checkout workflows.
- Use Cucumber to:
  - Automate applying promo codes
  - Verify correct discount calculations

---

## 🛠️ Tools and Technologies
- ![Selenium Logo](https://upload.wikimedia.org/wikipedia/commons/d/d5/Selenium_Logo.png) **Automation Tool**: Selenium WebDriver
- ![Cucumber Logo](https://upload.wikimedia.org/wikipedia/commons/9/9f/Cucumber_Logo.png) **Framework**: Cucumber with Page Object Model (POM)
- ![Java Logo](https://upload.wikimedia.org/wikipedia/en/3/30/Java_programming_language_logo.svg) **Programming Language**: Java/Python (depending on implementation)
- ![Jira Logo](https://upload.wikimedia.org/wikipedia/en/6/64/Jira_Logo.png) **Test Management**: Jira/TestRail
- ![GitHub Logo](https://upload.wikimedia.org/wikipedia/commons/9/91/Octicons-mark-github.svg) **Version Control**: GitHub

---

## 🎯 Project Goals
- Validate the e-commerce platform's functionality, usability, and security.
- Ensure a seamless and consistent user experience across all devices and browsers.
- Automate critical workflows to improve testing efficiency and coverage.

---

## 📋 How to Use
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/tutorials-ninja-testing.git
   ```
2. Navigate to the project directory:
   ```bash
   cd tutorials-ninja-testing
   ```
3. Set up the environment and dependencies:
   ```bash
   # For Python:
   pip install -r requirements.txt

   # For Java (Maven):
   mvn install
   ```
4. Run the tests:
   ```bash
   # Manual tests: Refer to the test cases in the documentation folder.

   # Automation tests:
   mvn test   # For Maven setup
   ```

---

## 📂 Folder Structure
```
├── src
│   ├── main
│   │   └── java
│   │       └── pageobjects
│   └── test
│       └── java
│           └── stepdefinitions
├── features
│   └── *.feature
├── reports
│   └── test-report.html
├── pom.xml
└── README.md
```

---

## 📜 License
This project is licensed under the MIT License. See the `LICENSE` file for details.

---

## 👥 Contributors
- **Alok Mishra**
- **vinita Kumawat**

Feel free to contribute! Fork this repository, create a branch, and submit a pull request.

---

## 💬 Feedback and Support
For feedback or support, create an issue or contact [Alokmi2111997@gmail.com](mailto:Alokmi2111997@gmail.com).
