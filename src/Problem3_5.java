
public class Problem3_5 extends Problem {
	static void MultipleThree(int n[]) {
		for (int i = 0; i < n.length; i++) {
			if (n[i] % 3 == 0)
				System.out.print(n[i] + " ");
		}
	}

	static void SortUp(int n[]) {
		int temp;

		for (int i = 0; i < n.length; i++) {
			for (int j = i; j > 0; j--) {
				if (n[j] < n[j - 1]) {
					temp = n[j];
					n[j] = n[j - 1];
					n[j - 1] = temp;
				} else
					break;
			}
		}
	}

	@Override
	public void run() {
		int num[] = new int[10];
		System.out.println("���� 10���� �Է��Ͻÿ�.");
		for (int i = 0; i < num.length; i++) // ���� 10�� �Է¹ޱ�
			num[i] = s.nextInt();
		// 10�� �� 3�� ����� ���� ���
		MultipleThree(num);
		System.out.println();
		// 10���� ������������ ���� �� ���
		SortUp(num);
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();

	}

}
