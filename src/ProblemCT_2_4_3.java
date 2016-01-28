
public class ProblemCT_2_4_3 extends Problem {

	@Override
	public void run() {
		System.out.println("문자열을 입력하시오.(빈칸을 기준으로 분리)");
		int count = 0;

		while (s.hasNext()) {
			String str = s.next();
			System.out.println(str);
			count++;
		}

		System.out.println("문자의 개수: " + count);

	}

}
