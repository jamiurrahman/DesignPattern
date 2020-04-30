
public class Main {

	public static void main(String[] args) {
		Turkey turkey_1 = new WildTurkey();
		Duck turkey_2 = new TurkeyAdapter(turkey_1);
		Duck duck = new MallardDuck();
		
		System.out.println("This is turkey 1 --> Turkey");
		turkey_1.gobble();
		turkey_1.fly();
		
		System.out.println("This is duck");
		testDuck(duck);
		
		System.out.println("This is turkey 2 --> Duck");
		testDuck(turkey_2);
	}

	private static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

}
