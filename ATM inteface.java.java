import java.util.Scanner;
public class SimpleATM {
    private static double balance = 1000; // Initial balance
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdrawFunds();
                    break;
                case 3:
                    depositFunds();
                    break;
                case 4:
                    System.out.println("Exiting ATM. Thank you!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    private static void displayMenu() {
        System.out.println("===== Simple ATM Menu =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Funds");
        System.out.println("3. Deposit Funds");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }
    private static void checkBalance() {
        System.out.println("Your balance: $" + balance);
    }
    private static void withdrawFunds() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {<br > balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: $" + balance);
        } else {
            System.out.println("Invalid amount or insufficient funds. Please try again.");
        }
    }
    private static void depositFunds() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid amount. Please try again.");
        }
    }
}
public class ATM {
  // The balance of the ATM.
  private double balance = 1000;
  // The list of accounts that are linked to the ATM.
  private List<Account> accounts;
  // The constructor for the ATM class.
  public ATM() {
    accounts = new ArrayList<>();
  }
  // The method that allows users to withdraw cash from the ATM.
  public void withdrawCash(double amount) {
    if (balance >= amount) {
      balance -= amount;
    } else {
      System.out.println("Insufficient funds.");
    }
  }
  // The method that allows users to deposit money into the ATM.
  public void depositMoney(double amount) {
    balance += amount;
  }
  // The method that allows users to check their balance.
  public double checkBalance() {
    return balance;
  }
  // The method that allows users to link an account to the ATM.
  public void linkAccount(Account account) {
    accounts.add(account);
  }
  // The method that allows users to unlink an account from the ATM.
  public void unlinkAccount(Account account) {
    accounts.remove(account);
  }
}
public class Account {
  // The account number.
  private String accountNumber;
  // The balance of the account.
  private double balance;
  // The owner's name.
  private String ownerName;
  // The constructor for the Account class.
  public Account(String accountNumber, double balance, String ownerName) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.ownerName = ownerName;
  }
  // The method that returns the account number.
  public String getAccountNumber() {
    return accountNumber;
  }
  // The method that returns the balance of the account.
  public double getBalance() {
    return balance;
  }
  // The method that returns the owner's name.
  public String getOwnerName() {
    return ownerName;
  }
}
public class Main {
  public static void main(String[] args) {
    // Create an instance of the ATM class.
    ATM atm = new ATM();
    // Link an account to the ATM.
    Account account = new Account("123456789", 1000, "John Doe");
    atm.linkAccount(account);
    // Withdraw cash from the ATM.
    atm.withdrawCash(500);
    // Check the balance of the account.
    double balance = atm.checkBalance();
    System.out.println("The balance of the account is $" + balance);
  }
}