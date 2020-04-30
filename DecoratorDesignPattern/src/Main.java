
public class Main {

	public static void main(String[] args) {
		Beverage beverage_1 = new Decaf();
		System.out.println("Beverage 1 : " + beverage_1.getDescription() + "\t and Cost: " + beverage_1.cost());
		
		Beverage beverage_2 = new Espresso();
		beverage_2 = new Mocha(beverage_2);
		beverage_2 = new Mocha(beverage_2);
		beverage_2 = new Whip(beverage_2);
		System.out.println("Beverage 2 : " + beverage_2.getDescription() + "\t and Cost: " + beverage_2.cost());
	}

}
