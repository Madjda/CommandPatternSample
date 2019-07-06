
public class DeviceButton {

	Command cmnd ;
	
	public DeviceButton(Command comnd)
	{
		cmnd = comnd ;
	}
	 public void press () {
		 cmnd.exceute();
	 }
}
