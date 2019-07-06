
public class PlayWithRemote {

	public static void main(String[] args) {
	
		ElectronicDevice newDevice = TvRemote.getDevice() ;
		//ON 
		TurnTVOn OnCommand = new TurnTVOn(newDevice) ;
		DeviceButton onPressed = new DeviceButton(OnCommand);
		onPressed.press();
		
		//OFF
		TurnTVOff OffCommand = new TurnTVOff(newDevice) ;
		DeviceButton offPressed = new DeviceButton(OffCommand);
		offPressed.press();

		//VolumeUp 
		
		TurnTVUp upCommand = new TurnTVUp(newDevice) ;
		DeviceButton upPressed = new DeviceButton(upCommand);
		upPressed.press();
		upPressed.press();
		upPressed.press();
		
		
		
		//VolumeDown 
		TurnTVDown downCommand = new TurnTVDown(newDevice) ;
		DeviceButton downPressed = new DeviceButton(downCommand);
		downPressed.press();
		upPressed.press();
		

	}

}
