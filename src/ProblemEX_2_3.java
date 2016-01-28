import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemEX_2_3 extends Problem {

	@Override
	public void run() {
		InputStreamReader rd = new InputStreamReader(System.in);
		try {
			while (true) {
				int a = rd.read();
				if (a == -1)
					break;
				System.out.println((char) a);
			}
		} catch (IOException e) {
			System.out.println("입력 오류 발생");
		}

	}

}
