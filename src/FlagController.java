import java.util.*;

public class FlagController {
	HashMap<String, Boolean> items = new HashMap<String, Boolean>();
	
	public void makedictionary() {
		items.put("Sword", false);
		items.put("Torch", true);
	}
	
	public void listitems() {
		System.out.println("The Items you currently have are:");
		for(String name : items.keySet()) {
			if(items.get(name))
			{
				System.out.println(name);
			}
		}
	}
	
	public boolean getitem(String item) {
		boolean itemstatus = items.get(item);
		return itemstatus;
	}
	public void setitem(String item) {
		if(items.get(item) == false)
		{
			items.put(item, true);
		} else {
			items.put(item, false);
		}
	}
	//we are reverting this
}
