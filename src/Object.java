
public abstract class Object {
	
	private String title; // Main name that is used for "calling" the noun. Example: "Table" 
	
	private String[] adjectives; //May or may not do this. Might be cool.
	
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
