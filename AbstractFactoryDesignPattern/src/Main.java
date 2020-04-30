
public class Main {

	public static void main(String[] args) {
		PizzaStore pizzaStore_1 = new NYStylePizzaStore();
		pizzaStore_1.orderPizza("Cheese");
		
		PizzaStore pizzaStore_2 = new ChicagoStylePizzaStore();
		pizzaStore_2.orderPizza("Veggie");
	}

}
