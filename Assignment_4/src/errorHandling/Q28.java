/*28. Implement a Java program to handle StackOverflowError*/
package errorHandling;

public class Q28 {
	public static void main(String[] args) {
		try {
			recursiveMethod(1);
		} catch (StackOverflowError e) {
			System.err.println("Caught StackOverflowError: " + e.getMessage());
			// Additional handling or logging can be done here
		}
	}

	public static void recursiveMethod(int counter) {
		// Base case to prevent infinite recursion
		if (counter > 1000) {
			System.out.println("Reached maximum recursion depth.");
			return;
		}
		recursiveMethod(counter + 1);
	}
}
