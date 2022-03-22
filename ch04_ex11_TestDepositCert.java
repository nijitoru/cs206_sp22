import java.time.*;
import javax.swing.*;
//import java.util.*;

public class TestDepositCert {
	
	public static void main(String[] args) {
		int certNum, yr, mo, da;
		double balance;
		String name, dateEntry, inputString;
		LocalDate issueDate;
		
		// interactive application
		inputString = JOptionPane.showInputDialog(null, "Enter certificate number: ");
		certNum = Integer.parseInt(inputString);
		
		name = JOptionPane.showInputDialog(null, "Enter last name of account holder: ");
		
		inputString = JOptionPane.showInputDialog(null, "Enter balance: ");
		balance = Double.parseDouble(inputString);
		
		// input of date
		dateEntry = JOptionPane.showInputDialog(null, "Enter year of issue: ");
		yr = Integer.parseInt(dateEntry);
		
		dateEntry = JOptionPane.showInputDialog(null, "Enter month of issue: ");
		mo = Integer.parseInt(dateEntry);
		
		dateEntry = JOptionPane.showInputDialog(null, "Enter day of issue: ");
		da = Integer.parseInt(dateEntry);
		
		issueDate = LocalDate.of(yr, mo, da);
		
		// cert1
		DepositCert cert1 = new DepositCert(certNum, name, balance, issueDate);
				
		
		
		// interactive application 2
		inputString = JOptionPane.showInputDialog(null, "Enter certificate number: ");
		certNum = Integer.parseInt(inputString);
		
		name = JOptionPane.showInputDialog(null, "Enter last name of account holder: ");
		
		inputString = JOptionPane.showInputDialog(null, "Enter balance: ");
		balance = Double.parseDouble(inputString);
		
		// input of date 2
		dateEntry = JOptionPane.showInputDialog(null, "Enter year of issue: ");
		yr = Integer.parseInt(dateEntry);
		
		dateEntry = JOptionPane.showInputDialog(null, "Enter month of issue: ");
		mo = Integer.parseInt(dateEntry);
		
		dateEntry = JOptionPane.showInputDialog(null, "Enter day of issue: ");
		da = Integer.parseInt(dateEntry);
		
		issueDate = LocalDate.of(yr, mo, da);
		
		// cert2
		DepositCert cert2 = new DepositCert(certNum, name, balance, issueDate);
		
		display(cert1);
		display(cert2);
		
	}
	
	public static void display(DepositCert cd) {
		JOptionPane.showMessageDialog(null, "Certificate #: " + cd.getCertNum() +
				"\nLast Name: " + cd.getLastName() +
				"\nBalance: $" + cd.getBalance() +
				"\nIssued: " + cd.getIssueDate() +
				"\nMaturity Date of " + cd.getMaturityDate());
	}

}
