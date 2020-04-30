
public class ChicagoStylePizzaStore extends PizzaStore{
	
	@Override
	public Pizza createPizza(String type) {
		
		Pizza pizza;
		
		if(type.equals("Cheese")) {
			System.out.println("Creating Chicago Style Cheese Pizza.");
			pizza = new ChicagoStyleCheesePizza();
		}
		else if(type.equals("Veggie")) {
			System.out.println("Creating Chicago Style Veggie Pizza.");
			pizza = new ChicagoStyleVeggiePizza();
		}
		else {
			System.out.println("Creating Chicago Style Normal Pizza.");
			pizza = new ChicagoStyleNormalPizza();
		}
		
		return pizza;
	}

}

class ChicagoStyleCheesePizza extends Pizza {
	
	public ChicagoStyleCheesePizza() {
		name = "ChicagoStyleCheesePizza";
		toppings.add("Cheese");
		dough = "Thick crust";
	}
	
	public void cut() {
		System.out.println("Cutting in Chicago special square shape.");
	}
	
}

class ChicagoStyleVeggiePizza extends Pizza {
	
	public ChicagoStyleVeggiePizza() {
		name = "ChicagoStyleVeggiePizza";
		toppings.add("Broccoli");
		toppings.add("Cabbage");
		dough = "Thick crust";
	}
	
	public void cut() {
		System.out.println("Cutting in Chicago special square shape.");
	}
	
	public void box() {
		System.out.println("Packing with 3rd party box.");
	}
	
}

class ChicagoStyleNormalPizza extends Pizza {
	
	public ChicagoStyleNormalPizza() {
		name = "ChicagoStyleNormalPizza";
		toppings.add("Normal Vegetables");
		dough = "Thick crust";
	}
}