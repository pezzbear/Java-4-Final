/*
 * 
 * Defines the TextController that is used to control the text that the player is inputting and the text that will be shown to the player in response.
 * 
 */
public class TextController {
	
	public RoomController roomController = RoomController.GetInstance();
	
	public PlayerInventory inventory = PlayerInventory.GetInstance();
	
	public void InputText(String inputString) {
		String inputArr[] = inputString.split("\\s+");
		
		String verb = "";
		String noun = "";
		String modifier = "";
		
		//This is scuffed. Don't worry... Actually, just don't even look at it. 
		verb = inputArr[0];
		if(inputArr.length == 2) { 
			verb = inputArr[0].replaceAll("\\s", "");
			noun = inputArr[1].replaceAll("\\s", "");
		} else if(inputArr.length == 3) {
			verb = inputArr[0].replaceAll("\\s", "");
			modifier = inputArr[1].replaceAll("\\s", "");
			noun = inputArr[2].replaceAll("\\s", "");
		}
		
		// Determines what do to with the commands. Exception commands are here as well. 
		// *NOTE* If you are adding a new command it has to be in lower case.
		switch(verb) { 
								// Help command exception
		case "help":
		case "commands":
			System.out.println("Commands: \r  -Walk + (north, east, south, west) \r  -Move + (north, east, south, west) \r  -Go + (north, east, south, west)"
					+ "\r  -Look + (north, east, south, west) \r  -Grab \r  -Get \r  -Take \r  -Pickup \r  -Items \r  -Walk Through Door"
					+ "\r  -Examine + (item name) \r "); // I know we are switching println but for now
			break;
								// Inventory command exception
		case "show inventory":
		case "inventory" :
		case "show items" :
		case "items" :
			System.out.println(inventory.ShowInventory()); 
			break;
			
		default: 
			if(!noun.equals("")) {
				System.out.println(DetermineAction(verb, noun, modifier));
			} else {
				System.out.println("Please enter a valid command. Type help for the list of commands.");
			}
			break;
		} 
	}
	
	private String DetermineAction(String verb, String noun, String modifier) {
		String outputText = "";
		
		switch(verb) {
		case "use" :
			for (Object object  : roomController.getCurrentObjects()) {
				if (noun.equals(object.title.toLowerCase())) {
					outputText = object.Use();
					return outputText;
				}
			} 
			outputText = "What should I use?";
			break;
		
		case "walk" : // Walk verbs
		case "move" :
		case "go" :
			if(modifier.equals("")) {
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
				default:
					outputText = "I can't walk there.";
					break;
				}
				return outputText;
			} else {
				if(modifier.equals("through")) {
					for (Object object  : roomController.getCurrentObjects()) {
						if (noun.equals(object.title.toLowerCase())) {
							if(object.canWalkThrough) {
								outputText = object.WalkThrough();
								return outputText;
							} else {
								outputText = "What door should I walk through.";
								return outputText;
							}
						}
					}
				} else {
					outputText = "Invalid Command.";
					return outputText;
				}
			}
			break;
			
		case "grab" : // grab verbs
		case "get" :
		case "take" :
		case "pickup" :
			//SET THE GET ITEM FLAGS
			for (Object object  : roomController.getCurrentObjects()) {
				if (noun.equals(object.title.toLowerCase())) {
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
			if (!modifier.equals("at")) {
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
				default:
					outputText = "Where should I look?";
					break;
				} 
			} else {
				for (Object object  : roomController.getCurrentObjects()) {
					if (noun.equals(object.title.toLowerCase())) {
						outputText = object.description;
						return outputText;
					}
				} 
				outputText = "What should I look at?";
			}
			break;
			
		case "examine" :
			for (Object object  : roomController.getCurrentObjects()) {
				if (noun.equals(object.title.toLowerCase())) {
					outputText = object.description;
					return outputText;
				}
			} 
			outputText = "What should I examine?";
			break;
		
			default :
				outputText = "Invalid Command.";
				break;
			
		}
		return outputText;
	} 

	
}
