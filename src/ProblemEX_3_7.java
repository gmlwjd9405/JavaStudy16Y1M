
public class ProblemEX_3_7 extends Problem {

	@Override
	public void run() {
		int[] num = new int[5];
		int max = 0;

		System.out.println("양수 5개를 입력하시오. ");
		for (int i = 0; i < 5; i++) {
			num[i] = s.nextInt();
			if (max < num[i]) {
				max = num[i];
			}
		}
		System.out.println("가장 큰 양수: " + max);
	}

}
