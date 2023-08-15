
public class PrintMatrixInSpiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

		int startRowIndex = 0;
		int endRowIndex = intmatrix.length - 1;
		int startColumnIndex = 0;
		int endColumnIndex = intmatrix[0].length - 1;

		while (startRowIndex <= endRowIndex && startColumnIndex <= endColumnIndex) {

			for (int i = startColumnIndex; i <= endColumnIndex; i++) {
				System.out.print(intmatrix[startRowIndex][i]);
			}
			startRowIndex++;

			for (int i = startRowIndex; i <= endRowIndex; i++) {
				System.out.print(intmatrix[i][endColumnIndex]);
			}

			endColumnIndex--;

			for (int i = endColumnIndex; i >= startColumnIndex; i--) {
				System.out.print(intmatrix[endRowIndex][i]);
			}

			endRowIndex--;

			for (int i = endRowIndex; i >= startRowIndex; i--) {
				System.out.print(intmatrix[i][startColumnIndex]);
			}
			startColumnIndex++;
		}
		// 1, 2, 3, 6, 9, 8, 7, 4, 5
	}
}
