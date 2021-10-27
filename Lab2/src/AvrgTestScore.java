
public class AvrgTestScore {

	public static void main(String[] args) {
		System.out.println("""
				Score: -
				Test 1: 30%
				Test 2: 55%
				Test 3: 62%
				Test 4: 89%
				""");
		System.out.println("Calculating average score...");

		// Calculate the average score of 4 tests
		double averageScore = (30 + 55 + 62 + 89) / 4.0;
		
		// Display results
		System.out.println("The average score of 4 tests is " + averageScore + "%.");
	}

}
