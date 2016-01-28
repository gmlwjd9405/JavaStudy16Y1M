
public class ProblemEX_3_3 extends Problem {

	@Override
	public void run() {
		char a = 'a';

		do {
			System.out.print(a);
			a = (char) (a + 1);
		} while (a <= 'z');

	}

}
