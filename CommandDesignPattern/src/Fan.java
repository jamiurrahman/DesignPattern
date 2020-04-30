
public interface Fan {

	public void on();
	public void off();
	public void speedUp();
	public void speedDown();

}

class LivingRoomFan implements Fan {

	@Override
	public void on() {
		System.out.println("Living Room Fan is ON");
	}

	@Override
	public void off() {
		System.out.println("Living Room Fan is OFF");
	}

	@Override
	public void speedUp() {
		System.out.println("Living Room Fan Speen UP");
	}

	@Override
	public void speedDown() {
		System.out.println("Living Room Fan Speen Down");
	}
	
}

class DrawingRoomFan implements Fan {

	@Override
	public void on() {
		System.out.println("Drawing Room Fan is ON");
	}

	@Override
	public void off() {
		System.out.println("Drawing Room Fan is OFF");
	}

	@Override
	public void speedUp() {
		System.out.println("Drawing Room Fan Speen UP");
	}

	@Override
	public void speedDown() {
		System.out.println("Drawing Room Fan Speen Down");
	}
	
}
