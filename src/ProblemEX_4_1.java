
public class ProblemEX_4_1 extends Problem {
	String name;
	int price, numberOfStock, sold;

	@Override
	public void run() {
		ProblemEX_4_1 camera;
		camera = new ProblemEX_4_1();

		camera.name = "Nikon";
		camera.price = 400000;
		camera.numberOfStock = 30;
		camera.sold = 50;

		System.out.println(camera.name + " " + camera.price + " " + camera.numberOfStock + " " + camera.sold);

	}

}
