
public class ProblemEX_3_14 extends Problem {

	@Override
	public void run() {
		int divisor = 0;
		int dividend = 0;

		System.out.println("�������� �Է��Ͻÿ�.");
		dividend = s.nextInt();
		System.out.println("�������� �Է��Ͻÿ�.");
		divisor = s.nextInt();

		try {
			System.out.println(dividend + "�� " + divisor + "�� ������ ���� " + dividend / divisor + "�Դϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
	}

}
