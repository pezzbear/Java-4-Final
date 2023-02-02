import java.util.*;

public class FlagController {
	// Hash map with for the flags
	private HashMap<String, Boolean> flags = new HashMap<String, Boolean>();
	
	//Initializes all of the flags we are using
	public void InitializeFlagController() {
		flags.put("HasSword", false);
		flags.put("PushedButton", true);
	}
	
	public boolean GetFlag(String flagID) {
		return flags.get(flagID);
	}
	
	public void SetFlag(String flagID, boolean value) {
		flags.replace(flagID, value);
	}
}
