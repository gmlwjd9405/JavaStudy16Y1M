
public class ProblemEX_2_1 extends Problem {
	public static int sum(int n, int m) {
		return n + m;
	}

	@Override
	public void run() {
		int i = 20;
		int s;
		char a;

		s = sum(i, 10);
		a = '?';
		System.out.println(a);
		System.out.println("Hello2");
		System.out.println(s);
	}

}
