import java.util.ArrayList;
import java.util.List;
/*
 * 
 * Defines the TextController that is used to control the text that the player is inputting and the text that will be shown to the player in response.
 * 
 */
public class TextController {
	
	FlagController flagController = new FlagController();
	
	RoomController roomController = new RoomController();
	
	PlayerInventory inventory = new PlayerInventory();
	
	public void InputText(String inputString) {
		
		String lowerCase = inputString.toLowerCase();
		
		if(lowerCase.equals("help") || lowerCase.equals("commands")) {
			System.out.println("Commands: \r Walk \r Move \r Go \r Grab \r ");
		}
		
		String inputArr[] = lowerCase.split(" ", 2);
		
		String verb = inputArr[0];
		
		String noun = inputArr[1];
		
		DetermineAction(verb, noun);
		
	}
	
	private String DetermineAction(String verb, String noun) {
		String outputText = "";
		
		switch(verb) {
		case "walk" : // Walk verbs
		case "move" :
		case "go" :
			switch(noun) {
			case "north" :
				outputText = roomController.move(Location.north);
				break;
			case "south" :
				outputText = roomController.move(Location.south);
				break;
			case "east" :
				outputText = roomController.move(Location.east);
				break;
			case "west" :
				outputText = roomController.move(Location.west);
				break;
			}
			break;
			
		case "grab" : // grab verbs
		case "get" :
		case "take" :
		case "pickup" :
			//SET THE GET ITEM FLAGS
			for (Object object  : roomController.getCurrentObjects()) {
				if (noun.equals(object.title)) {
					if (object.canPickup) {
						inventory.AddItem(object);
						outputText = object.Pickup();
						return outputText;
					} else {
						outputText = "I can't pick up " + object.title;
						return outputText;
					}
				}
			}
			outputText = "I can't find the object.";
			break;
		
		case "look" : // look verbs
			switch(noun) {
			case "north" :
				outputText = roomController.look(Location.north);
				break;
			case "south" :
				outputText = roomController.look(Location.south);
				break;
			case "east" :
				outputText = roomController.look(Location.east);
				break;
			case "west" :
				outputText = roomController.look(Location.west);
				break;
			}
			break;
			
		case "examine" :
			break;
		
			default :
				outputText = "Invalid Command.";
				break;
			
		}
		return outputText;
	}
	
}
