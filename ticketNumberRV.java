import javax.swing.*;

public class tixNumRevised {

	public static void main(String[] args) {
		// Judy Marie Delos Reyes | CS 206-01 | January 22, 2022
		
			// input dialog box to enter ticket #
		String ticketEntry = JOptionPane.showInputDialog(null, "Enter six digit ticket number: ");
		
		int tixNum = Integer.parseInt(ticketEntry);
		int lastDigit = tixNum / 10;
		int lostDigit = tixNum % 10;
		int validTix = lastDigit % 7;
		
		// in case for int validTix = lastDigit % 7 formula if forgotten again
		//lostDigit == validTix via boolean
		//boolean validTix = (lostDigit % 7) == lastDigit;
		
		// tickets # 123454 # 147103 equate to true and # 154123 equates to false
		
		// for assignment requirements
		//JOptionPane.showMessageDialog(null, "Is Ticket #" + tixNum + " valid? " + validTix);
		
		// if else statement to have better grammar than one above
		if(lostDigit == validTix){
            JOptionPane.showMessageDialog(null, "Ticket #" + ticketEntry + " is valid.");
        }
		else
			JOptionPane.showMessageDialog(null, "Ticket #" + ticketEntry + " is invalid.");
		
		}
	}