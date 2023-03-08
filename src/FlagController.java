import java.util.*;
/**
 * This class controls the flags for rooms and objects controlling which doors and objects are available to use
 * 
 */
public class FlagController {
	
	  /**
	   * Creates instances of each room 
	   * and initializes he FlagController
	   * 
	   */
	private static final FlagController instance = new FlagController();
	
	private FlagController() {
		DressingRoomFlags();
		BalloonRoomFlags();
		BicylceRoomFlags();
		HallwayFlags();
		StageRoomFlags();
		StorageRoomFlags();
	};
	
	  /**
	   * Creates an instance of FlagController
	   */	
	public static FlagController GetInstance() {
		return instance;
	}
	
	// Hash map with for the flags
	private HashMap<String, Boolean> flags = new HashMap<String, Boolean>();
	

	  /**
	   * Method to get the flag and flagId
	   */
	public synchronized boolean GetFlag(String flagID) {
		return flags.get(flagID);
	}
	
	  /**
	   * Accepts two parameters and sets the flag
	   */
	public synchronized void SetFlag(String flagID, boolean value) {
		flags.replace(flagID, value);
	}
	
	  /**
	   * Initializes flags in the Dressing Room
	   */
	private synchronized void DressingRoomFlags() {
		flags.put("hasMakupOn", false);
		flags.put("mirrorOpen", false);
	}
	
	  /**
	   * Initializes flags in the Balloon Room
	   */
	private synchronized void BalloonRoomFlags() {
		flags.put("crateIsLock", true);
		flags.put("buttonIsPushed", true);
		flags.put("leverIsPulled", true);
	}
	
	  /**
	   * Initializes flags in the Bicycle Room
	   */
	private synchronized void BicylceRoomFlags() {
		flags.put("hasRedNose", false);
	}
	
	  /**
	   * Initializes flags in the Hallway Room
	   */
	private synchronized void HallwayFlags() {
		flags.put("hallwayStageDoorIsLock", true);
	}
	
	  /**
	   * Initializes flags in the Stage Room
	   */
	private synchronized void StageRoomFlags() {
		flags.put("stageExitDoorIsLock", true);
		flags.put("hasOutfit", false);
		flags.put("stageBicyleDoorIsLock", true);
		flags.put("gameIsWon", false);
	}
	
	  /**
	   * Initializes flags in the Storage Room
	   */
	private synchronized void StorageRoomFlags() {
		flags.put("cageIsOpen", false);
		flags.put("hasMakeup", false);
	}
}

