package final_example;

final class Banking22 {
	
	    private String accountNumber;
	    private double balance;

	    public Banking22(String accountNumber, double initialBalance) {
	        this.accountNumber = accountNumber;
	        this.balance = initialBalance;
	    }

	    public void deposit1(double amount) {
	        balance += amount;
	        System.out.println("Deposited: " + amount);
	        System.out.println("Current Balance: " + balance);
	    }

	    public void withdraw1(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        } else {
	            System.out.println("Insufficient balance!");
	        }
	        System.out.println("Current Balance: " + balance);
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public String getAccountNumber() {
	        return accountNumber;
	    }
	}

	
