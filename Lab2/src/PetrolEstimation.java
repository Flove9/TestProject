// import java.util.Scanner

public class PetrolEstimation {

	public static void main(String[] args) {
		// Create a Scanner object
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		// Prompt the user to enter the values needed
		System.out.print("Enter the distance of a trip (kilometers): ");
		double distance = input.nextDouble();
		System.out.print("Enter the kilometer per litre estimate for the car (km/l): ");
		double kilometer_per_litre = input.nextDouble();
		System.out.print("Enter the average cost of one litre of petrol (RM): ");
		double averageCost_petrol = input.nextDouble();
		
		// Calculation 
		double petrol_needed = distance / kilometer_per_litre;
		double trip_cost = averageCost_petrol * petrol_needed;
		
		// Displaying results
		System.out.printf("The estimated petrol needed for the trip is %.2f litre.\n", petrol_needed);
		System.out.printf("The cost of the trip is RM%.2f.", trip_cost);

	}

}
