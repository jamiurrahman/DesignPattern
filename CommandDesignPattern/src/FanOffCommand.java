
public class FanOffCommand implements Command{
	Fan fan;
	
	public FanOffCommand(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		System.out.println("We are executing FanOffCommand --> ");
		fan.off();
	}

}
