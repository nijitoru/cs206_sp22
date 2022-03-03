import java.util.Scanner;

public class minutesConversion {

	public static void main(String[] args) {
		int numOfMins = 60;
		int numOfHours; 
		float numOfDays;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter number of minutes: >>");
				numOfMins = input.nextInt();
				numOfHours = numOfMins / 60;
				numOfDays = numOfHours / 24;
				
		}
			
		System.out.println(numOfMins + " minutes equals " + numOfHours + " hours and equals to " +
				numOfDays + " days. ");

	}

}
