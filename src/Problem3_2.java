
public class Problem3_2 extends Problem {

	@Override
	public void run() {
		System.out.print("���ĺ� �� ���ڸ� �Է��Ͻÿ�.>> ");

		String al;
		al = s.next();
		int i = 0;

		do {
			System.out.print((char) ('a' + i));
			i++;
		} while (al.charAt(0) != (char) ('a' + i)); // �Է��� al�� ���� ���ڸ� ������ �ݺ�������
													// ��������
		System.out.println((char) ('a' + i));
	}
}
