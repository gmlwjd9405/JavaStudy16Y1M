
public class ProblemCT_2_4_3 extends Problem {

	@Override
	public void run() {
		System.out.println("���ڿ��� �Է��Ͻÿ�.(��ĭ�� �������� �и�)");
		int count = 0;

		while (s.hasNext()) {
			String str = s.next();
			System.out.println(str);
			count++;
		}

		System.out.println("������ ����: " + count);

	}

}
