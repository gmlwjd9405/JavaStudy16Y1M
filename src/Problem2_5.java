
public class Problem2_5 extends Problem {

	@Override
	public void run() {
		System.out.println("3���� ������ �Է��Ͻÿ�.");

		int a, b, c;
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();

		if (a + b > c && a + c > b && b + c > a)
			System.out.println("�ﰢ���� ������");
		else
			System.out.println("�ﰢ���� �Ұ�����");

	}

}
