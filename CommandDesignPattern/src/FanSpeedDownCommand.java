
public class FanSpeedDownCommand implements Command{
	Fan fan;
	
	public FanSpeedDownCommand(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		System.out.println("We are executing FanSpeedDownCommand --> ");
		fan.speedUp();
	}

}
