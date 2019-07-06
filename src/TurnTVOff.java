
public class TurnTVOff implements Command {
 ElectronicDevice theDevice ;
 public TurnTVOff ( ElectronicDevice newDevice)
 {
	 theDevice= newDevice ;
 }
	@Override
	public void exceute() {
		// TODO Auto-generated method stub
		theDevice.off();
	}

}
