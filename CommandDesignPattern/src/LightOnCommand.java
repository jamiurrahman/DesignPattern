
public class LightOnCommand implements Command{
	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		System.out.println("We are executing LightOnCommand --> ");
		light.on();
	}

}
