
public class NYStylePizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		
		Pizza pizza;
		
		if(type.equals("Cheese")) {
			System.out.println("Creating NY Style Cheese Pizza.");
			pizza = new NYStyleCheesePizza();
		}
		else if(type.equals("Veggie")) {
			System.out.println("Creating NY Style Veggie Pizza.");
			pizza = new NYStyleVeggiePizza();
		}
		else {
			System.out.println("Creating NY Style Normal Pizza.");
			pizza = new NYStyleNormalPizza();
		}
		
		return pizza;
	}

}

class NYStyleCheesePizza extends Pizza {
	
	public NYStyleCheesePizza() {
		name = "NYStyleCheesePizza";
		toppings.add("Cheese");
		toppings.add("Pineapple");
		dough = "Thin crust";
	}
	
}

class NYStyleVeggiePizza extends Pizza {
	
	public NYStyleVeggiePizza() {
		name = "NYStyleCheesePizza";
		toppings.add("Broccoli");
		toppings.add("Cabbage");
		toppings.add("Carrot");
		dough = "Thin crust";
	}
	
}

class NYStyleNormalPizza extends Pizza {
	
	public NYStyleNormalPizza() {
		name = "NYStyleCheesePizza";
		toppings.add("Normal Vegetables");
		dough = "Thin crust";
	}
}
