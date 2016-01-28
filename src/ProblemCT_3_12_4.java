
public class ProblemCT_3_12_4 extends Problem {
	static int[][] makeArray() {
		int arr[][] = new int[4][];
		arr[0] = new int[4];
		arr[1] = new int[1];
		arr[2] = new int[1];
		arr[3] = new int[4];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i;
			}
		}
		return arr;
	}

	static int sumArray(int array[][]) {
		int sum = 0;
		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[i].length; j++)
				sum += array[i][j];
		return sum;
	}

	@Override
	public void run() {
		int intArray[][] = makeArray();

		System.out.println(sumArray(intArray));
	}

}
