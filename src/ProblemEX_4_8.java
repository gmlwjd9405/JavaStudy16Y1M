
public class ProblemEX_4_8 extends Problem {
	private static double rate; // 한국 원화에 대한 환율

	public static double toDoller(double won) {
		return won / rate; // 한국 원화를 달러로 변환
	}

	public static double roKWR(double dollar) {
		return dollar * rate; // 달러를 한국 원화로 변환
	}

	public static void setRate(double r) {
		rate = r; // 미국 달러 환율 설정
	}

	@Override
	public void run() {
		ProblemEX_4_8.setRate(1121); // 미국 달러 환율 설정
		System.out.println("백만원은 " + ProblemEX_4_8.toDoller(1000000) + "달러 입니다.");
		System.out.println("백달러는 " + ProblemEX_4_8.roKWR(100) + "원 입니다.");
	}

}
