import java.util.*;

public class FlagController {
	
	private static final FlagController instance = new FlagController();
	
	private FlagController() {
		DressingRoomFlags();
		BalloonRoomFlags();
		BicylceRoomFlags();
		HallwayFlags();
		StageRoomFlags();
		StorageRoomFlags();
	};
	
	public static FlagController GetInstance() {
		return instance;
	}
	
	// Hash map with for the flags
	private HashMap<String, Boolean> flags = new HashMap<String, Boolean>();
	
	
	public synchronized boolean GetFlag(String flagID) {
		return flags.get(flagID);
	}
	
	public synchronized void SetFlag(String flagID, boolean value) {
		flags.replace(flagID, value);
	}
	
	//The Following methods are used to organize and initialize the flags for each room. 
	
	private synchronized void DressingRoomFlags() {
		flags.put("hasMakupOn", false);
		flags.put("mirrorOpen", false);
	}
	
	private synchronized void BalloonRoomFlags() {
		
	}
	
	private synchronized void BicylceRoomFlags() {
		
	}
	
	private synchronized void HallwayFlags() {
		flags.put("hallwayStageDoorIsLock", true);
	}
	
	private synchronized void StageRoomFlags() {
		
	}
	
	private synchronized void StorageRoomFlags() {
		flags.put("cageIsOpen", false);
		flags.put("hasMakeup", false);
	}
	
}

