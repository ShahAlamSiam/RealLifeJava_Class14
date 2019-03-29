package class14;

class BankAccount1{
	int balanceA=10000;
	private int AccountNumber;
	private double DepositBalance;
	private double WithDrawBalance;
	private String CusName;
	private String Email;
	private int PhoneNumber;
	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	public double getDepositBalance() {
		return DepositBalance;
	}
	public void setDepositBalance(double balance) {
		DepositBalance = balance;
	}
	public double getWithDrawBalance() {
		return WithDrawBalance;
	}
	public void setWithDrawBalance(double balance) {
		WithDrawBalance = balance;
	}
	public String getCusName() {
		return CusName;
	}
	public void setCusName(String cusName) {
		CusName = cusName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
	
	public double DepositFunds() {
		setAccountNumber(1);
		setCusName("Siam");
		setDepositBalance(10000.00);
		double BB = balanceA + getDepositBalance();
		System.out.println("Name:" +getCusName() + 
				" Account Number: " +getAccountNumber() + 
				" Balance:"+BB);
		return BB;
	}
	
	public double WithDrawFunds(){
		setWithDrawBalance(1000.00);
		double withdrawBlance= DepositFunds() - getWithDrawBalance();
		if(withdrawBlance > 0.0) {
			System.out.println(withdrawBlance);
			
		}else {
			System.out.println("Insufficient Balance");
		}
		return withdrawBlance;
	}
	
}

public class BankAccount {

	public static void main(String[] args) {
		
		BankAccount1 b = new BankAccount1();
		
		b.DepositFunds();
		b.WithDrawFunds();
	}

}
