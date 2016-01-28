
public class Problem3_2 extends Problem {

	@Override
	public void run() {
		System.out.print("알파벳 한 문자를 입력하시오.>> ");

		String al;
		al = s.next();
		int i = 0;

		do {
			System.out.print((char) ('a' + i));
			i++;
		} while (al.charAt(0) != (char) ('a' + i)); // 입력한 al과 같은 문자를 만나면 반복문에서
													// 빠져나옴
		System.out.println((char) ('a' + i));
	}
}
