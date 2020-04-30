
public class ChicagoStylePizzaStore extends PizzaStore{
	
	@Override
	public Pizza createPizza(String type) {
		
		Pizza pizza;
		PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
		
		if(type.equals("Cheese")) {
			System.out.println("Creating Chicago Style Cheese Pizza.");
			pizza = new CheesePizza(pizzaIngredientFactory);
		}
		else if(type.equals("Veggie")) {
			System.out.println("Creating Chicago Style Veggie Pizza.");
			pizza = new VeggiePizza(pizzaIngredientFactory);
		}
		else {
			System.out.println("Creating Chicago Style Normal Pizza.");
			pizza = new NormalPizza(pizzaIngredientFactory);
		}
		
		return pizza;
	}

}