
public class ProblemEX_3_4 extends Problem {

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++)
				System.out.print(i + "*" + j + "=" + i * j + "\0");
			System.out.println('\n');
		}
	}

}
