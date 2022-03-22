import javax.swing.*;

public class pay {

	public static void main(String[] args) {
		
		String input, message;
		
		int level;
		
		int hrsWorked;
		double payRate, regularPay, overtimePay, totalPay;
		double medical = 0, dental = 0, disability = 0, retirement = 0, totalDeduction;
		
		int medicalOPT, dentalOPT, disabilityOPT, retirementOPT;
		
		final int full_week = 40;
		final double pay1 = 17.00, pay2 = 20.00, pay3 = 22.00;
		final double ot_rate = 1.5, medicalINS = 32.50, dentalINS = 20.00, disabilityINS = 10.00, retire_rate = 0.03;
		
		// skill level
		input = JOptionPane.showInputDialog(null,
				"Please enter skill level: [1 - 3]");
		level = Integer.parseInt(input);
		
		// hours worked
		input = JOptionPane.showInputDialog(null,
				"Enter hours worked:");
		hrsWorked = Integer.parseInt(input);
		
		if(level == 1)
			payRate = pay1;
		else
			if(level == 2)
				payRate = pay2;
			else
				payRate = pay3;
		
		if(hrsWorked > full_week) {
			regularPay = full_week * payRate;
			overtimePay = (hrsWorked - full_week) * ot_rate * payRate;
		}
		else {
			regularPay = hrsWorked * payRate;
	        overtimePay = 0.0;
		}
		
		totalPay = regularPay + overtimePay;
		
		if(level == 2 || level ==3) {
			input = JOptionPane.showInputDialog(null,
					"Would you like medical insurance?\n" +
					"	Enter 1 for YES or 2 for NO");
			medicalOPT = Integer.parseInt(input);
			if(medicalOPT == 1)
				medical = medicalINS;
			
			input = JOptionPane.showInputDialog(null,
					"Would you like dental insurance?\n" +
					"	Enter 1 for YES or 2 for NO");
			dentalOPT = Integer.parseInt(input);
			if(dentalOPT == 1)
				dental = dentalINS;
			
			input = JOptionPane.showInputDialog(null,
					"Would you like long-term disability insurance?\n" +
					"	Enter 1 for YES or 2 for NO");
			disabilityOPT = Integer.parseInt(input);
			if(disabilityOPT == 1)
				disability = disabilityINS;
			
			if(level == 3) {
				input = JOptionPane.showInputDialog(null,
						"Would you like the retirement plan?\n" +
						"	Enter 1 for YES or 2 for NO");
				retirementOPT = Integer.parseInt(input);
				if(retirementOPT == 1)
					retirement = totalPay * retire_rate;
			}
			
		}
		
		totalDeduction = medical + dental + disability + retirement;
		
		message =
				"\nHours Worked: " + hrsWorked +
				"\nHourly pay rate: $" + payRate +
				"\nRegular pay: $" + regularPay +
				"\nOvertime pay: $" + overtimePay +
				"\nTotal pay ....... $" + totalPay +
				"\n" +
				"\nDeductions" +
				"\n     Medical: $" + medical +
				"\n     Dental: $" + dental +
				"\n     Disability: $" + disability +
				"\n     Retirement: $" + retirement +
				"\nTotal Deduction ....... $" + totalDeduction +
				"\n";
		
		if(totalDeduction > totalPay)
			message = message + "\nDeductions have exceeded gross pay.";
		else
			message = message + "\nNet pay ....... $" + (totalPay - totalDeduction);
		JOptionPane.showMessageDialog(null, message);

	}

}
