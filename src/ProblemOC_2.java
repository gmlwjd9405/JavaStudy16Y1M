
public class ProblemOC_2 extends Problem {

	@Override
	public void run() {
		System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
		System.out.print("철수 >> ");
		String var1 = s.next();
		System.out.print("영희 >> ");
		String var2 = s.next();

		if (var1.equals(var2))
			System.out.println("비겼습니다.");
		else if (var1.equals("가위")) {
			if (var2.equals("바위"))
				System.out.println("영희가 이겼습니다.");
			else
				System.out.println("철수가 이겼습니다.");
		} else if (var1.equals("바위")) {
			if (var2.equals("보"))
				System.out.println("영희가 이겼습니다.");
			else
				System.out.println("철수가 이겼습니다.");
		} else if (var1.equals("보")) {
			if (var2.equals("가위"))
				System.out.println("영희가 이겼습니다.");
			else
				System.out.println("철수가 이겼습니다.");
		} else {
			System.out.print("입력이 잘못되었습니다.");
		}

	}

}
