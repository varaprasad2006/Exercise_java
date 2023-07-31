package Usecase2;


public class Account {
	double balance=0.0;
	  
    double getBalance()
   {
	   return balance;
   }
    public void deposit(double amount) {
        balance =balance+amount;
    }
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance =balance-amount;
            return true;
        }
        return false;
    }
}
class SavingsAccount extends Account {
    public void calculateInterest() {
        double interest = balance * 0.07;
        balance = balance+interest;
    }
}
class CheckingAccount extends Account {
   
    private static final double FEE_RATE = 0.0005; // 5 Rs. per 10,000
    private static final double WITHDRAWAL_LIMIT = 50000;

    public boolean withdraw(double amount) {
        double totalAmount = amount;
        if (amount > WITHDRAWAL_LIMIT) {
            totalAmount += (amount - WITHDRAWAL_LIMIT) * FEE_RATE;
        }
        if (balance >= totalAmount) {
            balance = balance-totalAmount;
            return true;
        } else {
            return false;
        }
}

}
