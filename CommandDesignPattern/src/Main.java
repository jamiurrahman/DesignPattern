
public class Main {

	public static void main(String[] args) {
		Light livingRoomLight = new LivingRoomLight();
		Light kitchenLight = new KitchenLight();
		
		Fan livingRoomFan = new LivingRoomFan();
		Fan drawingRoomFan = new DrawingRoomFan();
		
		LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
		LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
		
		LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
		LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);
		
		FanOnCommand livingRoomFanOnCommand = new FanOnCommand(livingRoomFan);
		FanSpeedUpCommand livingRoomFanSpeedUpCommand = new FanSpeedUpCommand(livingRoomFan);
		FanSpeedDownCommand livingRoomFanSpeedDownCommand = new FanSpeedDownCommand(livingRoomFan);
		FanOffCommand livingRoomFanOffCommand = new FanOffCommand(livingRoomFan);
		
		FanOnCommand drawingRoomFanOnCommand = new FanOnCommand(drawingRoomFan);
		FanSpeedUpCommand drawingRoomFanSpeedUpCommand = new FanSpeedUpCommand(drawingRoomFan);
		FanSpeedDownCommand drawingRoomFanSpeedDownCommand = new FanSpeedDownCommand(drawingRoomFan);
		FanOffCommand drawingRoomFanOffCommand = new FanOffCommand(drawingRoomFan);
		
		// Setting Remote control slots functionalities...
		RemoteControl remoteControl = new RemoteControl();
		remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
		remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
		
		remoteControl.setCommand(2, livingRoomFanOnCommand, livingRoomFanOffCommand);
		remoteControl.setCommand(3, drawingRoomFanOnCommand, drawingRoomFanOffCommand);
		
		// Printing the Remote Control Current Status
		System.out.println(remoteControl);
		
		// Playing with different on off buttons
		remoteControl.onButtonPushed(0);
		remoteControl.onButtonPushed(1);
		remoteControl.onButtonPushed(2);
		remoteControl.onButtonPushed(3);
		
		remoteControl.offButtonPushed(0);
		remoteControl.offButtonPushed(1);
		remoteControl.offButtonPushed(2);
		remoteControl.offButtonPushed(3);
		
	}

}
