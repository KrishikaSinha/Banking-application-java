import java.util.Scanner;

public class UserInterface {
    private Account[] accounts;
    private int accountCount;
    private Scanner sc;

    public UserInterface() {
        accounts = new Account[100]; // can store up to 100 accounts
        accountCount = 0;
        sc = new Scanner(System.in);
    }

    // Create new account
    public void createAccount() {
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
        System.out.print("Enter initial deposit: ");
        double balance = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        int accountNumber = 1000 + accountCount + 1;
        accounts[accountCount] = new Account(accountNumber, name, balance, email, phone);
        accountCount++;

        System.out.println("Account created successfully with Account Number: " + accountNumber);
    }

    // Find account
    private Account findAccount(int accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                return accounts[i];
            }
        }
        return null;
    }

    // Deposit
    public void performDeposit() {
        System.out.print("Enter account number: ");
        int accNum = sc.nextInt();
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        sc.nextLine();
        Account acc = findAccount(accNum);
        if (acc != null) {
            acc.deposit(amount);
        } else {
            System.out.println("Account not found!");
        }
    }

    // Withdraw
    public void performWithdrawal() {
        System.out.print("Enter account number: ");
        int accNum = sc.nextInt();
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        sc.nextLine();
        Account acc = findAccount(accNum);
        if (acc != null) {
            acc.withdraw(amount);
        } else {
            System.out.println("Account not found!");
        }
    }

    // Show details
    public void showAccountDetails() {
        System.out.print("Enter account number: ");
        int accNum = sc.nextInt();
        sc.nextLine();
        Account acc = findAccount(accNum);
        if (acc != null) {
            acc.displayAccountDetails();
        } else {
            System.out.println("Account not found!");
        }
    }

    // Update contact
    public void updateContact() {
        System.out.print("Enter account number: ");
        int accNum = sc.nextInt();
        sc.nextLine();
        Account acc = findAccount(accNum);
        if (acc != null) {
            System.out.print("Enter new email: ");
            String email = sc.nextLine();
            System.out.print("Enter new phone number: ");
            String phone = sc.nextLine();
            acc.updateContactDetails(email, phone);
        } else {
            System.out.println("Account not found!");
        }
    }

    // Main menu
    public void mainMenu() {
        while (true) {
            System.out.println("\n--- Banking Application ---");
            System.out.println("1. Create a new account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. View account details");
            System.out.println("5. Update contact details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: createAccount(); break;
                case 2: performDeposit(); break;
                case 3: performWithdrawal(); break;
                case 4: showAccountDetails(); break;
                case 5: updateContact(); break;
                case 6: 
                    System.out.println("Thank you for using Banking Application!");
                    return;
                default: 
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
