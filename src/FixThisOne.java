import java.util.Scanner;

public class FixThisOne {

	public static void main(String[] args) {
		
		//Declare constants, variables and scanner
		int eggs, dozens, singles; 
		float dozensCost;
		final float PRICE_PER_DOZEN = 3.25f;
		final float PRICE_PER_SINGLE_EGG = 0.45f;
		Scanner sc = new Scanner(System.in);
				
		//Display Input and receive the value stored in eggs
		System.out.println("How many eggs would you like to purchase today? >>");
		eggs = sc.nextInt();
				
		//Calculating the total cost of dozens and single eggs
		dozens = eggs / 12;
		singles = eggs % 12;
		dozensCost = PRICE_PER_DOZEN * dozens;
		float singlesCost = PRICE_PER_SINGLE_EGG * singles;
		float totalCost = dozensCost + singlesCost;
				
		//Output the number of eggs ordered, the total of dozens, number of loose eggs, and the total price.
		System.out.println("You ordered " + eggs + " That's " + dozens + " dozen, at $3.25 per dozen and " + 
		singles + " loose eggs at 45.0 cents each for a total of " + totalCost);
				
	}

}



