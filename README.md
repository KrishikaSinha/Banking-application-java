# Banking-application-java
A simple java Banking Application for account management with features like create account, deposit, withdraw, view details, and update contact information.

---

# ✨ Features

- Create new account
- Deposit money
- Withdraw money
- View account details
- Update contact details

---

# 📂 Project Structure

-├── Account.java        # Account class with attributes and methods

-├── UserInterface.java  # Menu-driven interface for users

-└── BankingApp.java     # Main class to start the program

---

## 🛠Technologies Used

- **Java (Core Java)**  
- **OOP Principles** (Encapsulation, Classes & Objects)  
- **Arrays & Strings**  
- **Control Structures** (if-else, switch, loops)  
- **Scanner Class** for input

---

## 📊 UML Class Diagram

```mermaid
classDiagram
    class Account {
        - int accountNumber
        - String accountHolderName
        - double balance
        - String email
        - String phoneNumber
        + Account(int, String, double, String, String)
        + deposit(double)
        + withdraw(double)
        + displayAccountDetails()
        + updateContactDetails(String, String)
        + getAccountNumber() int
    }

    class UserInterface {
        - Account[] accounts
        - int accountCount
        - Scanner scanner
        + UserInterface()
        + createAccount()
        + performDeposit()
        + performWithdrawal()
        + showAccountDetails()
        + updateContact()
        + mainMenu()
        + main(String[]) static
    }

