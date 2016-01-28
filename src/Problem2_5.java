
public class Problem2_5 extends Problem {

	@Override
	public void run() {
		System.out.println("3개의 정수를 입력하시오.");

		int a, b, c;
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();

		if (a + b > c && a + c > b && b + c > a)
			System.out.println("삼각형이 가능함");
		else
			System.out.println("삼각형이 불가능함");

	}

}
