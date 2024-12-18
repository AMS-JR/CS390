package problem_two;

public class CustomerAccount {
    String Cus_name;
    long Acc_No;
    double Balance;

    public CustomerAccount(String Cus_name, long Acc_No, double Balance) {
        this.Cus_name = Cus_name;
        this.Acc_No = Acc_No;
        this.Balance = Balance;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) return false;
        Balance += amount;
        return true;
    }
    public boolean withdraw(double amount) throws AccountException {
        if (amount <= 0) return false;
        else if (amount > Balance) {
            throw new AccountException("Insufficient balance. Current balance: $" + Balance + ", Attempted withdrawal: $" + amount);
        } else {
            if ((Balance - amount) < 100) throw new AccountException("Balance cannot go below $100 after withdrawal. Current balance: $" + Balance + ", Attempted withdrawal: $" + amount);
            Balance -= amount;
            return true;
        }
    }

    public double getBalance() {
        return Balance;
    }

    public static void main(String[] args) {
        try {
            CustomerAccount acc = new CustomerAccount("Alex", 23569874, 90);

            System.out.println("Initial Balance: " + acc.getBalance());
            acc.deposit(100.0);
            acc.withdraw(40.0); //Accepts to withdraw
           acc.withdraw(1000.0); //Withdraw amount exceed the balance
           acc.withdraw(100.0); //Balance reach below 100$
            System.out.println("Balance: " + acc.getBalance());
            acc.withdraw(250.0);
            System.out.println(acc.getBalance());
        } catch (AccountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}