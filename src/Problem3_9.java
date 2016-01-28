
public class Problem3_9 extends Problem {

	@Override
	public void run() {
		int sum = 0;

		String[] args = {"±Ç", "ÈåÀÌ", "ÀúÀ¸¾û"};
		
		for (int i = 0; i < args.length; i++) {
			int j = Integer.parseInt(args[i]);
			sum += j;
		}
		System.out.println("Á¤¼öµéÀÇ Æò±Õ: " + (double) sum / args.length);

	}

}
