import java.util.ArrayList;

public abstract class Pizza {
	
	String name;
	
	Dough dough;
	Sauce sauce;
	Cheese cheese;
	Veggies veggies[];
	
	public abstract void prepare();
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void cut() {
		System.out.println("Cutting in triangular shape.");
	}
	
	public void box() {
		System.out.println("Packing with original box");
	}

}
