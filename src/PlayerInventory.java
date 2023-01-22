import java.util.ArrayList;
import java.util.List;

public class PlayerInventory {
	private List<Object> inventoryList = new ArrayList<Object>();
	
	public String ShowInventory() { // Show the current inventory on the output console.
		return "";
	}
	
	public void AddItem(Object object) { // Adds the item to the inventory list.
		inventoryList.add(object);
	}
	
	public List<Object> GetItemList() { // Gets the item list
		return inventoryList;
	}
	
}
