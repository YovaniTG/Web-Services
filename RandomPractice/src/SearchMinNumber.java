import java.util.Arrays;
//import org.apache.commons.lang3.ArrayUtils;
import java.util.Scanner;

public class SearchMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		sc.close();

		// input = input.replace("[^\\d]", "");
		// input = input.replaceAll(" +", "");

		String[] inputStrArray = input.replaceAll("[^\\d]", "").replaceAll(" +", "").split("");

		// int[] resultStream =
		// Arrays.stream(inputStrArray).mapToInt(Integer::parseInt).toArray();

		int[] inputIntArray = new int[inputStrArray.length];

		int minNum = Integer.MAX_VALUE;

		if (inputIntArray != null) {// isNotEmpty(inputIntArray)

			for (int i = 0; i < inputStrArray.length; i++) {
				inputIntArray[i] = Integer.parseInt(inputStrArray[i]);
			}

			for (int currentNum : inputIntArray) {
				if (minNum > currentNum) {
					minNum = currentNum;
					System.out.println("var: " + minNum);
				}
			}
		}
		System.out.println("Min: " + minNum);
	}

}
