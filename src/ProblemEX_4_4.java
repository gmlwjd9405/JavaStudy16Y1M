
public class ProblemEX_4_4 extends Problem {

	static void Change(char c[]) {
		for (int i = 0; i < c.length; i++) {
			if (c[i] == ' ') {
				c[i] = ',';
			}
		}
	}

	static void PrintArray(char c[]) {
		System.out.println(c);
	}

	@Override
	public void run() {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };
		PrintArray(c);// ���� �迭���� ���
		Change(c);// ���鹮�� �ٲٱ�
		PrintArray(c);// ������ �迭���� ���

	}

}
