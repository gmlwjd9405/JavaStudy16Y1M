
public class Problem2_7 extends Problem {

	@Override
	public void run() {
		System.out.print("�� (x, y)�� ��ǥ�� �Է��Ͻÿ�. >> ");
		int x = s.nextInt();
		int y = s.nextInt();

		if (x >= 50 && x <= 100) {
			if (y >= 50 && y <= 100)
				System.out.print("�簢�� �ȿ� ���� �ֽ��ϴ�.");
		} else
			System.out.println("�簢�� �ȿ� ���� �����ϴ�.");

	}

}
