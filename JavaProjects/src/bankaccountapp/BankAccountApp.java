package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		List<Account> accounts = new LinkedList<Account>();
		
		String file = "data/NewBankAccounts.csv";
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		
		for(String[] accountHolder : newAccountHolders) {
			String name = accountHolder[0];
			String ssn = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name,ssn,initDeposit));
			}
			else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name,ssn,initDeposit));
			}
			else
				System.out.println("ERROR READING ACCOUNT TYPE");
		}
		
		for(Account acc : accounts) {
			acc.showInfo();
			System.out.println("************");
		}
		
		/*Checking checkacc1 = new Checking("Jagriti Goswami","719374910",1500);
		
		Savings savacc1 = new Savings("Jaba Goswami","292846691",2000);
		
		checkacc1.compound();
		
		checkacc1.showInfo();
		
		System.out.println("**********");
		
		savacc1.compound();
		
		savacc1.showInfo();*/
		
//		System.out.println("**********");
		
//		savacc1.deposit(5000);
//		savacc1.withdraw(200);
//		savacc1.transfer("Brokerage", 3123);
		
	}

}
