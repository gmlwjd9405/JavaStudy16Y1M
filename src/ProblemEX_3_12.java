
public class ProblemEX_3_12 extends Problem {
	static int[] makeArray() {
		int temp[] = new int[4];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i;
		}
		return temp;
	}

	@Override
	public void run() {
		int intArray[] = makeArray(); // �ż��忡�� �����ϴ� �迭 ���۷����� ���޹���
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]);
			System.out.println();

		}
	}
}