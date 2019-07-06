
public class TurnTVUp implements Command {
 ElectronicDevice theDevice ;
 public TurnTVUp ( ElectronicDevice newDevice)
 {
	 theDevice= newDevice ;
 }
	@Override
	public void exceute() {
		// TODO Auto-generated method stub
		theDevice.volumeUp();
	}

}
