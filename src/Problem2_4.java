
public class Problem2_4 extends Problem {

	@Override
	public void run() {
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�. >> ");
		int num = s.nextInt();

		if (num / 10 == 0) // 1~9
		{
			if (num == 3 || num == 6 || num == 9)
				System.out.println("�ڼ�¦");
		} else // 10~99
		{
			if (num / 10 == 3 || num / 10 == 6 || num / 10 == 9)
				if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9)
					System.out.println("�ڼ�¦¦");
		}

	}

}
