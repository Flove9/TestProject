import java.util.Scanner;

public class AvrgTestScore2 {

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the score for Test 1, 2, 3, 4 accordingly: ");
		
		int test1Score = input.nextInt();
		int test2Score = input.nextInt();
		int test3Score = input.nextInt();
		int test4Score = input.nextInt();
		
		double averageScore = (test1Score + test2Score + test3Score + test4Score) / 4;
		
		System.out.println("The average score of 4 tests is " + averageScore);
	}

}
