package template;

public class CarTest {

	public static void main(String[] args) {
		//Car aiCar = new AICar();
		AICar aiCar = new AICar();
		aiCar.run();
		System.out.println("**********");
		Car munualCar = new ManualCar();
		munualCar.run();
	}

}
