
public class ProblemEX_2_14 extends Problem {

	@Override
	public void run() {
		int score;
		char grade;

		System.out.println("점수를 입력하세요.");

		while (s.hasNext()) {
			score = s.nextInt();
			switch (score / 10) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
			}
			System.out.println("학점은 " + grade + " 입니다.");
		}

	}

}
