// Java Program to find even sum of
// fibonacci Series Till number N
import java.io.*;

class geeksforgeeks {

	// Computing the value of first fibonacci series
	// and storing the sum of even indexed numbers
	static int Fib_Even_Sum(int N)
	{
		if (N <= 0)
			return 0;

		int fib[] = new int[2 * N + 1];
		fib[0] = 0;
		fib[1] = 1;

		// Initializing the sum
		int s = 0;

		// Adding remaining numbers
		for (int j = 2; j <= 2 * N; j++) {
			fib[j] = fib[j - 1] + fib[j - 2];

			// Only considering even indexes
			if (j % 2 == 0)
				s += fib[j];
		}

		return s;
	}

	// The Driver code
	public static void main(String[] args)
	{
		int N = 11;

		// Prints the sum of even-indexed numbers
		System.out.println(
			"Even sum of fibonacci series till number " + N
			+ " is: " + +Fib_Even_Sum(N));
	}
 
#feature202 changes by karthik on oct.2023
class Main {
  public static void main(String[] args) {

    int n = 10, firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(firstTerm + ", ");

      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}

 #feature201 worked by belief for hdfc application oct.2023


// Java Program to find even indexed
// Fibonacci Sum in O(Log n) time.
 
class GFG {
 
    static int MAX = 1000;
 
    // Create an array for memoization
    static int f[] = new int[MAX];
 
    // Returns n'th Fibonacci number
    // using table f[]
    static int fib(int n)
    {
        // Base cases
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return (f[n] = 1);
        }
 
        // If fib(n) is already computed
        if (f[n] == 1) {
            return f[n];
        }
 
}
