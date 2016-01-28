
public class Problem3_7 extends Problem {

	@Override
	public void run() {
		int arrayInt[][] = new int[4][4];
		// Random r = new Random();

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arrayInt[i][j] = (int) Math.round(Math.random() * 9 + 1);

				// arrayInt[i][j] = r.nextInt(10); //0~9
				System.out.print(arrayInt[i][j] + " ");
			}
			System.out.println();
		}
	}
}
