
public class Problem3_3 extends Problem {
	static int count = 0;

	static void binary(int n) {
		if (n / 2 == 1) {
			System.out.print("1");
			count++;
			if (n % 2 == 1)
				count++;
			System.out.print(n % 2);
		} // 몫이 1이면 1을 출력
		else {
			binary(n / 2);
			if (n % 2 == 0)
				System.out.print("0");
			else {
				System.out.print("1");
				count++;
			}
		} // 몫이 1이 아니면 재귀
	}

	@Override
	public void run() {
		System.out.println("0보다 큰 정수를 입력하시오.");
		int num = s.nextInt();

		binary(num);
		System.out.println();
		System.out.print(count);
	}

}
