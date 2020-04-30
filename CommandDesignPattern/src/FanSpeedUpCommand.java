
public class FanSpeedUpCommand implements Command{
	Fan fan;
	
	public FanSpeedUpCommand(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		System.out.println("We are executing FanSpeedUpCommand --> ");
		fan.speedUp();
	}

}
