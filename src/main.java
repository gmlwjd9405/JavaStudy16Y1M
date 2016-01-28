
public class main {

	public static void main(String[] args) {
		Problem problem = new ProblemErr();

		while (true) {
			System.out.print("문제번호를 입력하시오 : ");
			String str = Problem.s.next();

			switch (str) {
			case "2-1":
				problem = new Problem2_1();
				break;
			case "2-3":
				problem = new Problem2_3();
				break;
			case "2-4":
				problem = new Problem2_4();
				break;
			case "2-5":
				problem = new Problem2_5();
				break;
			case "2-7":
				problem = new Problem2_7();
				break;
			case "3-10":
				problem = new Problem3_10();
				break;
			case "3-11":
				problem = new Problem3_11();
				break;
			case "3-2":
				problem = new Problem3_2();
				break;
			case "3-3":
				problem = new Problem3_3();
				break;
			case "3-4":
				problem = new Problem3_4();
				break;
			case "3-5,6":
				problem = new Problem3_5();
				break;
			case "3-7":
				problem = new Problem3_7();
				break;
			case "3-8":
				problem = new Problem3_8();
				break;
			case "3-9":
				problem = new Problem3_9();
				break;
			case "checkTime2-4-2":
				problem = new ProblemCT_2_4_2();
				break;
			case "checkTime2-4-3":
				problem = new ProblemCT_2_4_3();
				break;
			case "checkTime3-12-4":
				problem = new ProblemCT_3_12_4();
				break;
			case "ex2-1":
				problem = new ProblemEX_2_1();
				break;
			case "ex2-10":
				problem = new ProblemEX_2_10();
				break;
			case "ex2-14":
				problem = new ProblemEX_2_14();
				break;
			case "ex2-2":
				problem = new ProblemEX_2_2();
				break;
			case "ex2-3":
				problem = new ProblemEX_2_3();
				break;
			case "ex2-4":
				problem = new ProblemEX_2_4();
				break;
			case "ex2-5":
				problem = new ProblemEX_2_5();
				break;
			case "ex3-1":
				problem = new ProblemEX_3_1();
				break;
			case "ex3-10":
				problem = new ProblemEX_3_10();
				break;
			case "ex3-11":
				problem = new ProblemEX_3_11();
				break;
			case "ex3-12":
				problem = new ProblemEX_3_12();
				break;
			case "ex3-13":
				problem = new ProblemEX_3_13();
				break;
			case "ex3-14":
				problem = new ProblemEX_3_14();
				break;
			case "ex3-2":
				problem = new ProblemEX_3_2();
				break;
			case "ex3-3":
				problem = new ProblemEX_3_3();
				break;
			case "ex3-4":
				problem = new ProblemEX_3_4();
				break;
			case "ex3-5":
				problem = new ProblemEX_3_5();
				break;
			case "ex3-6":
				problem = new ProblemEX_3_6();
				break;
			case "ex3-7":
				problem = new ProblemEX_3_7();
				break;
			case "ex3-8":
				problem = new ProblemEX_3_8();
				break;
			case "ex3-9":
				problem = new ProblemEX_3_9();
				break;
			case "ex4-1":
				problem = new ProblemEX_4_1();
				break;
			case "ex4-2":
				problem = new ProblemEX_4_2();
				break;
			case "ex4-3":
				problem = new ProblemEX_4_3();
				break;
			case "ex4-4":
				problem = new ProblemEX_4_4();
				break;
			case "ex4-5":
				problem = new ProblemEX_4_5();
				break;
			case "ex4-8":
				problem = new ProblemEX_4_8();
				break;
			case "openChallenge2":
				problem = new ProblemOC_2();
				break;
			case "openChallenge3":
				problem = new ProblemOC_3();
				break;
			case "openChallenge4":
				problem = new ProblemOC_4();
				break;

			default:
				problem = new ProblemErr();
				break;
			}
			problem.run();
		}
	}

}
