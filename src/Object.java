/*
 * Defines an "Object" in our game. Each object will have a title, attached adjectives, and other objects that can be liked to it.
 * Each object will have functions for when it is being called by the text handler. 
 * 
 * Example object: Table. 
 * The title would be "Table"
 * The linkedObjects could include a Bottle object with its own properties
 * 
 */
public abstract class Object {
	
	private String title; // Main name that is used for "calling" the noun. Example: "Table" 
	
	private Object[] linkedObjects; // Used to keep track of other objects linked to this one. Example: A bottle object on a table Object. 
									// The bottle is liked to the table -- May or may not use this. Depends on how complex we want it.
	
	public abstract void initObject(); // Initializes the object. Sets the Title, Adjectives, and the text for each verb that needs to be used.
	
	// All of the methods below are default "Verb" methods. They are called when a verb modifying a certain Object.
	
	public String Look() {
		String outputString = "It looks like a " + title;
		
		return outputString;
	}
	
	public String Pickup() {
		String outputString = "I can't pickup a " + title;
		
		return outputString;
	}
	
	public String Use() {
		String outputString = "Use it for what?";
		
		return outputString;
	}
	
	
}
