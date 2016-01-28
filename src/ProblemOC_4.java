
public class ProblemOC_4 extends Problem {

	public class Player {
		String name; // �÷��̾��� �̸�
		String inputWord; // �÷��̾ �Է��� �ܾ�

		// ������
		Player(String name) {
			this.name = name;
		}

		Player() {

		}

		// ����ڷκ��� �ܾ �Է¹޴� �޼ҵ�
		void sayWord(String word) {
			this.inputWord = word;
		}

		// �����ձ⿡ �����Ͽ������� �Ǻ��ϰ� ������ ����ϴ����� �Ǻ��ϴ� �޼ҵ�
		boolean succeed(String word) {
			int lastIndex = word.length() - 1; // ������ �ε���
			char lastChar = word.charAt(lastIndex); // ������ ����

			if (this.inputWord.charAt(0) == lastChar) // �Է¹��� ������ ù��° ���� == ������
														// ����
				return true; // �����ձ� ����
			else
				return false;
		}
	}

	@Override
	public void run() {
		// Scanner s = new Scanner(System.in);
		// �������� ���� �Է¹޾� Player[] �迭�� �����Ѵ�.

		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�?>> ");
		int playerNum = s.nextInt();
		Player player[] = new Player[playerNum];
		// �÷��̾� ���۷��� �迭�� ����

		for (int i = 0; i < playerNum; i++) {
			System.out.print("�������� �̸��� �Է��ϼ���>> ");
			// �÷��̾� ���۷��� ��ü�� ����
			String playername = s.next();
			player[i] = new Player(playername);
		}

		String firstWord = "�ƹ���";
		System.out.println("�����ϴ� �ܾ�� " + firstWord + "�Դϴ�. ");

		int end = 0; // ���Ḧ �Ǵ�
		// �÷��̸� �ݺ��Ѵ�.
		while (end == 0) {
			int firstPlay = -1; // ù�� ° �÷��̸� �� �� "�ƹ���"�� �־���

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
					System.out.println(player[i].name + "�� �����ϴ�.");
					break;
				}
			}
		}

	}

}
