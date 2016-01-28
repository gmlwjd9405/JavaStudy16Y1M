
public class ProblemEX_3_6 extends Problem {

	@Override
	public void run() {
		int count = 0;

		while (true) {
			int i;
			if ((i = s.nextInt()) == -1)
				break;
			else
				count++;
		}
		System.out.println(count);

	}

}
