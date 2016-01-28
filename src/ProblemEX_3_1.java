
public class ProblemEX_3_1 extends Problem {

	@Override
	public void run() {
		int i, sum = 0;

		for (i = 1; i <= 10; i++) {
			sum += i;
			System.out.print(i);
			if (i < 10)
				System.out.print('+');
		}
		System.out.println("=" + sum);

	}

}
