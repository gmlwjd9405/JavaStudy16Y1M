
public class Problem2_3 extends Problem {

	@Override
	public void run() {
		System.out.print("돈의 액수를 입력하시오.(정수형태) ");

		int money = s.nextInt();

		int 오만원 = money / 50000;
		int 만원 = (money % 50000) / 10000;
		int 천원 = ((money % 50000) % 10000) / 1000;
		int 백원 = (((money % 50000) % 10000) % 1000) / 100;
		int 오십원 = ((((money % 50000) % 10000) % 1000) % 100) / 50;

		System.out.print(오만원);
		System.out.print(만원);
		System.out.print(천원);
		System.out.print(백원);
		System.out.print(오십원);
		//한 줄로 적어서 출력하기
	}

}