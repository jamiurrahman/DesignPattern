public class MiniDuckSimulator {
	
	/*
	 * DESIGN PRINCIPLE

		1. Identify the aspects of your application that vary and separate them from what stays the
		same.
		
		2. Program to an interface, not an implementation.
		
		3. Favor composition over inheritance.
	 */

	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.display();
		
		mallardDuck.performFly();
		mallardDuck.setFlyBehavior(new FlyWithWings());
		mallardDuck.performFly();
		
		mallardDuck.performQuack();
	}

}
