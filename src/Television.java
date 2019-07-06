
public class Television implements ElectronicDevice {
	int volume ;

	public void on() {
		// TODO Auto-generated method stub
  System.out.println(" TV is ON ");
	}

	public void off() {
		// TODO Auto-generated method stub
		System.out.println(" TV is OFF");
	}

	public void volumeUp() {
		// TODO Auto-generated method stub
		volume++;
		System.out.println(" volume is up "+volume);
	}

	public void volumeDown() {
		// TODO Auto-generated method stub
		volume--;
		System.out.println(" volume is down "+volume);

	}

}
