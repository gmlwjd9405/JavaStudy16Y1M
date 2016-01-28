
public class ProblemEX_3_5 extends Problem {

	@Override
	public void run() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				sum += i;
			else
				continue;
		}
		System.out.println(sum);

	}

}
