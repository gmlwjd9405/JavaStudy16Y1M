
public class ProblemEX_2_5 extends Problem {

	@Override
	public void run() {
		int hour, minute, second;
		int time;

		System.out.println("정수를 입력하세요.");
		time = s.nextInt();
		second = time % 60;
		minute = (time / 60) % 60;
		hour = (time / 60) / 60;

		System.out.println(time + "은 ");
		System.out.println(hour + "시간 ");
		System.out.println(minute + "분");
		System.out.println(second + "초 ");

	}

}
