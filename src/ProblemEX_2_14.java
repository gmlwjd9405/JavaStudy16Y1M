
public class ProblemEX_2_14 extends Problem {

	@Override
	public void run() {
		int score;
		char grade;

		System.out.println("������ �Է��ϼ���.");

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
			System.out.println("������ " + grade + " �Դϴ�.");
		}

	}

}
