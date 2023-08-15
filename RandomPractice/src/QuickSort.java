import java.util.Arrays;

public class QuickSort {

	public static void quickSort(int arr[], int begin, int end) {
		if (begin < end) {
			int partitionIndex = partition(arr, begin, end);

			quickSort(arr, begin, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, end);
		}
	}

	// compare numbers with pivot, and swap them based on if they are > or < then
	// pivot

	private static int partition(int arr[], int begin, int end) {
		int pivot = arr[end];
		int i = (begin - 1);

		System.out.println(i);

		for (int j = begin; j < end; j++) {
			if (arr[j] <= pivot) {
				i++;

				int swapTemp = arr[i];
				arr[i] = arr[j];
				arr[j] = swapTemp;
			}
		}

		int swapTemp = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = swapTemp;

		return i + 1;
	}

	private static final int LEFT_INDEX = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = { 4, -1, 6, 8, 0, 5, -3 };
		int[] intArray2 = { 2, 1, 1, 1, 4, 2, 6, 7, 3, 1, 1, 4, 8, 3, 9, 12, 33, 57, 6, 5, 4 };
		// int n = intArray.length - 1;
		// quickSort(intArray, 0, n);

		quickSort(intArray2);
		System.out.println(Arrays.toString(intArray2));
	}

	public static void quickSort(int[] array) {
		quickSortAlg(array, 0, array.length - 1);
	}

	private static void quickSortAlg(int[] array, int left, int right) {
		if (left >= right) {
			return;
		}
		int pivot = array[(left + right) / 2];
		int index = partition(array, left, right, pivot);
		quickSortAlg(array, left, index - 1);
		quickSortAlg(array, index , right);
	}

	private static int partition(int[] array, int left, int right, int pivot) {
		while (left <= right) {
			while (array[left] < pivot) {
				left++;
			}
			while (array[right] > pivot) {
				right--;
			}
			if (left <= right) {
				swap(array, left, right);
				left++;
				right--;
			}
		}
		return left;
	}

	private static void swap(int[] array, int left, int right) {
		array[left] = array[left] + array[right];
		array[right] = array[left] - array[right];
		array[left] = array[left] - array[right];
	}

}
