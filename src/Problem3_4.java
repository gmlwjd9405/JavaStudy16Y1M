import java.math.BigInteger;

public class Problem3_4 extends Problem {
	static int Gcd(int n1, int n2) {
		if (n2 == 0)
			return n1;
		else
			return Gcd(n2, n1 % n2);
	}

	@Override
	public void run() {
		int num1 = s.nextInt();
		int num2 = s.nextInt();

		// �ִ����� ���ϱ�
		// 1.Ŭ�����̿�
		BigInteger b1 = BigInteger.valueOf(num1);
		BigInteger b2 = BigInteger.valueOf(num2);
		BigInteger b = b1.gcd(b2);

		System.out.println(b);

		// 2.�˰����̿�(ȣ����)
		System.out.println(Gcd(num1, num2));

	}

}
