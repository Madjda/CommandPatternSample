public class TurnTVOn implements Command {
 ElectronicDevice theDevice ;
 public TurnTVOn ( ElectronicDevice newDevice)
 {
	 theDevice= newDevice ;
 }
	@Override
	public void exceute() {
		// TODO Auto-generated method stub
		theDevice.on();
	}

}








