
public interface Light {

	public void on();
	public void off();

}

class LivingRoomLight implements Light {

	@Override
	public void on() {
		System.out.println("Living Room Light is ON");
	}

	@Override
	public void off() {
		System.out.println("Living Room Light is OFF");
	}
	
}

class KitchenLight implements Light {

	@Override
	public void on() {
		System.out.println("Kitchen Light is ON");
	}

	@Override
	public void off() {
		System.out.println("Kitchen Light is OFF");
	}
	
}
