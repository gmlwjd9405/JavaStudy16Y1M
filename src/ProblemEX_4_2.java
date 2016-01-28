
public class ProblemEX_4_2 extends Problem {
	int base, exp;

	int getValue() {
		int res = 1;
		for (int i = 0; i < exp; i++) {
			res *= base;
		}
		return res;
	}

	@Override
	public void run() {
		ProblemEX_4_2 myexp;
		myexp = new ProblemEX_4_2();
		myexp.base = 2;
		myexp.exp = 3;

		System.out.println(myexp.base + "ÀÇ " + myexp.exp + "Àº " + myexp.getValue());
	}

}
