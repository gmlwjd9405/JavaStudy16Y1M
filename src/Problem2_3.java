
public class Problem2_3 extends Problem {

	@Override
	public void run() {
		System.out.print("���� �׼��� �Է��Ͻÿ�.(��������) ");

		int money = s.nextInt();

		int ������ = money / 50000;
		int ���� = (money % 50000) / 10000;
		int õ�� = ((money % 50000) % 10000) / 1000;
		int ��� = (((money % 50000) % 10000) % 1000) / 100;
		int ���ʿ� = ((((money % 50000) % 10000) % 1000) % 100) / 50;

		System.out.print(������);
		System.out.print(����);
		System.out.print(õ��);
		System.out.print(���);
		System.out.print(���ʿ�);
		//�� �ٷ� ��� ����ϱ�
	}

}