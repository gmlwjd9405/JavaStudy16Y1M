
public class ProblemEX_3_8 extends Problem {

	@Override
	public void run() {
		int intArray[] = new int[4];

		int sum = 0;

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = s.nextInt();
			sum += intArray[i];
		}
		double avg = sum / intArray.length;
		System.out.println("입력한 값들의 평균 : " + avg);

	}

}
