
public class Problem3_9 extends Problem {

	@Override
	public void run() {
		int sum = 0;

		for (int i = 0; i < args.length; i++) {
			int j = Integer.parseInt(args[i]);
			sum += j;
		}
		System.out.println("정수들의 평균: " + (double) sum / args.length);

	}

}
