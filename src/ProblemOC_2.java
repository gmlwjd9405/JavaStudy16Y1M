
public class ProblemOC_2 extends Problem {

	@Override
	public void run() {
		System.out.println("���� ���� �� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���.");
		System.out.print("ö�� >> ");
		String var1 = s.next();
		System.out.print("���� >> ");
		String var2 = s.next();

		if (var1.equals(var2))
			System.out.println("�����ϴ�.");
		else if (var1.equals("����")) {
			if (var2.equals("����"))
				System.out.println("���� �̰���ϴ�.");
			else
				System.out.println("ö���� �̰���ϴ�.");
		} else if (var1.equals("����")) {
			if (var2.equals("��"))
				System.out.println("���� �̰���ϴ�.");
			else
				System.out.println("ö���� �̰���ϴ�.");
		} else if (var1.equals("��")) {
			if (var2.equals("����"))
				System.out.println("���� �̰���ϴ�.");
			else
				System.out.println("ö���� �̰���ϴ�.");
		} else {
			System.out.print("�Է��� �߸��Ǿ����ϴ�.");
		}

	}

}
