
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	// Every kind of duck can swim
	public void swim() {
		System.out.println("I can swim");
	}
	
	// Different types of duck will display their name differently
	public abstract void display();
	
	// Not all kind of duck can perform fly
	public void performFly() {
		this.flyBehavior.fly();
	}
	
	// Not all kind of duck sounds same
	public void performQuack() {
		this.quackBehavior.quack();
	}
	
	// At runtime, if we want to change the fly behavior of any duck 
	// then this method will help us.
	public void setFlyBehavior(FlyBehavior flyObj) {
		this.flyBehavior = flyObj;
	}
	
	// At runtime, if we want to change the quack behavior of any duck 
	// then this method will help us.
	public void setQuackBehavior(QuackBehavior quackObj) {
		this.quackBehavior = quackObj;
	}
}
