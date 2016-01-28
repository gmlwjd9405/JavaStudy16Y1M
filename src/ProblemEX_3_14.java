
public class ProblemEX_3_14 extends Problem {

	@Override
	public void run() {
		int divisor = 0;
		int dividend = 0;

		System.out.println("나뉨수를 입력하시오.");
		dividend = s.nextInt();
		System.out.println("나눗수를 입력하시오.");
		divisor = s.nextInt();

		try {
			System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend / divisor + "입니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}

}
