
public class ProblemEX_2_10 extends Problem {

	@Override
	public void run() {
		System.out.println("점수를 입력하세요.");
		int result = s.nextInt();

		if (result >= 80)
			System.out.println("합격입니다.");
		else
			System.out.println("불합격입니다.");

	}

}
