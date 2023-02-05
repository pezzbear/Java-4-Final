import java.util.*;

public class FlagController {
	
	private static final FlagController instance = new FlagController();
	
	private FlagController() {
		DressingRoomFlags();
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
	
	private synchronized void DressingRoomFlags() {
		flags.put("hasMakupOn", false);
		flags.put("mirrorOpen", false);
	}
}
