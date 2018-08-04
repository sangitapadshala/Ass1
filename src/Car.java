
public class Car {
	private String model;
	private String[] features;

	public Car(String model, String... features) {
		this.model = model;
		this.features = features;
	}

	public void specs() {
		System.out.println("features of " + model);
		for (String features : features) {
			System.out.println(features);
		}

	}

	public static void main(String[] args) {
		Car alto = new Car("Alto", "Power stearing", "Power Window", "Keyless Entry");
		alto.specs();

		Car jazz = new Car("Jazz", "Keyless Start", "ABs", "Pano Roof", "Auto Gears");
		jazz.specs();
	}

}
