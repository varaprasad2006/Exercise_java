package Usecase2;

import java.util.Scanner;

public class BankApp1 {
	
	public static void main(String args[]) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Choose account Type");
		System.out.println("1.SavingsAccount");
		System.out.println("2.CheckingAccount");
		int choice=sc.nextInt();
		
		if(choice==1)
		{
			SavingsAccount account =new SavingsAccount();
			System.out.println("Account:SavingsAccount");
			System.out.println("Balance="+account.getBalance());
			
			while (true) {
	            System.out.println("Select the option");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Exit");

	            int option = sc.nextInt();
	            
	            if (option == 1) 
	            {
	                System.out.print("Deposit: ");
	                double amount = sc.nextDouble();
	                account.deposit(amount);
	                System.out.println("Balance: " + account.getBalance());
	            }
	            else if (option == 2) 
	            {
	            	System.out.print("Withdrawal amount: ");
	                double amount = sc.nextDouble();
	                if(account.withdraw(amount))
	                {
	                account.calculateInterest();
                    System.out.println("Account Balance after interest: " + account.getBalance());
	                }
	                else {
                        System.out.println("Insufficient balance.");
	                }
	            }
	            else if (option == 3) {
	                break;
	            } 
	            else 
	            {
	                System.out.println("Invalid option. Please try again.");
	            }
			}
			}
			
		
		else if(choice==2)
		{
			CheckingAccount account=new CheckingAccount();
			System.out.println("Account:CheckingAccount");
			System.out.println("Balance="+account.getBalance());
			while (true) {
	            System.out.println("Select the option");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Exit");

	            int option = sc.nextInt();
	            
	            if (option == 1) 
	            {
	                System.out.print("Deposit: ");
	                double amount = sc.nextDouble();
	                account.deposit(amount);
	                System.out.println("Balance: " + account.getBalance());
	            }
	            else if (option == 2) 
	            {
	            	System.out.print("Withdrawal amount: ");
	                double amount = sc.nextDouble();
	                if(account.withdraw(amount))
	                {
	                    System.out.println("Balance after deduction: " + account.getBalance());
	                }
	                else {
                        System.out.println("Insufficient balance.");
	                }
	            }
	                
	            else if (option == 3) {
	                break;
	            } 
	            else 
	            {
	                System.out.println("Invalid option. Please try again.");
	            }
			}
		}
		else
		{
			System.out.println("Choose Wrong Option");
			return;
		}
	  
	}


}
