
public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Rotate matrix by 90 degrees
		int[][] intmatrix = new int[3][3];

		intmatrix[0][0] = 1;
		intmatrix[0][1] = 2;
		intmatrix[0][2] = 3;

		intmatrix[1][0] = 4;
		intmatrix[1][1] = 5;
		intmatrix[1][2] = 6;

		intmatrix[2][0] = 7;
		intmatrix[2][1] = 8;
		intmatrix[2][2] = 9;

		for (int i = 0; i < intmatrix.length; i++) {
			for (int j = i; j < intmatrix.length; j++) {
				int temp = intmatrix[i][j];
				intmatrix[i][j] = intmatrix[j][i];
				intmatrix[j][i] = temp;
			}
		}

		for (int i = 0; i < intmatrix.length; i++) {
			for (int j = 0; j < (intmatrix.length / 2); j++) {
				int temp = intmatrix[i][j];
				intmatrix[i][j] = intmatrix[i][intmatrix.length - 1];
				intmatrix[i][intmatrix.length - 1] = temp;
			}
		}

		for (int i = 0; i < intmatrix.length; i++) {
			for (int j = 0; j < intmatrix.length; j++) {
				System.out.print(intmatrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
