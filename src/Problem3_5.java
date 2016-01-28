
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
		System.out.println("정수 10개를 입력하시오.");
		for (int i = 0; i < num.length; i++) // 정수 10개 입력받기
			num[i] = s.nextInt();
		// 10개 중 3의 배수인 수를 출력
		MultipleThree(num);
		System.out.println();
		// 10개를 오름차순으로 정렬 후 출력
		SortUp(num);
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();

	}

}
