
public class Problem3_3 extends Problem {
	static int count = 0;

	static void binary(int n) {
		if (n / 2 == 1) {
			System.out.print("1");
			count++;
			if (n % 2 == 1)
				count++;
			System.out.print(n % 2);
		} // ���� 1�̸� 1�� ���
		else {
			binary(n / 2);
			if (n % 2 == 0)
				System.out.print("0");
			else {
				System.out.print("1");
				count++;
			}
		} // ���� 1�� �ƴϸ� ���
	}

	@Override
	public void run() {
		System.out.println("0���� ū ������ �Է��Ͻÿ�.");
		int num = s.nextInt();

		binary(num);
		System.out.println();
		System.out.print(count);
	}

}
