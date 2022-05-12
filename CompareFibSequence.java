import java.util.Arrays;

public class CompareFibSequence {

	// Create recursive fib algorithm
	public static int recursiveFib(int n1, int n2, int num) {
		if (num < 0) {  // base cases: negative nums
			return -1;
		} else if (num <= 1) { // base cases: 0 or 1
				return n1 + n2;
		} else {
			 return recursiveFib(n2, n1 + n2, num - 1);
		}
	}

	// Create iterative fib algorithm
	public static void iterateFib(int num) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;

		for(int i = 2; i < num; i++ ) {		// Starts at 2	
			n3 = n1 + n2;
			n1 = n2; 	// n2 becomes the first number 
			n2 = n3; 	// n3 becomes the second number
		}
	} 
	
	public static void main(String[] args) {
		iterateFib(5); // output was weird so I have to call them here first or the numbers are off
		recursiveFib(0, 1, 5); 
		long startTime;
		long endTime;
		
		// Iterative tests
		startTime = System.nanoTime();
		iterateFib(5);
		endTime = System.nanoTime() - startTime;
		System.out.println("The 5th fibonacci value iterated in " + endTime +  " nanoseconds.");

		startTime = System.nanoTime();
		iterateFib(10);
		endTime = System.nanoTime() - startTime;
		System.out.println("The 10th fibonacci value iterated in " + endTime +  " nanoseconds.");
		
		startTime = System.nanoTime();
		iterateFib(15);
		endTime = System.nanoTime() - startTime;
		System.out.println("The 15th fibonacci value iterated in " + endTime +  " nanoseconds.");
		
		startTime = System.nanoTime();
		iterateFib(20);
		endTime = System.nanoTime() - startTime;
		System.out.println("The 20th fibonacci value iterated in " + endTime +  " nanoseconds.");
	
		System.out.println("======================================================");

		// Recursive tests		
		startTime = System.nanoTime();
		recursiveFib(0, 1, 5);
		endTime = System.nanoTime() - startTime;
		System.out.println("The 5th fibonacci value recursed in " + endTime +  " nanoseconds.");
		
		startTime = System.nanoTime();
		recursiveFib(0, 1, 10);
		endTime = System.nanoTime() - startTime;
		System.out.println("The 10th fibonacci value recursed in " + endTime +  " nanoseconds.");
		
		startTime = System.nanoTime();
		recursiveFib(0, 1, 15);
		endTime = System.nanoTime() - startTime;
		System.out.println("The 15th fibonacci value recursed in " + endTime +  " nanoseconds.");
		
		startTime = System.nanoTime();
		recursiveFib(0, 1, 20);
		endTime = System.nanoTime() - startTime;
		System.out.println("The 20th fibonacci value recursed in " + endTime +  " nanoseconds.");

	}

}
