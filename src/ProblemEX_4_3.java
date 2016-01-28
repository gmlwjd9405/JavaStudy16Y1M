
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
		Goods[] goodsArray; // 레퍼런스 선언
		goodsArray = new Goods[3]; // 레퍼런스 배열 생성

		for (int i = 0; i < goodsArray.length; i++) {
			// 레퍼런스 객체 생성
			System.out.println("상품의 이름, 가격, 재고 개수, 팔린 개수를 순서대로 입력하시오.");
			String name = s.next();
			int price = s.nextInt();
			int numberOfStock = s.nextInt();
			int sold = s.nextInt();

			goodsArray[i] = new Goods(name, price, numberOfStock, sold);
		}
		for (int i = 0; i < goodsArray.length; i++) {
			System.out.println("상품의 이름: " + goodsArray[i].name);
		}
	}

}
