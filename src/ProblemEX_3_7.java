
public class ProblemEX_3_7 extends Problem {

	@Override
	public void run() {
		int[] num = new int[5];
		int max = 0;

		System.out.println("��� 5���� �Է��Ͻÿ�. ");
		for (int i = 0; i < 5; i++) {
			num[i] = s.nextInt();
			if (max < num[i]) {
				max = num[i];
			}
		}
		System.out.println("���� ū ���: " + max);
	}

}
