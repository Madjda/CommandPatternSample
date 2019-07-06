
public class TurnTVDown implements Command {
	
 ElectronicDevice theDevice ;
 public TurnTVDown ( ElectronicDevice newDevice)
 {
	 theDevice= newDevice ;
 }
	@Override
	public void exceute() {
		// TODO Auto-generated method stub
		theDevice.volumeDown();
	}

}

