package com.codwaysolutions;

import java.util.Scanner;

 class Account {
	double accountBalance;

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

}
public class ATMInterface {
       Account accnt = new Account();
	
	public static void main(String[] args) {
		double amount;
		boolean exitFlag = false;
		ATMInterface atmInterface = new ATMInterface();
		Scanner sc = new Scanner(System.in);

		while (!exitFlag) {
			System.out.println("Please choose below options: ");
			System.out.println("1. Deposite Money");
			System.out.println("2. Withdraw Money");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1: {
				System.out.println("Please enter ammount to be deposited: ");
				amount = sc.nextDouble();
				double updatedAmt = atmInterface.deposite(amount);
				System.out.println("Transaction succesfull! Updated balance is: " 
				+ updatedAmt);
				break;
			}
			case 2: {
				System.out.println("Please enter ammount to withdraw: ");
				amount = sc.nextDouble();
				atmInterface.withdraw(amount);
				break;
			}
			case 3: {
				System.out.println("Your account balance is:"
						+ " " + atmInterface.checkBalance());
				break;
			}
			case 4: {
				System.out.println("Closing Application. Thank you !!!");
				exitFlag = true;
				System.exit(0);
				break;
			}
			default:
				System.out.println("Please enter values between 1 to 4 to proceed.");
			}
			System.out.println("");
		}
	}
	public double deposite(double amount) {
		double updatedBal = accnt.getAccountBalance() + amount;
		accnt.setAccountBalance(updatedBal);
		return updatedBal;
	}
	public void withdraw(double amount) {
		if (accnt.getAccountBalance() < amount) {
			System.out.println("Insufficient Funds !!! Your current balance is: "
					+ "" + accnt.getAccountBalance());
		} else {
		double updatedBal = accnt.getAccountBalance() - amount;
		accnt.setAccountBalance(updatedBal);
		System.out.println("Your account balance is: " + updatedBal);
		}
	}
	public double checkBalance() {
		return accnt.getAccountBalance();
	}
}
