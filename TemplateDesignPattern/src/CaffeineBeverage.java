
public abstract class CaffeineBeverage {
	final void prepareRecipe () {
		boilWater();
		brew();
		poureInCup();
		if (customerWantsToAddCondiment()) {
			addCondiment();
		}
		hook();
	}

	private boolean customerWantsToAddCondiment() {
		// By default add condiment 
		// Override this method if needed
		return true;
	}

	void hook() {
		// By default do nothing
		// Override this method if needed
	}

	abstract void addCondiment();

	abstract void brew();

	void poureInCup() {
		System.out.println("Pouring into cup");
	}

	void boilWater() {
		System.out.println("Boiling water");
	}
}
