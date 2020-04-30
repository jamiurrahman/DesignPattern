public class MallardDuck extends Duck {
	
	public MallardDuck() {
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I am a MallardDuck!");
		
	}

}
