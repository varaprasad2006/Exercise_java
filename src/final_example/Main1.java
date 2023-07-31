package final_example;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Banking22 account = new Banking22("1234567890", 1000);

		        account.deposit1(500);
		        account.withdraw1(200);
		        account.withdraw1(900); // Will show insufficient balance message

		        System.out.println("Account Number: " + account.getAccountNumber());
		        System.out.println("Final Balance: " + account.getBalance());
		    }
		

	

	}


