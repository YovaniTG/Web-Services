
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[] numArray = { 1, 2, 3, 4, 5, 22, 4, 10, 4, 7, 9, 3, 32, 5, 7, 9, 4, 12
		// };
		int[] numArr = { 1, 3, 4, 5, 7, 8, 10, 14, 15, 22 };
		System.out.println(binarySearch(numArr, 1));
	}
	// O (log n)
	// O (1) space --> takes same space to search for any elements in the array
	public static int binarySearch(int[] numbers, int x) {

		int firstNum = 0;
		int lastNum = numbers.length - 1;
		int mid = 0;

		while (firstNum <= lastNum) {
			mid = (firstNum + lastNum) / 2;

			if (numbers[mid] > x) {
				lastNum--;
			} else if (numbers[mid] < x) {
				firstNum++;
			} else {
				return numbers[mid];
			}
		}
		return -1;
	}

	public static int binarySearch(String[] arr, String x) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			int res = x.compareTo(arr[m]);
			//use compareTo method from String to check for equality of strings
			// Check if x is present at mid
			if (res == 0)
				return m;

			// If x greater, ignore left half
			if (res > 0)
				l = m + 1;

			// If x is smaller, ignore right half
			else
				r = m - 1;
		}

		return -1;
	}
}
