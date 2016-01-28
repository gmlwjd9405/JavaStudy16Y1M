
public class Problem3_10 extends Problem {
	
	static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("error");
			return false;
		}
	}

	@Override
	public void run() {
		int sum = 0;
		
		String[] args = {"��", "����", "������"};
		
		for (int i = 0; i < args.length; i++) {
			// ��������ڰ� ������ ��ȯ�� �� �ִ� ���̸�
			if (isInteger(args[i])) {
				System.out.println(args[i] + " ");
				int j = Integer.parseInt(args[i]);
				sum += j;
			}
		}
		System.out.println("�������� ��: " + sum);
	}

}
