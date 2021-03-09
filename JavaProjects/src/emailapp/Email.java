package emailapp;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private String email;
	private int defaultPasswordLength = 8;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	private String comapnySuffix = "company.com";
	
	//Constructor to receive the first and last name
	public Email(String firstName, String lastName){
		this.firstname = firstName;
		this.lastname = lastName;
		
		//Call a method asking for the department - return the departement
		this.department = setDepartment();
		
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		//Combine elements to generate email
		this.email = this.firstname.toLowerCase() + "." +this.lastname.toLowerCase() + "@" 
					+ this.department + "." + comapnySuffix;
	}
	
	//Ask for the department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development"
				+ "\n3 for Accounting\n0 for none\nEnter your department:");
		
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1)
			return "sales";
		else if(depChoice == 2)
			return "dev";
		else if(depChoice == 3)
			return "acct";
		else
			return "";
	}
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int rand_idx = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand_idx);
		}
		
		return String.valueOf(password);
	}
	
	//Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//Change Password
	public void changePassword(String password) {
		this.password = password;
	}
	
	//Get the mailbox capacity
	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassowrd() {return password;}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstname + " " + lastname +
				"\nCOMPANY EMAIL: " + email +
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
}
