
public class ProblemEX_2_5 extends Problem {

	@Override
	public void run() {
		int hour, minute, second;
		int time;

		System.out.println("������ �Է��ϼ���.");
		time = s.nextInt();
		second = time % 60;
		minute = (time / 60) % 60;
		hour = (time / 60) / 60;

		System.out.println(time + "�� ");
		System.out.println(hour + "�ð� ");
		System.out.println(minute + "��");
		System.out.println(second + "�� ");

	}

}
