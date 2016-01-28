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

		// 최대공약수 구하기
		// 1.클래스이용
		BigInteger b1 = BigInteger.valueOf(num1);
		BigInteger b2 = BigInteger.valueOf(num2);
		BigInteger b = b1.gcd(b2);

		System.out.println(b);

		// 2.알고리즘이용(호제법)
		System.out.println(Gcd(num1, num2));

	}

}
