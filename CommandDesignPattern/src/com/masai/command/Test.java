package com.masai.command;

public class Test {

	public static void main(String[] args) {
		
		RemoteControl rc = new RemoteControl();
		Light light = new Light();
		LightOnCommand lc = new LightOnCommand(light);
		rc.setCommand(lc);
		rc.buttonPress();
		LightOffCommand lightoff = new LightOffCommand(light);
		rc.setCommand(lightoff);
		rc.buttonPress();
	}

}
