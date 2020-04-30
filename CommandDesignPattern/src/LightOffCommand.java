
public class LightOffCommand implements Command{
	Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		System.out.println("We are executing LightOffCommand --> ");
		light.off();
	}

}
