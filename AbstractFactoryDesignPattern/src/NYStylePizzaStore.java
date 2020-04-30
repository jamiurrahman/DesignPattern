
public class NYStylePizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		
		Pizza pizza;
		PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
		
		if(type.equals("Cheese")) {
			System.out.println("Creating NY Style Cheese Pizza.");
			pizza = new CheesePizza(pizzaIngredientFactory);
		}
		else if(type.equals("Veggie")) {
			System.out.println("Creating NY Style Veggie Pizza.");
			pizza = new VeggiePizza(pizzaIngredientFactory);
		}
		else {
			System.out.println("Creating NY Style Normal Pizza.");
			pizza = new NormalPizza(pizzaIngredientFactory);
		}
		
		return pizza;
	}

}

class CheesePizza extends Pizza {
	PizzaIngredientFactory pizzaIngredientFactory;
	
	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		
		this.pizzaIngredientFactory = pizzaIngredientFactory;
		name = "NYStyleCheesePizza";
	}

	@Override
	public void prepare() {
		System.out.println("Now, preparing the " + name + " Pizza with : ");
		dough = this.pizzaIngredientFactory.createDough();
		sauce = this.pizzaIngredientFactory.createSauce();
		cheese = this.pizzaIngredientFactory.createCheese();
		veggies = this.pizzaIngredientFactory.createVeggies();
		
	}
	
}

class VeggiePizza extends Pizza {
	PizzaIngredientFactory pizzaIngredientFactory;
	
	public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
		name = "NYStyleCheesePizza";
	}

	@Override
	public void prepare() {
		System.out.println("Now, preparing the " + name + " Pizza with : ");
		dough = this.pizzaIngredientFactory.createDough();
		sauce = this.pizzaIngredientFactory.createSauce();
		cheese = this.pizzaIngredientFactory.createCheese();
		veggies = this.pizzaIngredientFactory.createVeggies();
		
	}
	
}

class NormalPizza extends Pizza {
	PizzaIngredientFactory pizzaIngredientFactory;
	
	public NormalPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
		name = "NYStyleCheesePizza";
	}

	@Override
	public void prepare() {
		System.out.println("Now, preparing the " + name + " Pizza with : ");
		dough = this.pizzaIngredientFactory.createDough();
		sauce = this.pizzaIngredientFactory.createSauce();
		cheese = this.pizzaIngredientFactory.createCheese();
		veggies = this.pizzaIngredientFactory.createVeggies();
		
	}
}
