
public class Tea extends CaffeineBeverage {

	@Override
	void addCondiment() {
		System.out.println("Adding lemon and ginger");
	}

	@Override
	void brew() {
		System.out.println("Steeping the tea");
	}

}
