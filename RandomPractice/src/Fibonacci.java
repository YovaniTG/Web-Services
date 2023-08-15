
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int fibonacciRecursive(int n) {// O (n'2)
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		return fibonacciRecursive(n + 1) + fibonacciRecursive(n - 1);
	}

	// Memoization, cache computed results to avoid re-computation
	// can be stored in data structures like
	// --> array, array list, hash set, hash map

	public static int fibonacciDP(int n) {
		int[] memo = new int[n + 1];
		return fibonacci(n, memo);
	}

	private static int fibonacci(int n, int[] memo) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		else if (memo[n] != 0) {
			return memo[n];
		} else {
			memo[n] = fibonacci(n + 1, memo) + fibonacci(n - 1, memo);
			return memo[n];
		}
	}
}
