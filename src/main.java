import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Problem problem = new ProblemErr();
		
		while (true) {
			System.out.print("������ȣ�� �Է��Ͻÿ� : ");
			String str = Problem.s.next();

			switch (str) {
			case "2-1":
				problem = new Problem2_1();
				break;
			default :
				problem =  new ProblemErr();
				break;	
			}
			problem.run();
		}
	}

}
