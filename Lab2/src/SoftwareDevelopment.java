import java.util.Scanner;

public class SoftwareDevelopment {

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// A formatting for the header
		System.out.println("""
				                            CSC3100 PROBLEM SOLVING AND PROGRAMMING CONCEPT                            
				*************************************MARKS EVALUATION APPLICATION**************************************
				
				PLEASE ENTER MARKS: -
				
				""");
		
		// Prompt the user to enter test scores
		System.out.print("     FIRST TEST: ");
		double test1Score = input.nextDouble();
		System.out.print("    SECOND TEST: ");
		double test2Score = input.nextDouble();
		System.out.print("\n   ASSIGNMENT 1: ");
		double assignment1Score = input.nextDouble();
		System.out.print("   ASSIGNMENT 2: ");
		double assignment2Score = input.nextDouble();
		System.out.print("   ASSIGNMENT 3: ");
		double assignment3Score = input.nextDouble();
		System.out.print("\nFINAL EXAMINATION: ");
		double finalScore = input.nextDouble();
		
		// Calculation of the scores
		double test1Score_percentage = (test1Score / 50) * 20.0;
		double test2Score_percentage = (test2Score / 50) * 20.0;
		double assignmentTotalScore = (assignment1Score + assignment2Score + assignment3Score);
		double assignmentScore_percentage = ((assignment1Score + assignment2Score + assignment3Score) / 90) * 30.0;
		double finalScore_percentage = (finalScore / 100) * 30.0;
		double totalScore_percentage = test1Score_percentage + test2Score_percentage + assignmentScore_percentage + finalScore_percentage;
		
		// A formatting for the header
		System.out.println("""
										CALCULATED MARKS
														
				FIRST TEST	SECOND TEST	ASG 1	ASG 2	ASG 3	ASG-TOTAL	FINAL EXAMINATION		TOTAL
				================================================================================================================

				""");

		// Displaying the results using formatting
		System.out.printf("%.1f(%.2f%%)	%.1f(%.2f%%)	%.1f	%.1f	%.1f	%.1f(%.2f%%)	%.1f(%.2f%%)			%.2f%%",
				test1Score, test1Score_percentage, test2Score, test2Score_percentage, assignment1Score, assignment2Score, assignment3Score,
				assignmentTotalScore, assignmentScore_percentage, finalScore, finalScore_percentage, totalScore_percentage);
	}

}
