import java.util.Scanner;

public class DamageThisOne {

	/**
	 * @author Clyde Brown
	 * @version 1.0
	 * @date August 12, 2013
	 * @param void
	 */
	
	public static void main(String[] args) 
	{
		//This section declares TICKETNUMBER, STEM, CheckDigit
		int ticket_Number, STEM, check_Digit;
			Scanner sc = new Scanner(System.in);
		
		// This section requests input from the user, in the form of a six digit number, then it generates a stem and checkdigit from that number
		 
		System.out.print("Please enter a six-digit ticket number:");
			ticket_Number = sc.nextInt();
			STEM = ticket_Number / 10;
		check_Digit = ticket_Number / 10;	

		// This section will check the validity of the ticket number and continue to prompt the user for a new ticket number while the current number is invalid
		 
		while (check_Digit != STEM % 7) 
		{ System.out.println("That is NOT a valid ticket number, bucko!");
			System.out.print("Try again:");
		ticket_Number = sc.nextInt();
			STEM = ticket_Number / 10;
				check_Digit = ticket_Number % 10;	
				}
		
		/*This line prints the valid ticket number*/				
		System.out.println("That is a valid ticket number, well done!");
	
			}

}
