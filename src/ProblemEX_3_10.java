
public class ProblemEX_3_10 extends Problem {

	@Override
	public void run() {
		int intArray[][] = { { 90, 90, 110, 110 }, { 120, 110, 100, 110 }, { 120, 140, 130, 150 } };

		int totalSum = 0;

		for (int i = 0; i < intArray.length; i++) {
			int sum = 0;
			for (int j = 0; j < intArray[i].length; j++) {
				sum += intArray[i][j];
				totalSum += intArray[i][j];
			}
			System.out.println(i + 1 + "차 매출의 총액: " + sum);
		}
		double avg = totalSum / intArray.length;
		System.out.println("3년간 매출 총액: " + totalSum);
		System.out.println("연평균 매출: " + avg);

	}

}
