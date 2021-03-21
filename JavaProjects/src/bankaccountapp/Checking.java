package bankaccountapp;

public class Checking extends Account{
	
	private int debitCardNumber;
	private int debitCardPin;
	
	public Checking(String name,String ssn,double deposit) {
		super(name,ssn,deposit);
		accountNumber = "1" + accountNumber;
		setDebitCard();
	}
	
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 3));	
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * 0.15;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Your checking account features:"
							+ "\n Debit Card number: " + debitCardNumber
							+ "\n Debit card pin: " + debitCardPin);
	}
}
