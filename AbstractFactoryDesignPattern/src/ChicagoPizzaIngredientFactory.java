
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		System.out.println("Dough from Chicago Pizza Ingredient Factory.");
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		System.out.println("Sauce from Chicago Pizza Ingredient Factory.");
		return new TomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		System.out.println("Cheese from Chicago Pizza Ingredient Factory.");
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		System.out.println("Veggies from Chicago Pizza Ingredient Factory.");
		Veggies[] veggies = { new Garlic(), new Onion(), new BlackPeper()};
		return veggies;
	}

}
