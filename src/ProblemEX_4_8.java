
public class ProblemEX_4_8 extends Problem {
	private static double rate; // �ѱ� ��ȭ�� ���� ȯ��

	public static double toDoller(double won) {
		return won / rate; // �ѱ� ��ȭ�� �޷��� ��ȯ
	}

	public static double roKWR(double dollar) {
		return dollar * rate; // �޷��� �ѱ� ��ȭ�� ��ȯ
	}

	public static void setRate(double r) {
		rate = r; // �̱� �޷� ȯ�� ����
	}

	@Override
	public void run() {
		ProblemEX_4_8.setRate(1121); // �̱� �޷� ȯ�� ����
		System.out.println("�鸸���� " + ProblemEX_4_8.toDoller(1000000) + "�޷� �Դϴ�.");
		System.out.println("��޷��� " + ProblemEX_4_8.roKWR(100) + "�� �Դϴ�.");
	}

}
