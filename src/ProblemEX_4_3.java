
public class ProblemEX_4_3 extends Problem {
	static class Goods {
		public String name;
		public int price, numberOfStock, sold;

		Goods(String name, int price, int numberOfStock, int sold) {
			this.name = name;
			this.price = price;
			this.numberOfStock = numberOfStock;
			this.sold = sold;
		}
	}

	@Override
	public void run() {
		Goods[] goodsArray; // ���۷��� ����
		goodsArray = new Goods[3]; // ���۷��� �迭 ����

		for (int i = 0; i < goodsArray.length; i++) {
			// ���۷��� ��ü ����
			System.out.println("��ǰ�� �̸�, ����, ��� ����, �ȸ� ������ ������� �Է��Ͻÿ�.");
			String name = s.next();
			int price = s.nextInt();
			int numberOfStock = s.nextInt();
			int sold = s.nextInt();

			goodsArray[i] = new Goods(name, price, numberOfStock, sold);
		}
		for (int i = 0; i < goodsArray.length; i++) {
			System.out.println("��ǰ�� �̸�: " + goodsArray[i].name);
		}
	}

}
