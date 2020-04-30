
public class FanOnCommand implements Command{
	Fan fan;
	
	public FanOnCommand(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		System.out.println("We are executing FanOnCommand --> ");
		fan.on();
	}

}
