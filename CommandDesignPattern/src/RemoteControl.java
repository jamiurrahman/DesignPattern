
public class RemoteControl {
	
	Command onCommands[];
	Command offCommands[];
	
	int numberOfButtons = 7;
	
	public RemoteControl() {
		onCommands = new Command[numberOfButtons];
		offCommands = new Command[numberOfButtons];
		
		Command noCommand = new NoCommand();
		for (int i = 0; i < numberOfButtons; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		this.onCommands[slot] = onCommand;
		this.offCommands[slot] = offCommand;
	}
	
	public void onButtonPushed(int slot) {
		onCommands[slot].execute();
	}
	
	public void offButtonPushed(int slot) {
		offCommands[slot].execute();
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("Remote Control Info:\n");
		for (int i = 0; i < numberOfButtons; i++) {
			sb.append("Slot - " + i + " : onCommand - " + this.onCommands[i].getClass().getName() 
					+ " and offCommand - " + this.offCommands[i].getClass().getName() + "\n");
		}
		
		return sb.toString();
		
	}

}
