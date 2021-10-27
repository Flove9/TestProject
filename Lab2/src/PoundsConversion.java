import java.util.Scanner;

public class PoundsConversion {

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter an amount of weight
		System.out.print("Enter the amount of pounds you want to convert to kilogram: ");
		double weight = input.nextDouble();
		
		// Convert pounds into kilograms
		double converted_weight = weight * 0.454;
		
		// Display results
		System.out.println(weight + " pounds is equivalent to " + converted_weight + " kilograms");

	}

}
