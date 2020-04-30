
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		System.out.println("Dough from NY Pizza Ingredient Factory.");
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		System.out.println("Sauce from NY Pizza Ingredient Factory.");
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		System.out.println("Cheese from NY Pizza Ingredient Factory.");
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		System.out.println("Veggies from NY Pizza Ingredient Factory.");
		Veggies[] veggies = { new Garlic(), new RedOnion(), new RedPeper()};
		return veggies;
	}

}
