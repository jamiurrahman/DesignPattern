import java.util.ArrayList;

public abstract class Pizza {
	
	String name;
	String dough;
	ArrayList<String> toppings;
	
	Pizza() {
		toppings = new ArrayList<String>();
	}
	
	public void prepare() {
		System.out.println("Now, preparing the " + name + " Pizza");
		System.out.println("Adding topping :");
		for (String topping : toppings) {
			System.out.println(topping);
		}
	}
	
	public void bake() {
		System.out.println("Baking with " + dough);
	}
	
	public void cut() {
		System.out.println("Cutting in triangular shape.");
	}
	
	public void box() {
		System.out.println("Packing with original box");
	}

}
