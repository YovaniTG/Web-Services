import java.util.Arrays;

public class Rotate {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4 };

		//System.out.println(Arrays.toString(rotateArray(array, 1)));
		System.out.println(Arrays.toString(rotateArrayLeft(array, 1)));
		//System.out.println(Arrays.toString(rotateArrayRight(array, 2)));
		// 2341
	}

	public static int[] rotateArrayRight(int[] array, int x) {
		for (int i = 0; i < x; i++) {
			rotateArrayRightByOne(array, x);
		}
		return array;
	}

	private static void rotateArrayRightByOne(int[] array, int x) {
		int temp = array[array.length - 1];
		for (int i = array.length - 1; i > 0; i--) {
			array[i] = array[i - 1];
		}
		array[0] = temp;
	}

	public static int[] rotateArrayLeft(int[] array, int rotate) {
		for (int i = 0; i < rotate; i++) {
			rotateArrayLeftByOne(array, rotate);
		}
		return array;
	}

	private static void rotateArrayLeftByOne(int[] array, int rotate) {
		int temp = array[0];
		for (int i = 0; i < array.length-1; i++) {
			array[i] = array[i + 1];
		}
		array[array.length - 1] = temp;
	}

	public static int[] rotateArray(int[] array, int rotate) {
		reverse(array, 0, array.length - rotate - 1);// 0 - 2 --> 3 2 1
		reverse(array, array.length - rotate, array.length - 1);// 3 - 3 -> 4
		reverse(array, 0, array.length - 1);//
		return array;
	}

	private static int[] reverse(int[] array, int startIndex, int endIndex) {
		int temp;
		while (startIndex < endIndex) {
			temp = array[startIndex];
			array[startIndex] = array[endIndex];
			array[endIndex] = temp;
			startIndex++;
			endIndex--;
		}
		return array;
	}

}
