
public class Problem2_1 extends Problem {
	@Override
	public void run() {
		String engChar;
		engChar = s.next();

		if (Character.isUpperCase(engChar.charAt(0))) {
			System.out.println(engChar.toLowerCase());
		} else if (Character.isLowerCase(engChar.charAt(0))) {
			System.out.println(engChar.toUpperCase());
		} else {
			System.out.println("영문자가 아닙니다.");
		}
	}

}
