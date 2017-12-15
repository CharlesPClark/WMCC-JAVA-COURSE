//Final MultiTable
//By Charles Clark
//12-21-2015
//Beginner's Java
public class MultiplicationTable {

	public static void main(String[] args) {

		//Declaration of Array Vairable
		int[][] MultiTable = new int[5][10];
		//Send MultiTable into Table Method
		MultiTable = Table(5,10);

		//Gives Every Row and Column Values
		for (int row = 0; row < MultiTable.length ; row++) {
			for (int column = 0; column < MultiTable[row].length; column++) {
				System.out.printf("%2d ",MultiTable[row][column]);
			}
			System.out.println();
		}
	}

	//Checks Length of Row Length and Then Does Multiplication to return one variable at a time
	public static int[][] Table(int r, int c) {

		int [][] intACompleteTable = new int[r][c];

		for (int row = 0; row < intACompleteTable.length ; row++) {
			for (int column = 0; column < intACompleteTable[row].length; column++) {
				intACompleteTable[row][column] = (row+1)*(column+1);
			}

		}
		return intACompleteTable;
	}

}