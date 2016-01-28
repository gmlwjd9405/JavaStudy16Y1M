
public class ProblemOC_4 extends Problem {

	public class Player {
		String name; // 플레이어의 이름
		String inputWord; // 플레이어가 입력한 단어

		// 생성자
		Player(String name) {
			this.name = name;
		}

		Player() {

		}

		// 사용자로부터 단어를 입력받는 메소드
		void sayWord(String word) {
			this.inputWord = word;
		}

		// 끝말잇기에 성공하였는지를 판별하고 게임을 계속하는지를 판별하는 메소드
		boolean succeed(String word) {
			int lastIndex = word.length() - 1; // 마지막 인덱스
			char lastChar = word.charAt(lastIndex); // 마지막 문자

			if (this.inputWord.charAt(0) == lastChar) // 입력받은 문자의 첫번째 문자 == 마지막
														// 문자
				return true; // 끝말잇기 성공
			else
				return false;
		}
	}

	@Override
	public void run() {
		// Scanner s = new Scanner(System.in);
		// 참가자의 수를 입력받아 Player[] 배열을 생성한다.

		System.out.print("게임에 참가하는 인원은 몇명입니까?>> ");
		int playerNum = s.nextInt();
		Player player[] = new Player[playerNum];
		// 플레이어 레퍼런스 배열을 생성

		for (int i = 0; i < playerNum; i++) {
			System.out.print("참가자의 이름은 입력하세요>> ");
			// 플레이어 레퍼런스 객체를 생성
			String playername = s.next();
			player[i] = new Player(playername);
		}

		String firstWord = "아버지";
		System.out.println("시작하는 단어는 " + firstWord + "입니다. ");

		int end = 0; // 종료를 판단
		// 플레이를 반복한다.
		while (end == 0) {
			int firstPlay = -1; // 첫번 째 플레이를 할 때 "아버지"를 주어짐

			for (int i = 0; i; i++) {
				System.out.print(player[i].name + ">> ");
				String playerWord = s.next();
				player[i].sayWord(playerWord);

				if (firstPlay == -1) {
					if (player[i].succeed(firstWord) == true) {
						firstPlay++;
					}
				} else if (player[i].succeed(firstWord) == true) {
					i++;
				} else {
					System.out.println(player[i].name + "가 졌습니다.");
					break;
				}
			}
		}

	}

}
