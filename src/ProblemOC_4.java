
public class ProblemOC_4 extends Problem {

	@Override
	public void run() {
		// Scanner s = new Scanner(System.in);
		// �������� ���� �Է¹޾� Player[] �迭�� �����Ѵ�.

		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�?>> ");
		int playerNum = s.nextInt();
		Player player[] = new Player[playerNum];
		// �÷��̾� ���۷��� �迭�� ����
		Player temp = new Player();
		for (int i = 0; i < playerNum; i++) {
			System.out.print("�������� �̸��� �Է��ϼ���>> ");
			// �÷��̾� ���۷��� ��ü�� ����
			String playername = s.next();
			player[i] = new Player(playername);
		}

		String firstWord = "�ƹ���";
		System.out.println("�����ϴ� �ܾ�� " + firstWord + "�Դϴ�. ");

		int i = 0, j = 0;
		int first = 0;
		while (true) {
			System.out.print(player[i].name + ">> ");
			String playerWord = s.next();
			player[i].sayWord(playerWord);

			if (first == 0) {
				if (player[0].succeed(firstWord) == true) {
					first++;
				} else {
					System.out.println(player[0].name + "�� �����ϴ�.");
					break;
				}

			} else {
				if (player[i].succeed(player[j].inputWord) == false) {
					System.out.println(player[i].name + "�� �����ϴ�.");
					break;
				}
			}

			i++;
			if (i == 1) {
				j = 0;
			} else if (i == 2) {
				j = 1;
			} else {// i == 3
				i = 0;
				j = 2;
			}
		}
	}

}

class Player {
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
			return true; // �����ձ� ����. ���� ��� ����
		else
			return false;
	}
}
