package abstraction;

interface Device{
	void turnon();
	void turnoff();
}
abstract class SmartDevice{
	String name;
	SmartDevice(String name){
		this.name= name;
	}
	void connectToWifi(){
		System.out.println(name +" is connected to Wifi");
	}
	abstract void deviceInfo();
}

class SmartDoor extends SmartDevice implements Device{
	SmartDoor(String name){
		super(name);
	}
	public void turnon() {
		System.out.println(name + "'s door is unlocked");
	}
	public void turnoff() {
		System.out.println(name + "'s door is locked");
	}
	void deviceInfo() {
		System.out.println("This is an SmartDoor Lock");
	}
}

public class SmartHome {

	public static void main(String[] args) {
		SmartDoor sd = new SmartDoor("Rebel");
        sd.connectToWifi();
        sd.deviceInfo();
        sd.turnon();
        sd.turnoff();

	}

}
