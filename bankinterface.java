interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
    void displayBalance();
}

class Customer {
    String name;
    int customerId;

    Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    void displayCustomer() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customerId);
    }
}

class Account extends Customer implements Bank {
    double balance;

    Account(String name, int customerId, double balance) {
        super(name, customerId);
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class bankinterface {
    public static void main(String[] args) {
        Account acc = new Account("Ridreb", 101, 5000);

        acc.displayCustomer();
        acc.displayBalance();

        acc.deposit(2000);
        acc.withdraw(1500);

        acc.displayBalance();
    }
}