import java.util.Random;
import java.util.Scanner;

public class ProblemOC_3 extends Problem {

	@Override
	public void run() {
		Random r = new Random();
		int k = r.nextInt(100); // 1~99���� ������ ���� ����

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while (true) {
			int num = 99, i = 1;

			System.out.println("���� �����Ͽ����ϴ�. ���߾����.");

			do {
				System.out.println("0~" + num);
				System.out.print(i + ">>");
				num = s.nextInt();

				if (num > k) {
					System.out.println("�� ����");
				} else if (num < k) {
					System.out.println("�� ����");
				} else {
					System.out.println("�¾ҽ��ϴ�. " + "\n" + "�ٽ��Ͻðڽ��ϱ�?(y/n)>> ");
					if (s.next().equals("n")) {
						System.exit(0);
					}
				}
				i++;
			} while (num != k);

		}

	}
}
