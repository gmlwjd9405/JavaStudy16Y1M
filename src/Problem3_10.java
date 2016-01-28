
public class Problem3_10 extends Problem {
	
	static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("error");
			return false;
		}
	}

	@Override
	public void run() {
		int sum = 0;
		
		String[] args = {"권", "흐이", "저으엉"};
		
		for (int i = 0; i < args.length; i++) {
			// 명령형인자가 정수로 변환할 수 있는 값이면
			if (isInteger(args[i])) {
				System.out.println(args[i] + " ");
				int j = Integer.parseInt(args[i]);
				sum += j;
			}
		}
		System.out.println("정수들의 합: " + sum);
	}

}
