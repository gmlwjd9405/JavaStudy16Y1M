
public class ProblemEX_3_13 extends Problem {

	@Override
	public void run() {
		double sum = 0;
		String[] args = { "33", "35", "40" };

		for (int i = 0; i < args.length; i++) {
			sum += Double.parseDouble(args[i]);
		}
		System.out.println("ÇÕ°è: " + sum);
		System.out.println("Æò±Õ: " + sum / args.length);

	}

}
