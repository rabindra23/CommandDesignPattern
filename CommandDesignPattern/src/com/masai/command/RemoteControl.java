package com.masai.command;

public class RemoteControl {

	private Command command;
	
	public RemoteControl() {}

	public RemoteControl(Command command) {
		super();
		this.command = command;
	}


	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void buttonPress() {
		command.execute();
	}
}
