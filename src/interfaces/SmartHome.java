package interfaces;

interface Device{
	void turnon();
	void turnoff();
}
interface EnergyMonitor{
	void showUsage();

}
class SmartLight implements Device, EnergyMonitor{
	public void turnon() {
		System.out.println("Lights on");
	}
	public void turnoff() {
		System.out.println("Lights off");
	}
	public void showUsage() {
		System.out.println("It costed u 5 volts");
	}
}

public class SmartHome {

	public static void main(String[] args) {
		SmartLight sl = new SmartLight();
		sl.turnon();
		sl.turnoff();
		sl.showUsage();
		
	}

}
