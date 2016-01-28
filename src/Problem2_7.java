
public class Problem2_7 extends Problem {

	@Override
	public void run() {
		System.out.print("점 (x, y)의 좌표를 입력하시오. >> ");
		int x = s.nextInt();
		int y = s.nextInt();

		if (x >= 50 && x <= 100) {
			if (y >= 50 && y <= 100)
				System.out.print("사각형 안에 점이 있습니다.");
		} else
			System.out.println("사각형 안에 점이 없습니다.");

	}

}
