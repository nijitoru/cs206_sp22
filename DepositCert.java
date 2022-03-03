import java.time.*;

public class DepositCert {
	private int certNum;
	private String lastName;
	private double balance;
	LocalDate issueDate, maturityDate;
	
	// set method
	public void setCertNum(int cn) {
		certNum = cn;
	}
	public void setLastName(String ln) {
		lastName = ln;
	}
	public void setBalance(double bal) {
		balance = bal;
	}
	public void setIssueDate(LocalDate date) {
		issueDate = date;
	}
	
	// get method
	public int getCertNum() {
		return certNum;
	}
	public String getLastName() {
		return lastName;
	}
	public double getBalance() {
		return balance;
	}
	public LocalDate getIssueDate() {
		return issueDate;
	}
	public LocalDate getMaturityDate() {
		return maturityDate;
	}
	
	public DepositCert(int cn, String ln, Double bal, LocalDate date) {
		issueDate = date;
		certNum = cn;
		lastName = ln;
		balance = bal;
		maturityDate = issueDate.plusYears(1);
	}

}
