
public class Coffee extends CaffeineBeverage {

	@Override
	void addCondiment() {
		System.out.println("Adding milk and sugar");
	}

	@Override
	void brew() {
		System.out.println("Dripping coffee through filter");
	}

}
