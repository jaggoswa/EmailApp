package bankaccountapp;

public class Savings extends Account{
	
	//List properties specific to savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;

	public Savings(String name,String ssn,double deposit) {
		super(name,ssn,deposit);
		accountNumber = "2" + accountNumber;
		setSafetyDepositBox();
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - 0.25;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Your savings account features: "
							+ "\n Safety Deposit Box ID: " + safetyDepositBoxID
							+ "\n Safety Deposit Box: " + safetyDepositBoxKey);
	}
}
