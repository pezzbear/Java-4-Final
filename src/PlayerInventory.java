import java.util.ArrayList;
import java.util.List;

public class PlayerInventory {
	
	private static final PlayerInventory instance = new PlayerInventory();
	
	private PlayerInventory() {
	
	};
	
	public static PlayerInventory GetInstance() {
		return instance;
	}
	
	// List of all of the items in the players inventory
	private static List<Object> inventoryList = new ArrayList<Object>();
	
	// Show the current inventory on the output console.
	public String ShowInventory() { 
		String output = "";
		
		for (Object object : inventoryList) {
			output = output + object.title + '\r';
		}
		
		return "Inventory: \r" + output;
	}
	
	// Adds the item to the inventory list.
	public void AddItem(Object object) { 
		inventoryList.add(object);
	}
	
	// Gets the item list
	public static List<Object> GetItemList() { 
		return inventoryList;
	}
	
}
