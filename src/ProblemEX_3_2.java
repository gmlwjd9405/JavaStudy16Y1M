
public class ProblemEX_3_2 extends Problem {

	@Override
	public void run() {
		int sum = 0, count = 0;
		int num;
		double avg;
		while ((num = s.nextInt()) != 0) {
			count++;
			System.out.println("count");
			sum += num;
		}
		avg = (double) sum / count;
		System.out.println("�Էµ� ���� " + count + "���̸� ����� " + avg + "�̰�" + "���� " + sum + "�̴�.");

	}

}
