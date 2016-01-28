import java.util.Random;
import java.util.Scanner;

public class ProblemOC_3 extends Problem {

	@Override
	public void run() {
		Random r = new Random();
		int k = r.nextInt(100); // 1~99까지 임의의 정수 생성

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while (true) {
			int num = 99, i = 1;

			System.out.println("수를 결정하였습니다. 맞추어보세요.");

			do {
				System.out.println("0~" + num);
				System.out.print(i + ">>");
				num = s.nextInt();

				if (num > k) {
					System.out.println("더 낮게");
				} else if (num < k) {
					System.out.println("더 높게");
				} else {
					System.out.println("맞았습니다. " + "\n" + "다시하시겠습니까?(y/n)>> ");
					if (s.next().equals("n")) {
						System.exit(0);
					}
				}
				i++;
			} while (num != k);

		}

	}
}
