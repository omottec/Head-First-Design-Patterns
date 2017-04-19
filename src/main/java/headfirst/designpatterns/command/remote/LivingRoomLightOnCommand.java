package headfirst.designpatterns.command.remote;

public class LivingRoomLightOnCommand implements Command {
	Light light;

	public LivingRoomLightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}
