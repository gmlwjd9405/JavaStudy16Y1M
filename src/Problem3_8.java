import java.util.Random;

public class Problem3_8 extends Problem {

	@Override
	public void run() {
		int arrayInt[][] = new int[4][4]; // 처음부터 0으로 초기화
		Random r = new Random();
		int count = 0;

		while (count < 8) {
			int i = r.nextInt(4);
			int j = r.nextInt(4);

			if (arrayInt[i][j] == 0) {
				arrayInt[i][j] = (int) Math.round(Math.random() * 9 + 1);
				count++;
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arrayInt[i][j] + " ");
			}
			System.out.println();
		}

	}

}
